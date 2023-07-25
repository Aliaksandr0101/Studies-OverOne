package Сollection;
import java.util.HashMap;
import java.util.Map;

public class ExampleEight {
    public void check(){
        Map<Float, String> product = new HashMap<>();
        product.put(78.7F, "Meat");
        product.put(8.7F, "Milk");
        product.put(7.7F, "Apple");
        product.put(18.7F, "Bananas");
        product.put(17.7F, "Cheese");
        product.put(2.7F, "Bread");
        product.put(5.7F, "Corn");
        product.put(45.7F, "Sour cream");
        product.put(8.7F, "Cat food");
        product.put(31.2F, "Vacuum cleaner");
        for (Map.Entry<Float, String> entry : product.entrySet()){
            System.out.println("HashMap product: cost = " + entry.getKey() + ", product - " + entry.getValue());
        }
    }
}
