class Main{
	public static void main(String args[]){
		Variavel var;
		var=new Variavel();
		Interpretador inter;
		inter=new Interpretador();

		var.setNome("Jardel");
		var.setValor(19.0);
		Double a;
		String b;
		a=var.getValor();
		b=var.getNome();
		System.out.println(b +" "+a);
		inter.criaVariavel(var);
		a=inter.vetor[0].getValor();
		b=inter.vetor[0].getNome();
		System.out.println(a +" "+b);
		
	}

}