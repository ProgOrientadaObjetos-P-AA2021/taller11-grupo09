package paquete1;

/**
 *
 * @author Asus
 */
public class MenuCarta extends Menu {

    private double valorPorcion;
    private double valorBebida;
    private double valorServicio;

    public MenuCarta(String nom, double vI, double vp, double vb) {
        super(nom, vI);
        valorPorcion = vp;
        valorBebida = vb;
        setValorServicio();
        setValorMenu();
    }

    public double getValorPorcion() {
        return valorPorcion;
    }

    public void setValorPorcion(double vPorcion) {
        this.valorPorcion = vPorcion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double vBebida) {
        this.valorBebida = vBebida;
    }

    public double getValorServicio() {
        return valorServicio;
    }

    public void setValorServicio() {
        this.valorServicio = (valorInicial * 0.10);
    }

    @Override
    public void setValorMenu() {
        this.valorMenu = valorPorcion + valorBebida + valorServicio + valorInicial;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tMenu Carta\n"
                + "Nombre plato = %s\n"
                + "Valor del Menu = %.2f\n"
                + "Valor inicial del menu = %.2f\n"
                + "Valor de porcion de guarnición = %.2f\n"
                + "Valor de bebida = %.2f\n"
                + "Porcentaje adicional por servico en relacion del valor inical: %.2f\n",
                getNombrePlato(),
                getValorMenu(),
                getValorInicial(),
                getValorPorcion(),
                getValorBebida(),
                getValorServicio());

        return cadena;
    }

}
