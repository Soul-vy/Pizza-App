package realone;

class TakeOrder {
int orderNumber;
int tableNumber;
int totalPrice;

public TakeOrder(int orderNum, int tableNum) {
   this.orderNumber = orderNum;
   this.tableNumber = tableNum;
   this.totalPrice = 0;
}
}