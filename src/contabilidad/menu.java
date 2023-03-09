package contabilidad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class menu extends javax.swing.JFrame {

    private ArrayList<Cuenta> catalogo = new ArrayList<Cuenta>();
    Cuenta activos, pasivos, capital;
    //
    public menu() {
        initComponents();

        loadTemplate();
        cargarCuentas();
        updateTabla();
    }
    
    public void loadTemplate() {
        catalogo = new ArrayList<Cuenta>();
        
        activos = new Cuenta("Activo", "1");
        pasivos = new Cuenta("Pasivo", "2");
        capital = new Cuenta("Capital", "3");
        
        catalogo.add(activos);
        catalogo.add(pasivos);
        catalogo.add(capital);
        
        activos.addCuenta(new Cuenta("Activo circulante", activos));
        activos.addCuenta(new Cuenta("Activo no circulante", activos));
        
        pasivos.addCuenta(new Cuenta("Corto plazo", pasivos));
        pasivos.addCuenta(new Cuenta("Largo plazo", pasivos));
        
        capital.addCuenta(new Cuenta("Capital social", capital));
    }

    public void cargarCuentas() {
        var reporte = new GenerarReporte();
        var texto = reporte.readCSV();
        var filas = texto.split("\n");
        
        for(int i = 0; i < filas.length; i++) {
            filas[i] = filas[i].replace("\n", "");
            filas[i] = filas[i].replace("\t", "");
            
            var col = filas[i].split(",", -1);
            if(col[0].isEmpty()) continue;
            
            var id = col[0].trim();
            var nombre = col[1].trim();
            
            //System.out.println(id);
            //System.out.println(nombre);
            
            //ENCONTRAR LA CUENTA PADRE
            if (id.length() > 2){
                var idPadre = id.substring(0, id.length()-1);
                System.out.println(idPadre);
                var cuentaPadre = activos.buscarSubcuenta(idPadre);
                if (cuentaPadre == null) {
                    cuentaPadre = pasivos.buscarSubcuenta(idPadre);
                    if (cuentaPadre == null) {
                        cuentaPadre = capital.buscarSubcuenta(idPadre);
                    }
                }
                
                if (cuentaPadre != null){
                    cuentaPadre.addCuenta(new Cuenta(nombre, cuentaPadre));
                    System.out.println("QUEEEE"+ id+"  "+nombre);
                }
            }
        }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCatalogo = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        codigoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        buscarField = new javax.swing.JTextField();
        POLOLO = new javax.swing.JButton();
        CargarBoton = new javax.swing.JButton();
        GuardarD = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crossfit DLT - Catálogo de cuentas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        tablaCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        tablaCatalogo.setShowGrid(true);
        jScrollPane5.setViewportView(tablaCatalogo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        nombreField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 3, true));
        nombreField.setName(""); // NOI18N

        codigoField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 3, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");

        botonAgregar.setText("Agregar cuenta");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCuenta(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar nueva cuenta");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        nombreField.getAccessibleContext().setAccessibleName("");
        nombreField.getAccessibleContext().setAccessibleDescription("");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Eliminar cuenta seleccionada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEliminarBoton(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 560));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar Código");

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        botonBuscar.setLabel("Buscar cuenta");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPerformed(evt);
            }
        });

        buscarField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 3, true));

        POLOLO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        POLOLO.setText("Generar reporte");
        POLOLO.setName("BotonPDF"); // NOI18N
        POLOLO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onGenerarPDF(evt);
            }
        });

        CargarBoton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CargarBoton.setLabel("Cargar datos");
        CargarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarBotonActionPerformed(evt);
            }
        });

        GuardarD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GuardarD.setLabel("Guardar datos");
        GuardarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CATÁLOGO DE CUENTAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarField)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CargarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GuardarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(POLOLO, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarField, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(POLOLO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CargarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 750, 230));

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla1.setShowGrid(false);
        jScrollPane1.setViewportView(Tabla1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 530, 260));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDActionPerformed
        var repo = activos.toString();
        repo += "\n"+pasivos.toString();
        repo += "\n"+capital.toString();

        var reporte = new GenerarReporte();
        reporte.save(repo);

        System.out.println("Guardando datos...");
        loadTemplate();
        cargarCuentas();
        updateTabla();

        JOptionPane.showMessageDialog(rootPane, "Se guardaron los datos correctamente");
    }//GEN-LAST:event_GuardarDActionPerformed

    private void CargarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarBotonActionPerformed
        // TODO add your handling code here:
        loadTemplate();
        cargarCuentas();
        updateTabla();
    }//GEN-LAST:event_CargarBotonActionPerformed

    private void onGenerarPDF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onGenerarPDF
        System.out.println("Exportando PDF");

        //Todo el texto que se pondrá en el reporte se saca con los toString()
        var repo = activos.toString();
        repo += "\n"+pasivos.toString();
        repo += "\n"+capital.toString();

        System.out.println(activos.toString());
        System.out.println(pasivos.toString());
        System.out.println(capital.toString());

        //Se crea el objeto que guarda y genera reportes
        var reporte = new GenerarReporte();
        
        //Primero se guarda la información en el archivo de texto
        reporte.save(repo);

        //Ahora se lee el archivo de texto
        var csv = reporte.readCSV();
        var filas = csv.split("\n");

        //Para escribir sobre el archivo sin errores, hay que quitar los \n  \t y las comas
        for(int i = 0; i < filas.length; i++) {
            filas[i] = filas[i].replace("\n", "");
            filas[i] = filas[i].replace("\t", "        ");
            filas[i] = filas[i].replace(",", "                        ");

        }

        //Se manda a escribir sobre la plantilla pdf
        reporte.write(filas);
 
        //Aquí se abre el archivo una vez se guardó
        try {
            //Esto es para encontrar el pdf
            File file = new File(System.getProperty("user.dir") + "/Data/Reporte.pdf");
            if (file.exists()) {
                //Si el archivo existe se abre
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                    JOptionPane.showMessageDialog(rootPane, "Se generó correctamente el PDF");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Hubo un error. No se generó el PDF");    
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se guardó correctamente el PDF");
            }
        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Hubo un error");
        }
        
    }//GEN-LAST:event_onGenerarPDF

    private void botonBuscarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPerformed
        //BUSCAR EL CODIGO
        var codigo = buscarField.getText();
        Cuenta cuenta = null;
        for (var c : catalogo) {
            cuenta = c.buscarSubcuenta(codigo);
            if (cuenta != null)
            break;
        }

        //DECTECTA LOS ARTICULOS //
        var msg = cuenta != null ? "Encontrado: " + cuenta.getNombre() : "No se encontró nada";

        if (cuenta == null) {
            // EN CASO DE NO ENCONTRAR UN ARTICULO ESTE TENDRA UN MENSAJE//
            JOptionPane.showMessageDialog(null, "No se encontró nada", "Datos", JOptionPane.DEFAULT_OPTION);
            return;

        }

        // MODELO EN EL CUAL MUESTRA TODO EN LA TABLA//
        var model = new javax.swing.table.DefaultTableModel(
            new String[][]{
                {cuenta.getId(), cuenta.getNombre()}
            },
            new String[]{
                "Código", "Nombre"
            }
        );
        Tabla1.setModel(model);
    }//GEN-LAST:event_botonBuscarPerformed

    private void onEliminarBoton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onEliminarBoton
        eliminarCuenta();
    }//GEN-LAST:event_onEliminarBoton

    private void agregarCuenta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCuenta

        var nombre = nombreField.getText();
        var codigo = codigoField.getText();

        if (nombre.isBlank() || nombre.isEmpty() || codigo.isEmpty() || codigo.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Ingresa correctamente los datos");
            return;
        }

        if (codigo.length() > 2){
            var idPadre = codigo.substring(0, codigo.length()-1);
            System.out.println(idPadre);
            var cuentaPadre = activos.buscarSubcuenta(idPadre);
            if (cuentaPadre == null){
                cuentaPadre = pasivos.buscarSubcuenta(idPadre);
                if (cuentaPadre == null) {
                    cuentaPadre = capital.buscarSubcuenta(idPadre);
                }
            }

            if (cuentaPadre != null){
                cuentaPadre.addCuenta(new Cuenta(nombre, cuentaPadre));
                System.out.println("QUEEEE"+ idPadre+"  "+nombre);
            } else {
                System.out.println("No se halló ningun padre");
            }
        } else {
            System.out.println("Codigo muy pequeño");
        }

        updateTabla();
        JOptionPane.showMessageDialog(rootPane, "Se agregó la cuenta "+nombre+" correctamente");
    }//GEN-LAST:event_agregarCuenta


    
    private void updateTabla() {  
        var model = new DefaultTableModel(
                new String[]{
                    "Código", "Nombre de cuenta"
                }, 0
        );
        
        //ACTIVOS
        var act = activos.toString();
        var filas = act.split("\n");
        
        for(int i = 0; i < filas.length; i++) {
            filas[i] = filas[i].replace("\n", "");
            filas[i] = filas[i].replace("\t", "  ");   
            var col = filas[i].split(",");
            model.addRow(new String[] { col[0], col[1] });
        }
        
        //PASIVOS
        act = pasivos.toString();
        filas = act.split("\n");
        
        for(int i = 0; i < filas.length; i++) {
            filas[i] = filas[i].replace("\n", "");
            filas[i] = filas[i].replace("\t", "  ");   
            var col = filas[i].split(",");
            model.addRow(new String[] { col[0], col[1] });
        }
        
        //CAPITAL
        act = capital.toString();
        filas = act.split("\n");
        
        for(int i = 0; i < filas.length; i++) {
            filas[i] = filas[i].replace("\n", "");
            filas[i] = filas[i].replace("\t", "  ");   
            var col = filas[i].split(",");
            model.addRow(new String[] { col[0], col[1] });
        }
        
        tablaCatalogo.setModel(model);
    }
        
    private void eliminarCuenta() {
        int filaElegida = tablaCatalogo.getSelectedRow();
        if (filaElegida == -1) return;
        
        var id = (String)tablaCatalogo.getValueAt(filaElegida, 0);
        var cuenta = activos.buscarSubcuenta(id);
        if (cuenta == null){
            cuenta = pasivos.buscarSubcuenta(id);
            if (cuenta == null){
                cuenta = capital.buscarSubcuenta(id);
            }
        }
        
        if (cuenta == null) {
            System.out.println("No se encontro cuenta a eliminar");
            return;
        } else if(cuenta == activos.buscarSubcuenta("11") || cuenta == activos.buscarSubcuenta("12")){
            System.out.println("No se encontro cuenta a eliminar");
            return;
        } else if (cuenta == pasivos.buscarSubcuenta("21") || cuenta == pasivos.buscarSubcuenta("22")) {
            System.out.println("No se encontro cuenta a eliminar");
            return;
        } else if (cuenta == capital.buscarSubcuenta("31")) {
            System.out.println("No se encontro cuenta a eliminar");
            return;
        }
        
        cuenta.eliminar();
        updateTabla();
        
        JOptionPane.showMessageDialog(rootPane, "Se eliminó la cuenta "+cuenta.getNombre()+" ("+cuenta.getId()+")"+" correctamente");
    }
    
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarBoton;
    private javax.swing.JButton GuardarD;
    private javax.swing.JButton POLOLO;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField buscarField;
    private javax.swing.JTextField codigoField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTable tablaCatalogo;
    // End of variables declaration//GEN-END:variables

    private void Tabla1(String[] datos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
