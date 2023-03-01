package tercero;
import java.util.Arrays;
import java.util.Scanner;
public class Tercero {
    public static void main(String[] args) {
        int [] n = {5, 100, 500, 1000, 5000, 10000};
        int a;
        long [][] time = new long [6][4];
      try{
        for(int i = 0; i < 7; i++){
            a = n[i];
            MetodoTercero O = new MetodoTercero(a);
            O.rellenarVectores(a);
            if(a == 5){
                System.out.println("Numeros:");
                O.imprimirNumeros(a);
            }
            
            if(a == 5){
                System.out.println("\n\nNumeros ordenados por el metodo de seleción:");
            }
            long inicio = System.nanoTime();
            O.seleccion(a);
            long fin = System.nanoTime();
            time[i][0] = fin - inicio;
            
            if(a == 5){
                System.out.println("\nNumeros ordenados por el metodo de burbuja:");
            }
            long inicio1 = System.nanoTime();
            O.burbuja(a);
            long fin1 = System.nanoTime();
            time[i][1] = fin1 - inicio1;
            
            if(a == 5){
                System.out.println("\nNumeros ordenados por el metodo de inserción:");
            }
            long inicio2 = System.nanoTime();
            O.insercion(a);
            long fin2 = System.nanoTime();
            time [i][2] = fin2 - inicio2;
            
            if(a == 5){
                System.out.println("\nNumeros ordenados por el metodo de mergesort:");
            }
            double [] v = O.getVector();
            long inicio3 = System.nanoTime();
            O.ordenacionMergeSort(v);
            long fin3 = System.nanoTime();
            time [i][3] = fin3 - inicio3;
            
            if(i == 5){
                System.out.println("\nTabla comparativa:\n \tMetodo selección\t \tMetodo burbuja\t\t\tMetodo inserción\t\tMetodo mergesort");
                for(int d = 1; d < 7; d++){
                    System.out.print(n [d] + ":\t");
                    for(int j = 0; j < 4; j++){
                        System.out.print(time[d][j] + "\t\t\t");
                    }
                    System.out.println("");
                }
            }
        }
        
      }catch (Exception e){  
            
      }
    }           
}
