import java.util.*;

public class ValidaData{

    private static GregorianCalendar dataAtual = new GregorianCalendar();
    private static int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
    private static int mes = dataAtual.get(Calendar.MONTH) + 1;
    private static int ano = dataAtual.get(Calendar.YEAR);

    //MÉTODOS DE VALIDAÇÃO DO DIA
    public static boolean isDay(int dia){

        if(dia < 1 || dia > 31){return(false);}
        return(true);

    }
    public static boolean isDay(String dia){

        int d = Integer.parseInt(dia);
        if(d < 1 || d > 31){return(false);}
        return(true);

    }

    //MÉTODOS DE VALIDAÇÃO DO MÊS
    public static boolean isMonth(int mes){

        if(mes < 1 || mes > 12){return(false);}
        return(true);

    }
    public static boolean isMonth(String mes){

        int m = Integer.parseInt(mes);
        if(m < 1 || m > 12){return(false);}
        return(true);

    }

    //MÉTODOS DE VALIDAÇÃO DO ANO
    public static boolean isYear(int ano){

        if(ano < 1900 || ano > ValidaData.ano){return(false);}
        return(true);        
    
    }
    public static boolean isYear(String ano){

        int a = Integer.parseInt(ano);
        if(a < 1900 || a > ValidaData.ano){return(false);}
        return(true);    
    
    }

    public static boolean validData(int dia, int mes, int ano){

        if(ValidaData.isDay(dia) && ValidaData.isMonth(mes) && ValidaData.isYear(ano)){

            return(true);

        }

        return(false);

    }

    public static int idade(int d, int m, int a){

        if(m < mes){
            return((ano - a));
        }else if(m == mes){

            if(d > dia){
                return((ano - a)-1);
            }else{return(ano - a);}

        }else{
            return(ano - a)-1;
        }

    }

    /*public static void main(String args[]){

        System.out.println(ValidaData.dia);
        System.out.println(ValidaData.mes);
        System.out.println(ValidaData.ano);

    }*/
    
}
