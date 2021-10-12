import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Keyboard k = new Keyboard();
        Scanner c = new Scanner();
        System.out.println("Please enter a UPC");
        input = br.readLine();
        k.setUPCCode(Integer.parseInt(input));
        System.out.println("Please enter a UPC");
        input = br.readLine();
        c.scannedUPCCode(Integer.parseInt(input));
    }
}
