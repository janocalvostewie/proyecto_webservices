
package Idiomas;

import javax.swing.JTable;

/**
 *
 * @author janillo
 */
public class Frances {
    
    
     static String[] cabeceraGeneralUsuario={"ID","PRÉNOM","NOM","NOM","DNI","ADDRESS","DATE NAISSANCE","NUMÉRO","GENRE"};
    static String[] cabeceraTiendasUsuario={"CODE","MAGASIN","VILLE"};
    static String[] cabeceraUsuarioAcceso={"UTILISATEUR","PROFIL"};
    
      public static void cambiarAFrances(){
    
        Menus.MenuPrincipal.lTrabajadores.setText("Employé");
        Menus.MenuPrincipal.lTiendas.setText("Magasins");
        Menus.MenuPrincipal.lUsuarioAcceso.setText("Utilisateur");
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(0, "Consultation des Utilisateurs");
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(1, "Ajouter des Utilisateurs");
         
    
    
    }
     public static void actualizaCabeceras(JTable tabla, String[] arrayCabeceras){
    
    for(int i=0;i<arrayCabeceras.length;i++){
    tabla.getColumnModel().getColumn(i).setHeaderValue(arrayCabeceras[i]);
    }
    tabla.getTableHeader().repaint();
    }
    
}
