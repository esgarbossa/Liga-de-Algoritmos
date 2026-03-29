import java.io.File;
import java.util.Scanner;

public class CReal {
    public static void main(String args[]) throws Exception {
        Scanner in  = new Scanner(new File("codigo_real_input.txt"));
        int s;
        s = 0;

        while(in.hasNextLine()){
            String entrada = in.nextLine();
            s += getLinha(entrada);
        }
        System.out.println(s);

    }
    public static int getValor(char c) {

        if (c == '!') {
            return 1;
        } else if(c == '@'){
             return 5;
        }else if(c == '#'){
             return 10;
        }else if(c == '$'){
             return 50;
        }else if(c == '%'){
             return 100;
        }else if(c == '&'){
             return 500;
        }else if(c == '*'){
             return 1000;
        }else return 0;

    }
    public static int getLinha(String  linha){
        int tot  =  0;

        for(int i = 0; i < linha.length(); i++){
            int atual = getValor(linha.charAt(i));
            int proximo = 0;
            if(i+1<linha.length()){
            proximo = getValor(linha.charAt(i + 1));}
            if (atual < proximo) {
                tot -= atual;
            } else {
                tot += atual;
            }
            }
        return tot;
        }
    }