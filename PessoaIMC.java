public abstract class PessoaIMC extends Pessoa{
    
    protected float altura;
    protected float peso;

    //GETTERS E SETTERS
    public void setPeso(float n){

      if(n > 0 && n < 300){
        this.peso = n;
      }else{
        System.out.print("\nPeso inválido, digite novamente: ");
        n = input.nextFloat();
        setPeso(n);
      }
    
    }
    public float getPeso(){return this.peso;}

    public void setAltura(float n){
		
      if(n > 1 && n < 3){
        this.altura = n;
      }else{
        System.out.print("\nAltura inválida, digite novamente: ");
        n = input.nextFloat();
        setAltura(n);
      }
    }
    public float getAltura(){return this.altura;}

    //CALCULA IMC
    public float calculaIMC(){
      return(this.peso / ((this.altura)*(this.altura)));
    }

    public abstract String resultIMC();

    //TO STRING
    public String toString(){
      return("\nNome: " + this.nome + "\nData de Nascimento: " + this.dia + "/" + this.mes + "/" + this.ano + "\nPeso: " + this.peso + "\nAltura: " + this.altura);
    }

    //CONSTRUTORES
    public PessoaIMC(String nome, String sobrenome, int dia, int mes, int ano, float altura, float peso){
      super(nome, sobrenome, dia, mes, ano);
      setAltura(altura);
      setPeso(peso);
    }

    public PessoaIMC(String nome, String sobrenome, String cpf, int dia, int mes, int ano, float altura, float peso){
      super(nome, sobrenome, cpf, dia, mes, ano);
      setAltura(altura);
      setPeso(peso);
    }

}
