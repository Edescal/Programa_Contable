package contabilidad;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public final class NewGUI extends javax.swing.JFrame {

    private LogicaCatalogo logica;

    public NewGUI() {
        logica = new LogicaCatalogo();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        buscarField = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCatalogo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saldoLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nuevaCuentaField = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        aboutMenuButton = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(89, 89, 96));

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarPerformed(evt);
            }
        });

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCargar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Buscar:");

        buscarField.setText("Código");

        botonBuscar.setText("Resultados");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPerformed(evt);
            }
        });

        jScrollPane1.setName("Tabla Catalogo"); // NOI18N

        tablaCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null},
                {"11", null},
                {"12", null},
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
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Cuenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaCatalogo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tablaCatalogo.setShowGrid(false);
        tablaCatalogo.setShowHorizontalLines(true);
        tablaCatalogo.getTableHeader().setResizingAllowed(false);
        tablaCatalogo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCatalogo);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catálogo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre:");

        nombreLabel.setText("Bancos");
        nombreLabel.setOpaque(true);

        jLabel4.setText("Saldo:");

        saldoLabel.setText("500000 MXN");

        jLabel6.setText("Código en el catálogo:");

        codigoLabel.setText("1.2.10");

        jLabel8.setBackground(new java.awt.Color(0, 102, 153));
        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setLabelFor(panelDatos);
        jLabel8.setText("    DATOS DE LA CUENTA:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);

        botonEditar.setText("Editar datos");

        botonEliminar.setText("Eliminar cuenta");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(saldoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(saldoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codigoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setText("Nueva cuenta");

        nuevaCuentaField.setText("Nombre");

        botonAgregar.setText("Añadir cuenta");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        aboutMenuButton.setText("About");
        jMenuBar1.add(aboutMenuButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevaCuentaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonAgregar)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(buscarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar))
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(botonAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevaCuentaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarPerformed
        mostrarDatosEnTabla();
    }//GEN-LAST:event_botonCargarPerformed

    private void botonGuardarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarPerformed
        logica.guardarCuentas();

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Hubo un error");
        }
    }//GEN-LAST:event_botonGuardarPerformed

    private void botonBuscarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPerformed
        String nombre = buscarField.getText();
        Cuenta objetivo = logica.buscar(nombre);

        //Si no encontró nada, mostrar un aviso y acabar el método
        if (objetivo == null) {
            JOptionPane.showMessageDialog(null, "No se encontró nada", "Datos", JOptionPane.DEFAULT_OPTION);
            return;
        }

        //Si encontró algo, mostrar los datos
        nombreLabel.setText(objetivo.getNombre());
        saldoLabel.setText(objetivo.getSaldo() + " MXN");
        codigoLabel.setText(objetivo.getId());

        //Encontrar la fila de la selección
        for (int i = 0; i < tablaCatalogo.getModel().getRowCount(); i++) {
            //Se revisa cada fila para ver cuál tiene el id buscado
            if (tablaCatalogo.getModel().getValueAt(i, 0).equals(objetivo.getId())) {
                //Seleccionar esa fila
                tablaCatalogo.setRowSelectionInterval(i, i);
            }
        }
    }//GEN-LAST:event_botonBuscarPerformed

    private void botonEliminarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPerformed
        //Omitir las cuentas que no se deben borrar (falta añadir más)
        String[] omitir = new String[]{"1", "11", "12", "2", "21", "22", "3", "31", "4", "5", "6", "7", "71", "72", "8", "9", "0"};

        try {
            Cuenta cuentaEliminada = buscarCuentaDeTabla(omitir);
            if (cuentaEliminada != null) {
                //Si había una cuenta seleccionada se elimina
                cuentaEliminada.eliminar();
                //Actualizar la tabla
                mostrarDatosEnTabla();
                //Mensaje de lo ocurrido
                JOptionPane.showMessageDialog(rootPane, "Se eliminó la cuenta "
                        + cuentaEliminada.getNombre() + " (" + cuentaEliminada.getId() + ") correctamente");
            }

        } catch (NoSeleccionException e) {
            //Mensaje de que no se encontró nada
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        } catch (CuentaImportanteException e) {
            //Mensaje de que se intentó eliminar una cuenta importante
            JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar esta cuenta: " + e.getMessage());

        } catch (Exception e) {
            //Mensaje de que ocurrió un error no expecificado
            JOptionPane.showMessageDialog(rootPane, "Hubo un error al intentar eliminar la cuenta");
        }


    }//GEN-LAST:event_botonEliminarPerformed

    private void botonAgregarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPerformed
        //Obtener el nombre de la nueva cuenta
        String nombre = nuevaCuentaField.getText();
        //Si no escribió nada regresar
        if (nombre.isBlank() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa el nombre de la nueva cuenta a agregarc");
            return;
        }

        try {
            //Omitir las cuentas a las que no se debe agregar cuentas (falta añadir más)
            String[] omitir = new String[]{"1", "11", "12", "2", "21", "22", "3", "31", "4", "5", "6", "7", "71", "72", "8", "9", "0"};

            //Buscar la cuenta seleccionada en la tabla
            Cuenta cuentaPadre = buscarCuentaDeTabla(omitir);
            //Si la encuentra añadir la nueva subcuenta y actualizar tabla
            if (cuentaPadre != null) {
                cuentaPadre.addCuenta(new Cuenta(nombre, cuentaPadre));
                mostrarDatosEnTabla();
                JOptionPane.showMessageDialog(rootPane, "Se agregó la cuenta " + nombre + " correctamente");
            } else {
                //Si no se encontró nada (error) mostrar mensaje
                JOptionPane.showMessageDialog(rootPane, "No se pudo añadir la cuenta " + nombre + " correctamente");
            }
        } catch (NoSeleccionException e) {
            //Mensaje de que no se encontró nada
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        } catch (CuentaImportanteException e) {
            //Mensaje de que se intentó eliminar una cuenta importante
            JOptionPane.showMessageDialog(rootPane, "No se pudo añadir la subcuenta: " + e.getMessage());

        } catch (Exception e) {
            //Mensaje de que ocurrió un error no expecificado
            JOptionPane.showMessageDialog(rootPane, "Hubo un error al intentar eliminar la cuenta");
        }
    }//GEN-LAST:event_botonAgregarPerformed

    private void mostrarDatosEnTabla() {
        //Crear el modelo
        var model = new DefaultTableModel(
                new String[]{
                    "Código", "Nombre de cuenta"
                }, 0
        );

        //Obtener todo el texto
        String texto = logica.toString();
        //Dividir en filas
        String[] filas = texto.split("\n");

        //Por cada fila se agrega a la tabla una cuenta
        for (int i = 0; i < filas.length; i++) {
            filas[i] = filas[i].replace("\n", "");
            filas[i] = filas[i].replace("\t", "    ");
            var col = filas[i].split(",");
            model.addRow(new String[]{col[0], col[1]});
        }

        //Ponerle el modelo con la info a la tabla
        tablaCatalogo.setModel(model);
        //Añadirle un evento para que siempre que cambie la selección, se muestren los datos
        tablaCatalogo.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                mostrarDatosDeSeleccion();
            }
        });
    }

    private void mostrarDatosDeSeleccion() {
        try {
            //Buscar la cuenta seleccionada en la tabla (no se tiene que omitir nada)
            Cuenta cuenta = buscarCuentaDeTabla(null);
            if (cuenta != null) {
                nombreLabel.setText(cuenta.getNombre());
                saldoLabel.setText(cuenta.getSaldo() + " MXN");
                codigoLabel.setText(cuenta.getId());
            }

        } catch (Exception e) {
            //Mensaje de que ocurrió un error no expecificado
            JOptionPane.showMessageDialog(rootPane, "Hubo un error");
        }
    }

    //El método puede arrojar un error especial (se debe usar try-catch)
    private Cuenta buscarCuentaDeTabla(String[] omitirIds) throws CuentaImportanteException, NoSeleccionException {
        //Si no hay nada seleccionado en la tabla, arrojar un error
        int filaElegida = tablaCatalogo.getSelectedRow();
        System.out.println(filaElegida);
        if (filaElegida == -1) {
            throw new NoSeleccionException("No se ha seleccionado nada en la tabla");
        }

        //Obtener el codigo de la fila seleccionada
        //Si se intenta eliminar una cuenta importante arrojar un error 
        String id = (String) tablaCatalogo.getValueAt(filaElegida, 0);
        if (omitirIds != null) {
            for (int i = 0; i < omitirIds.length; i++) {
                if (id.equals(omitirIds[i])) {
                    String mensaje = "La cuenta " + (String) tablaCatalogo.getValueAt(filaElegida, 1) + " no puede ser modificada";
                    throw new CuentaImportanteException(mensaje);
                }
            }
        }

        //Buscar la cuenta por su código
        Cuenta cuentaSeleccionada = logica.buscar(id);
        //Regresar el resultado (checar si es nulo)
        return cuentaSeleccionada;
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
            java.util.logging.Logger.getLogger(NewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenuButton;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField buscarField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nuevaCuentaField;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JTable tablaCatalogo;
    // End of variables declaration//GEN-END:variables
}
