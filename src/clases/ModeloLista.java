
package clases;

import java.util.Collection;
import java.util.HashMap;
import javax.swing.DefaultListModel;

/**
 *Crear cadena con los datos de los objetos q queremos ver
 * El JList solopara un tipo List
 */
public class ModeloLista extends DefaultListModel{
    
    ListaDispositivosAndroid and;

    public void cargar(ListaDispositivosAndroid l) {
        and = l;
        this.fireContentsChanged(this, 0, size());
    }

    @Override
    public int getSize() {
        return and.tam();
    }
    
    @Override
    public Object getElementAt(int index) {
        String cadena;
        cadena = and.listaAndroid.get(index).getNombre();
        return cadena;

    }
}