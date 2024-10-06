package vetor02;

import java.util.Arrays;

public class Vetor02 {

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        
        // Serve para colocar o vetor em ordem
        Arrays.sort(v);
                
        // Esse tipo de loop for (For each), só 
        // funciona para vetores
        for (double valor : v) {
            System.out.print(valor + " ");
        }
    }
    
}
