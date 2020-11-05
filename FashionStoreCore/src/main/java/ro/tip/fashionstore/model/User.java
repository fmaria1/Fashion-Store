package ro.tip.fashionstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "User")
public class User {
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long accountId;
	private long deliveryInfoId;

	private String username;
	private String password;
	private String email;
	private boolean admin;

	// a constructor without arguments is needed
	public User() {
		super();
	}

	public User(long accountId, long deliveryInfoId, String username, String password, String email, boolean admin) {
		super();
		this.accountId = accountId;
		this.deliveryInfoId = deliveryInfoId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.admin = admin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getDeliveryInfoId() {
		return deliveryInfoId;
	}

	public void setDeliveryInfoId(long deliveryInfoId) {
		this.deliveryInfoId = deliveryInfoId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", accountId=" + accountId + ", deliveryInfoId=" + deliveryInfoId + ", username="
				+ username + ", password=" + password + ", email=" + email + ", admin=" + admin + "]";
	}
}
