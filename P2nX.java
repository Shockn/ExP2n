import java.util.*;

public class P2nX {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        Homem h = new Homem("Yuri", "de Oliveira Costa", 28, 8, 2000, "126.914.127-92", 1.67f, 60f);
        System.out.println(h);
        System.out.println(h.resultIMC());

        input.close();
        
    }

}
