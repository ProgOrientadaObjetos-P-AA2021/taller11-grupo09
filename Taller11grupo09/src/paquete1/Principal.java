package paquete1;

import java.util.ArrayList;

/**
 *
 * @author Jose Cordova
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Menu> ListaMenu = new ArrayList();
        
        MenuNiños mn1 = new MenuNiños("Copa Junior", 3.50, 4.00, 5.30 );
        MenuNiños mn2 = new MenuNiños("Crepe especial", 5.00, 2.10, 3.40);
        
        MenuEconomico me = new MenuEconomico("Combo 1", 2.50);
        
        MenuDia md = new MenuDia("Chaulafan", 5.30, 6.70, 8.00);
        
        MenuCarta mc = new MenuCarta("Omelete Ranchero", 4.99, 5.10, 6.40);
        mc.setValorServicio();
        
        ListaMenu.add(mn1);
        ListaMenu.add(mn2);
        ListaMenu.add(me);
        ListaMenu.add(md);
        ListaMenu.add(mc);
        
        for (int i = 0; i < ListaMenu.size(); i++) {
            ListaMenu.get(i).getValorMenu();
        }
        
        Cuenta c = new Cuenta("Jose Cordova", ListaMenu, 0.12);
        c.setSubTotal();
        c.setValorTotal();
        System.out.println(c);
        
    }
    
}
