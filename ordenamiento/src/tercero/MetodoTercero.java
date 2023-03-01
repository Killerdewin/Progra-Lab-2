package tercero;
import java.util.Arrays;

public class MetodoTercero {
    double[] v;
    double[] d;
    double[] b;
    double[] vector;
    int u;
 
    public MetodoTercero(int K){
        v = new double [K];
        d = new double [K];
        b = new double [K];
        vector = new double [K];
        u = K;
    }
    
     public void rellenarVectores(int g){
        for(int i = 0; i < g; i++){
            v[i] = (double)(Math.random() * 100);
            d[i] = v[i];
            b[i] = v[i];
            vector[i] = v[i];
        }  
    }
    
    public void imprimirNumeros(int h){
        for(int i = 0; i < h; i++){
            System.out.print(v[i] + " ");
        }  
    }
    
//Metodo selección
    
    public void seleccion(int y){
        for(int i = 0; i < v.length - 1; i++){
            double menor = v[i];
            int pos = i;
            for (int j = i + 1; j < v.length; j++ ){
                if(v[j] < menor){
                    menor = v[j];
                    pos = j;
                }
            }
            double T = v[i];
            v[i] = menor;  
            v[pos] = T;
            if(y == 5){
               for(int l = 0; l < v.length; l++){
                  System.out.print(" " + v[l]);
               }
               System.out.println("");
            }
        }
    }

    //Método burbuja 
    
    public void burbuja(int r){
        double c;
        for(int i = 0; i < v.length - 1; i++){
            for(int f = 0; f < v.length - 1; f++){
                if(d[f] > d[f + 1]){
                    c = d[f];
                    d[f] = d[f + 1];
                    d[f + 1] = c;
                }
            }
            
            if(r == 5){
                for(int l = 0; l < v.length; l++){
                    System.out.print(" " + d[l]);
                }
            System.out.println(""); 
            }
        }
    }

//Metodo inserción
    
    public void insercion(int m){
        int p;
        double a;
        for(int i = 0; i < b.length; i++){
            p = i;
            a = b[i];
            while((p > 0) && (b[p - 1]) > a){
                b[p] = b[p - 1];
                p--;
            }
            b[p] = a;
            if(m == 5){
                for(int l = 0; l < b.length; l++){
                   System.out.print(" " + b[l]);
                }
                System.out.println("");
            }
        }
    }
 
//Método ordenación mergesort
    
    public void ordenacionMergeSort(double ve[]){
        if(ve.length <= 1) return;
        int mitad = ve.length/2;
        double izq[] = Arrays.copyOfRange(ve, 0, mitad);
        double der[] = Arrays.copyOfRange(ve, mitad, ve.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);       
        combinarVector(ve, izq, der);
    }

//Método para combinar vectores para que salga el numero ordenado
    
    public void combinarVector(double v[], double izq[], double der[]){
            int i = 0;
            int j = 0;
            for(int k = 0;k < v.length; k++){
                if(i >= izq.length){
                    v[k] = der[j];
                    j++;
                    continue;
                }
                if(j >= der.length){
                    v[k] = izq[i];
                    i++;
                    continue;
                }
                if(izq[i] < der[j]){
                    v[k] = izq[i];
                    i++;
                }
                else{
                    v[k] = der[j];
                    j++;
                }
                    if(u ==5){
                        imprimirVector(v);
                    }
                }
        }

//Método para imprimir el numero 

    
        public void imprimirVector(double vec[]){
            for(int i = 0; i < vec.length; i++){
                System.out.print(" " + vec[i]);
            }
            System.out.println("");
        }
        public double[] getVector(){
            return vector;
        }
}
