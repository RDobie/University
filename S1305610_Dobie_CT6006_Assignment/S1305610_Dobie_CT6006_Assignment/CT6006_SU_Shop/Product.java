/**
 * The Product Class contains the variables relating to University SU Products displayed to the user
 * @author (Richard Dobie)
 * @version (Version 1 17/05/16)
 */
public class Product
{
    // instance variables - replace the example below with your own
    public enum ProductType {
        HOODIE, TSHIRT, MUG, SCARF,SHORTS,HAT
    }

    private ProductType Type;
    private String Name;
    private String Description;
    private double Price;
    
    /**
     * This code below creates the different product types, i.e. HOODIE,
     * TSHIRT, MUG,SCARF, SHORTS and HAT.
     */
    public String productTypeToString (ProductType p ) {
        if(p == ProductType.HOODIE) return "HOODIE";
        
        if(p == ProductType.TSHIRT) return "TSHIRT";
        
        if(p == ProductType.MUG) return "MUG";
        
        if(p == ProductType.SCARF) return "SCARF";
        
        if(p == ProductType.SHORTS) return "SHORTS";
        
        if(p == ProductType.HAT) return "HAT";
        return null;
    }
    
    /**
     * constructor for objects of class Product
     */
    public Product(ProductType T, String N, String D, double P) {
        Type = T;
        Name = N;
        Description = D;
        Price = P;
    }
    
    /**
     * This sets the type of the product
     */
    public void setProductType (ProductType T) {
        Type = T;
    }

    /**
     * This gets the type of the product after it has been set
     */
    public ProductType getProductType () {
        return Type;
    }
    
    /**
     * This sets the name of the product
     */
    public void setName (String N) {
        Name = N;
    }
    
    /**
     * This gets the name of the product after it has been set
     */
    public String getName () {
        return Name;
    }
    
    /**
     * This sets the description of the product
     */
    public void setDescription (String d) {
        Description = d;
    }
    
    /**
     * This gets the description of the product after it has been set
     */
    public String getDescription () {
        return Description;
    }
    
    /**
     * This sets the price of the product
     */
    public void setPrice(double p) {
        
        Price = p;
    }
    
    /**
     * This gets the price of the product after it has been set
     */
    public double getPrice() {
        return Price;
    }
    
    /**
     * Search results displayed in the GUI of possible products that match search criteria
     */
    public String toString() {
        String totalProdDesc = "<html><br><html>";
        
        totalProdDesc = totalProdDesc + "Name:" + "&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;" + Name + "&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;" + "Description:" + "&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;" + Description + "&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;" + "Price:" + "&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;" +Price + "<html><br><html>";
        
        
        return totalProdDesc;
    }
    
    /**
     * Search results displayed in the GUI of possible products that match search criteria
     */
     public String toStringNoHTML() {
        String totalProdDesc = "";
        
        totalProdDesc = totalProdDesc + Name + "--" + Description + "--" + Price + "";
        
        
        return totalProdDesc;
    }
}
