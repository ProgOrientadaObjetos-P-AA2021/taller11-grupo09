package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class MenuDia extends Menu{
    
    private double valorPostre;
    private double valorBebida;
    
    public MenuDia(String nom, double vI, double vp, double vb){
        super(nom, vI);
        valorPostre = vp;
        valorBebida = vb;
        setValorMenu();
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }
    
    @Override
    public void setValorMenu() {
        this.valorMenu = valorPostre + valorBebida + valorInicial;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tMenu Día\n"
                + "Nombre plato = %s\n"
                + "Valor del Menu = %.2f\n"
                + "Valor inicial del menu = %.2f\n"
                + "Valor de postre = %.2f\n"
                + "Valor de bebida = %.2f\n",
                getNombrePlato(),
                getValorMenu(),
                getValorInicial(),
                getValorPostre(),
                getValorBebida());

        return cadena;
    }
   
}
