
public class Scanner {

	private CashRegister Cashregister = new CashRegister();
	
	public void scannedUPCCode(int UPCCode) {
		this.Cashregister.setCurrentProductUPC(UPCCode);
	}
	
}
