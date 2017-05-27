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
public class DispositivosApple extends Dispositivos{
private String nombre;
private String tipoConector;
private String conectorJack;

    /**
     *
     * @param nombre
     * @param tipoConector
     * @param conectorJack
     * @param pulgadas
     * @param lectorHuellas
     * @param ram
     * @param procesador
     * @param resolucionPantalla
     * @param precio
     * @param capacidadAlmacenamiento
     */
    public DispositivosApple(String nombre,String tipoConector, String conectorJack, String pulgadas, String lectorHuellas, String ram, String procesador, String resolucionPantalla, String precio, String capacidadAlmacenamiento) {
        super(pulgadas, lectorHuellas, ram, procesador, resolucionPantalla, precio, capacidadAlmacenamiento);
        this.tipoConector = tipoConector;
        this.conectorJack = conectorJack;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String isConectorJack() {
        return conectorJack;
    }

    public String getConectorJack() {
        return conectorJack;
    }

    public void setConectorJack(String conectorJack) {
        this.conectorJack = conectorJack;
    }

             public String toFileString(){
                return this.getNombre()+ ";" + this.getTipoConector()+ ";" + this.getConectorJack() + ";"+this.getPulgadas()+ ";" + this.getLectorHuellas() + ";" 
                        + this.getRam() + ";" + this.getProcesador() +";" + this.getResolucionPantalla() + ";" + this.getPrecio() + ";" + this.getCapacidadAlmacenamiento() +";\r\n";
    }

}
