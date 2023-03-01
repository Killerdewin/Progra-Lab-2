package primero;
import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in); 
        System.out.println("Por favor ingrese solo numeros positivos \n\nIngrese la cantidad de elementos del vector");                
        String n = o.nextLine();
        int cn = 0;
        
        try{
          cn = Integer.parseInt(n);
        }
        catch (Exception e){
          System.out.println("Por favor solo coloque numeros");
          System.out.println("Ingrese la cantidad de elementos que desea que conforme el vector");                
          n = o.nextLine(); 
          cn = Integer.parseInt(n); 
        }
        MetodoPrimero A = new MetodoPrimero(cn);
        A.imprimirVector();
        double M = 0;
        double  Media;
        Media = A.calculaMedia(M);
        double V = 0;
        double Varianza;
        Varianza = A.calcularVarianza(V, Media);
        double D = 0;
        double desviacion;
        desviacion = A.calcularDesviacion(D, Varianza);
        System.out.println("\nLa media es de :" + Media);
        System.out.println("La varianza es de :" + Varianza);
        System.out.println("La desviación es de :" + desviacion);
                
    }
}
