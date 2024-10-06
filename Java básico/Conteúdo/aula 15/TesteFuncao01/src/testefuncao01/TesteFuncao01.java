package testefuncao01;

public class TesteFuncao01 {
    
    // Isso é um "método", porque tem "void" na linha de código
    static void soma(int a, int b) {
        int s = a + b;
        System.out.printf("Soma: %d + %d = %d. ", a, b, s);
    }
    
    // Isso é uma "função", porque tem o tipo primitivo 
    // dito e tem o retorno
    static int soma2(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        soma(5,2);
        int sm = soma2(5,2);
        System.out.println("A soma é " + sm);
    }
    
}
