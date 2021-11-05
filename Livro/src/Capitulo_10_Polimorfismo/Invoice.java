package Capitulo_10_Polimorfismo;

public class Invoice implements Payable {
	
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	// Construtor
	public Invoice(String partNumber, String partDescription, 
			int quantity, double pricePerItem) {
		
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity must be >= 0");
		}
		
		if (pricePerItem < 0.0) {
			throw new IllegalArgumentException("Price per item must be >= 0");
		}
		
		this.quantity = quantity;
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.pricePerItem = pricePerItem;
	} // fim do construtor
	
	public String getPartNumber() {
		return partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setQuantity(int quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity must be >= 0");
		}
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	// configura preço por item
	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem < 0.0) {
			throw new IllegalArgumentException("Price per item must be >= 0");
		}
		this.pricePerItem = pricePerItem;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	// retorno da representação String do objeto Invoice
	@Override
	public String toString() {
		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(),
				"quantity", getQuantity(), "price per item", getPricePerItem());
	}
	
	// método requerido para executar o contrato com a interface Payable
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calcula custo total
	}
}

