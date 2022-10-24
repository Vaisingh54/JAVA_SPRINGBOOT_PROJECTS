package onlineshopping1;

public class Product {
	
	private int productId;
	private int price;
	private int starRating;
	private String description ;
	private String productName;
	public Product(int productId, int price, int starRating, String description, String productName) {
		super();
		this.productId = productId;
		this.price = price;
		this.starRating = starRating;
		this.description = description;
		this.productName = productName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStarRating() {
		return starRating;
	}
	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + ", starRating=" + starRating + ", description="
				+ description + ", productName=" + productName + "]";
	}
	


}
