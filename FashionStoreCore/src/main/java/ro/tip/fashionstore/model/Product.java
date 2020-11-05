package ro.tip.fashionstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "Product")

public class Product {
	@Id
	@Column(name = "ProductID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String name;
	private String description;
	private double price;
	private String size;
	private int stock;
	private char type;
	private String category;
	private String colour;
	private String imagePath;

	// a constructor without arguments is needed
	public Product() {
		super();
	}

	public Product(String name, String description, double price, String size, int stock, char type, String category,
			String colour, String imagePath) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.size = size;
		this.stock = stock;
		this.type = type;
		this.category = category;
		this.colour = colour;
		this.imagePath = imagePath;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", size="
				+ size + ", stock=" + stock + ", type=" + type + ", category=" + category + ", colour=" + colour
				+ ", imagePath=" + imagePath + "]";
	}

}
