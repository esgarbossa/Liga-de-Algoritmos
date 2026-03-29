import java.io.File;
import java.util.Scanner;

public class Elixir {
    static int ciclo = 1;
    static int densidade = 1;
    static int st = 0;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("o_elixir_sagrado_input.txt"));

        for (String instrucao = in.nextLine(); in.hasNextLine(); instrucao = in.nextLine()) {
            if (instrucao.equals("noop")) {
                t();
            } else {
                Scanner sc = new Scanner(instrucao);
                sc.next();
                int valor = sc.nextInt();
                t();
                t();
                densidade += valor;
            }
        }

        System.out.println(st);
    }

    public static void t() {
        if (ciclo == 20 || ciclo == 60 || ciclo == 100 ||
                ciclo == 140 || ciclo == 180 || ciclo == 220) {
            st += ciclo * densidade;
        }
        ciclo++;
    }
}