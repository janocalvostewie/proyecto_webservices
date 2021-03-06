
package Tablas;


import static Menus.MenuPrincipal.jtGeneralUsuarios;
import static Menus.MenuPrincipal.jtUsuariosAcceso;
import static Menus.MenuPrincipal.jtUsuariosTiendas;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author janillo
 */
public class ModelosTablas extends DefaultTableModel{
    
    public static DefaultTableModel modGeneralUsuarios = new DefaultTableModel();
    public static DefaultTableModel modUsuariosTiendas = new DefaultTableModel();
    public static DefaultTableModel modUsuariosLogueo = new DefaultTableModel();
    
    
    public static void tablaConsultaGeneral() {

        //AÑADIMOS LA CABECERA DE LA TABLA
        modGeneralUsuarios.addColumn("ID");
        modGeneralUsuarios.addColumn("NOMBRE");
        modGeneralUsuarios.addColumn("PRIMER APELLIDO");
        modGeneralUsuarios.addColumn("SEGUNDO APELLIDO");
        modGeneralUsuarios.addColumn("DNI");
        modGeneralUsuarios.addColumn("DIRECCIÓN");
        modGeneralUsuarios.addColumn("F. NACIMIENTO");
        modGeneralUsuarios.addColumn("TELÉFONO");
        modGeneralUsuarios.addColumn("SEXO");
        

        //APLICAMOS EL MODELO A LA JTABLE QUE TENEMOS EN EL JFRAME
        jtGeneralUsuarios.setModel(modGeneralUsuarios);
        jtGeneralUsuarios.getColumnModel().getColumn(0).setMaxWidth(25);
        jtGeneralUsuarios.getColumnModel().getColumn(8).setMaxWidth(25);
       /* jtGeneralUsuarios.getColumnModel().getColumn(1).setMaxWidth(100);
        jtGeneralUsuarios.getColumnModel().getColumn(3).setMaxWidth(80);
        jtGeneralUsuarios.getColumnModel().getColumn(5).setMaxWidth(60);
        jtGeneralUsuarios.getColumnModel().getColumn(6).setMaxWidth(80);*/
     jtGeneralUsuarios.setModel(modGeneralUsuarios);
     

    }
    
      public static void tablaUsuariosTiendas() {
          modUsuariosTiendas.addColumn("CÓDIGO");
          modUsuariosTiendas.addColumn("TIENDA");
          modUsuariosTiendas.addColumn("CIUDAD");
          jtUsuariosTiendas.setModel(modUsuariosTiendas);
          jtUsuariosTiendas.getColumnModel().getColumn(0).setMaxWidth(25);
          jtUsuariosTiendas.setModel(modUsuariosTiendas);
      }
      
       public static void tablaUsuariosLogueo() {
          modUsuariosLogueo.addColumn("USUARIO");
          modUsuariosLogueo.addColumn("PERFIL");
          jtUsuariosAcceso.setModel(modUsuariosLogueo);
          
      }

}
