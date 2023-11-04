import java.util.*;

public class Pessoa{

	//VARIÁVEIS
	protected String nome;
	protected String sobrenome;
	protected GregorianCalendar dataNascimento = new GregorianCalendar();

	protected int dia, mes, ano, idade;
	//protected float peso;
	//protected float altura;
	protected long cpf;
	protected static int contador = 0;

	protected Scanner input = new Scanner(System.in);

	//GETTERS AND SETTERS

	//NOME
	public void setNome(String n){

		char[] nChar = n.toCharArray();
		for(char i: nChar){
			if(Character.isDigit(i)){
				System.out.print("\nNome inválido, digite novamente: ");
				n = input.nextLine();
				setNome(n);
				break;
			}
		}
		if(n.length() <= 1){
			System.out.print("\nNome inválido, digite novamente: ");
			n = input.nextLine();
			setNome(n);
		}else{this.nome = n;}

	}
	public String getNome(){return this.nome;}
	
	//SOBRENOME
	public void setSobrenome(String n){

		char[] nChar = n.toCharArray();
		for(char i: nChar){
			if(Character.isDigit(i)){
				System.out.print("\nNome inválido, digite novamente: ");
				n = input.nextLine();
				setSobrenome(n);
				break;
			}
		}
		
		if(n.length() <= 1 || n.matches("[0-9]*")){
			System.out.print("\nSobrenome inválido, digite novamente: ");
			n = input.nextLine();
			setSobrenome(n);
		}else{this.sobrenome = n;}

	}
	public String getSobrenome(){return this.sobrenome;}

	//CPF
	public void setCpf(String c){

		if(ValidaCPF.isCPF(c)){
			this.cpf = ValidaCPF.isLong(c);
		}else{
			System.out.print("\nCPF inválido, digite novamente: ");
			c = input.nextLine();
			setCpf(c);
		}

	}
	public long getCpf(){return cpf;}

	/*PESO
	public void setPeso(Double n){

		if(n > 0 && n < 300){
			this.peso = n;
		}else{
			System.out.print("\nPeso inválido, digite novamente: ");
			n = input.nextDouble();
			setPeso(n);
		}
	
	}
	public double getPeso(){return this.peso;}

	//ALTURA
	public void setAltura(double n){
		
		try{
			if(n > 1 && n < 3){
			this.altura = n;
			}else{
				System.out.print("\nAltura inválida, digite novamente: ");
				n = input.nextDouble();
				setAltura(n);
			}
		}catch(Exception e){
			System.out.print("\nAltura inválida, digite novamente: ");
			n = input.nextDouble();
			setAltura(n);
		}
		
	}
	public double getAltura(){return this.altura;}*/

	//DATA DE NASCIMENTO
	public void setDataNascimento(int a, int m, int d){
		if(ValidaData.validData(d, m, a)){
			this.dataNascimento = new GregorianCalendar(a, m, d);
			this.dia = dataNascimento.get(Calendar.DAY_OF_MONTH);
			this.mes = dataNascimento.get(Calendar.MONTH);
			this.ano = dataNascimento.get(Calendar.YEAR);
			this.idade = ValidaData.idade(d, m, a);
		}else{
			System.out.print("\nData inválida, digite o DIA novamente: ");
			d = input.nextInt();
			System.out.print("\nData inválida, digite o MÊS novamente: ");
			m = input.nextInt();
			System.out.print("\nData inválida, digite o ANO novamente: ");
			a = input.nextInt();
			setDataNascimento(a, m, d);
		}
		
	}
	public GregorianCalendar getDataNascimento(){return(this.dataNascimento);}

	//CONTADOR DE INSTÂNCIAS
	protected void setNumPessoas(){
		contador++;
	}
	public static int numPessoas(){return(contador);}

	/*TO STRING
	public String toString(){
		return("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nCPF: " + cpf + "\nData de Nascimento: " + dia + "/" + mes + "/" + ano + " - Idade: " + idade + " anos" + "\nAltura: " + altura + "cm\nPeso: " + peso + "kg");	
	}*/

	//MÉTODOS CONSTRUTORES DA CLASSE
	//public Pessoa(){};

	public Pessoa(String nome, String sobrenome, int dia, int mes, int ano){
		setNome(nome);
		setSobrenome(sobrenome);
		setDataNascimento(ano, mes, dia);
		setNumPessoas();
	}

	public Pessoa(String nome, String sobrenome, String cpf, int dia, int mes, int ano){
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);	
		setDataNascimento(ano, mes, dia);
		setNumPessoas();
	}

	/*public static void main(String args[]){
		
		Pessoa p1 = new Pessoa();
		p1.setDataNascimento(2045, 8, 28);
		System.out.println("DATA GC: " + p1.getDataNascimento());
		System.out.println(p1);


	}*/

}
