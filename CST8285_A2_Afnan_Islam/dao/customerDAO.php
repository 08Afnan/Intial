
<?php
/**
 * Afnan Islam
 * Id: 041082073
 * Description: Setting data to retrive from database by using fuctions, objects, and setting conditions for specific situatins
 * Assignment 2
 */
require_once('abstractDAO.php');
require_once('./model/customer.php');

class customerDAO extends abstractDAO {
        
    function __construct() {
        try{
            parent::__construct();
        } catch(mysqli_sql_exception $e){
            throw $e;
        }
    }  
    
    public function getCustomer($customerId){
        $query = 'SELECT * FROM customers WHERE id = ?';
        $stmt = $this->mysqli->prepare($query);
        $stmt->bind_param('i', $customerId);
        $stmt->execute();
        $result = $stmt->get_result();
        if($result->num_rows == 1){
            $temp = $result->fetch_assoc();
            $customer = new customer($temp['id'],$temp['name'], $temp['address'], $temp['payment'], $temp['service'] ); //
            $result->free();
            return $customer;
        }
        $result->free();
        return false;
    }


    public function getCustomers(){
        //The query method returns a mysqli_result object
        $result = $this->mysqli->query('SELECT * FROM Customers');
        $Customers = Array();
        
        if($result->num_rows >= 1){
            while($row = $result->fetch_assoc()){
                //Create a new employee object, and add it to the array.
                $customer = new Customer($row['id'], $row['name'], $row['address'], $row['payment'], $row['service']); //
                $customers[] = $customer;
            }
            $result->free();
            return $customers;
        }
        $result->free();
        return false;
    }   
    
    public function addCustomer($customer){
        
        if(!$this->mysqli->connect_errno){
            //The query uses the question mark (?) as a
            //placeholder for the parameters to be used
            //in the query.
            //The prepare method of the mysqli object returns
            //a mysqli_stmt object. It takes a parameterized 
            //query as a parameter.
			$query = 'INSERT INTO customers (name, address, payment, service) VALUES (?,?,?,?)'; //
			$stmt = $this->mysqli->prepare($query);
            if($stmt){
                    $name = $customer->getName();
			        $address = $customer->getAddress();
			        $payment = $customer->getPayment();
                    $service = $customer->getService();
			        
                    $stmt->bind_param('ssii', 
				        $name,
				        $address,
				        $payment,
                        $service
			        );    
                    //Execute the statement
                    $stmt->execute();         
                    
                    if($stmt->error){
                        return $stmt->error;
                    } else {
                        return $customer->getName() . ' added successfully!';
                    } 
			}
             else {
                $error = $this->mysqli->errno . ' ' . $this->mysqli->error;
                echo $error; 
                return $error;
            }
       
        }else {
            return 'Could not connect to Database.';
        }
    }   
    public function updateCustomer($customer){
        
        if(!$this->mysqli->connect_errno){
            //The query uses the question mark (?) as a
            //placeholder for the parameters to be used
            //in the query.
            //The prepare method of the mysqli object returns
            //a mysqli_stmt object. It takes a parameterized 
            //query as a parameter.
            $query = "UPDATE customers SET name=?, address=?, payment=?, service=? WHERE id=?"; //
            $stmt = $this->mysqli->prepare($query);
            if($stmt){
                    $id = $customer->getId();
                    $name = $customer->getName();
			        $address = $customer->getAddress();
			        $payment = $customer->getPayment();
                    $service = $customer->getService();
                  
			        $stmt->bind_param('ssiii', 
				        $name,
				        $address,
				        $payment,
                        $service,
                        $id
			        );    
                    //Execute the statement
                    $stmt->execute();         
                    
                    if($stmt->error){
                        return $stmt->error;
                    } else {
                        return $customer->getName() . ' updated successfully!';
                    } 
			}
             else {
                $error = $this->mysqli->errno . ' ' . $this->mysqli->error;
                echo $error; 
                return $error;
            }
       
        }else {
            return 'Could not connect to Database.';
        }
    }   

    public function deleteCustomer($customerId){
        if(!$this->mysqli->connect_errno){
            $query = 'DELETE FROM customers WHERE id = ?';
            $stmt = $this->mysqli->prepare($query);
            $stmt->bind_param('i', $customerId);
            $stmt->execute();
            if($stmt->error){
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
?>