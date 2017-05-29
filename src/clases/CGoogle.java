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
public class CGoogle extends DispositivosAndroid {
/**
 * 
 * @param tarjetaSD
 * @param androidPuro
 * @param versionAndroid
 * @param tipoSim
 * @param tipoConexion
 * @param numeroCamaras
 * @param marca
 * @param pulgadas
 * @param lectorHuellas
 * @param ram
 * @param procesador
 * @param resolucionPantalla
 * @param otros
 * @param precio
 * @param nombre
 * @param capacidadAlmacenamiento 
 */
    public CGoogle(String tarjetaSD, String androidPuro, String versionAndroid, String tipoSim, String tipoConexion, String numeroCamaras, String marca, String pulgadas, String lectorHuellas, String ram, String procesador, String resolucionPantalla, String otros, String precio, String nombre, String capacidadAlmacenamiento) {
        super(tarjetaSD, versionAndroid, tipoSim, tipoConexion, marca, pulgadas, lectorHuellas, ram, procesador, resolucionPantalla, precio, nombre, capacidadAlmacenamiento);
    }

}
