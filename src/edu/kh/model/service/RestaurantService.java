package edu.kh.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.model.vo.Restaurant;

public class RestaurantService {
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Restaurant> foodlist = new ArrayList<Restaurant>();
	
	
	
	public RestaurantService() {}
	
	int mainPrice = 15000;
	int dessertPrice = 5000;
	int drinkPrice = 2500;
	int alcoholicPriceTK = 6000;
	int alcoholicPriceEJ = 12000;
	
	
	/**
	 * 디스플레이 메뉴
	 */
	public void displayMenu() {
		
		try {
			
			int menuNum = 0;
			do {
				
				System.out.println("안녕하세요 .반갑습니다. 손사장의 파스타입니다. 보기 란을 선택해주세요");
				System.out.println("1. 메인 메뉴 ");
				System.out.println("2. 디저트 메뉴");
				System.out.println("3. 음료 메뉴");
				System.out.println("4. 술 메뉴");
				System.out.println("5. 장바구니 확인");
				System.out.println("0. 그냥 다른집 갈래요");
				
				System.out.print("원하시는 란의 숫자를 입력해주세요 : ");
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : System.out.println(mainFood()); break;
				case 2 : System.out.println(dessertFood());break;
				case 3 : System.out.println(XdrinkX());break;
				case 4 : System.out.println(XalcoholicX());break;
				case 5 : foodList(foodlist);break;
				case 0 : System.out.println("감사합니다 다음에 뵙겠습니다.");break;
				default : System.out.println("메뉴에 있는번호인지 확인하고 다시 입력해주세요"); break;
				}
				
				
				
			} while (menuNum != 0);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		/**
		 * 
		 * 장바구니 확인 
		 */
		public String foodList(List<Restaurant>list) {
			
			if(list.isEmpty()) {
				System.out.println("장바구니를 채워주세요!");
			}else {
				for(Restaurant temp : list) {
					System.out.println(temp);
				}
			}
						
			
			
			return "";
		}
	

		/**
		 *  장바구니 등록메소드
		 */
		public String moamoa() {
			
			System.out.println("고객님이 확인하신 음식의 이름을 적어주세요");
			
			System.out.print("메인 음식 : ");
			String mainFood  = sc.nextLine();
			
			
			
			System.out.println("디저트 음식 : ");
			String dessertFood = sc.nextLine();
			
			System.out.println("음료 : ");
			String drink = sc.nextLine();
			
			System.out.println("술 (카스,테라) : ");
			String alcoholicDrink1 = sc.nextLine();
			
			System.out.println("술 (앱솔루트,잭다니엘) : ");
			String alcoholicDrink2 = sc.nextLine();
			
			Object ma1 = (String)mainFood;
			Object de2 = (String)dessertFood;
			Object dr3 = (String)drink;
			Object al4 = (String)alcoholicDrink1;
			Object al5 = (String)alcoholicDrink2;
			
			
			
			
			
Restaurant moamoa = new Restaurant(mainFood, dessertFood, drink, alcoholicDrink1, alcoholicDrink2,price);
foodlist.add(moamoa);
		
			
		}
		
		
		
		
		
		
		/**
		 *  결제 메소드
		 */
		public String cardSlash() {
			
			
			
			
			
			int menuNum ;
			do {
				
			System.out.println("카드를 꽂으시고 1번을 입력해주세요.");
			System.out.print("입력 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : System.out.println("잠시만 기달려주세요");
			default : System.out.println("잘못 입력하셨습니다. 번호를 확인해주세요.");
			}
			
			} while (menuNum != 0);
	
			
			
			
			return "결제 완료";
			
		
			
		}
		
	
	
	/**
	 * 메인음식 입력 메소드
	 */
	public String mainFood() {
		
		System.out.println("****메인 메뉴 란 입니다.****");

		int menuNum = 0;
		do {
			System.out.println("메뉴의 번호를 입력해 주세요.");
			System.out.println("1. 크림 파스타");
			System.out.println("2. 봉골레 파스타");
			System.out.println("3. 알리오올리오 파스타");
			System.out.println("0. 돌아가기");
			
			System.out.print("번호를 입력해주세요 : ");
			
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : System.out.println(main1Food());break;
			case 2 : System.out.println(main2Food());break;
			case 3 : System.out.println(main3Food()); break;
			case 0 : System.out.println("처음 화면으로 돌아왔습니다.");break;
			default : System.out.println("잘못입력하셨습니다. 메뉴의 번호를 확인해주세요");break;
			
			
			
			}
			
	
			
			
		} while (menuNum != 0);
		
	
		Restaurant newmainFood = new Restaurant();		
	
			
		return "다음페이지로 넘어갑니다.";
	}
	/**
	 * 메인음식 1번 메소드
	 */
	public String main1Food() {
		
		int menuNum ;
		do {
		System.out.println("크림 파스타 주문을 완료하시겠습니까? ");
		System.out.println(mainPrice);
		System.out.println("1. 바로 결재하기 ");
		System.out.println("2. 장바구니 담기 ");
		System.out.println("번호를 입력해주세요 : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 : System.out.println(cardSlash()); break;
		case 2 : foodList(foodlist); break;
		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
		}
		
		
		}while (menuNum != 0);
		
		return "다음페이지로 넘어갑니다.";
	}

	/**
	 * 메인음식 2번 메소드
	 */
	public String main2Food() {
		
		int menuNum ;
		do {
		System.out.println(" 봉골레 파스타 주문을 완료하시겠습니까? ");
		System.out.println(mainPrice);
		System.out.println("1. 바로 결재하기 ");
		System.out.println("2. 장바구니 담기 ");
		System.out.println("번호를 입력해주세요 : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 : System.out.println(cardSlash()); break;
		case 2 : foodList(foodlist); break;
		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
		}
		
		
		}while (menuNum != 0);
		
		return "다음페이지로 넘어갑니다.";
	}
	
	/**
	 * 메인음식 3번 메소드
	 */
	public String main3Food() {
		
		int menuNum ;
		do {
		System.out.println("알리오올리오 파스타 주문을 완료하시겠습니까? ");
		System.out.println(mainPrice);
		System.out.println("1. 바로 결재하기 ");
		System.out.println("2. 장바구니 담기 ");
		System.out.println("번호를 입력해주세요 : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 : System.out.println(cardSlash()); break;
		case 2 : foodList(foodlist); break;
		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
		}
		
		
		}while (menuNum != 0);
		
		return "다음페이지로 넘어갑니다.";
	}
	
	/**
	 * 디저트 음식 입력 메소드
	 */
	public String dessertFood() {
		
		System.out.println("****디저트 메뉴 란 입니다.****");

		int menuNum = 0;
		do {
			System.out.println("메뉴의 번호를 입력해 주세요.");
			System.out.println("1. 퐁듀 마시멜로우");
			System.out.println("2. 오렌지 3p");
			System.out.println("3. 바게트 빵");
			System.out.println("0. 돌아가기");
			System.out.println("번호를 입력해주세요 : ");
			
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : System.out.println(dessert1Food());break;
			case 2 : break;
			case 3 : break;
			case 0 : System.out.println("처음 화면으로 돌아왔습니다.");break;
			default : System.out.println("잘못입력하셨습니다. 메뉴의 번호를 확인해주세요");break;
			
			}
			
		} while (menuNum != 0);
		
			
		return "다음페이지로 넘어갑니다.";
	}
	
	/**
	 * 디저트 음식 1번 메소드
	 */
	public String dessert1Food() {
		
		int menuNum ;
		do {
		System.out.println("퐁듀 주문을 완료하시겠습니까? ");
		System.out.println(dessertPrice);
		System.out.println("1. 바로 결재하기 ");
		System.out.println("2. 장바구니 담기 ");
		System.out.print("번호를 입력해주세요 : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 : System.out.println(cardSlash()); break;
		case 2 : foodList(foodlist); break;
		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
		}
		
		
		}while (menuNum != 0);
		
		return "다음페이지로 넘어갑니다.";
	}

	/**
	 * 디저트 음식 2번 메소드
	 */
	public String dessert2Food() {
		
		int menuNum ;
		do {
		System.out.println(" 오렌지3p 주문을 완료하시겠습니까? ");
		System.out.println(dessertPrice);
		System.out.println("1. 바로 결재하기 ");
		System.out.println("2. 장바구니 담기 ");
		System.out.print("번호를 입력해주세요 : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 : System.out.println(cardSlash()); break;
		case 2 : foodList(foodlist); break;
		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
		}
		
		
		}while (menuNum != 0);
		
		return "다음페이지로 넘어갑니다.";
	}
	
	/**
	 * 디저트 음식 3번 메소드
	 */
	public String dessert3Food() {
		
		int menuNum ;
		do {
		System.out.println("바게트빵 주문을 완료하시겠습니까? ");
		System.out.println(dessertPrice);
		System.out.println("1. 바로 결재하기 ");
		System.out.println("2. 장바구니 담기 ");
		System.out.print("번호를 입력해주세요 : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 : System.out.println(cardSlash()); break;
		case 2 : foodList(foodlist); break;
		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
		}
		
		
		}while (menuNum != 0);
		
		return "다음페이지로 넘어갑니다.";
	}
	
        /**
         * 음료 메뉴 메소드
         */
        public String XdrinkX() {
		
		System.out.println("****음료 메뉴 란 입니다.****");

		int menuNum = 0;
		do {
			System.out.println("메뉴의 번호를 입력해 주세요.");
			System.out.println("1. 콜라");
			System.out.println("2. 오렌지쥬스");
			System.out.println("3. 토닉워터");
			System.out.println("0. 돌아가기");
			
			System.out.print("번호를 입력해주세요 : ");
			
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : System.out.println();break;
			case 2 : System.out.println();break;
			case 3 : System.out.println(); break;
			case 0 : System.out.println("처음 화면으로 돌아왔습니다.");break;
			default : System.out.println("잘못입력하셨습니다. 메뉴의 번호를 확인해주세요");break;
			
			}
			
		} while (menuNum != 0);
		
			
		return "다음페이지로 넘어갑니다.";
	}
	
        public String Xdrink1X() {
    		
    		int menuNum ;
    		do {
    		System.out.println("콜라 주문을 완료하시겠습니까? ");
    		System.out.println(drinkPrice );
    		System.out.println("1. 바로 결재하기 ");
    		System.out.println("2. 장바구니 담기 ");
    		System.out.print("번호를 입력해주세요 : ");
    		menuNum = sc.nextInt();
    		
    		switch(menuNum) {
    		case 1 : System.out.println(cardSlash()); break;
    		case 2 : foodList(foodlist); break;
    		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
    		}
    		
    		
    		}while (menuNum != 0);
    		
    		return "다음페이지로 넘어갑니다.";
    	}

    	
    	public String Xdrink2X() {
    		
    		int menuNum ;
    		do {
    		System.out.println(" 오렌지쥬스 주문을 완료하시겠습니까? ");
    		System.out.println(drinkPrice );
    		System.out.println("1. 바로 결재하기 ");
    		System.out.println("2. 장바구니 담기 ");
    		System.out.print("번호를 입력해주세요 : ");
    		menuNum = sc.nextInt();
    		
    		switch(menuNum) {
    		case 1 : System.out.println(cardSlash()); break;
    		case 2 : foodList(foodlist); break;
    		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
    		}
    		
    		
    		}while (menuNum != 0);
    		
    		return "다음페이지로 넘어갑니다.";
    	}
    	
    	
    	public String Xdrink3X() {
    		
    		int menuNum ;
    		do {
    		System.out.println("토닉워터 주문을 완료하시겠습니까? ");
    		System.out.println(drinkPrice );
    		System.out.println("1. 바로 결재하기 ");
    		System.out.println("2. 장바구니 담기 ");
    		System.out.print("번호를 입력해주세요 : ");
    		menuNum = sc.nextInt();
    		
    		switch(menuNum) {
    		case 1 : System.out.println(cardSlash()); break;
    		case 2 : foodList(foodlist); break;
    		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
    		}
    		
    		
    		}while (menuNum != 0);
    		
    		return "다음페이지로 넘어갑니다.";
    	}
    	public String XalcoholicX() {
    		
    		System.out.println("****술 메뉴 란 입니다.****");

    		int menuNum = 0;
    		do {
    			System.out.println("메뉴의 번호를 입력해 주세요.");
    			System.out.println("1. 테라");
    			System.out.println("2. 카스");
    			System.out.println("3. 엡솔루트");
    			System.out.println("4. 잭다니엘 허니");
    			System.out.println("0. 돌아가기");
    			
    			System.out.print("번호를 입력해주세요 : ");
    			
    			menuNum = sc.nextInt();
    			
    			switch (menuNum) {
    			case 1 : System.out.println(Xalcoholic1X());break;
    			case 2 : System.out.println(Xalcoholic2X());break;
    			case 3 : System.out.println(Xalcoholic3X()); break;
    			case 4 : System.out.println(Xalcoholic4X()); break;
    			case 0 : System.out.println("처음 화면으로 돌아왔습니다.");break;
    			default : System.out.println("잘못입력하셨습니다. 메뉴의 번호를 확인해주세요");break;
    			
    			}
    			
    		} while (menuNum != 0);
    		
    			
    		return "다음페이지로 넘어갑니다.";
    	}
    	
            public String Xalcoholic1X() {
        		
        		int menuNum ;
        		do {
        		System.out.println("테라 주문을 완료하시겠습니까? ");
        		System.out.println(alcoholicPriceTK  );
        		System.out.println("1. 바로 결재하기 ");
        		System.out.println("2. 장바구니 담기 ");
        		System.out.print("번호를 입력해주세요 : ");
        		menuNum = sc.nextInt();
        		
        		switch(menuNum) {
        		case 1 : System.out.println(cardSlash()); break;
        		case 2 : foodList(foodlist); break;
        		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
        		}
        		
        		
        		}while (menuNum != 0);
        		
        		return "다음페이지로 넘어갑니다.";
        	}

        	
        	public String Xalcoholic2X() {
        		
        		int menuNum ;
        		do {
        		System.out.println(" 카스 주문을 완료하시겠습니까? ");
        		System.out.println(alcoholicPriceTK  );
        		System.out.println("1. 바로 결재하기 ");
        		System.out.println("2. 장바구니 담기 ");
        		System.out.print("번호를 입력해주세요 : ");
        		menuNum = sc.nextInt();
        		
        		switch(menuNum) {
        		case 1 : System.out.println(cardSlash()); break;
        		case 2 : foodList(foodlist); break;
        		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
        		}
        		
        		
        		}while (menuNum != 0);
        		
        		return "다음페이지로 넘어갑니다.";
        	}
        	
        
        	public String Xalcoholic3X() {
        		
        		int menuNum ;
        		do {
        		System.out.println("엡솔루트 주문을 완료하시겠습니까? ");
        		System.out.println(alcoholicPriceEJ  );
        		System.out.println("1. 바로 결재하기 ");
        		System.out.println("2. 장바구니 담기 ");
        		System.out.print("번호를 입력해주세요 : ");
        		menuNum = sc.nextInt();
        		
        		switch(menuNum) {
        		case 1 : System.out.println(cardSlash()); break;
        		case 2 : foodList(foodlist); break;
        		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
        		}
        		
        		
        		}while (menuNum != 0);
        		
        		return "다음페이지로 넘어갑니다.";
        	}

        	public String Xalcoholic4X() {
        		
        		int menuNum ;
        		do {
        		System.out.println("잭다니엘 허니 주문을 완료하시겠습니까? ");
        		System.out.println(alcoholicPriceEJ  );
        		System.out.println("1. 바로 결재하기 ");
        		System.out.println("2. 장바구니 담기 ");
        		System.out.print("번호를 입력해주세요 : ");
        		menuNum = sc.nextInt();
        		
        		switch(menuNum) {
        		case 1 : System.out.println(cardSlash()); break;
        		case 2 : foodList(foodlist); break;
        		default : System.out.println("번호 입력이 잘못되었습니다 입력번호를 확인해주세요.");break;
        		}
        		
        		
        		}while (menuNum != 0);
        		
        		return "다음페이지로 넘어갑니다.";
        	}
	}

	


	
	

	
	
	


