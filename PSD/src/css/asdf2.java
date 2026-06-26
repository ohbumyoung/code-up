package css;

public class asdf2 {
	
	private String productName;
	private int price;
	private String brand;

	public asdf2() {
		
	
	}

	
	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void information() {
		
		System.out.print(productName + price + brand);
		
}
}