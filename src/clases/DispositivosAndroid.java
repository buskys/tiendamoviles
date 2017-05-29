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
public class DispositivosAndroid extends Dispositivos{
    private String versionAndroid;
    private String tipoSim;
    private String tipoConexion;
    private String marca;
    private String nombre;
    private String tarjetaSD;
/**
 * Constructor DispositivosAndroid
 * @param tarjetaSD
 * @param versionAndroid
 * @param tipoSim
 * @param tipoConexion
 * @param marca
 * @param pulgadas
 * @param lectorHuellas
 * @param ram
 * @param procesador
 * @param resolucionPantalla
 * @param precio
 * @param nombre
 * @param capacidadAlmacenamiento 
 */
    public DispositivosAndroid(String tarjetaSD, String versionAndroid, String tipoSim, String tipoConexion, String marca, String pulgadas, 
            String lectorHuellas, String ram, String procesador, String resolucionPantalla, String precio, String nombre, String capacidadAlmacenamiento) {
        super(pulgadas, lectorHuellas, ram, procesador, resolucionPantalla, precio, capacidadAlmacenamiento);
        this.versionAndroid = versionAndroid;
        this.tipoSim = tipoSim;
        this.tipoConexion = tipoConexion;
        this.marca = marca;
        this.nombre = nombre;
        this.tarjetaSD = tarjetaSD;
    }
/**
 * 
 * @return 
 */
    public String isTarjetaSD() {
        return tarjetaSD;
    }
/**
 * 
 * @param tarjetaSD 
 */
    public void setTarjetaSD(String tarjetaSD) {
        this.tarjetaSD = tarjetaSD;
    }
/**
 * 
 * @return 
 */
    public String getVersionAndroid() {
        return versionAndroid;
    }
/**
 * 
 * @param versionAndroid 
 */
    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }
/**
 * 
 * @return 
 */
    public String getTipoSim() {
        return tipoSim;
    }
/**
 * 
 * @param tipoSim 
 */
    public void setTipoSim(String tipoSim) {
        this.tipoSim = tipoSim;
    }
/**
 * 
 * @return 
 */
    public String getTipoConexion() {
        return tipoConexion;
    }
/**
 * 
 * @param tipoConexion 
 */
    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }
/**
 * 
 * @return 
 */
    public String getMarca() {
        return marca;
    }
/**
 * 
 * @param marca 
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }
/**
 * 
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return 
 */
 public String toFileString(){
                return this.isTarjetaSD()+ ";" + this.getVersionAndroid()+ ";" + this.getTipoConexion() + ";"  + this.getMarca()+ ";" + this.getPulgadas() + ";" + this.getLectorHuellas() + ";" + this.getRam() +";" + this.getProcesador() + ";" + this.getResolucionPantalla()+";" + this.getPrecio() + ";" + this.getNombre() + ";" + this.getCapacidadAlmacenamiento() +";\r\n";
    }
         

}
