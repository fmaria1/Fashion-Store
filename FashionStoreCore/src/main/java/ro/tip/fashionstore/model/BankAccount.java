package ro.tip.fashionstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "BankAccount")
public class BankAccount {
	@Id
	@Column(name = "AccountID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cardNumber;
	private int cvvCode;
	private Date expirationDate;

	// a constructor without arguments is needed
	public BankAccount() {
		super();
	}

	public BankAccount(String cardNumber, int cvvCode, Date expirationDate) {
		super();
		this.cardNumber = cardNumber;
		this.cvvCode = cvvCode;
		this.expirationDate = expirationDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(int cvvCode) {
		this.cvvCode = cvvCode;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", cardNumber=" + cardNumber + ", cvvCode=" + cvvCode + ", expirationDate="
				+ expirationDate + "]";
	}
}
