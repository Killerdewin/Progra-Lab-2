
package cuarto;

public class Metodos_usuario {
    private int kilometraje,modelo;
    private String marca, colorx;
    public Metodos_usuario(){
        kilometraje=0;modelo=0;marca="";colorx="";
    }
    public int getKm() {
        return kilometraje;
    }
    public int getMod() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getCol(){
        return colorx;
    }
    public void setKm(int Kmx) {
        kilometraje = Kmx;
    }
    public void setMod(int mmodelo) {
        modelo = mmodelo;
    }
    public void setMarca(String mmarca) {
        marca = mmarca;
    }
    public void setCol(String ccol){
        colorx = ccol;
    }
    
    
}
