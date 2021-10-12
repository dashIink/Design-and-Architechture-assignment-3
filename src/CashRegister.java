public class CashRegister {
    int currentProduct;
    ProductDB products;
    Display D;
    TicketPrinter T;

    public CashRegister(){
        products = new ProductDB();
        D = new Display();
        T  = new TicketPrinter();
    }
    public void setCurrentProductUPC (int x){
        currentProduct = x;
        Product printProduct = getCurrentProductInfo();
        D.displayText(printProduct.getName());
        D.displayText("$" + printProduct.getPrice());
        T.displayText(printProduct.getName());
        T.displayText("$" + printProduct.getPrice());
    }
    public Product getCurrentProductInfo (){
        return products.GetProductInfo(currentProduct);
    }
}
