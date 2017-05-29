/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Adrián Bermúdez Vázquez
 */
public abstract class Dispositivos {

    private String pulgadas;
    private String lectorHuellas;
    private String ram;
    private String procesador;
    private String resolucionPantalla;
    private static String id;
    private String precio;
    private String capacidadAlmacenamiento;
    private int contador;
/**
 * Constructor de dispositivos, el cual tiene un contador que se va sumando cada vez que se crea un dispositivo diferente para 
 * a continuación igualarlo a la ID
 * @param pulgadas
 * @param lectorHuellas
 * @param ram
 * @param procesador
 * @param resolucionPantalla
 * @param precio
 * @param capacidadAlmacenamiento 
 */
    public Dispositivos(String pulgadas, String lectorHuellas, String ram, String procesador, String resolucionPantalla, String precio, String capacidadAlmacenamiento) {
        contador++;
        this.pulgadas = pulgadas;
        this.lectorHuellas = lectorHuellas;
        this.ram = ram;
        this.procesador = procesador;
        this.resolucionPantalla = resolucionPantalla;
        this.id = String.valueOf(contador);
        this.precio = precio;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
/**
 * 
 * @return 
 */
    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }
/**
 * 
 * @param capacidadAlmacenamiento 
 */
    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
/**
 * 
 * @return 
 */
    public String getPrecio() {
        return precio;
    }
/**
 * 
 * @param precio 
 */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
/**
 * 
 * @return 
 */
    public String getPulgadas() {
        return pulgadas;
    }
/**
 * 
 * @param pulgadas 
 */
    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }
/**
 * 
 * @return 
 */
    public String getLectorHuellas() {
        return lectorHuellas;
    }
/**
 * 
 * @param lectorHuellas 
 */
    public void setLectorHuellas(String lectorHuellas) {
        this.lectorHuellas = lectorHuellas;
    }
/**
 * 
 * @return 
 */
    public String getRam() {
        return ram;
    }
/**
 * 
 * @param ram 
 */
    public void setRam(String ram) {
        this.ram = ram;
    }
/**
 * 
 * @return 
 */
    public String getProcesador() {
        return procesador;
    }
/**
 * 
 * @param procesador 
 */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
/**
 * 
 * @return 
 */
    public String getResolucionPantalla() {
        return resolucionPantalla;
    }
/**
 * 
 * @param resolucionPantalla 
 */
    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
/**
 * 
 * @return 
 */
    public String getId() {
        return id;
    }
/**
 * 
 * @param id 
 */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Separa cada parametro del constructor DispositivosAndroid en un array para gravarlo en el fichero correspondiente separado por ";"
     * @param str
     * @return 
     */
    public static DispositivosAndroid fromFileString(String str){
        String[] partes = str.split(";");
        return new DispositivosAndroid(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6],partes[7],
                partes[8],partes[9],partes[10],partes[11],partes[12]+";"+id+";");
    }
    /**
     * Separa cada parametro del constructor DispositivosApple en un array para gravarlo en el fichero correspondiente separado por ";"
     * @param str
     * @return 
     */
    public static DispositivosApple fromFileStringApple(String str){
        String[] partes = str.split(";");
        return new DispositivosApple(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6],partes[7],
                partes[8],partes[9]+id+";");
    }
}
