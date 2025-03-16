/*
 *  implement classes for the given scenario:
	- A reatail store which can store,edit,and delete 
multible products like fruits, vegetables, grocery, etc..
	- display the avilabe products like price, name, 
	quantity
 * 
 */
import java.util.*;
abstract class Store{
    String storename;
    String storelocation;

    Store(String storename, String storelocation){
        this.storename = storename;
        this.storelocation = storelocation;
    }

    public String getStorename(){
        return storename;
    }
    public String getStorelocation(){
        return storelocation;
    }
    abstract public void displaydetails();
}

class Fruit extends Store{
    private double fruitprice;
    private int fruitquantity;
    public Fruit(String storename, String storelocation, double fruitprice, int fruitquantity){
        super(storename, storelocation);
        this.fruitprice = fruitprice;
        this.fruitquantity = fruitquantity;

    }

    public void displaydetails(){
        System.out.println("Storename :"+getStorename());
        System.out.println("Storelocation :"+ getStorelocation());
        System.out.println("Fruitprice :"+ fruitprice);
        System.out.println("Fruitquantity :"+ fruitquantity);
    }

}

class Vegitable extends Store{
    private double vegitableprice;
    private int vegitablequantity;
    public Vegitable(String storename, String storelocation, double vegitableprice, int vegitablequantity){
        super(storename, storelocation);
        this.vegitableprice = vegitableprice;
        this.vegitablequantity = vegitablequantity;
    }

    public void displaydetails() {
        System.out.println("Storename :" + getStorename());
        System.out.println("Storelocation :" + getStorelocation());
        System.out.println("Vegitableprice :" + vegitableprice);
        System.out.println("Vegitablequantity :" + vegitablequantity);
    }
    
} 

class Grocery extends Store{
    private double groceryprice;
    private int groceryquantity;
    public Grocery (String storename, String storelocation, double groceryprice, int groceryquantity){
        super(storename, storelocation);
        this.groceryprice = groceryprice;
        this.groceryquantity = groceryquantity;
    }

    public void displaydetails() {
        System.out.println("Storename :" + getStorename());
        System.out.println("Storelocation :" + getStorelocation());
        System.out.println("Groceryprice :" + groceryprice);
        System.out.println("Groceryquantity :" + groceryquantity);
    }

}
class StoreLoc{
    private ArrayList<Store> stores  = new ArrayList<>();
    public void adddetails(Store store){
        stores.add(store);
    }

    public void displayInformation(){
        for(Store storee:stores){
            storee.displaydetails();
        }
    }
}
public class exercise8 {
    public static void main(String[] args){
        StoreLoc lc = new StoreLoc();
        lc.adddetails(new Fruit("Fruit Store", "Location A", 10.5, 50));
        lc.adddetails(new Vegitable("Vegetable Store", "Location B", 5.0, 100));
        lc.adddetails(new Grocery("Grocery Store", "Location C", 20.0, 200));
        lc.displayInformation();

    }
    
}
