package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class MenuEconomico extends Menu {
    
    private double descuento;
    
    public MenuEconomico(String nom, double vI){
        super(nom, vI);
        setDescuento();
        setValorMenu();
    }
    
    public void setDescuento(){
        this.descuento = (valorInicial * 0.20);
    }
    public double getDescuento(){
        return descuento;
    }
    
    @Override
    public void setValorMenu() {
        this.valorMenu = valorInicial - descuento;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tMenu Economico\n"
                + "Nombre plato = %s\n"
                + "Valor del Menu = %.2f\n"
                + "Valor inicial del menu = %.2f\n"
                + "Descuento = %.2f\n",
                getNombrePlato(),
                getValorMenu(),
                getValorInicial(),
                getDescuento());

        return cadena;
    }
    
}
