import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
       // System.out.println("input 5");
       // int value = scanner.nextInt();
       // while (value != 5){
          //  System.out.println("input 5");
          //  value = scanner.nextInt();
        int value;
        do {
            System.out.println("input 5");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("u inputed 5");
        }

    }

