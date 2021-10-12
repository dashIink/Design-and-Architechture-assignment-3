import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ProductDB {
    public static ArrayList<Product> productOut = new ArrayList();
    public ProductDB(){
        try {
            FileReader fr = new FileReader("database.txt");
            BufferedReader reader = new BufferedReader(fr);

            String line;
            while ((line = reader.readLine()) != null) {
                String[] productDetails = line.trim().split(",");
                Product product = new Product();
                product.setUPCode(Integer.parseInt(productDetails[0]));
                product.setName(productDetails[1]);
                product.setPrice(Integer.parseInt(productDetails[2]));
                productOut.add(product);
            }

        }
        catch(Exception e){

        }
    }
    public static Product GetProductInfo(int x){
        for (int i = 0; i < productOut.size(); i++) {
            if (productOut.get(i).getUPCode() == x) {
                return productOut.get(i);
            }
        }
        Product product = new Product();
        product.setUPCode(0);
        product.setName("No Item Found");
        product.setPrice(0);
        return product;

    }


}
