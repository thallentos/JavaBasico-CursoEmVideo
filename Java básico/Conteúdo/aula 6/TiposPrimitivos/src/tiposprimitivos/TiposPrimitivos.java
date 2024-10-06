package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        
        //instância para poder digitar no teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        
        //inserir uma entrada de dados
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

        //Saída formatada
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        
        //parte de mudar o tipo de dado
        String valor = "30";
        //mudar o tipo de dado
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        System.out.println(valor);

        
    } 
}
