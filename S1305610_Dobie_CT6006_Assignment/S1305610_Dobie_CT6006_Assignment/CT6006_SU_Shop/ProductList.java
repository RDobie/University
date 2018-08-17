
import java.util.ArrayList;
import java.util.Iterator;
/**
 * The ProductList class contains the dataset used by the program aswell as the searching algorithm
 * @author (Richard Dobie) 
 * @version (Version 1 17/05/16)
 */
public class ProductList
{
    // instance variables - replace the example below with your own
    ArrayList<Product> elements = new ArrayList<>();
    
    /**
     * Constructor for objects of class ProductList
     * This constructor contains the Dataset used in the software
     */
    public ProductList () {
       Product p1 = new Product(Product.ProductType.HOODIE, "University Hoodie ", "Black",19.99); 
       Product p2 = new Product(Product.ProductType.HOODIE, "University Hoodie ", "Blue",19.99);
       Product p3 = new Product(Product.ProductType.HOODIE, "University Hoodie ", "Grey",19.99);
       Product p4 = new Product(Product.ProductType.HOODIE, "University Hoodie ", "Red",19.99);
       
       Product p5 = new Product(Product.ProductType.TSHIRT, "University T-Shirt","Black", 15.99); 
       Product p6 = new Product(Product.ProductType.TSHIRT, "University T-Shirt","Blue", 15.99); 
       Product p7 = new Product(Product.ProductType.TSHIRT, "University T-Shirt","Grey", 15.99); 
       Product p8 = new Product(Product.ProductType.TSHIRT, "University T-Shirt","Red", 15.99); 
       
       Product p9 = new Product(Product.ProductType.MUG, "University Mug","white", 5.99); 
       Product p10 = new Product(Product.ProductType.MUG, "University Mug","Blue", 5.99);
       Product p11 = new Product(Product.ProductType.MUG, "University Mug","Red", 5.99);
       
       
       Product p12 = new Product(Product.ProductType.SCARF, "University Scarf","Black and blue", 10.99); 
       Product p13 = new Product(Product.ProductType.SCARF, "University Scarf","Black and Red", 10.99); 
       
       Product p14 = new Product(Product.ProductType.SHORTS, "University Shorts","Black", 29.99);
       Product p15 = new Product(Product.ProductType.SHORTS, "University Shorts","Blue", 29.99);
       Product p16 = new Product(Product.ProductType.SHORTS, "University Shorts","White", 29.99);
       
       Product p17 = new Product(Product.ProductType.HAT, "University Hat","Black and blue", 9.99);
       
       elements.add(p1);
       elements.add(p2);
       elements.add(p3);
       elements.add(p4);
       elements.add(p5);
       elements.add(p6);
       elements.add(p7);
       elements.add(p8);
       elements.add(p9);
       elements.add(p10);
       elements.add(p11);
       elements.add(p12);
       elements.add(p13);
       elements.add(p14);
       elements.add(p15);
       elements.add(p16);
       elements.add(p17);
       
    }
    
    public void showAllData(){
        
        Iterator iterator = elements.iterator();
        String s = "";
        while (iterator.hasNext()){
            Product p = (Product)iterator.next();
            System.out.println(p.toStringNoHTML());
        }
        
        
    }
    
    public void showResult(ArrayList<Product> result){
        Iterator iterator = elements.iterator();
        String s = "";
        while (iterator.hasNext()){
            Product p = (Product)iterator.next();
            System.out.println(p.toStringNoHTML());
        }
    }
        
        
    /**
     * Constructor for searching algorithm
     * This constructor contains the searching algorithm used to return results to users searches
     */
    public ArrayList<Product> search(double maxPrice, double minPrice, String p) {
        ArrayList<Product> result = new ArrayList<>();
        
        Product product;
        Product.ProductType productType;
        double productPrice;
        
  
        Iterator iterator = elements.iterator();
        /**
         * The code below shows where I have implemented my Linear Search algorithm,
         * this is able to compare the different products to the min and max price, reuslting
         * in the products the user searching for being displayed.
         */
        
        long sTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
                        
            product = (Product)iterator.next();
            productType = product.getProductType();
            productPrice = product.getPrice();
            
            System.out.println("Searching........ : " + productType + "---" + productPrice);

            if( product.productTypeToString(productType).compareTo( p ) == 0 &&  productPrice > minPrice && productPrice < maxPrice )
               result.add(product);
               
            }
        long eTime = System.currentTimeMillis();
        long timeNeeded = eTime - sTime;
        System.out.println ("Time needed:" + timeNeeded);
        return result;  
        
    }
    
 
}
