import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        System.out.println("Informe a operacao: \n1 - Soma\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao\n5 - Sair");
        Scanner n = new Scanner(System.in);
        int opcao = n.nextInt();
        double total = 0;

        while(opcao!=5) {
            System.out.print("Informe quantos valores serao utilizados: ");
            int num = n.nextInt();
            double[] array = new double[num];
            if (opcao == 1) {
                for (int i = 0; i < num; i++) {
                    System.out.print("Informe os valores: ");
                    array[i] = n.nextDouble();
                }
                for (int i = 0; i < num; i++) {
                    total += array[i];
                }
                System.out.print("Resultado: " + total);
            }
            else if (opcao ==2){
                for (int i = 0; i < num; i++) {
                    System.out.print("Informe os valores: ");
                    array[i] = n.nextDouble();
                    total = array[0];
                }
                for (int i = 1; i < num; i++) {
                    total -= array[i];
                }
                System.out.print("Resultado: " + total);
            }
            else if (opcao ==3){
                for (int i = 0; i < num; i++) {
                    System.out.print("Informe os valores: ");
                    array[i] = n.nextDouble();
                    total = array[0];
                }
                for (int i = 1; i < num; i++) {
                    total /= array[i];
                }
                System.out.print("Resultado: " + total);
            }
            else if (opcao == 4){
                for (int i = 0; i < num; i++) {
                    System.out.print("Informe os valores: ");
                    array[i] = n.nextDouble();
                    total = array[0];
                }
                for (int i = 1; i < num; i++) {
                    total *= array[i];
                }
                System.out.printf("Resultado: "+ total);
            }
            else{
                System.out.println("Opcao invalida!");
            }
            System.out.println("\nInforme a operacao: \n1 - Soma\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao\n5 - Sair");
            opcao = n.nextInt();
        }
        System.out.println("Fechando calculadora...");

    }
}
