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

		var.setNome("Lisle");
		var.setValor(16.0);
		inter.criaVariavel(var);

		var.setNome("Luany");
		var.setValor(5.0);
		inter.criaVariavel(var);

		var.setNome("Lara");
		var.setValor(3.0);
		inter.criaVariavel(var);

		var=inter.getVariavel("Lisle");
		System.out.println(var.getNome()+" "+var.getValor());
		var=inter.getVariavel("Jardel");
		System.out.println(var.getNome()+" "+var.getValor());
		var=inter.getVariavel("Luany");
		System.out.println(var.getNome()+" "+var.getValor());
		var=inter.getVariavel("Lisle");
		System.out.println(var.getNome()+" "+var.getValor());
		var=inter.getVariavel("Lara");
		System.out.println(var.getNome()+" "+var.getValor());
	}

}