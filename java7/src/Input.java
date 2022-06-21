import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        //String string = new String("pepa");
        Scanner s = new Scanner (System.in);
        System.out.println("input anything number");
        //String string = s.nextLine();
        int x = s.nextInt();
        System.out.println("output "+ x);
    }
}
