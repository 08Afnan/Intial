<?php
// Include employeeDAO file
require_once('./dao/customerDAO.php');

 
// Define variables and initialize with empty values
$name = $address = $payment = $service = "";
$name_err = $address_err = $payment_err = $service_err = "";
 
// Processing form data when form is submitted
if($_SERVER["REQUEST_METHOD"] == "POST"){
    // Validate name
    $input_name = trim($_POST["name"]);
    if(empty($input_name)){
        $name_err = "Please enter a name.";
    } elseif(!filter_var($input_name, FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"/^[a-zA-Z\s]+$/")))){
        $name_err = "Please enter a valid name.";
    } else{
        $name = $input_name;
    }
    
    // Validate address
    $input_address = trim($_POST["address"]);
    if(empty($input_address)){
        $address_err = "Please enter an address.";     
    } else{
        $address = $input_address;
    }

    
    // Validate salary
    $input_payment = trim($_POST["payment"]);
    if(empty($input_payment)){
        $payment_err = "Please enter the payment amount.";     
    } elseif(!ctype_digit($input_payment)){
        $payment_err = "Please enter a positive integer value.";
    } else{
        $payment = $input_payment;
    }
    
    // Check input errors before inserting in database
    if(empty($name_err) && empty($address_err) && empty($payment_err)){
        $customerDAO = new customerDAO();    
        $customer = new Customer(0, $name, $address, $payment, $service);
        $addResult = $customerDAO->addCustomer($customer);        
        header( "refresh:2; url=index.php" ); 
		echo '<br><h6 style="text-align:center">' . $addResult . '</h6>';   
        // Close connection
        $customerDAO->getMysqli()->close();
        }
}
?>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Record</title>
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
                    <h2 class="mt-5">Create Record</h2>
                    <p>Please fill this form and submit to add employee record to the database.</p>
					
					<!--the following form action, will send the submitted form data to the page itself ($_SERVER["PHP_SELF"]), instead of jumping to a different page.-->
                    <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post"  enctype="multipart/form-data">
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
                            <label>payment</label>
                            <input type="text" name="payment" class="form-control <?php echo (!empty($payment_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $payment; ?>">
                            <span class="invalid-feedback"><?php echo $payment_err;?></span>
                        </div>
                        <div class="form-group">
                            <label>Service</label>
                            <input type="image" name="service" src="\pic\images.jpeg" class="form-control <?php echo (!empty($service_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $service; ?>">
                            <span class="invalid-feedback"><?php echo $service_err;?></span>
                        </div>
                        <input type="submit" class="btn btn-primary" value="Submit">
                        <a href="index.php" class="btn btn-secondary ml-2">Cancel</a>
                    </form>
                </div>
            </div>        
        </div>
        <?include 'footer.php';?>
    </div>
</body>
</html>