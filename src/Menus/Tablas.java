package Menus;

import static Menus.ModelosTablas.modGeneralUsuarios;
import java.util.List;
import static Menus.MenuPrincipal.jtGeneralUsuarios;
import static Menus.MenuPrincipal.jtUsuariosAcceso;
import static Menus.MenuPrincipal.jtUsuariosTiendas;
import static Menus.ModelosTablas.modUsuariosLogueo;
import static Menus.ModelosTablas.modUsuariosTiendas;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import net.java.dev.jaxb.array.StringArray;

/**
 *
 * @author janillo
 */
public class Tablas {

    public static void rellenaUsuariosGeneral() {

        String[] valores = new String[9];

        List<StringArray> lista = consultarTrabajadores();
        creaMatrizTabla(lista, modGeneralUsuarios);

        jtGeneralUsuarios.setModel(modGeneralUsuarios);
    }

    public static void rellenaTablaUsuariosLogueo(int idUsuario) {

        while (jtUsuariosAcceso.getRowCount() > 0) {
            ((DefaultTableModel) jtUsuariosAcceso.getModel()).removeRow(0);
        }

        List<String> valores = new ArrayList<>();

        String[] vUsario = new String[5];
        valores = devuelveUsuarioLogueo(idUsuario);
        valores.toArray(vUsario);
        modUsuariosLogueo.addRow(vUsario);
        jtUsuariosAcceso.setModel(modUsuariosLogueo);
    }

    public static void rellenaTablaUsuariosTiendas(int idUsuario) {

        while (jtUsuariosTiendas.getRowCount() > 0) {
            ((DefaultTableModel) jtUsuariosTiendas.getModel()).removeRow(0);
        }

        List<StringArray> lista = consultarUsuariosTiendas(idUsuario);
        creaMatrizTabla(lista, modUsuariosTiendas);
        jtUsuariosTiendas.setModel(modUsuariosTiendas);

    }

    /**
     * *******************************CREACIÓN DE LA MATRIX DE DATOS
     * DEVUELTOS**************************************
     */
    public static void creaMatrizTabla(List<StringArray> lista, DefaultTableModel modelo) {

        for (int i = 0; i < lista.size(); i++) {

            StringArray z1 = lista.get(i);
            List l1 = z1.getItem();
            String[] valores = new String[l1.size()];
            for (int j = 0; j < l1.size(); j++) {
                String var = l1.get(j).toString();
                valores[j] = var;

            }
            modelo.addRow(valores);

        }

    }

    /**
     * *************************METODOS
     * WEB*************************************
     */
    private static java.util.List<net.java.dev.jaxb.array.StringArray> consultarTrabajadores() {
        servicio_usuarios.Usuarios_Service service = new servicio_usuarios.Usuarios_Service();
        servicio_usuarios.Usuarios port = service.getUsuariosPort();
        return port.consultarTrabajadores();
    }

    private static java.util.List<net.java.dev.jaxb.array.StringArray> consultarUsuariosTiendas(int arg0) {
        servicio_usuarios.Usuarios_Service service = new servicio_usuarios.Usuarios_Service();
        servicio_usuarios.Usuarios port = service.getUsuariosPort();
        return port.consultarUsuariosTiendas(arg0);
    }

    private static java.util.List<java.lang.String> devuelveUsuarioLogueo(int arg0) {
        servicio_usuarios.Usuarios_Service service = new servicio_usuarios.Usuarios_Service();
        servicio_usuarios.Usuarios port = service.getUsuariosPort();
        return port.devuelveUsuarioLogueo(arg0);
    }

}
