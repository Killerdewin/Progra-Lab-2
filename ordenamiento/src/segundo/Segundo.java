package segundo;
import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in); 
        System.out.println("NOTA: Si la cadena tiene dos o mas conjuntos caracteres con igual cantidad de cracteres,\nsiendo estos los que mas caracteres tienen repetidos.\nse escojera uno de esos al azar como maximo a intercambiar.\n\nEscriba la linea de caracteres a procesar:");                
        String en = o.nextLine();
        int w = en.length();
        MetodoSegundo B = new MetodoSegundo(w, en);
        int lo = B.procedimiento();
        B.impresion(lo);
    }
}
