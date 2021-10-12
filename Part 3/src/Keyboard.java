
public class Keyboard {

	private CashRegister Cashregister = new CashRegister();
	
	public void setUPCCode(int UPCCode) {
		this.Cashregister.setCurrentProductUPC(UPCCode);
	}
	
}
