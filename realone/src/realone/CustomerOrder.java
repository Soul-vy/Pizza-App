package realone;

class CustomerOrder extends TakeOrder {
String customerName;
String customerPhone;

public CustomerOrder(int orderNum, int tableNum, String customerName, String customerPhone) {
   super(orderNum, tableNum);
   this.customerName = customerName;
   this.customerPhone = customerPhone;
}

public void printCustomerDetails() {
   System.out.println("Customer: " + customerName + " (" + customerPhone + ")");
}
}