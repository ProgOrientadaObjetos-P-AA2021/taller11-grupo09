package paquete1;

import java.util.ArrayList;

/**
 *
 * @author Jose Cordova
 */

public class Cuenta {
    private String nombreCliente;
    private ArrayList<Menu> ListaMenu = new ArrayList<>();
    private double valorTotal;
    private double subTotal;
    private double iva;

    public Cuenta(String nc, ArrayList<Menu> lista, double i) {
        this.nombreCliente = nc;
        this.ListaMenu = lista;
        this.iva = i;

    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String n) {
        this.nombreCliente = n;
    }

    public ArrayList<Menu> getListaMenu() {
        return ListaMenu;
    }

    public void setListaMenu(ArrayList<Menu> lista) {
        this.ListaMenu = lista;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        this.valorTotal = subTotal + (subTotal * iva);
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal() {
        for (int i = 0; i < getListaMenu().size(); i++) {
            subTotal = subTotal + getListaMenu().get(i).valorMenu;
        }
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double i) {
        this.iva = i;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\t---- Cuenta ----\n"
                + "Nombre del Cliente = %s\n"
                + "Lista Menu \n\n",
                getNombreCliente());
        for (int i = 0; i < getListaMenu().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    getListaMenu().get(i));
        }
        cadena = String.format("\n%sSubtotal: %.2f\n"
                + "Iva: %.2f\n"
                + "Total de cuenta: %.2f\n",
                cadena,
                getSubTotal(),getIva(),getValorTotal());        

        return cadena;
    }
    
}
