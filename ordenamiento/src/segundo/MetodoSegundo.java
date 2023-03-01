package segundo;
public class MetodoSegundo{
    String n;
    String [] d;
    String [] g;
    int [] c;
    boolean b;
    
    public MetodoSegundo (int v, String f){ 
        d = new String [v];
        g = new String [v];
        c = new int [v];
        n = f;
    }

//Toma el caracter mas repetido, para luego reemplazar
    
    public int procedimiento(){ 
        for(int i = 0; i < n.length(); i++){
            d[i] = n.substring(i, i + 1);
        }       
        
        for(int i = 0; i < n.length(); i++){
            for(int t = i; t < n.length(); t++){
                b = d[i].equals(n.substring(t, t + 1));
                if(b == true){
                   c[i]++;   
                }
            }   
        }
        
        int M = c[0];
        int j = 0;
        for (int x = 1; x < n.length(); x++) {
		if (c[x] > M) {
		   M = c[x];
                   j = x;
		}
	}
        return j;
    }

    //Imprime el caracter mas repetido 
    
    public void impresion(int q){
        System.out.println("\nCadena de caracteres procesada:");
        String k = "AaEeIiOoUu�";
        for(int i = 0; i < n.length(); i++){
            if(n.substring(i, i + 1).equals(k.substring(0, 1)) || n.substring(i, i + 1).equals(k.substring(1, 2)) || n.substring(i, i + 1).equals(k.substring(2, 3)) || n.substring(i, i + 1).equals(k.substring(3, 4)) || n.substring(i, i + 1).equals(k.substring(4, 5)) || n.substring(i, i + 1).equals(k.substring(5, 6)) || n.substring(i, i + 1).equals(k.substring(6, 7)) || n.substring(i, i + 1).equals(k.substring(7, 8)) || n.substring(i, i + 1).equals(k.substring(8, 9)) || n.substring(i, i + 1).equals(k.substring(9, 10)) || n.substring(i, i + 1).equals(k.substring(10, 11))){
                System.out.print(d[q]);
            }
            else{
                System.out.print(d[i]);
            }
        }
        System.out.println("\n");
    }
}
