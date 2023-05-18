package Lab6;

/**
 * File name: Username.java
 *  Author: Afnan Islam
 *  Course: CST8284
 *  Assignment: lab6
 *  Date:2023-03-31
 *  Professor:HESHAM SAADAWI
 *  Purpose: We are going use the concept of interface and polymorphisom by creating an interface and a super class
 *  with few sub classes. We also implement the interface to see how how implements the method and use it to run print or check something.
 *
 *  This is the invoice class that also implements the interface payme
 *  and we implement the get payment amount for
 * @author afnan
 * @version 6.1
 * @since Javac 17.0.4.1
 */
//LAB 6 - CST8284
//LAB 6: Invoice.java

//This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass

//The Invoice class implements Payme interface. NO MODIFICATION IS REQUIRED HERE!!!

public class Invoice implements Payme {
	/**
	 * Attribute for part part Number
	 */
	private String partNumber;
	/**
	 *Attribute for part Description
	 */
	private String partDescription;
	/**
	 *Attribute for quantity
	 */
	private int quantity;
	/**
	 * Attribute for price per item
	 */
	private double pricePerItem;

	/**
	 * four-argument constructor
	 * @param part sets the part
	 * @param description sets the description
	 * @param count sets the count
	 * @param price sets the price
	 */
	public Invoice(String part, String description, int count,
			double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	}

	/**
	 * set part number
	 * @param part
	 */
	public void setPartNumber(String part) {
		partNumber = part;
	}

	/**
	 * get part number
	 * @return
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * set description
	 * @param description
	 */
	public void setPartDescription(String description) {
		partDescription = description;
	}

	/**
	 * get description
	 * @return
	 */
	public String getPartDescription() {
		return partDescription;
	}

	/**
	 * set quantity
	 * @param count
	 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}

	/**
	 * get quantity
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * set price per item
	 * @param price
	 */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

	/**
	 * get price per item
	 * @return
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
	 * return String representation of Invoice object
	 */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
				"invoice", "part number", getPartNumber(), getPartDescription(),
				"quantity", getQuantity(), "price per item", getPricePerItem());
	}

	/**
	 * method required to carry out contract with interface Payme
	 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}


}



