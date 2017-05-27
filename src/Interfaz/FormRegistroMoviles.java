/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import clases.DispositivosAndroid;
import clases.DispositivosApple;
import clases.ListaDispositivosAndroid;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Buskys
 */
public class FormRegistroMoviles extends javax.swing.JFrame {
ListaDispositivosAndroid listaAndroid = new ListaDispositivosAndroid();
    /** Creates new form FormRegistroMoviles */
    public FormRegistroMoviles() {
        listaAndroid.initializeList();
        initComponents();
        androidPanel.setEnabled(false);
        androidPanel.setVisible(false);
        applePanel.setEnabled(false);
        applePanel.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sistemaCB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        pulgadasTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        procesadorTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        resolucionPantallaTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        precioTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        androidPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        versionAndroidCB = new javax.swing.JComboBox();
        tipoSimCB = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        tipoConexionCB = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        marcaCB = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        nombreTf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tarjetaSdCB = new javax.swing.JComboBox();
        nombreAndroidMensaje = new javax.swing.JLabel();
        ramCB = new javax.swing.JComboBox();
        lectorHuellasCB = new javax.swing.JComboBox();
        capacidadAlmacenamientoCB = new javax.swing.JComboBox();
        applePanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        nombreAppleTf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tipoConectorCB = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        conectorJackCB = new javax.swing.JComboBox();
        nombreAppleMensaje = new javax.swing.JLabel();
        pulagasMensaje = new javax.swing.JLabel();
        precioMensaje = new javax.swing.JLabel();
        ProcesadorMensaje = new javax.swing.JLabel();
        resolucionMensaje = new javax.swing.JLabel();
        enviarBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione tipo de movil");

        sistemaCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Seleccione un SO-", "Android", "Apple" }));
        sistemaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemaCBActionPerformed(evt);
            }
        });

        jLabel2.setText("Pulgadas: ");

        jLabel3.setText("Lector de huellas?");

        jLabel4.setText("Ram:");

        jLabel5.setText("Procesador:");

        jLabel6.setText("Capacidad de almacenamiento:");

        jLabel7.setText("GB");

        jLabel8.setText("GB");

        jLabel9.setText("ppp");

        jLabel10.setText("Resolución de pantalla:");

        jLabel11.setText("Precio:");

        jLabel12.setText("€");

        jLabel13.setText("Versión de Android:");

        jLabel14.setText("Tipo de SIM:");

        versionAndroidCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4.0", "4.4", "5.0", "5.1", "6.0", "6.1", "7.0" }));

        tipoSimCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MicroSIM", "NanoSIM", "SIM" }));

        jLabel15.setText("Tipo de conexión:");

        tipoConexionCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MiniUSB", "TipoC" }));

        jLabel16.setText("Marca:");

        marcaCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bq", "Google", "HTC", "Huawei", "LG", "Samsung", "Sony", "Xiaomi" }));

        jLabel17.setText("Nombre del modelo:");

        jLabel18.setText("Permite tarjeta SD?");

        tarjetaSdCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        nombreAndroidMensaje.setForeground(new java.awt.Color(255, 51, 51));
        nombreAndroidMensaje.setText("El campo nombre no puede estar vacio");

        javax.swing.GroupLayout androidPanelLayout = new javax.swing.GroupLayout(androidPanel);
        androidPanel.setLayout(androidPanelLayout);
        androidPanelLayout.setHorizontalGroup(
            androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(androidPanelLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTf))
            .addGroup(androidPanelLayout.createSequentialGroup()
                .addGroup(androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(androidPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(versionAndroidCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(androidPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoConexionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(androidPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(androidPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoSimCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(androidPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarjetaSdCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, androidPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(nombreAndroidMensaje)
                .addContainerGap())
        );
        androidPanelLayout.setVerticalGroup(
            androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(androidPanelLayout.createSequentialGroup()
                .addGroup(androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(versionAndroidCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tipoSimCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tipoConexionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(marcaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreAndroidMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(androidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tarjetaSdCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        ramCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

        lectorHuellasCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        capacidadAlmacenamientoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "12", "16", "32", "64", "124" }));

        jLabel19.setText("Nombre del modelo:");

        jLabel20.setText("Tipo de conexión:");

        tipoConectorCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lightning", "Conector de 30 pines" }));

        jLabel21.setText("Conector Jack?");

        conectorJackCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        nombreAppleMensaje.setForeground(new java.awt.Color(255, 51, 51));
        nombreAppleMensaje.setText("El campo nombre no puede estar vacio");

        javax.swing.GroupLayout applePanelLayout = new javax.swing.GroupLayout(applePanel);
        applePanel.setLayout(applePanelLayout);
        applePanelLayout.setHorizontalGroup(
            applePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applePanelLayout.createSequentialGroup()
                .addGroup(applePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(applePanelLayout.createSequentialGroup()
                        .addGroup(applePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(applePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(applePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nombreAppleTf))
                                .addGroup(applePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tipoConectorCB, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(applePanelLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conectorJackCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nombreAppleMensaje)))
                .addContainerGap())
        );
        applePanelLayout.setVerticalGroup(
            applePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(applePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(nombreAppleTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreAppleMensaje)
                .addGap(4, 4, 4)
                .addGroup(applePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tipoConectorCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(applePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conectorJackCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pulagasMensaje.setForeground(new java.awt.Color(255, 51, 51));
        pulagasMensaje.setText("Debe introducir un número válido");

        precioMensaje.setForeground(new java.awt.Color(255, 51, 51));
        precioMensaje.setText("Debe introducir un precio válido");

        ProcesadorMensaje.setForeground(new java.awt.Color(255, 0, 0));
        ProcesadorMensaje.setText("El campo procesador no puede estar vacio");

        resolucionMensaje.setForeground(new java.awt.Color(255, 51, 51));
        resolucionMensaje.setText("Debe introducir un número válido");

        enviarBoton.setText("Enviar");
        enviarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBotonActionPerformed(evt);
            }
        });

        cancelarBoton.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pulagasMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precioMensaje))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pulgadasTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lectorHuellasCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ramCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(sistemaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(androidPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(resolucionMensaje)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(resolucionPantallaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel9)))
                                            .addComponent(ProcesadorMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(applePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(enviarBoton)
                                                .addGap(34, 34, 34)
                                                .addComponent(cancelarBoton)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(procesadorTf, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(capacidadAlmacenamientoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sistemaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pulgadasTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(precioTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(ramCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lectorHuellasCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulagasMensaje)
                    .addComponent(precioMensaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(procesadorTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(capacidadAlmacenamientoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProcesadorMensaje)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(resolucionPantallaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(2, 2, 2)
                        .addComponent(resolucionMensaje)
                        .addGap(2, 2, 2)
                        .addComponent(androidPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(applePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enviarBoton)
                            .addComponent(cancelarBoton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBotonActionPerformed
        
        if (sistemaCB.getSelectedItem().toString().equalsIgnoreCase("Android")) {
            DispositivosAndroid android1 = new DispositivosAndroid(tarjetaSdCB.getSelectedItem().toString(), versionAndroidCB.getSelectedItem().toString(), tipoSimCB.getSelectedItem().toString(),
                tipoConexionCB.getSelectedItem().toString(), marcaCB.getSelectedItem().toString(), pulgadasTf.getText(), lectorHuellasCB.getSelectedItem().toString(),
                Arrays.toString(ramCB.getSelectedObjects()), procesadorTf.getText(), resolucionPantallaTf.getText(),precioTf.getText(), 
                nombreTf.getText(), capacidadAlmacenamientoCB.getSelectedItem().toString());
        listaAndroid.añadir(android1);
        JOptionPane.showMessageDialog(this, "Movil "+android1.getNombre()+" registrado correctamente.", null, WIDTH);
        }else if(sistemaCB.getSelectedItem().toString().equalsIgnoreCase("Apple")){
            DispositivosApple apple1 = new DispositivosApple(nombreAppleTf.getText(), tipoConectorCB.getSelectedItem().toString(), conectorJackCB.getSelectedItem().toString(),
                    pulgadasTf.getText(), lectorHuellasCB.getSelectedItem().toString(), ramCB.getSelectedItem().toString(), procesadorTf.getText(), resolucionPantallaTf.getText(), 
                    precioTf.getText(), capacidadAlmacenamientoCB.getSelectedItem().toString());
        
            this.dispose();
        }
    }//GEN-LAST:event_enviarBotonActionPerformed

    private void sistemaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemaCBActionPerformed
    if (sistemaCB.getSelectedItem().toString().equalsIgnoreCase("Android")) {
            applePanel.setEnabled(false);
            applePanel.setVisible(false);
            androidPanel.setVisible(true);
            androidPanel.setEnabled(true);
        }if (sistemaCB.getSelectedItem().toString().equalsIgnoreCase("Apple")) {
            androidPanel.setEnabled(false);
            androidPanel.setVisible(false);
            applePanel.setVisible(true);
            applePanel.setEnabled(true);
        }
    }//GEN-LAST:event_sistemaCBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormRegistroMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistroMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistroMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistroMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistroMoviles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProcesadorMensaje;
    private javax.swing.JPanel androidPanel;
    private javax.swing.JPanel applePanel;
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JComboBox capacidadAlmacenamientoCB;
    private javax.swing.JComboBox conectorJackCB;
    private javax.swing.JButton enviarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox lectorHuellasCB;
    private javax.swing.JComboBox marcaCB;
    private javax.swing.JLabel nombreAndroidMensaje;
    private javax.swing.JLabel nombreAppleMensaje;
    private javax.swing.JTextField nombreAppleTf;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JLabel precioMensaje;
    private javax.swing.JTextField precioTf;
    private javax.swing.JTextField procesadorTf;
    private javax.swing.JLabel pulagasMensaje;
    private javax.swing.JTextField pulgadasTf;
    private javax.swing.JComboBox ramCB;
    private javax.swing.JLabel resolucionMensaje;
    private javax.swing.JTextField resolucionPantallaTf;
    private javax.swing.JComboBox sistemaCB;
    private javax.swing.JComboBox tarjetaSdCB;
    private javax.swing.JComboBox tipoConectorCB;
    private javax.swing.JComboBox tipoConexionCB;
    private javax.swing.JComboBox tipoSimCB;
    private javax.swing.JComboBox versionAndroidCB;
    // End of variables declaration//GEN-END:variables

}