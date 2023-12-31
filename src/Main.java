import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x, y, z;

        System.out.println("Digite o Primeiro valor: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        y = sc.nextInt();

        z = x + y;

        System.out.println("A Soma é : " + z);

        sc.close();

        }
    }
