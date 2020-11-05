package ro.tip.fashionstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "DeliveryInfo")
public class DeliveryInfo {

	@Id
	@Column(name = "deliveryInfoId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private String address;
	private String city;
	private String country;
	private String postalCode;
	private String phoneNumber;

	// a constructor without arguments is needed
	public DeliveryInfo() {
		super();
	}

	public DeliveryInfo(String name, String address, String city, String country, String postalCode,
			String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
		this.phoneNumber = phoneNumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "DeliveryInfo [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", country="
				+ country + ", postalCode=" + postalCode + ", phoneNumber=" + phoneNumber + "]";
	}
}