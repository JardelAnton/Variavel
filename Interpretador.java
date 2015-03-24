class Interpretador{
	Variavel[] vetor= new Variavel[5];

	public Variavel getVariavel(String name){
		Variavel var= new Variavel();
		int i=0;
		 while(vetor[i]!=null){
		 	if(vetor[i].getNome().equals(name)){
		 	var=vetor[i];
		 }
		 	i++;
		 }
		return var;
	}
	public void criaVariavel(Variavel v){
		 int i=0;
		 while(vetor[i]!=null){
		 	i++;
		 }
		 vetor[i]=new Variavel();
		 vetor[i].setNome(v.getNome());
		 vetor[i].setValor(v.getValor());
	}	
}