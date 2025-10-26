package realone;

class OrderDetailsPrint extends Payment {

public OrderDetailsPrint(int orderNum, int tableNum, String customerName, String customerPhone, String pizzaType, int pizzaPrice, String drinkType, int drinkPrice, String paymentMethod, int tip) {
   super(orderNum, tableNum, customerName, customerPhone, pizzaType, pizzaPrice, drinkType, drinkPrice, paymentMethod, tip);
}

public void printAllDetails() {
   printCustomerDetails();
   printPizzaDetails();
   printDrinkDetails();
   printPaymentDetails();
}
}