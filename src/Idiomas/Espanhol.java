
package Idiomas;


import javax.swing.JTable;

/**
 *
 * @author janillo
 */
public class Espanhol {
    
    
     static String[] cabeceraGeneralUsuario={"ID","NOMBRE","APELLIDO 1","APELLIDO 2","DNI","DIRECCIÓN","FECHA NACIMIENTO","TELÉFONO","SEXO"};
    static String[] cabeceraTiendasUsuario={"CODIGO","TIENDA","CIUDAD"};
    static String[] cabeceraUsuarioAcceso={"USUARIO","PERFIL"};
    
      public static void cambiarAEspanhol(){
    
        Menus.MenuPrincipal.lTrabajadores.setText("Empleado");
        Menus.MenuPrincipal.lTiendas.setText("Tiendas");
        Menus.MenuPrincipal.lUsuarioAcceso.setText("Usuario de Acceso");
         
         Menus.MenuPrincipal.tpUsuarios.setTitleAt(0, "Consulta Usuarios");
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(1, "Añadir Usuarios");
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
