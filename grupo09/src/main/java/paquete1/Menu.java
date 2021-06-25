package paquete1;

/**
 *
 * @author Jose Cordvoa
 */
public abstract class Menu {
    
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;
    
    public Menu(String nom, double vI){
        nombrePlato = nom;
        valorInicial = vI;
    }
    
    public void setNombrePlato(String nombre){
        nombre = nombrePlato;
    }
    public String getNombrePlato(){
        return nombrePlato ;
    }
    
    public abstract void setValorMenu();
    
    public double getValorMenu(){
        return valorMenu;
    }
    
    public void setValorInicial(double vi){
        vi = valorMenu;
    }
    public double getValorInicial(){
        return valorInicial;
    }
    
}
