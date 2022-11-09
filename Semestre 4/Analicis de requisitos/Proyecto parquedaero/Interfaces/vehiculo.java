
package Vista;

import java.awt.Color;

public class vehiculo extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public vehiculo() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panel_Regis_Vehiculo = new Vista.PanelesRedondeados();
        jSeparator2 = new javax.swing.JSeparator();
        txt_vehiculo = new javax.swing.JLabel();
        Buscador_vehiculo = new javax.swing.JPanel();
        btn_buscar_vehiculo = new javax.swing.JLabel();
        Tabla_Vehiculos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        box_busqueda_vehiculo = new javax.swing.JTextField();
        eliminar_vehiculo = new javax.swing.JPanel();
        btn_eliminar_vehiculo = new javax.swing.JLabel();
        modificar_vehiculo = new javax.swing.JPanel();
        btn_modificar_vehiculo = new javax.swing.JLabel();
        agregar_vehiculo = new javax.swing.JPanel();
        btn_agregar_vehiculo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 540));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Regis_Vehiculo.setBackground(new java.awt.Color(235, 235, 235));
        panel_Regis_Vehiculo.setForeground(new java.awt.Color(250, 250, 250));
        panel_Regis_Vehiculo.setBordeInferiorDerecho(50);
        panel_Regis_Vehiculo.setBordeInferiorIzquierdo(50);
        panel_Regis_Vehiculo.setBordeSuperiorDerecho(50);
        panel_Regis_Vehiculo.setBordeSuperiorIzquierdo(50);
        panel_Regis_Vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        panel_Regis_Vehiculo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 620, 20));

        txt_vehiculo.setBackground(new java.awt.Color(187, 187, 187));
        txt_vehiculo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_vehiculo.setText("Vehiculos");
        panel_Regis_Vehiculo.add(txt_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Buscador_vehiculo.setBackground(new java.awt.Color(18, 90, 173));
        Buscador_vehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscador_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Buscador_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Buscador_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Buscador_vehiculoMousePressed(evt);
            }
        });
        Buscador_vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_buscar_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_buscar_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_buscar_vehiculo.setText("Buscar");
        btn_buscar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscar_vehiculoMouseExited(evt);
            }
        });
        Buscador_vehiculo.add(btn_buscar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 60, 30));

        panel_Regis_Vehiculo.add(Buscador_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 70, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Placa", "Color", "Fotografia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_Vehiculos.setViewportView(jTable1);

        panel_Regis_Vehiculo.add(Tabla_Vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 700, 310));

        box_busqueda_vehiculo.setBackground(new java.awt.Color(235, 235, 235));
        box_busqueda_vehiculo.setForeground(new java.awt.Color(102, 102, 102));
        box_busqueda_vehiculo.setText("Ingrese la placa del vehiculo a buscar");
        box_busqueda_vehiculo.setBorder(null);
        box_busqueda_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_busqueda_vehiculoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                box_busqueda_vehiculoMouseReleased(evt);
            }
        });
        box_busqueda_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_busqueda_vehiculoActionPerformed(evt);
            }
        });
        panel_Regis_Vehiculo.add(box_busqueda_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 610, 20));

        eliminar_vehiculo.setBackground(new java.awt.Color(18, 90, 173));
        eliminar_vehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminar_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminar_vehiculoMousePressed(evt);
            }
        });
        eliminar_vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_eliminar_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_eliminar_vehiculo.setText("Eliminar");
        btn_eliminar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminar_vehiculoMouseExited(evt);
            }
        });
        eliminar_vehiculo.add(btn_eliminar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        panel_Regis_Vehiculo.add(eliminar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 90, 30));

        modificar_vehiculo.setBackground(new java.awt.Color(18, 90, 173));
        modificar_vehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificar_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modificar_vehiculoMousePressed(evt);
            }
        });
        modificar_vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_modificar_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_modificar_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_modificar_vehiculo.setText("Modificar");
        btn_modificar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modificar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_modificar_vehiculoMouseExited(evt);
            }
        });
        modificar_vehiculo.add(btn_modificar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        panel_Regis_Vehiculo.add(modificar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 90, 30));

        agregar_vehiculo.setBackground(new java.awt.Color(18, 90, 173));
        agregar_vehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregar_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregar_vehiculoMousePressed(evt);
            }
        });
        agregar_vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_agregar_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_agregar_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar_vehiculo.setText("Agregar");
        btn_agregar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregar_vehiculoMouseExited(evt);
            }
        });
        agregar_vehiculo.add(btn_agregar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        panel_Regis_Vehiculo.add(agregar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 90, 30));

        Background.add(panel_Regis_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 750, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Buscador_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscador_vehiculoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscador_vehiculoMouseEntered

    private void Buscador_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscador_vehiculoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscador_vehiculoMouseExited

    private void Buscador_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscador_vehiculoMousePressed

    }//GEN-LAST:event_Buscador_vehiculoMousePressed

    private void box_busqueda_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_vehiculoMousePressed
        if(box_busqueda_vehiculo.getText().equals("Ingrese la placa del vehiculo a buscar"))
        box_busqueda_vehiculo.setText("");
       box_busqueda_vehiculo.setForeground(Color.black);
    }//GEN-LAST:event_box_busqueda_vehiculoMousePressed

    private void box_busqueda_vehiculoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_vehiculoMouseReleased
        //nothing
    }//GEN-LAST:event_box_busqueda_vehiculoMouseReleased

    private void box_busqueda_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_busqueda_vehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_busqueda_vehiculoActionPerformed

    private void eliminar_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_vehiculoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_vehiculoMouseEntered

    private void eliminar_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_vehiculoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_vehiculoMouseExited

    private void eliminar_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_vehiculoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_vehiculoMousePressed

    private void agregar_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_vehiculoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_vehiculoMouseEntered

    private void agregar_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_vehiculoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_vehiculoMouseExited

    private void agregar_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_vehiculoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_vehiculoMousePressed

    private void modificar_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_vehiculoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_vehiculoMouseEntered

    private void modificar_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_vehiculoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_vehiculoMouseExited

    private void modificar_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_vehiculoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_vehiculoMousePressed

    private void btn_eliminar_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminar_vehiculoMouseExited
       eliminar_vehiculo.setBackground(new Color(18, 90, 173));
        btn_eliminar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_eliminar_vehiculoMouseExited

    private void btn_eliminar_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminar_vehiculoMouseEntered
        eliminar_vehiculo.setBackground(new Color(236, 112, 99));
        btn_eliminar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_eliminar_vehiculoMouseEntered

    private void btn_agregar_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_vehiculoMouseEntered
        agregar_vehiculo.setBackground(new Color(115, 198, 182));
        btn_agregar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_agregar_vehiculoMouseEntered

    private void btn_agregar_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_vehiculoMouseExited
        agregar_vehiculo.setBackground(new Color(18, 90, 173));
        btn_agregar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_agregar_vehiculoMouseExited

    private void btn_modificar_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificar_vehiculoMouseEntered
        modificar_vehiculo.setBackground(new Color(46, 134, 193));
        btn_modificar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_modificar_vehiculoMouseEntered

    private void btn_modificar_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificar_vehiculoMouseExited
        modificar_vehiculo.setBackground(new Color(18, 90, 173));
        btn_modificar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_modificar_vehiculoMouseExited

    private void btn_buscar_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscar_vehiculoMouseEntered
        Buscador_vehiculo.setBackground(new Color(31, 97, 141));
        btn_modificar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_buscar_vehiculoMouseEntered

    private void btn_buscar_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscar_vehiculoMouseExited
        Buscador_vehiculo.setBackground(new Color(18, 90, 173));
        btn_modificar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_buscar_vehiculoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Buscador_vehiculo;
    private javax.swing.JScrollPane Tabla_Vehiculos;
    private javax.swing.JPanel agregar_vehiculo;
    private javax.swing.JTextField box_busqueda_vehiculo;
    private javax.swing.JLabel btn_agregar_vehiculo;
    private javax.swing.JLabel btn_buscar_vehiculo;
    private javax.swing.JLabel btn_eliminar_vehiculo;
    private javax.swing.JLabel btn_modificar_vehiculo;
    private javax.swing.JPanel eliminar_vehiculo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel modificar_vehiculo;
    private Vista.PanelesRedondeados panel_Regis_Vehiculo;
    private javax.swing.JLabel txt_vehiculo;
    // End of variables declaration//GEN-END:variables
}
