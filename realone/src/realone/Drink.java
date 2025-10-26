package realone;

class Drink extends Pizza {
	 String drinkType;
	 int drinkPrice;

	 public Drink(int orderNum, int tableNum, String customerName, String customerPhone, String pizzaType, int pizzaPrice, String drinkType, int drinkPrice) {
	     super(orderNum, tableNum, customerName, customerPhone, pizzaType, pizzaPrice);
	     this.drinkType = drinkType;
	     this.drinkPrice = drinkPrice;
	     this.totalPrice += drinkPrice;
	 }

	 public void printDrinkDetails() {
	     System.out.println("Drink: " + drinkType + " - " + drinkPrice + " EGP");
	 }
	}