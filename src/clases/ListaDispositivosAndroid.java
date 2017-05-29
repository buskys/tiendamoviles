package clases;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.ListIterator;


/**
 * @author Adrián Bermúdez Vázquez
 */
public class ListaDispositivosAndroid {

    private final static String FILE_LOC = "movilesAndroid.txt";
     public ArrayList<DispositivosAndroid> listaAndroid;
     
     public static ListaDispositivosAndroid miListaAndroid = new ListaDispositivosAndroid();
    //static private HashMap<String, Usuario> usuarioHashMap;

    public ListaDispositivosAndroid() {
        listaAndroid = new ArrayList<>();
    }

    public void añadir(DispositivosAndroid movilA) {
            addAndroidToFile(movilA);
            listaAndroid.add(movilA);
    }

        public void deleteAndroid(String id) {
        boolean borrado = false;
        ListIterator<DispositivosAndroid> iterList = listaAndroid.listIterator();
        DispositivosAndroid temp;
        if (listaAndroid.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            while (iterList.hasNext() && borrado == false) {
                temp = iterList.next();
                if (id.equalsIgnoreCase(temp.getNombre())) {
                    listaAndroid.remove(temp);
                    borrado = true;
                }
            }
        }
    }

    public DispositivosAndroid findId(String id) {
        ListIterator<DispositivosAndroid> iterList = listaAndroid.listIterator();
        while (iterList.hasNext()) {
            DispositivosAndroid m = iterList.next();
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
        //En caso de HashMap
        //return usuarioHashMap.get(username);
    }

    public boolean existsPhone(String id) {
        ListIterator<DispositivosAndroid> iterList = listaAndroid.listIterator();
        while (iterList.hasNext()) {
            DispositivosAndroid m = iterList.next();
            if (m.getId().equals(id)) {
                return true;
            }
        }
        return false;
        // Se a lista fora un hashMap<String, Usuario> donde o String key e o username
        //return usuarioHashMap.containsKey(username);
    }

    public void initializeList() {
        //leer fichero
        File file = new File(FILE_LOC);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                listaAndroid.add(DispositivosAndroid.fromFileString(line));
                System.out.println("Añadido al archivo correctamente");
            }
        } catch(Exception e){
            //manejar excepcion
        }
        //por cada linea leida

    }

    public void addAndroidToFile(DispositivosAndroid movil) {
        try {
            Files.write(Paths.get(FILE_LOC), movil.toFileString().getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            System.out.println("UUUUPS");
        }
    }

    public List<DispositivosAndroid> getListaAndroid() {
        return listaAndroid;
    }
        public int tam() {
        return listaAndroid.size();
    }

//    public void escribirDatos() throws FileNotFoundException, IOException {
//        try {
//            ObjectOutputStream ficheiro = new ObjectOutputStream(new FileOutputStream("usuarios.data"));
//            for (int i = 0; i < usuarios.size(); i++) {
//                Usuario usuario1 = usuarios.get(i);//Opcional??
//                ficheiro.writeObject(usuario1);
//            }
//            ficheiro.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("No se encuentra el fichero");
//
//        } catch (IOException e) {
//            System.out.println("Error!");
//        }
//    }
//
//    public void leerDatos() throws FileNotFoundException, IOException, ClassNotFoundException {
//        try {
//            ObjectInputStream ficheiro = new ObjectInputStream(new FileInputStream("usuarios.data"));
//            Usuario usuario2 = (Usuario) ficheiro.readObject();
//            while (usuario2 != null) {
//                usuarios.add(usuario2);//Usuarios.añadir??
//                usuario2 = (Usuario) ficheiro.readObject();
//            }
//            ficheiro.close();
//        } catch (EOFException e) {
//            System.out.println("Final fichero");
//        } catch (ClassNotFoundException e) {
//            System.out.println("No se encuentra fichero");
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
//
//    }

}
