package estoque;

public class Controle {

	String name;
	double price;
	int quantity;

	public void controleEstoque(String name, int quantity, double price) {
		setName(name);
		setPrice(price);
		addQuantity(quantity);
	}

	public void addQuantity(int quantity) {
		int aux = getQuantity();
		aux += quantity;
		setQuantity(aux);
	}
	
	public void removeQuantity(int quantity) {
		int aux = getQuantity();
		aux -= quantity;
		setQuantity(aux);
	}
	
	public double totalStock() {
		return getQuantity() * getPrice();
	}
	
	public void printStock() {
		System.out.println("Nome Produto: " + getName());
		System.out.println("Pre�o Unit�rio: " + getPrice());
		System.out.println("Quantidade: " + getQuantity());
		System.out.println("Valor total " + totalStock());
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
