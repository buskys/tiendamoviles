package clases;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


/**
 * @author Adrián Bermúdez Vázquez
 */
public class ListaDispositivosApple {

    private final static String FILE_LOC = "movilesApple.txt";
    static private ArrayList<DispositivosApple> listaApple;

    public ListaDispositivosApple() {
        listaApple = new ArrayList<>();
    }

    public void añadir(DispositivosApple movilA) {
            addAppleToFile(movilA);
            listaApple.add(movilA);
    }


    public DispositivosApple findId(String id) {
        ListIterator<DispositivosApple> iterList = listaApple.listIterator();
        while (iterList.hasNext()) {
            DispositivosApple m = iterList.next();
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
        //En caso de HashMap
        //return usuarioHashMap.get(username);
    }

    public boolean existsPhone(String id) {
        ListIterator<DispositivosApple> iterList = listaApple.listIterator();
        while (iterList.hasNext()) {
            DispositivosApple m = iterList.next();
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
                listaApple.add(DispositivosApple.fromFileStringApple(line));
                System.out.println("Añadido al archivo correctamente");
            }
        } catch(Exception e){
            //manejar excepcion
        }
        //por cada linea leida

    }

    public void addAppleToFile(DispositivosApple movil) {
        try {
            Files.write(Paths.get(FILE_LOC), movil.toFileString().getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            System.out.println("UUUUPS");
        }
    }

    public List<DispositivosApple> listaUsuario() {
        return listaApple;
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
