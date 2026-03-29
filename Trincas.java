import java.util.Scanner;

public class Trincas{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String naipe1, naipe2, naipe3;
        int valor1, valor2, valor3;

        System.out.println("Informe as cartas, na sequencia numero, nipe");
        System.out.println("Carta 1");
        valor1 = in.nextInt();
        in.nextLine();
        naipe1 = in.nextLine();
        System.out.println("Carta 2");
        valor2 = in.nextInt();
        in.nextLine();
        naipe2 = in.nextLine();
        System.out.println("Carta 3");
        valor3 = in.nextInt();
        in.nextLine();
        naipe3 = in.nextLine();

        if(valor1 == valor2 && valor2 == valor3){
            if(!naipe1.equals(naipe2) && !naipe2.equals(naipe3)){
                System.out.println("É trinca");
            }
            else{
                System.out.println("Não é trinca");
            }
        }
        else{
            System.out.println("Não é trinca");
        }
    }
}