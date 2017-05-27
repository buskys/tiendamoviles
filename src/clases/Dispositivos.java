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

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String isLectorHuellas() {
        return lectorHuellas;
    }

    public void setLectorHuellas(String lectorHuellas) {
        this.lectorHuellas = lectorHuellas;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public static DispositivosAndroid fromFileString(String str){
        String[] partes = str.split(";");
        return new DispositivosAndroid(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6],partes[7],
                partes[8],partes[9],partes[10],partes[11],partes[12]+";"+id);
    }
}
