import java.util.Scanner;

public class Nazmul {
    public static void main(String[] args) {

        System.out.println("Hello world from Nazmul!");
        System.out.println("Devit!! you are awesome");
        System.out.println("Devit!! Love from Nazmul");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old");
        sc.close();
    }
}