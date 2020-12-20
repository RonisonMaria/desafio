package package_Main;

import estoque.Controle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int add = 5;
		int remove = 2;
		
		Controle teste;
		
		teste = new Controle();
		teste.controleEstoque("TV", 10, 900.00);
		teste.printStock();
		

		
		System.out.println("\n=======Romovendo=Produto==========");
		System.out.println("Qtd. itens removidos: " + remove);
		teste.removeQuantity(remove);		
		teste.printStock();

		System.out.println("\n=======Adicionando=Produto==========");
		System.out.println("Qtd. itens adicionados: " + add);
		teste.addQuantity(add);
		teste.printStock();
		
	}

}
