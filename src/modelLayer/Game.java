package modelLayer;

public class Game extends Product {
	private String type;

	public Game(String barcode, String title, String category, double costPrice, double recommendedRetailPrice, int amountInStock,
			String publicationDate, String description, Supplier supplier, String type) {
		super(barcode, title, category, costPrice, recommendedRetailPrice, amountInStock, publicationDate, description, supplier);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}
