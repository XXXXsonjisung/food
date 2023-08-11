package edu.kh.model.vo;

public class AlcoholicDrink {

	private String TeKass;
	private int price;
	
	public AlcoholicDrink() {}

	public AlcoholicDrink(String teKass, int price) {
		super();
		TeKass = teKass;
		this.price = price;
	}

	public String getTeKass() {
		return TeKass;
	}

	public void setTeKass(String teKass) {
		TeKass = teKass;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return    " 테라,카스 : " + TeKass + " / 가격 : " + price + "]";

	}
}

