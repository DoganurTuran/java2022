package classesWithAttiributes;
public class Product {
public Product(int id, String name, String description, double price, int stockAmount, String color) {
	System.out.println("Yapıcı blok çalıştır");
	this.id=id;
	this.color = color;
	this.name = name;
	this.price = price;
	this.description = description;
	this.stockAmount = stockAmount;
}

//Attribute | Field
public Product() {
	
}
	private int id;
	private String name;
	private String description;// açıklama
	private double price;// fiyat
	private int stockAmount;
	private String color;
	private String kod;

	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setid(int id) {
		this.id=id; // this. içinde bulunduğum class anlamındadır
	}

	public String get_name() {
		return name;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public String get_description() {
		return description;
	}

	public void set_description(String description) {
		this.description = description;
	}

	public double get_price() {
		return price;
	}

	public void set_price(double price) {
		this.price = price;
	}

	public int get_stockAmount() {
		return stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String get_color() {
		return color;
	}

	public void set_color(String color) {
		this.color = color;
	}

	public String get_kod() {
		return this.name.substring(0, 1) + id;
	}

}
