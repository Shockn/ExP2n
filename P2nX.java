import java.util.*;

public class P2nX {
    
    public static void main(String[] args){

        /*Scanner input = new Scanner(System.in);
        int arrayNum; String arrayNumS;

        while(true){
            if(args[2].charAt(0) == 'm' || args[2].charAt(0) == 'M' && args.length == 6){
                Homem p = new Homem(args[0], args[1], args[2].charAt(0), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
                System.out.println(p);
                break;
            }else if(args[2].charAt(0) == 'm' || args[2].charAt(0) == 'M' && args.length == 9){
                Homem p = new Homem(args[0], args[1], args[2].charAt(0), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), args[6], Double.parseDouble(args[7]), Double.parseDouble(args[8]));
                System.out.println(p);
                break;
            }else if(args[2].charAt(0) == 'f' || args[2].charAt(0) == 'F'  && args.length == 6){
                Mulher p = new Mulher(args[0], args[1], args[2].charAt(0), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
                System.out.println(p);
                break;
            }else if(args[2].charAt(0) == 'f' || args[2].charAt(0) == 'F'  && args.length == 9){
                Mulher p = new Mulher(args[0], args[1], args[2].charAt(0), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), args[6], Double.parseDouble(args[7]), Double.parseDouble(args[8]));
                System.out.println(p);
                break;
            }/*else{
                String[] args2 = new String[6];
                args = args2;
                System.out.println("\nNão foi possível instanciar o objeto, entre com os dados novamente.");
                System.out.print("\nDigite o nome: ");
                args[0] = input.nextLine();
                System.out.print("\nDigite o sobrenome: ");
                args[1] = input.nextLine();
                System.out.print("\nDigite o gênero: ");
                args[2] = input.nextLine();
                System.out.print("\nDigite o DIA do nascimento: ");
                args[3] = input.nextLine();
                System.out.print("\nDigite o MÊS do nascimento: ");
                args[4] = input.nextLine();
                System.out.print("\nDigite o ANO do nascimento: ");
                args[5] = input.nextLine();
            }
        }

        while(true){
            System.out.println("\nQuantos elementos adicionais serão inseridos?");
            arrayNumS = input.nextLine();
            if(arrayNumS.matches("[0-9]*")){
                arrayNum = Integer.parseInt(arrayNumS);
                if(arrayNum == 0){
                    System.out.println("\nSem mais elementos a serem inseridos. Fim do programa.");
                    break;
                }else if(arrayNum > 0){
                    break;
                }
            }else{
                System.out.println("\nTamanho inválido, digite novamente.");
            }
        }

        Pessoa[] pessoas = new Pessoa[arrayNum];
        for(int i = 0; i < arrayNum; i++){

            while(true){

                String gen;
                System.out.print("\nDigite o gênero que deseja criar: ");
                gen = input.nextLine();

                String nomeL; String sobrenomeL; String cpfL;
                double alturaL; double pesoL; int diaL; int mesL; int anoL;
        
                if(gen.substring(0).matches("m") || gen.substring(0).matches("M")){
                    
                    pessoas[i] = new Homem();

                    System.out.print("\nDigite um nome: ");
                    nomeL = input.nextLine();
                    pessoas[i].setNome(nomeL);

                    System.out.print("\nDigite o sobrenome: ");
                    sobrenomeL = input.nextLine();
                    pessoas[i].setSobrenome(sobrenomeL);

                    System.out.print("\nDigite o CPF: ");
                    cpfL = input.nextLine();
                    pessoas[i].setCpf(cpfL);

                    System.out.print("\nDigite o DIA de nascimento: ");
                    diaL = input.nextInt();
                    System.out.print("\nDigite o MÊS de nascimento: ");
                    mesL = input.nextInt();
                    System.out.print("\nDigite o ANO de nascimento: ");
                    anoL = input.nextInt();
                    pessoas[i].setDataNascimento(anoL, mesL, diaL);

                    System.out.print("\nDigite a altura: ");
                    alturaL = input.nextDouble();
                    pessoas[i].setAltura(alturaL);
                    
                    System.out.print("\nDigite o peso: ");
                    pesoL = input.nextDouble();
                    pessoas[i].setPeso(pesoL);

                    break;
                
                }else if(gen.substring(0).matches("f") || gen.substring(0).matches("F")){

                    pessoas[i] = new Mulher();

                    System.out.print("\nDigite um nome: ");
                    nomeL = input.nextLine();
                    pessoas[i].setNome(nomeL);

                    System.out.print("\nDigite o sobrenome: ");
                    sobrenomeL = input.nextLine();
                    pessoas[i].setSobrenome(sobrenomeL);

                    System.out.print("\nDigite o CPF: ");
                    cpfL = input.nextLine();
                    pessoas[i].setCpf(cpfL);

                    System.out.print("\nDigite o DIA de nascimento: ");
                    diaL = input.nextInt();
                    System.out.print("\nDigite o MÊS de nascimento: ");
                    mesL = input.nextInt();
                    System.out.print("\nDigite o ANO de nascimento: ");
                    anoL = input.nextInt();
                    pessoas[i].setDataNascimento(anoL, mesL, diaL);

                    System.out.print("\nDigite a altura: ");
                    alturaL = input.nextDouble();
                    pessoas[i].setAltura(alturaL);

                    System.out.print("\nDigite o peso: ");
                    pesoL = input.nextDouble();
                    pessoas[i].setPeso(pesoL);

                    break;
                    
                }else if(gen == ""){
                    System.out.println("\nFinalizando inserção de elementos.");
                    break;
                }

            }

        }

        if(pessoas.length == 0){System.out.println("Fim do programa.");}
        else{

            for(Pessoa p: pessoas){
                System.out.println(p);
            }

            System.out.println("\nNúmero de objetos criados no total (incluí por entrada por linha de comando): " + pessoas.length);
            for(int i = 0; i < pessoas.length; i++){
                if(pessoas[i] instanceof Homem){
                    Homem.contH++;
                }else if(pessoas[i] instanceof Mulher){
                    Mulher.contM++;
                }
            }
            System.out.print("Número de objetos da classe Homem criados: " + Homem.contH);
            System.out.print("\nNúmero de objetos da classe Mulher criados: " + Mulher.contM);
        
        }
        
        input.close();
        if(arrayNum == 0){
                    System.out.println("\nSem mais elementos a serem inseridos. Fim do programa.");
                    break;
                }else if(arrayNum > 0){
                    pessoas = new Pessoa[arrayNum];
                    break;
                }else{
                    System.out.println("\nTamanho inválido, digite novamente.");
                }
        */       
        
    }

}
