package edu.kh.model.vo;

public class Restaurant {
	
	private String mainFood;
	private String dessertFood;
	private String drink;
	private String alcoholicDrink1;
	private String alcoholicDrink2;
	private int price;

	
	
	public Restaurant() {}

	
	



	@Override
	public String toString() {
		return  "[ 메인음식 : " + mainFood + "/ 디저트 음식 : " + dessertFood + "/ 음료 이름 : " + drink + "/ 술 이름 : " + alcoholicDrink1 + "/ 술 이름 : "+ alcoholicDrink2 + "/ 가격 : " + price + "]";

}
}
