
public class Driver {
    public static void main(String[] args)
    {
        String input;
        Keyboard k = new Keyboard();
        Scanner c = new Scanner();
        System.out.println("Please enter a UPC");
        input = System.console().readLine();
        k.setUPCCode(Integer.parseInt(input));
        System.out.println("Please enter a UPC");
        input = System.console().readLine();
        c.scannedUPCCode(Integer.parseInt(input));
    }
}
