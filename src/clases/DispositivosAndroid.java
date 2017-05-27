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

    public String isTarjetaSD() {
        return tarjetaSD;
    }

    public void setTarjetaSD(String tarjetaSD) {
        this.tarjetaSD = tarjetaSD;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getTipoSim() {
        return tipoSim;
    }

    public void setTipoSim(String tipoSim) {
        this.tipoSim = tipoSim;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
         public String toFileString(){
                return this.isTarjetaSD()+ ";" + this.getVersionAndroid()+ ";" + this.getTipoConexion() + ";"  + this.getMarca()+ ";" + this.getPulgadas() + ";" + this.isLectorHuellas() + ";" + this.getRam() +";" + this.getProcesador() + ";" + this.getResolucionPantalla()+";" + this.getPrecio() + ";" + this.getNombre() + ";" + this.getCapacidadAlmacenamiento() +/* ";" + this.getId() +*/";\r\n";
    }
         

}
