package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nascimento = teclado.nextInt();
        int idade = 2024 - nascimento;
        System.out.println("Sua idade é " + idade);
        if (idade>= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        
    }
    
}
