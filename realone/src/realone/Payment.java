package realone;

class Payment extends Drink {
String paymentMethod;
int tip;

public Payment(int orderNum, int tableNum, String customerName, String customerPhone, String pizzaType, int pizzaPrice, String drinkType, int drinkPrice, String paymentMethod, int tip) {
   super(orderNum, tableNum, customerName, customerPhone, pizzaType, pizzaPrice, drinkType, drinkPrice);
   this.paymentMethod = paymentMethod;
   this.tip = tip;
   this.totalPrice += tip;
}

public void printPaymentDetails() {
   System.out.println("Payment Method: " + paymentMethod);
   if (tip > 0) {
       System.out.println("Tip: " + tip + " EGP");
   }
   System.out.println("Total Price (with Tip): " + totalPrice + " EGP");
}
}