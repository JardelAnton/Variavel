class Main{
	public static void main(String args[]){
		Variavel var;
		var=new Variavel();
		Interpretador inter;
		inter=new Interpretador();

		var.setNome("Abacaxi");
		var.setValor(19.0);
		Double a;
		String b;
		a=var.getValor();
		b=var.getNome();
		System.out.println("vetor[0].nome= "+b +" vetor[0].valor= "+a);

		inter.criaVariavel(var);

		var.setNome("Abobora");
		var.setValor(16.0);
		inter.criaVariavel(var);

		var.setNome("Ananaz");
		var.setValor(5.0);
		inter.criaVariavel(var);

		var.setNome("Abacate");
		var.setValor(3.0);
		inter.criaVariavel(var);

		var=inter.getVariavel("Ananaz");
		System.out.println(var.getNome()+" "+var.getValor());
		var=inter.getVariavel("Abobora");
		System.out.println(var.getNome()+" "+var.getValor());
		var=inter.getVariavel("Abacate");
		System.out.println(var.getNome()+" "+var.getValor());
		var=inter.getVariavel("Abacaxi");
		System.out.println(var.getNome()+" "+var.getValor());
		var=inter.getVariavel("Abobora");
		System.out.println(var.getNome()+" "+var.getValor());
	}

}