import java.util.ArrayList;

public class CashRegister {
    int currentProduct;
    ProductDB products;
    Display D;
    TicketPrinter T;
    ArrayList<VisualUpdate> ol;
    public CashRegister(){
        products = new ProductDB();
        ol=new ArrayList<VisualUpdate>();
        D = new Display();
        T  = new TicketPrinter();
        ol.add(D);
        ol.add(T);
    }
    public void setCurrentProductUPC (int x){
        currentProduct = x;
        Product printProduct = getCurrentProductInfo();
        updateObservers(printProduct.getName(), printProduct.getPrice());
    }
    public Product getCurrentProductInfo (){
        return products.GetProductInfo(currentProduct);
    }
    public void updateObservers(String name, int price){
        for (VisualUpdate o:ol){
            o.update(name, price);
        }
    }
}
