
public class Display implements VisualUpdate {
	
	public void displayText(String text) {
		System.out.println("Display: ");
		System.out.println(text);
	}

	public void update(String name, int price){
		displayText(name);
		displayText("$" + price);
	}
	
}
