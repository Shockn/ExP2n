public class Mulher extends PessoaIMC{
    
	//VARIÁVEL GÊNERO E O SETTER E GETTER
    private char genero;
	protected static int contM;

    public void setGenero(char g){
		this.genero = 'f';
    }
    public char getGenero(){return this.genero;}

	@Override
	public String resultIMC(){
		if(calculaIMC() < 19){
			return("IMC: " + String.valueOf(calculaIMC()) + " - abaixo do peso ideal.");	
		}else if(calculaIMC() <= 25.8){
			return("IMC: " + String.valueOf(calculaIMC()) + " - no peso ideal.");	
		}else{
			return("IMC: " + String.valueOf(calculaIMC()) + " - acima peso ideal.");
		}
	}

	//TO STRING
	/*public String toString(){
		return("\nNome: " + nome + "\nSobrenome: " + sobrenome +  "\nGênero: Feminino" + "\nData de Nascimento: " + dia + "/" + mes + "/" + ano + " - Idade: " + idade + " anos" + "\nCPF: " + cpf +"\nAltura: " + altura + "cm\nPeso: " + peso + "kg");	
	}*/

	//CONSTRUTORES
	//public Mulher(){super();};

    public Mulher(String nome, String sobrenome, int dia, int mes, int ano, int altura, int peso){
		super(nome, sobrenome, dia, mes, ano, altura, peso);
	}

	public Mulher(String nome, String sobrenome, int dia, int mes, int ano, String cpf, float altura, float peso){
		super(nome, sobrenome, cpf, dia, mes, ano, altura, peso);
	}

}
