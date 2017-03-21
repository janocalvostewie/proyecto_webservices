package Idiomas;

import javax.swing.JTable;

/**
 *
 * @author janillo
 */
public class Ingles {

    static String[] cabeceraGeneralUsuario = {"ID", "NAME", "LAST NAME", "LAST NAME", "DNI", "ADDRESS", "BIRTH DATE", "PHONE", "GENDER"};
    static String[] cabeceraTiendasUsuario = {"CODE", "SHOP", "CITY"};
    static String[] cabeceraUsuarioAcceso = {"USER", "PROFILE"};

    public static void cambiarAIngles() {

        

        Menus.MenuPrincipal.tpUsuarios.setTitleAt(0, "View Users");
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(1, "Add Users");
        actualizaCabeceras(Menus.MenuPrincipal.jtGeneralUsuarios, cabeceraGeneralUsuario);
        actualizaCabeceras(Menus.MenuPrincipal.jtUsuariosTiendas, cabeceraTiendasUsuario);
        actualizaCabeceras(Menus.MenuPrincipal.jtUsuariosAcceso, cabeceraUsuarioAcceso);

 actualizaTooTips();
 cambiaLabels();

    }

    public static void actualizaCabeceras(JTable tabla, String[] arrayCabeceras) {

        for (int i = 0; i < arrayCabeceras.length; i++) {
            tabla.getColumnModel().getColumn(i).setHeaderValue(arrayCabeceras[i]);
        }
        tabla.getTableHeader().repaint();
    }
  public static void actualizaTooTips(){
              
           Menus.MenuPrincipal.bEspanhol.setToolTipText("Spanish");
        Menus.MenuPrincipal.bFrances.setToolTipText("French");
        Menus.MenuPrincipal.bIngles.setToolTipText("English");
        Menus.MenuPrincipal.bMenuAjustes.setToolTipText("Settings");
        Menus.MenuPrincipal.bMenuArticulos.setToolTipText("Articles");
        Menus.MenuPrincipal.bMenuClientes1.setToolTipText("Clients");
        Menus.MenuPrincipal.bMenuCompras.setToolTipText("Purchases");
        Menus.MenuPrincipal.bMenuUsuarios.setToolTipText("Users");
        Menus.MenuPrincipal.bMenuVentas.setToolTipText("Sales");
        Menus.MenuPrincipal.bSalir.setToolTipText("Exit");
    }
  
     public static void cambiaLabels(){
    Menus.MenuPrincipal.lTrabajadores.setText("Employee");
        Menus.MenuPrincipal.lTiendas.setText("Shops");
        Menus.MenuPrincipal.lUsuarioAcceso.setText("Access User");
        
        Menus.MenuPrincipal.lUsuApe1.setText("Surname");
        Menus.MenuPrincipal.lUsuApe2.setText("Surname");
        Menus.MenuPrincipal.lUsuDNI.setText("DNI");
        Menus.MenuPrincipal.lUsuDireccion.setText("Addresse");
        Menus.MenuPrincipal.lUsuFecha.setText("Birth Date");
        Menus.MenuPrincipal.lUsuNombre.setText("Name");
        Menus.MenuPrincipal.lUsuSexo.setText("Gendre");
        Menus.MenuPrincipal.lUsuTelefono.setText("Phone");
        Menus.MenuPrincipal.lFoto.setText("Photo");
        Menus.MenuPrincipal.lUsuID.setText("ID");
        
        
        Menus.MenuPrincipal.lArtConTabla.setText("Articles");
        Menus.MenuPrincipal.lArtReferencia.setText("Article");
        Menus.MenuPrincipal.lArtCompras.setText("Purchases");
        Menus.MenuPrincipal.lArtVentas.setText("Sales");
        }
}
