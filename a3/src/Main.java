import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite o seu nome: ");
        p.nome = sc2.nextLine();

        System.out.println("Digite sua idade: ");
        p.idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        p.altura = sc.nextDouble();

        System.out.println("Digite o nome do seu pai: ");
        p.nomepai = sc2.nextLine();

        System.out.println("Digite o nome da sua mãe: ");
        p.nomemae = sc2.nextLine();


        System.out.println(p.altura);
        System.out.println(p.idade);
        System.out.println(p.nome);
        System.out.println(p.nomepai);
        System.out.println(p.nomemae);
    }
    }