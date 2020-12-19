package package_Main;

import estoque.Controle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controle teste;
		
		teste = new Controle();
		
		teste.controleEstoque("TV", 10, 900.00);
		
		teste.reportStock();

	}

}
