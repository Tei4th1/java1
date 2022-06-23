import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your age");
        String age = scanner.nextLine();
        // if(age == 10){
        //  System.out.println("you are schoolboy");
        // } else if( age== 18){
        //  System.out.println("you are student");
        // }
        switch (age) {
            case "zero":
                System.out.println("u are baby");
                break;
            case "seven":
                System.out.println("you go to sthe school");
                break;
            case "nineteen":
                System.out.println("you are student");
                break;
            default:
                System.out.println("you are adult");

        }
    }
}
