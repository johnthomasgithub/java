package logical;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class InvalidOrderException extends Exception {
  
public InvalidOrderException(String s) {
    super(s);
    
}
    
}

class ItemOutOfStockException extends Exception {
  //Your code goes here
    ItemOutOfStockException(String s){
        super(s);
    }
}

class Inventory {
    
    String itemId;
    String itemName;
    int quantity;
    double price;
     public Inventory(String itemId,String itemName,int quantity,double price){
        this.itemId=itemId;
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
    }
    public void setItemId(String itemId)
    {
        this.itemId=itemId;
    }
    public void setItemName(String itemName)
    {
        this.itemName=itemName;
    }
    public void setQuantity(int  quantity)
    {
        this.quantity=quantity;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public String getItemId()
    {
        return this.itemId;
    }
     public String getItemName()
    {
        return this.itemName;
    }
     public int  getQuantity()
    {
        return this.quantity;
    }
     public double getPrice()
    {
        return this.price;
    }
    
}

class Order {
    
    static Inventory[] stock;
    String orderId;
    String item;
    int orderQuantity;
    double totalAmount;
     public void calculateBill()
    {
        for(Inventory i:stock){
            if(item.equals(i.getItemName())){
                this.totalAmount = i.getPrice() * orderQuantity;
                updateStock(i.getItemId(),orderQuantity);
            }
        }
        
    }
    public void updateStock(String itemId,int quantity)
    {
        int k=-1;
        for(Inventory i:stock){
            k++;
            if(itemId == i.getItemId()){
         stock[k].setQuantity(i.getQuantity()-quantity); 
            }
        }
    }
    
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getOrderQuantity() {
        return orderQuantity;
    }
    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public static void setStock(Inventory st[])
    {    
        stock = Arrays.copyOf(st,st.length);
    }
  
    
}


class VendingMachineService {
 
    public String checkInventoryStatus(String item,int orderQuantity)
    {
        try{
        for(Inventory i:Order.stock)
        {
        	
            if(item.equalsIgnoreCase(i.getItemName())){
                if(i.getQuantity() >= orderQuantity){
                       return "Item in stock";
                }
            }
        }
            throw new ItemOutOfStockException("Item Out Of Stock");
        }
        catch(ItemOutOfStockException i){
            return i.getMessage();
        }
    }
 
    public String validateData(String orderId,String item,int orderQuantity)
    {
        
       try {
           orderId=orderId.toUpperCase();
        if(orderId!=null && orderId.length()==5) {

            if(orderId.substring(0,2).equals("OR") && (orderId.substring(2)).matches("[0-9]+")) {

                if(orderQuantity>0 && orderQuantity<=10) {
      
               String str = checkInventoryStatus(item,orderQuantity);
               if(str.equalsIgnoreCase("Item in stock")) {
            	  return "valid";
              }
               else
            	   return str;
                   
                
            }
            }
       }
       throw new InvalidOrderException("invalid Order");
       }
       catch(InvalidOrderException e) {
              return e.getMessage();
       }
   }
    public String generateBill(Order order){
         order.calculateBill();
        return "Order Id:"+order.getOrderId()+"\n"+"Amount:Rs."+order.getTotalAmount();
    }
    public String processOrder(String orderId,String item,int orderQuantity)
    {
        String val=validateData(orderId,item,orderQuantity);
        //return "";
        if(val.equals("valid"))
        {
            Order or=new Order();
            or.setOrderId(orderId);
            or.setItem(item);
            or.setOrderQuantity(orderQuantity);
            val = generateBill(or);
        }
        return val;
    }
}

public class Solution{
  
    public static void main(String[] args) {
        // Creating the inventory
        Inventory[] stock = new Inventory[5];
        stock[0] = new Inventory("C101", "Lays Potato Chips", 10, 30.00);
        stock[1] = new Inventory("C102", "Water", 12, 20.00);
        stock[2] = new Inventory("C103", "Pepsi", 25, 15.00);
        stock[3] = new Inventory("C104", "Coke", 0, 15.00);
        stock[4] = new Inventory("C105", "DairyMilk Silk", 30, 45.00);
        Order.setStock(stock);
      
         Scanner input = new Scanner(System.in);
        // Item to place order
      String orderid=input.next();
      String item = input.next();
      int quantity = input.nextInt();
      VendingMachineService vm = new VendingMachineService();
      System.out.println(vm.processOrder(orderid, item, quantity));
    }
}