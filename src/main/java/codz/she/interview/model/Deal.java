package codz.she.interview.model;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Deal {

	private double itemPrice;
	private int noOfItems;
	private Instant startTime;
	private Instant endTime;
	private String dealId;
	private String dealName;
	private String sellerId;
	
	
	private Deal() {
		dealId = UUID.randomUUID().toString();
		this.startTime = Instant.now();
		this.endTime = startTime.plusSeconds(3600*2);
	}
	
	public Deal(double itemPrice, int noOfItems, String dealName, String sellerId) {
		dealId = UUID.randomUUID().toString();
		this.itemPrice = itemPrice;
		this.noOfItems = noOfItems;
		this.startTime = Instant.now();
		this.endTime = startTime.plusSeconds(3600*2);
		this.dealName = dealName;
		this.sellerId = sellerId;
	}
	
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public Instant getEndTime() {
		return endTime;
	}
	public void setEndTime(int numberOfHours) {
		endTime = endTime.plusSeconds(numberOfHours*3600);
	}
	
	public void setEndTimeToZero() {
		endTime = Instant.now();
	}
	
	public String getDealName() {
		return dealName;
	}
	public void setDealName(String dealName) {
		this.dealName = dealName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public Instant getStartTime() {
		return startTime;
	}
	public String getDealId() {
		return dealId;
	}
	public String getSellerId() {
		return sellerId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [itemPrice=");
		builder.append(itemPrice);
		builder.append(", noOfItems=");
		builder.append(noOfItems);
		builder.append(", startTime=");
		builder.append(Date.from(getStartTime()));
		builder.append(", endTime=");
		builder.append(Date.from(getEndTime()));
		builder.append(", dealId=");
		builder.append(dealId);
		builder.append(", dealName=");
		builder.append(dealName);
		builder.append(", sellerId=");
		builder.append(sellerId);
		builder.append("]");
		return builder.toString();
	}
	
}
