package contabilidad;

import java.io.IOException;
import java.util.InputMismatchException;
import javax.swing.*;

import javax.swing.event.*;
import javax.swing.table.*;

public final class InterfazGrafica extends javax.swing.JFrame {

    private final LogicaCatalogo logica;

    public InterfazGrafica() {
        logica = new LogicaCatalogo();
        initComponents();
        mostrarDatosEnTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        botonExportar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tablaCatalogo = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscarField = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catálogo de cuentas");
        setBackground(new java.awt.Color(89, 89, 96));

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGuardar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonGuardar.setMaximumSize(new java.awt.Dimension(80, 80));
        botonGuardar.setMinimumSize(new java.awt.Dimension(60, 80));
        botonGuardar.setPreferredSize(new java.awt.Dimension(80, 80));
        botonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarPerformed(evt);
            }
        });

        botonCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/load.png"))); // NOI18N
        botonCargar.setText("Cargar");
        botonCargar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCargar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonCargar.setMaximumSize(new java.awt.Dimension(80, 80));
        botonCargar.setMinimumSize(new java.awt.Dimension(60, 80));
        botonCargar.setPreferredSize(new java.awt.Dimension(80, 80));
        botonCargar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarPerformed(evt);
            }
        });

        botonExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        botonExportar.setText("Exportar");
        botonExportar.setToolTipText("Exportar en formato PDF");
        botonExportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonExportar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonExportar.setMaximumSize(new java.awt.Dimension(80, 80));
        botonExportar.setMinimumSize(new java.awt.Dimension(60, 80));
        botonExportar.setPreferredSize(new java.awt.Dimension(80, 80));
        botonExportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help.png"))); // NOI18N
        jButton2.setText("Ayuda");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton2.setMinimumSize(new java.awt.Dimension(60, 80));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        jButton3.setText("Nosotros");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jButton3.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton3.setMinimumSize(new java.awt.Dimension(60, 80));
        jButton3.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        tablaCatalogo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tablaCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCatalogo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaCatalogo.setFillsViewportHeight(true);
        tablaCatalogo.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting())
                mostrarDatosDeSeleccion();
            }
        });
        scrollPane.setViewportView(tablaCatalogo);

        jLabel7.setBackground(new java.awt.Color(0, 102, 204));
        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CATÁLOGO DE CUENTAS");
        jLabel7.setOpaque(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Buscar:");

        buscarField.setText("Código");

        botonBuscar.setText("Resultados");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPerformed(evt);
            }
        });

        botonAgregar.setText("Añadir cuenta");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBuscar))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDatos.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Nombre:");

        nombreLabel.setBackground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Bancos");
        nombreLabel.setOpaque(true);

        jLabel4.setText("Saldo:");

        saldoLabel.setBackground(new java.awt.Color(255, 255, 255));
        saldoLabel.setText("500000 MXN");
        saldoLabel.setOpaque(true);

        jLabel6.setText("Código en el catálogo:");

        codigoLabel.setBackground(new java.awt.Color(255, 255, 255));
        codigoLabel.setText("1.2.10");
        codigoLabel.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(0, 102, 153));
        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setLabelFor(panelDatos);
        jLabel8.setText("    DATOS DE LA CUENTA:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);

        botonEditar.setText("Editar datos");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarPerformed(evt);
            }
        });

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
                            .addComponent(saldoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarPerformed
        logica.cargarCuentas();
        mostrarDatosEnTabla();
    }//GEN-LAST:event_botonCargarPerformed

    private void botonGuardarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarPerformed
        logica.guardarCuentas();
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
                //Seleccionar esa fila de la tabla
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

        try {
            //Omitir las cuentas a las que no se debe agregar cuentas (falta añadir más)
            String[] omitir = new String[]{"1", "2", "3", "4", "5", "6", "8", "0"};
            //Buscar la cuenta seleccionada en la tabla
            Cuenta cuentaPadre = buscarCuentaDeTabla(omitir);

            //Hacer que el usuario ingrese el nombre de la cuenta en una nueva ventana
            String nombre = null;
            //Se crea una ventana para que el usuario escriba el nombre de la nueva cuenta
            JTextField nombreInput = new JTextField();
            Object[] message = {
                "Nombre de la cuenta: ", nombreInput
            };

            //Aquí se revisa si el usuario puso aceptar y escribió un nombre válido
            int opcion = JOptionPane.showConfirmDialog(null, message, "Ingresa los datos de la cuenta", JOptionPane.OK_CANCEL_OPTION);
            if (opcion == JOptionPane.OK_OPTION) {
                nombre = nombreInput.getText();
                if (nombreInput.getText().isBlank() && nombreInput.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Ingresa el nombre de la cuenta");
                    return;
                }
            }
            else if (opcion == JOptionPane.CANCEL_OPTION) return;
            
            //Añadir la nueva subcuenta y actualizar tabla
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

    private void botonExportarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarPerformed
        try {
            // Generar el pdf
            logica.exportarCuentas();
            //Aquí se abre el archivo una vez se guardó
            JOptionPane.showMessageDialog(null, "El catálogo se exportó correctamente", "Exportar catálogo", JOptionPane.INFORMATION_MESSAGE);
            logica.abrirReporte();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Hubo un error al exportar el PDF: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Hubo un error: " + e.getMessage());
        }
    }//GEN-LAST:event_botonExportarPerformed

    private void botonEditarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarPerformed
        // TODO add your handling code here:
        try {
            Cuenta editar = buscarCuentaDeTabla(null);
            if (editar != null) {
                //Hacer que el usuario ingrese el nuevo nombre y saldo en una nueva ventana
                String nombre = null;
                double saldo = 0;
                
                //Se crea una ventana para que el usuario escriba
                JTextField nombreInput = new JTextField(editar.getNombre());
                JTextField saldoInput = new JTextField(String.valueOf(editar.getSaldo()));
                Object[][] message = {
                    {"Nombre de la cuenta: ", nombreInput},
                    {"Saldo de la cuenta: ", saldoInput}
                };

                //Aquí se revisa si el usuario puso aceptar y escribió un nombre válido
                int opcion = JOptionPane.showConfirmDialog(null, message, "Ingresa los datos de la cuenta", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    if (nombreInput.getText().isBlank() || nombreInput.getText().isEmpty()
                            || saldoInput.getText().isBlank() || saldoInput.getText().isEmpty() ) {
                        JOptionPane.showMessageDialog(rootPane, "Datos inválidos");
                        return;
                    }
                    
                    nombre = nombreInput.getText();
                    saldo = Double.parseDouble(saldoInput.getText());
                    //Se cambian los datos de la cuenta
                    editar.setNombre(nombre);
                    editar.setSaldo(saldo);
                    //Al final hay que volver a actualizar la tabla
                    mostrarDatosEnTabla();

                    //Esto es para seleccionar la cuenta editada en la tabla
                    for (int i = 0; i < tablaCatalogo.getModel().getRowCount(); i++) {
                        //Se revisa cada fila para ver cuál tiene el id buscado
                        if (tablaCatalogo.getModel().getValueAt(i, 0).equals(editar.getId()))
                            tablaCatalogo.setRowSelectionInterval(i, i);
                    }
                    //Mensaje
                    JOptionPane.showMessageDialog(rootPane, "Se modificaron los datos de la cuenta "+editar.getNombre()+" correctamente");       
                }
            }
        } catch(NoSeleccionException e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR: "+e.getMessage());
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR: "+e.getMessage());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR: "+e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_botonEditarPerformed

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
            filas[i] = filas[i].replaceFirst("\t", "");
            filas[i] = filas[i].replace("\t", "    ");
            var col = filas[i].split(",");
            System.out.println(filas[i]);
            model.addRow(new String[]{col[0], col[1]});
        }
        
        //Ponerle el modelo con la info a la tabla
        tablaCatalogo.setModel(model);
        //Quitar la seleccion de la tabla
        tablaCatalogo.clearSelection();
        //Quitar la info de cuenta seleccionada
        nombreLabel.setText("");
        saldoLabel.setText("");
        codigoLabel.setText("");
        
        //Configurar dimensiones de la tabla
        tablaCatalogo.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tablaCatalogo.getTableHeader().setReorderingAllowed(false);
        tablaCatalogo.getColumnModel().getColumn(0).setMinWidth(70);
        tablaCatalogo.getColumnModel().getColumn(0).setMaxWidth(70);
        tablaCatalogo.getColumnModel().getColumn(0).setMinWidth(250);
        tablaCatalogo.getColumnModel().getColumn(1).setMaxWidth(300);
        tablaCatalogo.getColumnModel().getColumn(1).setPreferredWidth(250);
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
            
        } catch(NoSeleccionException e) {
            //Si no hay nada seleccionado no se hace nada
            nombreLabel.setText("");
            saldoLabel.setText("");
            codigoLabel.setText("");
        } catch (Exception e) {
            //Mensaje de que ocurrió un error no expecificado
            JOptionPane.showMessageDialog(rootPane, "Hubo un error: "+e.getMessage());
        }
    }

    //El método puede arrojar un error especial (se debe usar try-catch)
    private Cuenta buscarCuentaDeTabla(String[] omitirIds) throws CuentaImportanteException, NoSeleccionException {
        //Si no hay nada seleccionado en la tabla, arrojar un error
        int filaElegida = tablaCatalogo.getSelectedRow();
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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
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
    private javax.swing.JButton botonExportar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField buscarField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tablaCatalogo;
    // End of variables declaration//GEN-END:variables
}
