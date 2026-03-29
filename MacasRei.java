import java.util.Scanner;
public class MacasRei {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String macas;
        int mboas = 0;
        System.out.println("input");
        macas = in.nextLine();

        for(int i = 0; i < macas.length(); i++ ) {
            int m = macas.charAt(i) - '0';
            int mt = m%2;
            if (mt == 1){
                mboas++;
            }
        }
        System.out.println(mboas);
    }
}
