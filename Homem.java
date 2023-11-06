public class Homem extends PessoaIMC{
    
	//VARIÁVEL GÊNERO E O SETTER E GETTER
    private char genero;
	protected static int contH;

    public void setGenero(char g){
		this.genero = 'm';
    }
    public char getGenero(){return this.genero;}

	@Override
	public String resultIMC(){
		if(calculaIMC() < 20.7){
			return("IMC: " + String.valueOf(calculaIMC()) + " - abaixo do peso ideal.");	
		}else if(calculaIMC() <= 26.4){
			return("IMC: " + String.valueOf(calculaIMC()) + " - no peso ideal.");	
		}else{
			return("IMC: " + String.valueOf(calculaIMC()) + " - acima peso ideal.");
		}
	}

	//TO STRING
	/*public String toString(){
		return("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nGênero: Masculino" + "\nData de Nascimento: " + dia + "/" + mes + "/" + ano + " - Idade: " + idade + " anos" + "\nCPF: " + cpf + "\nAltura: " + altura + "cm\nPeso: " + peso + "kg");	
	}*/

	//CONSTRUTORES
	//public Homem(){}

	public Homem(String nome, String sobrenome, int dia, int mes, int ano, String cpf, float altura, float peso){
		super(nome, sobrenome, cpf, dia, mes, ano, altura, peso);
	}

    public Homem(String nome, String sobrenome, int dia, int mes, int ano, float altura, float peso){
		super(nome, sobrenome, dia, mes, ano, altura, peso);
	}
	
}
