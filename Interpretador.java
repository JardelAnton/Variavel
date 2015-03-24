class Interpretador{
	Variavel[] vetor= new Variavel[3];

	public Variavel getVariavel(String nome){
		Variavel var= new Variavel();
		/*for(int i=0;i<this.vetor.size();i++){
			System.out.println(vetor.size());
		}*/
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