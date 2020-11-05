package ro.tip.fashionstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import com.google.gson.Gson;

@Entity
@XmlRootElement(name = "Orders")
public class Orders {
	@Id
	@Column(name = "orderId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long productId;
	private long userId;
	private int quantity;
	private double cost;

	// a constructor without arguments is needed
	public Orders() {
		super();
	}

	public Orders(long productId, long userId, int quantity, double cost) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.quantity = quantity;
		this.cost = cost;
	}

	public Orders(String jsonOrder) {
		Gson g = new Gson();
		Orders order = g.fromJson(jsonOrder, Orders.class);
		System.out.println("gson order: " + order);
		this.productId = order.getProductId();
		this.userId = order.getUserId();
		this.quantity = order.getQuantity();
		this.cost = order.getCost();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", productId=" + productId + ", userId=" + userId + ", quantity=" + quantity
				+ ", cost=" + cost + "]";
	}
}