package Idiomas;

import javax.swing.JTable;

/**
 *
 * @author janillo
 */
public class Frances {

    static String[] cabeceraGeneralUsuario = {"ID", "PRÉNOM", "NOM", "NOM", "DNI", "ADDRESS", "DATE NAISSANCE", "NUMÉRO", "GENRE"};
    static String[] cabeceraTiendasUsuario = {"CODE", "MAGASIN", "VILLE"};
    static String[] cabeceraUsuarioAcceso = {"UTILISATEUR", "PROFIL"};

    public static void cambiarAFrances() {

     
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(0, "Consultation des Utilisateurs");
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(1, "Ajouter des Utilisateurs");
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
              
           Menus.MenuPrincipal.bEspanhol.setToolTipText("Espagnol");
        Menus.MenuPrincipal.bFrances.setToolTipText("Français");
        Menus.MenuPrincipal.bIngles.setToolTipText("Anglais");
        Menus.MenuPrincipal.bMenuAjustes.setToolTipText("Réglages");
        Menus.MenuPrincipal.bMenuArticulos.setToolTipText("Articles");
        Menus.MenuPrincipal.bMenuClientes1.setToolTipText("Clientèle");
        Menus.MenuPrincipal.bMenuCompras.setToolTipText("Achats");
        Menus.MenuPrincipal.bMenuUsuarios.setToolTipText("Utilisateurs");
        Menus.MenuPrincipal.bMenuVentas.setToolTipText("Ventes");
        Menus.MenuPrincipal.bSalir.setToolTipText("Sortir");
    }
     public static void cambiaLabels(){
         Menus.MenuPrincipal.lTrabajadores.setText("Employé");
        Menus.MenuPrincipal.lTiendas.setText("Magasins");
        Menus.MenuPrincipal.lUsuarioAcceso.setText("Utilisateur");
        
        Menus.MenuPrincipal.lUsuApe1.setText("Nom");
        Menus.MenuPrincipal.lUsuApe2.setText("Nom");
        Menus.MenuPrincipal.lUsuDNI.setText("DNI");
        Menus.MenuPrincipal.lUsuDireccion.setText("Addresse");
        Menus.MenuPrincipal.lUsuFecha.setText("Date Naissance");
        Menus.MenuPrincipal.lUsuNombre.setText("Prénom");
        Menus.MenuPrincipal.lUsuSexo.setText("Genre");
        Menus.MenuPrincipal.lUsuTelefono.setText("Numéro");
        Menus.MenuPrincipal.lFoto.setText("Photo");
        Menus.MenuPrincipal.lUsuID.setText("ID");
        
        }
}
