package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class MenuNiños extends Menu {
    
    private double valorHelado;
    private double valorPastel;
    
    public MenuNiños(String nom, double vI, double vh, double vp){
        super(nom, vI);
        valorHelado = vh;
        valorPastel = vp;
        setValorMenu();
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public void setValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void setValorPastel(double valorPastel) {
        this.valorPastel = valorPastel;
    }
    
    @Override
    public void setValorMenu() {
        this.valorMenu = valorHelado + valorPastel + valorInicial;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tMenu Niños\n"
                + "Nombre plato = %s\n"
                + "Valor del Menu = %.2f\n"
                + "Valor inicial del menu = %.2f\n"
                + "Valor Helado = %.2f\n"
                + "Valor Pastel = %.2f\n",
                getNombrePlato(),
                getValorMenu(),
                getValorInicial(),
                getValorHelado(),
                getValorPastel());

        return cadena;
    }
    
}
