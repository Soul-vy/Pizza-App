package realone;

class Pizza extends CustomerOrder {
String pizzaType;
int pizzaPrice;

public Pizza(int orderNum, int tableNum, String customerName, String customerPhone, String pizzaType, int pizzaPrice) {
   super(orderNum, tableNum, customerName, customerPhone);
   this.pizzaType = pizzaType;
   this.pizzaPrice = pizzaPrice;
   this.totalPrice += pizzaPrice;
}

public void printPizzaDetails() {
   System.out.println("Pizza: " + pizzaType + " - " + pizzaPrice + " EGP");
}
}