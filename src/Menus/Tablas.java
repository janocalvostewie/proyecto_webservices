package Menus;

import static Menus.ModelosTablas.modGeneralUsuarios;
import java.util.List;
import static Menus.MenuPrincipal.jtGeneralUsuarios;
import net.java.dev.jaxb.array.StringArray;

/**
 *
 * @author janillo
 */
public class Tablas {

    public static void rellenaUsuariosGeneral() {
 
        String[] valores = new String[9];
       
        List<StringArray> lista = consultarTrabajadores();
      
        for (int i = 0; i < lista.size(); i++) {

            StringArray z1  = lista.get(i);
            List l1=z1.getItem();
            for(int j=0;j<l1.size();j++){
            String var=l1.get(j).toString();
            valores[j]=var;
            System.out.println(valores[j]);
            
            }
            modGeneralUsuarios.addRow(valores);

        }
  jtGeneralUsuarios.setModel(modGeneralUsuarios);
    }

    private static java.util.List<net.java.dev.jaxb.array.StringArray> consultarTrabajadores() {
        servicio_usuarios.Usuarios_Service service = new servicio_usuarios.Usuarios_Service();
        servicio_usuarios.Usuarios port = service.getUsuariosPort();
        return port.consultarTrabajadores();
    }

}
