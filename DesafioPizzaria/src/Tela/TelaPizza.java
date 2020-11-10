package Tela;

import java.util.Scanner;

import Sistema.Pizza;

public class TelaPizza {

	public static void main(String[] args) {
		double varAuxiliar = Double.MAX_VALUE;
		Pizza pizza = new Pizza("", 0, 0);
		Scanner teclado = new Scanner(System.in);
		System.out.println("==================== Pizzaria ====================");
		while (true) {
			System.out.println("Qual pizza deseja?\nBroto\nBaby\nPequena\nM�dia\nGrande\nExagerada\n0 - Sair");
			String nomeComercial = teclado.next();
			if (nomeComercial.equalsIgnoreCase("0")) {
				break;
			}
			System.out.println("Informe o tamanho da pizza (Em Cent�metros): ");
			float tamanhoPizza = teclado.nextFloat();
			System.out.println("Informe o pre�o da pizza: ");
			float precoPizza = teclado.nextFloat();
			pizza = new Pizza(nomeComercial, tamanhoPizza, precoPizza);
			String msg = pizza.adicionarPizza(pizza);
			System.out.println(msg);
			
		}
		for (int i = 0; i < pizza.getPizzas().length; i++) {
			if (pizza.getPizza(i)!=null) {
				if (varAuxiliar < pizza.getPizza(i).getPrecoPizza()) {
					varAuxiliar = i;
			}
			}
		}
		System.out.println("An�lise de custo benef�cio de cada pizza: ");
		for (int i = 0; i < pizza.getPizzas().length; i++) {
			if (pizza.getPizza(i)!=null) {
				System.out.println("Pizza: "+pizza.getPizzas()[i].getNomeComercial()+" Tamanho: "+pizza.getPizzas()[i].getTamanhoPizza()+
						" Cm Custo Benef�cio: R$"+pizza.getPizzas()[i].calcularCustoBeneficio(pizza)+"/Cm");
			}
		
		}

	}

}
