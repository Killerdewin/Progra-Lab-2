
package cuarto;
import cuarto.Metodos_usuario;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Metodos_ordenamiento {
   
    
//Métodos burbuja para Edad
    
    public void modeloBurbuja(Metodos_usuario[] arregloOrdenar)
    {
    boolean flag = false;
        Metodos_usuario tmp;

        while(!flag) {
            flag = true;
            for (int x = 0; x < arregloOrdenar.length - 2; x++) {
                if (arregloOrdenar[x].getMod() > arregloOrdenar[x+1].getMod()) {
                    tmp = arregloOrdenar[x];
                    arregloOrdenar[x] = arregloOrdenar[x+1];
                    arregloOrdenar[x+1] = tmp;
                    flag = false;
                }
            }
        }
    }
    
//Metodo burbuja para Cedula
    
    public void KmBurbuja(Metodos_usuario[] arregloOrdenar)
    {
    boolean flag = false;
        Metodos_usuario tmp;

        while(!flag) {
            flag = true;
            for (int x = 0; x < arregloOrdenar.length - 2; x++) {
                if (arregloOrdenar[x].getKm() > arregloOrdenar[x+1].getKm()) {
                    tmp = arregloOrdenar[x];
                    arregloOrdenar[x] = arregloOrdenar[x+1];
                    arregloOrdenar[x+1] = tmp;
                    flag = false;
                }
            }
        }
    }
    
    
//  Merge Sort para edad
    

    public void modeloMerge(Metodos_usuario[] arregloOrdenar, int izquierda, int derecha)
    {
        int mid = (izquierda+derecha)/2;


        if (derecha <= izquierda)
            return;
        modeloMerge(arregloOrdenar, izquierda, mid);
        modeloMerge(arregloOrdenar, mid+1, derecha);
        mergemodelo(arregloOrdenar, izquierda, mid, derecha);
    }

    public void mergemodelo(Metodos_usuario[] arregloOrdenar, int izquierda, int medio, int derecha)
    {
        int tamanoIzquierda = medio - izquierda + 1;
        int tamanoDerecha = derecha - medio;
        Metodos_usuario parteIzquierda[] = new Metodos_usuario[tamanoIzquierda];
        Metodos_usuario parteDerecha[] = new Metodos_usuario[tamanoDerecha];


        for (int index = 0; index < tamanoIzquierda; index++)
            parteIzquierda[index] = arregloOrdenar[izquierda + index];
        for (int index= 0; index < tamanoDerecha; index++)
            parteDerecha[index] = arregloOrdenar[medio + index + 1];
        int indiceIzquierdo = 0;
        int indiceDerecho = 0;

        for (int index = izquierda; index < derecha + 1; index++) {
            if (indiceIzquierdo < tamanoIzquierda && indiceDerecho < tamanoDerecha) {
                if (parteIzquierda[indiceIzquierdo].getMod() < parteDerecha[indiceDerecho].getMod()) {
                    arregloOrdenar[index] = parteIzquierda[indiceIzquierdo];
                    indiceIzquierdo++;
                } else {
                    arregloOrdenar[index] = parteDerecha[indiceDerecho];
                    indiceDerecho++;
                }
            }

            else if (indiceIzquierdo < tamanoIzquierda) {
                arregloOrdenar[index] = parteIzquierda[indiceIzquierdo];
                indiceIzquierdo++;
            }
            else if (indiceDerecho < tamanoDerecha) {
                arregloOrdenar[index] = parteDerecha[indiceDerecho];
                indiceDerecho++;
            }
        }
    }
    
    
//MergeSort para Cedula
    
    public void KmMerge(Metodos_usuario[] arregloOrdenar, int izquierda, int derecha)
        {
            int mid = (izquierda+derecha)/2;


            if (derecha <= izquierda)
                return;
            KmMerge(arregloOrdenar, izquierda, mid);
            KmMerge(arregloOrdenar, mid+1, derecha);
            mergeKm (arregloOrdenar, izquierda, mid, derecha);
        }

        public void mergeKm(Metodos_usuario[] arregloOrdenar, int izquierda, int medio, int derecha)
        {
            int tamanoIzquierda = medio - izquierda + 1;
            int tamanoDerecha = derecha - medio;
            Metodos_usuario parteIzquierda[] = new Metodos_usuario[tamanoIzquierda];
            Metodos_usuario parteDerecha[] = new Metodos_usuario[tamanoDerecha];


            for (int x = 0; x < tamanoIzquierda; x++)
                parteIzquierda[x] = arregloOrdenar[izquierda + x];
            for (int x= 0; x < tamanoDerecha; x++)
                parteDerecha[x] = arregloOrdenar[medio + x + 1];
            int indiceIzquierdo = 0;
            int indiceDerecho = 0;

            for (int x = izquierda; x < derecha + 1; x++) {
                if (indiceIzquierdo < tamanoIzquierda && indiceDerecho < tamanoDerecha) {
                    if (parteIzquierda[indiceIzquierdo].getKm() < parteDerecha[indiceDerecho].getKm()) {
                        arregloOrdenar[x] = parteIzquierda[indiceIzquierdo];
                        indiceIzquierdo++;
                    } else {
                        arregloOrdenar[x] = parteDerecha[indiceDerecho];
                        indiceDerecho++;
                    }
                }

                else if (indiceIzquierdo < tamanoIzquierda) {
                    arregloOrdenar[x] = parteIzquierda[indiceIzquierdo];
                    indiceIzquierdo++;
                }
                else if (indiceDerecho < tamanoDerecha) {
                    arregloOrdenar[x] = parteDerecha[indiceDerecho];
                    indiceDerecho++;
                }
            }
        }


}
