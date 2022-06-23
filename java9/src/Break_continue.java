public class Break_continue {
    public static void main (String[] args){
        int i = 0;
        while (true){
            if (i == 15){
                break;
            }
            System.out.println(i);
            i++;
        }
        for ( int a = 0; a <= 15; a++){
            if(a %2 == 0 ){
              continue;
            }
            System.out.println("odd number " + a);
        }

    }
}
