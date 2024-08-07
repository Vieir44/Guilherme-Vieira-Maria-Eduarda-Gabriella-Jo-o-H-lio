package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioCaixa {

	public static void main(String[] args) {
		ArrayList<String> ing = new ArrayList();
		ArrayList<Double> precos = new ArrayList();
		Scanner ler = new Scanner(System.in);

		String produtos;
		double valor;
	

		while(0) {

			System.out.println("Quais são os produtos que você deseja adicionar");
			do {
				produtos = ler.nextLine();

				if(produtos != "X") {
					ing.add(produtos);

				}

				System.out.println("Qual é o valor do produto, caso deseje terminar digite 0");
				do {
					valor = ler.nextInt();

					if(valor != 0) {
						precos.add(valor);
					

					}
					
				
			

				
				


			

