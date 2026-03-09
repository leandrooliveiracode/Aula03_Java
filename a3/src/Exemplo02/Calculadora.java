package Exemplo02;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        CalculadoraClasse c = new CalculadoraClasse();
        Scanner sc = new Scanner(System.in);

        System.out.println("Número 1: ");
        c.n1 = sc.nextInt();
        System.out.println("Número 2");
        c.n2 = sc.nextInt();
        c.somar();
        System.out.println(c.total);


    }
}
