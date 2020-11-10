package Sistema;

public class Pizza {
	private String nomeComercial;
	private float tamanhoPizza;
	private float precoPizza;
	private Pizza pizzas[] = new Pizza[100];

	
	public Pizza(String nomeComercial, float tamanhoPizza, float precoPizza) {
		setNomeComercial(nomeComercial);
		setTamanhoPizza(tamanhoPizza);
		setPrecoPizza(precoPizza);
	}
	
	public Pizza[] getPizzas() {
		return pizzas;
	}
	public Pizza getPizza(int i) {
		return pizzas[i];
	}

	public void setPizza(Pizza[] pizza) {
		this.pizzas = pizza;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}
	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}
	public float getTamanhoPizza() {
		return tamanhoPizza;
	}
	public void setTamanhoPizza(float tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}
	public float getPrecoPizza() {
		return precoPizza;
	}
	public void setPrecoPizza(float precoPizza) {
		this.precoPizza = precoPizza;
	}
	
	public String adicionarPizza(Pizza pizzaAdicionar) {
		int i = 0;
		for (i = 0; i < pizzas.length; i++) {
			if (pizzas[i] == null) {
				pizzas[i] = pizzaAdicionar;
				return "Certo";
				
				
			}
		}
		return "errado";
	}
	
	public float calcularCustoBeneficio(Pizza pizza) {
		//double areaPizza = Math.PI * (Math.pow(tamanhoPizza/2.0, 2));
		float custoPorPedaco = pizza.getPrecoPizza()/pizza.getTamanhoPizza();
		return custoPorPedaco;
	}
	
	//public float calcularDiferenca()
	
}
