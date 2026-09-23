
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        double num1 , num2 , soma ; 
        int esco ; 
        
        System.out.println("Digite um número");
        num1 = scanner.nextDouble();
        System.out.println("Digite mais um número");
        num2 = scanner.nextDouble();
        System.out.println("Qual operação C quer?");
        System.out.println("1 PARA ADIÇÃO");
        System.out.println("2 para subtração");
        System.out.println("3 para multiplicação");
        System.out.println("4 para divisão");
        esco = scanner.nextInt();

        
        switch (esco){
            case 1:
                soma = num1 + num2;
                System.out.println("deu:"+ soma);
                break;    
            case 2:
                soma = num1 - num2;
                System.out.println("deu:"+ soma);
                break;
            case 3:
                soma = num1 * num2;
                System.out.println("deu:"+ soma);
                break;
            case 4:
                soma = num1 / num2;
                System.out.println("deu:"+ soma);
                break;
        }
        
    }
}
