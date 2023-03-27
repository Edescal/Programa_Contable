package contabilidad;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

public final class DoblePartida extends javax.swing.JFrame {

    private final LogicaCatalogo logica;
    
    public DoblePartida(LogicaCatalogo catalogo) {
        logica = catalogo;
        initComponents();
        cargarCuentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        totalLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        totalTextDer = new javax.swing.JTextField();
        totalTextIzq = new javax.swing.JTextField();
        validarField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCuentas = new javax.swing.JList<>();
        botonCargo = new javax.swing.JButton();
        botonAbono = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonTotal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 249));

        tabla.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setFillsViewportHeight(true);
        tabla.setMaximumSize(new java.awt.Dimension(150, 0));
        tabla.setMinimumSize(new java.awt.Dimension(150, 0));
        tabla.setRowHeight(20);
        tabla.setShowGrid(false);
        tabla.setShowHorizontalLines(false);
        tabla.setUpdateSelectionOnSort(false);
        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting())
                sumarTablas();
            }
        });
        jScrollPane2.setViewportView(tabla);

        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("Total de cargo");
        totalLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total de abono");

        totalTextDer.setEditable(false);
        totalTextDer.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        totalTextIzq.setEditable(false);
        totalTextIzq.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        validarField.setEditable(false);
        validarField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estatus de la transacción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validarField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalTextIzq)
                            .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTextDer)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTextIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTextDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(validarField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(300, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 254));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una cuenta" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        listaCuentas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(listaCuentas);

        botonCargo.setText("Cargar");
        botonCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargoActionPerformed(evt);
            }
        });

        botonAbono.setText("Abonar");
        botonAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbonoActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar cuenta seleccionada");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonTotal.setText("Validar operación");
        botonTotal.setEnabled(false);
        botonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(botonCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAbono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(botonTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargo)
                    .addComponent(botonAbono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Herramienta para realizar transacciones entre cuentas");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        //Si se selecciona la primera opción ("Elige una cuenta") no se hace nada
        if (comboBox.getSelectedIndex() == 0) return;
        
        //Se obtiene el nombre seleccionado y se busca esa cuenta
        String item = (String)comboBox.getSelectedItem();
        Cuenta cuenta = logica.buscar(item);

        //Si la cuenta se encontró
        if (cuenta != null) {
            //Se crea un nuevo modelo de lista
            DefaultListModel model = new DefaultListModel();
            //Se copian los valores que ya tenía
            for (int i = 0; i < listaCuentas.getModel().getSize(); i++)
                model.addElement(listaCuentas.getModel().getElementAt(i));
            //Se añade el nuevo valor al final
            model.addElement(cuenta.getNombre());
            //Se pone el modelo
            listaCuentas.setModel(model);
        }
        cambiarTamañoTabla(); //Actualizar tabla
    }//GEN-LAST:event_comboBoxActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        //Si no hay ninguna cuenta seleccionada, no se puede eliminar nada
        if (listaCuentas.getSelectedValue() == null) return;
        
        System.out.println(listaCuentas.getSelectedIndex());
        System.out.println(listaCuentas.getSelectedValue());
        
        //Se crea el modelo con los mismos datos, excepto el que se eliminará
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i < listaCuentas.getModel().getSize(); i++) {
            //La fila seleccionada se ignora, por lo que se eliminará de la lista
            if (i == listaCuentas.getSelectedIndex()) 
                continue;
            //Las demás filas no se ignoran y siguen en la lista
            model.addElement(listaCuentas.getModel().getElementAt(i));
        }
        
        //Se le pone el modelo a la lista, sin la cuenta eliminada
        listaCuentas.setModel(model);
        //Actualizar tamaño de la tabla
        cambiarTamañoTabla();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargoActionPerformed
        //Si no está seleccionada ninguna cuenta (fila == -1) no hacer nada
        int fila = listaCuentas.getSelectedIndex();
        if (fila == -1) {
            return;
        }

        //Se llama al método que genera una ventana para poner el saldo
        double saldo = inputSaldo();
        if (saldo != -1) {
            //Si no es -1, es que no dio error
            tabla.setValueAt(String.valueOf(saldo), fila, 0); //Poner en la columna de cargos
            tabla.setValueAt("", fila, 1); //La columna de abonos debe vaciarse
            sumarTablas();
        }
    }//GEN-LAST:event_botonCargoActionPerformed

    private void botonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTotalActionPerformed
        finalizarTransaccion();
    }//GEN-LAST:event_botonTotalActionPerformed

    private void botonAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbonoActionPerformed
        //Si no está seleccionada ninguna cuenta (fila == -1) no hacer nada
        int fila = listaCuentas.getSelectedIndex();
        if (fila == -1) {
            return;
        }
        
        //Se llama al método que genera una ventana para poner la cantidad
        double saldo = inputSaldo();
        if (saldo != -1) {
            //Si no es -1, es que no dio error
            tabla.setValueAt(String.valueOf(saldo), fila, 1);
            tabla.setValueAt("", fila, 0);
            sumarTablas();
        }
    }//GEN-LAST:event_botonAbonoActionPerformed

    //Métodos 
    private void cargarCuentas() {
        //Este método pone todas las cuentas en el combo box
        comboBox.removeAllItems();
        comboBox.addItem("Elige una cuenta");
        
        //Se buscan las cuentas de activos y pasivos
        Cuenta activos = logica.buscar("1");
        Cuenta pasivos = logica.buscar("2");
        //Se obtiene el texto de todas las subcuentas
        String info = activos.toString();
        info += "\n"+pasivos.toString();
        //Se crea un arreglo con el texto, cada String es una cuenta
        String[] filas = info.split("\n");
        
        for (String cuenta : filas) {
            String nombre = cuenta.split(",")[1].trim();
            //Se añade solo los nombres al comboBox
            comboBox.addItem(nombre);
        }
    }
    
    private double inputSaldo() {
        double saldo = -1;
        //Se creará una ventana con un JTextField
        JTextField saldoInput = new JTextField();
        Object[][] message = {
            {"¿Cuánto quieres cargar?", null},
            {"Saldo de la cuenta: ", saldoInput}
        };
        //La ventana regresa un número dependiendo de si se pone OK o CANCELAR
        int opcion = JOptionPane.showConfirmDialog(null, message, "Cargar cuenta", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) { //Si puso OK
            //Mostrar mensaje si se dejó en blanco
            if (saldoInput.getText().isBlank() || saldoInput.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No ingresaste nada");
                return -1;
            }
            
            //Se convierte el string a double, puede dar error
            try {
                saldo = Double.parseDouble(saldoInput.getText());
            }catch(InputMismatchException e) {
                JOptionPane.showMessageDialog(rootPane, "Error: Sólo se deben ingresar números."+e.getMessage());
                return -1;
            } catch(Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error al procesar el saldo: "+e.getMessage());
                return -1;
            }    
        }
        
        return saldo;
    }
    
    private void cambiarTamañoTabla() {
        //Este método se asegura que la tabla tenga el mismo número de filas que la lista
        int filas = tabla.getRowCount(); //Filas de la tabla
        int cuentas = listaCuentas.getModel().getSize(); //Filas de la lista
        //Se crea el nuevo modelo de la tabla
        var model = new DefaultTableModel(
                new String[]{
                    "Cargo", "Abono"
                }, 0
        );

        //Cuando la tabla tiene menos filas que la lista: se añaden
        if (filas < cuentas) {            
            //Se copian los datos ya existentes para que no se pierdan
            for(int i = 0; i < filas; i++)
                model.addRow(new String[] { (String)tabla.getValueAt(i, 0), (String)tabla.getValueAt(i, 1)});
            
            //Se crean las filas faltantes vacías
            for(int i = 0; i < (cuentas - filas); i++)
                model.addRow(new String[] {"", ""});
            
        } else if (filas > cuentas) {
            //Cuando se elimina una cuenta y la tabla tiene más filas de las que debe mostrar
            for(int i = 0; i < cuentas; i++)
                model.addRow(new String[] { (String)tabla.getValueAt(i, 0), (String)tabla.getValueAt(i, 1)});
        }
        
        tabla.setModel(model);
        tabla.setRowHeight(20); //Tamaño de las filas de la tabla
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getColumnModel().getColumn(0).setMaxWidth(150);
        tabla.getColumnModel().getColumn(0).setMinWidth(150);
        tabla.getColumnModel().getColumn(1).setMaxWidth(150);
        tabla.getColumnModel().getColumn(1).setMinWidth(150);
        
    }
    
    private void sumarTablas() {
        //Este método suma el total de cada columna de la tabla
        int filas = tabla.getModel().getRowCount(); //Cuántas filas tiene la tabla
        if (filas == 0) {
            JOptionPane.showMessageDialog(null, "Ingresa datos en la tabla");
            return; //Si la tabla tiene ningun dato (vacía) no se hace nada
        }
        
        //Se debe sumar por cada columna
        //Se pone en dos listas todos los string de cada columna
        var cargos = new ArrayList<String>();
        var abonos = new ArrayList<String>();
        for(int i = 0; i < filas; i++) {
            //Si la celda no tiene nada, se ignora
            String cargo = (String)tabla.getValueAt(i, 0);
            if (cargo != null)
                cargos.add(cargo);
            //Si la celda no tiene nada, se ignora
            String abono = (String)tabla.getValueAt(i, 1);
            if (abono != null)
                abonos.add(abono);
        }
        
        double sum1 = 0, sum2 = 0;
        try {
            //Los strings de cada columna se convierten a double y se suman
            //Si el string está vacío "" entonces se omite
            for(var s: cargos)
                if (s != null && !s.isEmpty()) {
                    double valor = Double.parseDouble(s);
                    sum1 += valor;
                }
            
            for(var s: abonos)
                if (s != null && !s.isEmpty()) {
                    double valor = Double.parseDouble(s);
                    sum2 += valor;
                }
            
            //Se pone la suma en los JTextLabel
            totalTextIzq.setText(String.valueOf(sum1));
            totalTextDer.setText(String.valueOf(sum2));
            
            //Se escribe el mensaje de abajo
            if (sum1 == sum2){
                validarField.setText("La suma es igual a ambos lados");
                botonTotal.setEnabled(true); //Activar el boton para cambiar los saldos
            } else {
                validarField.setText("La suma es diferente a ambos lados");
                botonTotal.setEnabled(false); //Desactivar el boton
            }
            
        } catch(Exception e) {
            validarField.setText("");
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void finalizarTransaccion() {
        int numeroCuentas = listaCuentas.getModel().getSize();
        if (numeroCuentas == 0) {
            return;
        }
        
        double[] cargos = new double[numeroCuentas];
        double[] abonos = new double[numeroCuentas];
        for(int i = 0; i < numeroCuentas; i++){
            cargos[i] = -1;
            abonos[i] = -1;
        }
        
        for(int i = 0; i < numeroCuentas; i++) {
            
            for (int j = 0; j < 2; j++) {
                double cantidad = 0;
                try {
                    cantidad = Double.parseDouble((String) tabla.getValueAt(i, j));
                    if (j == 0) {
                        cargos[i] = cantidad;
                    } else {
                        abonos[i] = cantidad;
                    }

                } catch (InputMismatchException e) {
                    System.err.println("Error al parsear: "+e.getMessage());
                } catch (Exception e) {
                    System.err.println("Error: "+e.getMessage());
                }
            }

        }
        
        for(int i = 0; i < numeroCuentas; i++){
            if (cargos[i] != -1) {
                String nombre = listaCuentas.getModel().getElementAt(i);
                Cuenta cuenta = logica.buscar(nombre);
                if (cuenta != null) {
                    System.out.println("Saldo de la cuenta antes: " + cuenta.getSaldo());
                    cuenta.setSaldo(cuenta.getSaldo() + cargos[i]);
                    System.out.println("Saldo de la cuenta después: " + cuenta.getSaldo());
                }
            }
            
            if (abonos[i] != -1) {
                String nombre = listaCuentas.getModel().getElementAt(i);
                Cuenta cuenta = logica.buscar(nombre);
                if (cuenta != null) {
                    System.out.println("Saldo de la cuenta antes: " + cuenta.getSaldo());
                    cuenta.setSaldo(cuenta.getSaldo() - abonos[i]);
                    System.out.println("Saldo de la cuenta después: " + cuenta.getSaldo());
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "La transacción fue realizada con éxito.");
    }
    
    
    public void mostrar() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoblePartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoblePartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoblePartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoblePartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoblePartida(new LogicaCatalogo()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbono;
    private javax.swing.JButton botonCargo;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonTotal;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaCuentas;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTextDer;
    private javax.swing.JTextField totalTextIzq;
    private javax.swing.JTextField validarField;
    // End of variables declaration//GEN-END:variables
}
