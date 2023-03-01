import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        int n1,n2,comando, resultado = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Menu:\n(1)Adição\n(2)Subtração\n(3)Multiplicação\n(4)Divisão\n(5)Sair\n");
            System.out.print("Digite o comando: ");
            comando = scanner.nextInt();
            if(comando >= 1 && comando < 5){
                System.out.print("\nDigite o primeiro número: ");
                n1 = scanner.nextInt();
                System.out.print("\nDigite o segundo número: ");
                n2 = scanner.nextInt();
                switch(comando){
                    case(1):
                    resultado = n1 + n2;
                    break;
                    case(2):
                    resultado = n1 - n2;
                    break;
                    case(3):
                    resultado = n1 * n2;
                    break;
                    case(4):
                    resultado = n1/n2;
                    break;
                }
                System.out.println("\nO resultado da sua operação é: " + resultado + "\n");
            }
        }while(comando != 5);
        scanner.close();
    }
}
