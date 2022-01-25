package codz.she.interview.model;

import java.util.Map;
import java.util.UUID;

public class Seller {

	private Map<String, Deal> deals;
	private String sellerId;
	
	public Seller() {
		this.sellerId = UUID.randomUUID().toString();
	}

	public  Map<String, Deal> getDeals() {
		return deals;
	}

	public void setDeals( Map<String, Deal> deals) {
		this.deals = deals;
	}

	public String getSellerId() {
		return sellerId;
	}
	
	
}
