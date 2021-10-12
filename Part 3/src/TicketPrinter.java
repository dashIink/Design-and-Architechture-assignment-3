
public class TicketPrinter implements VisualUpdate {

	public void displayText(String text) {
		System.out.println("Ticket Printer: ");
		System.out.println(text);
	}
	public void update(String name, int price){
		displayText(name);
		displayText("$" + price);
	}
	
}
