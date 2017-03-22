
package Tablas;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import net.java.dev.jaxb.array.StringArray;

/**
 *
 * @author janillo
 */
public class Combos {

    public static void comboArtCategorias(){
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();
     List<StringArray> lista =articulosCategorias();
    creaMatrizTabla(lista, modelo);
    //Menus.MenuPrincipal.cbArtCate.setModel(modelo);
    }
    
    
    
    ////////////////////////CREACIÓN DE LA MATRIX DE DATOS DEVUELTOS/////////////////////
    public static void creaMatrizTabla(List<StringArray> lista, DefaultComboBoxModel modelo) {
modelo.addElement("------");
int x=0;
        for (int i = 0; i < lista.size(); i++) {

            StringArray z1 = lista.get(i);
            List l1 = z1.getItem();
            String[] valores = new String[l1.size()];
            for (int j = 0; j < l1.size(); j++) {
                String var = l1.get(j).toString();
                if(j==1){
                valores[x] = var;
                }
System.out.println(var);
            }
            x++;
            //modelo.addElement(valores);

        }

    }
    
    
    
    ////////////////////METODOS WEB//////////////////////////
    private static java.util.List<net.java.dev.jaxb.array.StringArray> articulosCategorias() {
        web_articulos.Articulos_Service service = new web_articulos.Articulos_Service();
        web_articulos.Articulos port = service.getArticulosPort();
        return port.articulosCategorias();
    }
}
