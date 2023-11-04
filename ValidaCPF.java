//import java.util.*;

public class ValidaCPF{

	//VERIFICA SE O CPF RECEBIDO É VÁLIDO
	public static boolean isCPF(String cpf){

		char d10; char d11;	
		int soma = 0; int peso = 0; int resto = 0;

		//VALIDANDO SE O CPF INSERIDO POSSUÍ REPETIÇÕES
		if(cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") ||
		   cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") || cpf.equals("77777777777") ||	
		   cpf.equals("88888888888") || cpf.equals("99999999999")){return(false);}

		//VALIDANDO SE O CPF INSERIDO POSSUÍ APENAS COM NÚMEROS
		if(cpf.length() == 11){
		
			for(int i = 0; i < 11; i++){
				
				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

			}
			
			//ENCONTRANDO O 1 DÍGITO VERIFICADOR
			peso = 10;
			for(int i = 0; i < 9; i++){

				soma += ((int)(cpf.charAt(i)-48)) * peso;
				peso = peso-1;

			}
			resto = 11 - (soma%11);
			if(resto == 10 || resto == 11){
				d10 = '0';
			}else{d10 = (char)(resto + 48);}
		
			//System.out.println("DIGITO 10 DO CPF: " + cpf.charAt(9) + " DIGITO DE VERIFICAÇÃO: " + d10);

			//ENCONTRANDO O 2 DÍGITO VERIFICADOR
			soma = 0; resto = 0;
			peso = 11;
			for(int i = 0; i < 10; i++){

				soma += ((int)(cpf.charAt(i)-48)) * peso;
				peso = peso-1;

			}
			resto = 11 - (soma%11);
			if(resto == 10 || resto == 11){
				d11 = '0';
			}else{d11 = (char)(resto + 48);}

			//System.out.println("DIGITO 11 DO CPF: " + cpf.charAt(10) + " DIGITO DE VERIFICAÇÃO: " + d11);

			//TESTANDO PARA VER SE OS DÍGITOS DE VERIFICAÇÃO SÃO VÁLIDOS
			if(d10 == cpf.charAt(9) && d11 == cpf.charAt(10)){
				
			}else{return(false);}

		//VALIDANDO ENTRADA DO CPF PORÉM COM OS SEPARADORES, ENCONTRANDO OS DÍGITOS DE VERIFICAÇÃO E USANDO DOS LAÇOS PARA CRIAR UMA VARIAVEL LONG COM O CPF
		}else if(cpf.length() == 14){
			
			//VALIDANDO OS CARACTERES QUE SEPARAM OS NÚMEROS
			if(cpf.charAt(3) == '.' || cpf.charAt(7) == '.' || cpf.charAt(3) == ' ' || cpf.charAt(7) == ' '){
				
			}else{return(false);}

			//VALIDANDO O CARACTERE QUE SEPARAM OS 2 ÚLTIMOS DÍGITOS DO RESTO
			if(cpf.charAt(11) == ' ' || cpf.charAt(11) == '/' || cpf.charAt(11) == '-'){

			}else{return(false);}

			//TESTANDO SE OS 3 PRIMEIROS DÍGITOS SÃO NÚMEROS E ENCONTRANDO O 1 DÍGITO DE VERIFICAÇÃO JUNTO (UTILIZANDO OS MESMOS LAÇOS DE REPETIÇÃO)
			peso = 10; resto = 0; soma = 0;
			for(int i = 0; i < 3; i++){

				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

				soma += ((int)(cpf.charAt(i)-48)) * peso;
				peso = peso-1;

			}

			//TESTANDO SE OS 3 DÍGITOS DO MEIO SÃO NÚMEROS E ENCONTRANDO O 1 DÍGITO DE VERIFICAÇÃO JUNTO
			for(int i = 4; i < 7; i++){

				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

				soma += ((int)(cpf.charAt(i)-48)) * peso;
				peso = peso-1;

			}

			//TESTANDO SE OS 3 ÚLTIMOS DÍGITOS SÃO NÚMEROS E ENCONTRANDO O 1 DÍGITO DE VERIFICAÇÃO JUNTO
			for(int i = 8; i < 11; i++){

				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

				soma += ((int)(cpf.charAt(i)-48)) * peso;
				peso = peso-1;

			}

			//ATRIBUINDO VALOR AO 1 DÍGITO DE VERIFICAÇÃO
			resto = 11 - (soma%11);
			if(resto == 10 || resto == 11){
				d10 = '0';
			}else{d10 = (char)(resto + 48);}

			//TESTANDO SE OS 2 ÚLTIMOS DÍGITOS SÃO NÚMEROS
			for(int i = 12; i <= 13; i++){

				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

			}

			//System.out.println("DIGITO 10 DO CPF: " + cpf.charAt(12) + " DIGITO DE VERIFICAÇÃO: " + d10);

			//ENCONTRANDO O 2 DÍGITO DE VERIFICAÇÃO
			peso = 11; resto = 0; soma = 0;
			for(int i = 0; i < 3; i++){

				soma += ((int)(cpf.charAt(i)-48)) * peso;
				peso = peso-1;

			}

			for(int i = 4; i < 7; i++){

				soma += ((int)(cpf.charAt(i)-48)) * peso;
				peso = peso-1;

			}

			for(int i = 8; i < 11; i++){

				soma += ((int)(cpf.charAt(i)-48)) * peso;
				peso = peso-1;

			}

			soma += ((int)(cpf.charAt(12)-48)) * peso;

			resto = 11 - (soma%11);
			if(resto == 10 || resto == 11){
				d11 = '0';
			}else{d11 = (char)(resto + 48);}

			//System.out.println("DIGITO 11 DO CPF: " + cpf.charAt(13) + " DIGITO DE VERIFICAÇÃO: " + d11);

			//TESTANDO PARA VER SE OS DÍGITOS DE VERIFICAÇÃO SÃO VÁLIDOS
			if(d10 == cpf.charAt(12) && d11 == cpf.charAt(13)){
				
			}else{return(false);}

		//VALIDANDO ENTRADAS COM TAMANHOS ERRADOS	
		}else{return(false);}

		return(true);

	}

	//CONVERTE O CPF DE STRING PARA LONG
	public static long isLong(String cpf){

		long cpfLong = 0; int i;
		String cpfDigitos = "";

		//PRIMEIRO VERIFICA SE O CPF RECEBIDO É VÁLIDO UTILIZANDO O MÉTODO DE VALIDAÇÃO
		if(isCPF(cpf)){

			//CASO ENTRE APENAS COM OS DÍGITOS DO CPF CONVERTE PARA LONG USANDO O PARSE
			if(cpf.length() == 11){

				cpfLong = Long.parseLong(cpf);
			
			//CASO ENTRE COM OS DÍGITOS DE SEPARAÇÃO JOGA PARA UMA STRING SEM OS DÍGITOS E DEPOIS CONVERTE USANDO O PARSE
			}else{
				//126.914.127-92
				//01234567890123
				for(i = 0; i < 3; i++){
					cpfDigitos = cpfDigitos + (String.valueOf(cpf.charAt(i)));
				}
				for(i = 4; i < 7; i++){
					cpfDigitos = cpfDigitos + (String.valueOf(cpf.charAt(i)));
				}
				for(i = 8; i < 11; i++){
					cpfDigitos = cpfDigitos + (String.valueOf(cpf.charAt(i)));
				}
				for(i = 12; i <= 13; i++){
					cpfDigitos = cpfDigitos + (String.valueOf(cpf.charAt(i)));
				}

				cpfLong = Long.parseLong(cpfDigitos);

			}

		}
		
		return(cpfLong);
		
	}

	//MÉTODO MAIN PARA DEBUG
	/*public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		String cpf;
		long cpfLong;

		System.out.print("Digite o CPF: ");
		cpf = input.nextLine();
		cpfLong = ValidaCPF.isLong(cpf);

		System.out.println("\nCPF VÁLIDO: " + isCPF(cpf));
		System.out.println("CPF LONG: " + cpfLong);

		input.close();

	}*/

}
