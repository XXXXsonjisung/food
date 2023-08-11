package edu.kh.model.run;

import edu.kh.model.service.RestaurantService;

public class Run {
	public static void main(String[] args) {
		
		RestaurantService ReService = new RestaurantService();
		
		ReService.displayMenu();
	}
	

}
