import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    public Collection values(){
        return this.cart.values();
    }
    
    public void add (String product, int price){
        if(this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
        } else{
           this.cart.put(product, new Item(product, 1, price)); 
        }
        
    }

    public int price(){
       int sum = 0;
       for(Item item : cart.values()){
           sum += item.price();
       }
       return sum;
    }

    public void print(){
        for(Item item : cart.values()){
            System.out.println(item);
        }
    }
}