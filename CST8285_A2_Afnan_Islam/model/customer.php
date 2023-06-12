<?php
/**
 * Afnan Islam
 * Id: 041082073
 * Description: using a class with variables, intializing, and setting it for later use.
 * Assignment 2
 */
	class Customer{		

		private $id;
		private $name;
		private $address;
		private $payment;
		private $service;
				
		function __construct($id, $name, $address, $payment, $service){ 
			$this->setId($id);
			$this->setName($name);
			$this->setAddress($address);
			$this->setPayment($payment);
			$this->setService($service);
			}		
		
		public function getName(){
			return $this->name;
		}
		
		public function setName($name){
			$this->name = $name;
		}
		
		public function getAddress(){
			return $this->address;
		}
		
		public function setAddress($address){
			$this->address = $address;
		}

		public function getpayment(){
			return $this->payment;
		}

		public function setpayment($payment){
			$this->payment = $payment;
		}



		public function getService(){
			return $this->service;
		}
		
		public function setService($service){
			$this->service = $service;
		}
		



		public function setId($id){
			$this->id = $id;
		}

		public function getId(){
			return $this->id;
		}

	}
?>