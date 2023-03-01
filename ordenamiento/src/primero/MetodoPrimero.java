package primero;
public class MetodoPrimero {
    int [] vector;        
    
    public MetodoPrimero (int v){
        vector = new int [v];   
    }
 
//Imprime el vector de los numeros generados    

    public void imprimirVector(){
        System.out.print("[");
        for(int i=0; i < vector.length; i++){
            vector[i] = (int)(Math.random()*20);
            System.out.print(vector[i] + " ");
        }        
        System.out.println("]");    
    }
 
//Método para calcular la media con los numeros generados
    
    public double calculaMedia(double media){
        double suma = 0;
        for(int i=0; i < vector.length; i++){
            suma = suma + vector[i];
        }
        media = suma/vector.length;   
        return media;
    }

//Metodo para calcular la varianza con los numeros generados    
    
    public double calcularVarianza(double varianza, double media){  
        double pro = 0;
        for(int i=0; i<vector.length; i++){
            pro = vector[i] - media;
            pro = Math.pow(pro,2);
            varianza = varianza + pro;
        }
        varianza = varianza / (vector.length);
        return varianza;
    }
    
//Metodo para calcular la desviación estandar con los numeros generados
    
    public double calcularDesviacion(double desviacion, double v){
        
        desviacion = Math.pow(v, 0.5);
        return desviacion;
    }
}
