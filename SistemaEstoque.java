package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.ProdutoInformatica;
import util.GeradorCodigo;

public class SistemaEstoque {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);

	 System.out.print("Quantos produtos serao cadastrados? ");
	 int n = sc.nextInt();
	    
	 
	 List<ProdutoInformatica> produtos = new ArrayList<>();
	 
	
	 
	 	for(int i = 0; i<n;i++) {
	 		System.out.println("Produto " + (i+1)+ "#\n");
	 	int cat;
	 	String categoria = "";
	 	String prefixo = "";
	 	
	 	do {	
	 		
	 		System.out.println("Selecione a categoria");
	 		System.out.println("1 - Mouse");
	 		System.out.println("2 - Teclado");
	 		System.out.println("3 - Monitor");
	 		System.out.println("4 - Processador");
	 		System.out.println("5 - Placa de video");
	 		System.out.println();
	 	cat = sc.nextInt();
	 	
	 	switch(cat) {
	 		case 1:
	 			categoria = "Mouse";
	 			prefixo = "MOUS";
	 			break;
	 		case 2:
	 			categoria = "Teclado";
	 			prefixo = "TECL";
	 			break;
	 		case 3:
	 			categoria = "Monitor";
	 			prefixo = "MONI";
	 			break;
	 		case 4:
	 			categoria = "Processador";
	 			prefixo = "PROC";
	 			break;
	 		case 5:
	 			categoria = "Placa de video";
	 			prefixo = "PLAC";
	 			break;
	 		
	 		default:
	 			System.out.println("Opção invalida!! Tente novamente seu JAO");
	 			break;
	 	}
	 			
	 	}while(cat < 1 || cat > 5);
	 	
	 		sc.nextLine();
	 		System.out.print("Nome: ");
	 		String nome = sc.nextLine();
	 		System.out.print("MARCA: ");
	 		String marca = sc.nextLine();
	 		
	 		String preFixoMarca;
	 		
	 		if(marca.length() >= 4) {
	 			preFixoMarca = marca.substring(0, 4).toUpperCase();
	 			
	 		}
	 		else {
	 			preFixoMarca = marca.toUpperCase(); 
	 		}
	 		
	 		String preFixoCompleto = prefixo + "-" + preFixoMarca  ;
	 		
	 		int numero = 1;
	 				
	 		for(ProdutoInformatica produto : produtos) {
	 			if(produto.getCategoria().equals (categoria)) {
	 				numero++;
	 			}
	 				
	 		}
	 		
	 		String codigo = GeradorCodigo.gerarCodigo(preFixoCompleto, numero);
	 		System.out.println("Codigo gerado: " + codigo);
	 		
	 		System.out.print("Preco: ");
	 		double preco = sc.nextDouble();
	 		System.out.print("Quantidade: ");
	 		int quantidade =sc.nextInt();
	 	
	 		ProdutoInformatica produto = new ProdutoInformatica( codigo ,nome, preco, quantidade, categoria, marca );
	 		produtos.add(produto);
	 }   
	 	System.out.println("\n===== PRODUTOS CADASTRADOS =====\n");
	 	
	 		for(ProdutoInformatica produto : produtos ) {
	 			System.out.println(produto);
	 			System.out.println("------------------------------\n");
	 		}
	 			
	 	
	 	
	 	
	 
	 	sc.close();
	}

}

