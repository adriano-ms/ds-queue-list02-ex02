package model;

public class Client {
	
	private String name;
	private Integer partsAmount;
	private Double partsPrice;
	
	public Client() {
		super();
	}

	public Client(String name, Integer partsAmount, Double partsPrice) {
		this.name = name;
		this.partsAmount = partsAmount;
		this.partsPrice = partsPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPartsAmount() {
		return partsAmount;
	}

	public void setPartsAmount(Integer partsAmount) {
		this.partsAmount = partsAmount;
	}

	public Double getPartsPrice() {
		return partsPrice;
	}

	public void setPartsPrice(Double partsPrice) {
		this.partsPrice = partsPrice;
	}

	@Override
	public String toString() {
		return String.format("%s: Total: $%.2f", name, (partsAmount * partsPrice));
	}
	
	
}
