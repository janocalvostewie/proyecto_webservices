
package Idiomas;

import javax.swing.JTable;

/**
 *
 * @author janillo
 */
public class Ingles {
    
    static String[] cabeceraGeneralUsuario={"ID","NAME","LAST NAME","LAST NAME","DNI","ADDRESS","BIRTH DATE","PHONE","GENDER"};
    static String[] cabeceraTiendasUsuario={"CODE","SHOP","CITY"};
    static String[] cabeceraUsuarioAcceso={"USER","PROFILE"};
   
    public static void cambiarAIngles(){
    
        Menus.MenuPrincipal.lTrabajadores.setText("Employee");
        Menus.MenuPrincipal.lTiendas.setText("Shops");
        Menus.MenuPrincipal.lUsuarioAcceso.setText("Access User");
       // Menus.MenuPrincipal.pConsultaUsuarios.setName("View Users");
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(0, "View Users");
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(1, "Add Users");
       actualizaCabeceras(Menus.MenuPrincipal.jtGeneralUsuarios,cabeceraGeneralUsuario );
     actualizaCabeceras(Menus.MenuPrincipal.jtUsuariosTiendas,cabeceraTiendasUsuario );
     actualizaCabeceras(Menus.MenuPrincipal.jtUsuariosAcceso,cabeceraUsuarioAcceso );
                
    
    
    }
    public static void actualizaCabeceras(JTable tabla, String[] arrayCabeceras){
    
    for(int i=0;i<arrayCabeceras.length;i++){
    tabla.getColumnModel().getColumn(i).setHeaderValue(arrayCabeceras[i]);
    }
    tabla.getTableHeader().repaint();
    }
    
}
