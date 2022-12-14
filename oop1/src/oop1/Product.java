package oop1;

//PascalCase
public class Product {
	//camelCase
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	//String[] imageUrls;
	private int unitsInStock;
	
	//source > generate getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		this.discount = discount + 5; //
		return discount;
	}
//	public void setDiscount(double discount) {
//		this.discount = discount;
//	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
}
