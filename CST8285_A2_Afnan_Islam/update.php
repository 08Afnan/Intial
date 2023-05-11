<?php
/**
 * Afnan Islam
 * Id: 041082073
 * Description: To update the information of database by using isset fuction to verify the updated information for 
 * different input. Also used HTML5 for form structure and php to echo the errors.
 * Assignment 2
 */



// Include employeeDAO file
require_once('./dao/customerDAO.php');
 
// Define variables and initialize with empty values
$name = $address = $payment = $service = "";
$name_err = $address_err = $payment_err = $service_err = "";
$customerDAO = new customerDAO(); 

// Processing form data when form is submitted
if(isset($_POST["id"]) && !empty($_POST["id"])){
    // Get hidden input value
    $id = $_POST["id"];
    
    // Validate name
    $input_name = trim($_POST["name"]);
    if(empty($input_name)){
        $name_err = "Please enter a name.";
    } elseif(!filter_var($input_name, FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"/^[a-zA-Z\s]+$/")))){
        $name_err = "Please enter a valid name.";
    } else{
        $name = $input_name;
    }
    
    // Validate address address
    $input_address = trim($_POST["address"]);
    if(empty($input_address)){
        $address_err = "Please enter an address."; 
    } else{
        $address = $input_address;
    }
    
    // Validate payment
    $input_payment = trim($_POST["payment"]);
    if(empty($input_payment)){
        $payment_err = "Please enter the payment amount.";
    } elseif(!ctype_digit($input_payment)){
        $payment_err = "Please enter a positive integer value.";
    } else{
        $payment = $input_payment;
    }
    
    // Check input errors before inserting in database
    if(empty($name_err) && empty($address_err) && empty($payment_err) && empty($service_err)){
        $customer = new Customer($id, $name, $address, $payment, $service);
        $result = $customerDAO->updateCustomer($customer);        
		header("refresh:2; url=index.php");
		echo '<br><h6 style="text-align:center">' . $result . '</h6>';
        // Close connection
        $customerDAO->getMysqli()->close();
    }

} else{
    // Check existence of id parameter before processing further
    if(isset($_GET["id"]) && !empty(trim($_GET["id"]))){
        // Get URL parameter
        $id =  trim($_GET["id"]);
        $customer = $customerDAO->getCustomer($id);
                
        if($customer){
            // Retrieve individual field value
            $name = $customer->getName();
            $address = $customer->getAddress();
            $payment = $customer->getPayment();
            $service = $customer->getService();
        } else{
            // URL doesn't contain valid id. Redirect to error page
            header("location: error.php");
            exit();
        }
    } else{
        // URL doesn't contain id parameter. Redirect to error page
        header("location: error.php");
        exit();
    }
    // Close connection
    $customerDAO->getMysqli()->close();
}
?>
 
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Record</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .wrapper{
            width: 600px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <div class="wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <h2 class="mt-5">Update Record</h2>
                    <p>Please edit the input values and submit to update the customer record.</p>
                    <form action="<?php echo htmlspecialchars(basename($_SERVER['REQUEST_URI'])); ?>" method="post">
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" name="name" class="form-control <?php echo (!empty($name_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $name; ?>">
                            <span class="invalid-feedback"><?php echo $name_err;?></span>
                        </div>
                        <div class="form-group">
                            <label>Address</label>
                            <textarea name="address" class="form-control <?php echo (!empty($address_err)) ? 'is-invalid' : ''; ?>"><?php echo $address; ?></textarea>
                            <span class="invalid-feedback"><?php echo $address_err;?></span>
                        </div>
                        <div class="form-group">
                            <label>Payment</label>
                            <input type="text" name="payment" class="form-control <?php echo (!empty($payment_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $payment; ?>">
                            <span class="invalid-feedback"><?php echo $payment_err;?></span>
                        </div>
                        <div class="form-group">
                            <label>Service</label>
                            <input type="image" name="service"  src="\pic\images.jpeg" class="form-control <?php echo (!empty($service_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $service; ?>">
                            <span class="invalid-feedback"><?php echo $service_err;?></span>
                        </div>
                        <input type="hidden" name="id" value="<?php echo $id; ?>"/>
                        <input type="submit" class="btn btn-primary" value="Submit">
                        <a href="index.php" class="btn btn-secondary ml-2">Cancel</a>
                    </form>
                </div>
            </div>        
        </div>
    </div>
</body>
</html>