public class Product {
    String name;
    int price;
    int UPCode;
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public int getUPCode(){
        return UPCode;
    }

    public void setPrice(int price){
       this.price = price;
    }
    public void setName(String name){
       this.name = name;
    }
    public void setUPCode(int UPCode){
        this.UPCode = UPCode;
    }
}
