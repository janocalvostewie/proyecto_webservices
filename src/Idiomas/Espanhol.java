
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
    
        
         
         Menus.MenuPrincipal.tpUsuarios.setTitleAt(0, "Consulta Usuarios");
        Menus.MenuPrincipal.tpUsuarios.setTitleAt(1, "Añadir Usuarios");
     actualizaCabeceras(Menus.MenuPrincipal.jtGeneralUsuarios,cabeceraGeneralUsuario );
     actualizaCabeceras(Menus.MenuPrincipal.jtUsuariosTiendas,cabeceraTiendasUsuario );
     actualizaCabeceras(Menus.MenuPrincipal.jtUsuariosAcceso,cabeceraUsuarioAcceso );
    
 actualizaTooTips();
 cambiaLabels();
     
    }
    
     public static void actualizaCabeceras(JTable tabla, String[] arrayCabeceras){
    
    for(int i=0;i<arrayCabeceras.length;i++){
    tabla.getColumnModel().getColumn(i).setHeaderValue(arrayCabeceras[i]);
    }
    tabla.getTableHeader().repaint();
    }
     
        public static void actualizaTooTips(){
            Menus.MenuPrincipal.bEspanhol.setToolTipText("Español");
        Menus.MenuPrincipal.bFrances.setToolTipText("Francés");
        Menus.MenuPrincipal.bIngles.setToolTipText("Inglés");
        Menus.MenuPrincipal.bMenuAjustes.setToolTipText("Ajustes");
        Menus.MenuPrincipal.bMenuArticulos.setToolTipText("Artículos");
        Menus.MenuPrincipal.bMenuClientes1.setToolTipText("Clientes");
        Menus.MenuPrincipal.bMenuCompras.setToolTipText("Compras");
        Menus.MenuPrincipal.bMenuUsuarios.setToolTipText("Usuarios");
        Menus.MenuPrincipal.bMenuVentas.setToolTipText("Ventas");
        Menus.MenuPrincipal.bSalir.setToolTipText("Salir");
    }
        
        public static void cambiaLabels(){
        Menus.MenuPrincipal.lTrabajadores.setText("Empleado");
        Menus.MenuPrincipal.lTiendas.setText("Tiendas");
        Menus.MenuPrincipal.lUsuarioAcceso.setText("Usuario de Acceso");
        /////////////USUARIOS////////////////
        Menus.MenuPrincipal.lUsuApe1.setText("Apellido");
        Menus.MenuPrincipal.lUsuApe2.setText("Apellido");
        Menus.MenuPrincipal.lUsuDNI.setText("DNI");
        Menus.MenuPrincipal.lUsuDireccion.setText("Dirección");
        Menus.MenuPrincipal.lUsuFecha.setText("Fecha Nacimiento");
        Menus.MenuPrincipal.lUsuNombre.setText("Nombre");
        Menus.MenuPrincipal.lUsuSexo.setText("Sexo");
        Menus.MenuPrincipal.lUsuTelefono.setText("Teléfono");
        Menus.MenuPrincipal.lFoto.setText("Foto");
        Menus.MenuPrincipal.lUsuID.setText("ID");
        ////////////////////ARTICULOS/////////////////////
        Menus.MenuPrincipal.lArtConTabla.setText("Referencias");
        Menus.MenuPrincipal.lArtReferencia.setText("Referencia");
        Menus.MenuPrincipal.lArtCompras.setText("Compras");
        Menus.MenuPrincipal.lArtVentas.setText("Ventas");
        
        }
}
