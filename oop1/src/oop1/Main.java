package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
					//set value
//		product1.name="Delonghi Kahve Makinesi";
//		product1.unitPrice=7500;
//		product1.discount=7;
//		product1.imageUrl="bilmemne1.jpg";
//		product1.unitsInStock=3;
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		//product1.setDiscount(7);
		product1.setImageUrl("bilmemne1.jpg");
		product1.setUnitsInStock(3);
				
					//get value
		//System.out.println(product1.name);
		
		Product product2 = new Product();
//		product2.name="Smeg Kahve Makinesi";
//		product2.unitPrice=6500;
//		product2.discount=8;
//		product2.imageUrl="bilmemne2.jpg";
//		product2.unitsInStock=4;
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		//product2.setDiscount(8);
		product2.setImageUrl("bilmemne2.jpg");
		product2.setUnitsInStock(4);

		Product product3 = new Product();
//		product3.name="Kitchen Kahve Makinesi";
//		product3.unitPrice=4500;
//		product3.discount=9;
//		product3.imageUrl="bilmemne3.jpg";
//		product3.unitsInStock=2;
		
		product1.setName("Kitchen Aid Kahve Makinesi");
		product1.setUnitPrice(4500);
		//product1.setDiscount(9);
		product1.setImageUrl("bilmemne3.jpg");
		product1.setUnitsInStock(2);
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+ product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522222");
		individualCustomer.setCustomerNumber("12345");
		
		individualCustomer.setFirstName("Hüseyin");
		individualCustomer.setLastName("CESUR");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("0533333");
		
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
		
	}

}

//source>format
