package ro.tip.fashionstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "Request")
public class Request {
	@Id
	@Column(name = "RequestId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long productId;

	@Column(name = "NoOfRequests")
	private long numberOfRequests;

	@Column(name = "RequestStatus")
	private boolean status;

	// a constructor without arguments is needed
	public Request() {
		super();
	}

	public Request(long productId, long numberOfRequests, boolean status) {
		super();
		this.productId = productId;
		this.numberOfRequests = numberOfRequests;
		this.status = status;
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

	public long getNumberOfRequests() {
		return numberOfRequests;
	}

	public void setNumberOfRequests(long numberOfRequests) {
		this.numberOfRequests = numberOfRequests;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", productId=" + productId + ", numberOfRequests=" + numberOfRequests + ", status="
				+ status + "]";
	}

}
