package oop1;

public class CorporateCustomer extends Customer{
	private int randomNumber;
	private String taxNumber;
	public int getId() {
		return randomNumber;
	}
	public void setId(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	

}
