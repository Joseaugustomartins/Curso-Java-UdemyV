package entities;

public class ProductEnAuto {
	public String name;
	public double price;
	public int quantity;
	
	/*public ProductEnAuto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}*/
	
	/*public ProductEnAuto(String name, double price) {
		this.name = name;
		this.price = price;
	} -> Criados manualmente
	
	*/
	public ProductEnAuto() {
		
	}
	
	public ProductEnAuto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductEnAuto(String name, double price) {
		this.name = name;
		this.price = price; // -> Criados automaticamente
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", R$ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " unidades, total: R$ "
			+ String.format("%.2f", totalValueInStock());
	}
}
