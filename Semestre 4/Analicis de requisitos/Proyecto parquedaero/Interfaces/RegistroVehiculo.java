package Vista;

import java.awt.BorderLayout;
import java.awt.Color;

public class RegistroVehiculo extends javax.swing.JPanel {

    public RegistroVehiculo() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panel_Regis_usuario = new Vista.PanelesRedondeados();
        txt_Vehiculo = new javax.swing.JLabel();
        Marcas = new javax.swing.JLabel();
        Placas = new javax.swing.JLabel();
        Colores = new javax.swing.JLabel();
        Fotos = new javax.swing.JLabel();
        Ver_Vehiculo = new javax.swing.JPanel();
        btn_Ver_vehiculo = new javax.swing.JLabel();
        Guardar = new javax.swing.JPanel();
        btn_Guardar = new javax.swing.JLabel();
        box_Marca_vehiculo = new javax.swing.JTextField();
        box_Placa_vehiculo = new javax.swing.JTextField();
        box_Color_vehiculo = new javax.swing.JTextField();
        box_Fotos_vehiculo = new javax.swing.JTextField();
        jSeparatorNombre = new javax.swing.JSeparator();
        jSeparatorApellido = new javax.swing.JSeparator();
        jSeparatorIdentificacion = new javax.swing.JSeparator();
        jSeparatortelefono = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(235, 235, 235));
        setPreferredSize(new java.awt.Dimension(780, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Regis_usuario.setBackground(new java.awt.Color(235, 235, 235));
        panel_Regis_usuario.setBordeInferiorDerecho(50);
        panel_Regis_usuario.setBordeInferiorIzquierdo(50);
        panel_Regis_usuario.setBordeSuperiorDerecho(50);
        panel_Regis_usuario.setBordeSuperiorIzquierdo(50);
        panel_Regis_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Vehiculo.setBackground(new java.awt.Color(187, 187, 187));
        txt_Vehiculo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_Vehiculo.setText("Registro Vehiculo");
        panel_Regis_usuario.add(txt_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Marcas.setBackground(new java.awt.Color(0, 0, 0));
        Marcas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Marcas.setText("Marca");
        panel_Regis_usuario.add(Marcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 80, -1, -1));

        Placas.setBackground(new java.awt.Color(0, 0, 0));
        Placas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Placas.setText("Placa");
        panel_Regis_usuario.add(Placas, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 140, -1, -1));

        Colores.setBackground(new java.awt.Color(0, 0, 0));
        Colores.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Colores.setText("Color");
        panel_Regis_usuario.add(Colores, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 200, -1, -1));

        Fotos.setBackground(new java.awt.Color(0, 0, 0));
        Fotos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Fotos.setText("Fotos");
        panel_Regis_usuario.add(Fotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 260, -1, -1));

        Ver_Vehiculo.setBackground(new java.awt.Color(18, 90, 173));
        Ver_Vehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ver_Vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ver_VehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ver_VehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Ver_VehiculoMousePressed(evt);
            }
        });
        Ver_Vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Ver_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Ver_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ver_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Ver_vehiculo.setText("Ver vehiculo");
        btn_Ver_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Ver_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Ver_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_Ver_vehiculoMousePressed(evt);
            }
        });
        Ver_Vehiculo.add(btn_Ver_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        panel_Regis_usuario.add(Ver_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 330, 120, 30));

        Guardar.setBackground(new java.awt.Color(18, 90, 173));
        Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GuardarMousePressed(evt);
            }
        });
        Guardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Guardar.setText("Guardar");
        btn_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GuardarMouseExited(evt);
            }
        });
        Guardar.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        panel_Regis_usuario.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 330, 120, 30));

        box_Marca_vehiculo.setBackground(new java.awt.Color(235, 235, 235));
        box_Marca_vehiculo.setForeground(new java.awt.Color(204, 204, 204));
        box_Marca_vehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_Marca_vehiculo.setText("Toyota");
        box_Marca_vehiculo.setBorder(null);
        box_Marca_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box_Marca_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_Marca_vehiculoMousePressed(evt);
            }
        });
        box_Marca_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_Marca_vehiculoActionPerformed(evt);
            }
        });
        panel_Regis_usuario.add(box_Marca_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 300, -1));

        box_Placa_vehiculo.setBackground(new java.awt.Color(235, 235, 235));
        box_Placa_vehiculo.setForeground(new java.awt.Color(204, 204, 204));
        box_Placa_vehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_Placa_vehiculo.setText("STR 243");
        box_Placa_vehiculo.setBorder(null);
        box_Placa_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_Placa_vehiculoMousePressed(evt);
            }
        });
        panel_Regis_usuario.add(box_Placa_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 300, -1));

        box_Color_vehiculo.setBackground(new java.awt.Color(235, 235, 235));
        box_Color_vehiculo.setForeground(new java.awt.Color(204, 204, 204));
        box_Color_vehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_Color_vehiculo.setText("Verde");
        box_Color_vehiculo.setBorder(null);
        box_Color_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_Color_vehiculoMousePressed(evt);
            }
        });
        box_Color_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_Color_vehiculoActionPerformed(evt);
            }
        });
        panel_Regis_usuario.add(box_Color_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 300, -1));

        box_Fotos_vehiculo.setBackground(new java.awt.Color(235, 235, 235));
        box_Fotos_vehiculo.setForeground(new java.awt.Color(204, 204, 204));
        box_Fotos_vehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_Fotos_vehiculo.setText("3214567567");
        box_Fotos_vehiculo.setBorder(null);
        box_Fotos_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_Fotos_vehiculoMousePressed(evt);
            }
        });
        panel_Regis_usuario.add(box_Fotos_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 300, -1));
        panel_Regis_usuario.add(jSeparatorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 350, 10));
        panel_Regis_usuario.add(jSeparatorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 350, 10));
        panel_Regis_usuario.add(jSeparatorIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 350, 10));
        panel_Regis_usuario.add(jSeparatortelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 350, 10));

        Background.add(panel_Regis_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 560, 420));

        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Ver_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ver_vehiculoMouseEntered
        Ver_Vehiculo.setBackground(new Color(14, 76, 172));
        btn_Ver_vehiculo.setForeground(new Color(204, 209, 209));
    }//GEN-LAST:event_btn_Ver_vehiculoMouseEntered

    private void btn_Ver_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ver_vehiculoMouseExited
        Ver_Vehiculo.setBackground(new Color(18, 90, 173));
        btn_Ver_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_Ver_vehiculoMouseExited

    private void Ver_VehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver_VehiculoMouseEntered

    }//GEN-LAST:event_Ver_VehiculoMouseEntered

    private void Ver_VehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver_VehiculoMouseExited

    }//GEN-LAST:event_Ver_VehiculoMouseExited

    private void Ver_VehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver_VehiculoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ver_VehiculoMousePressed

    private void btn_GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarMouseEntered
        Guardar.setBackground(new Color(115, 198, 182));
        btn_Guardar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_GuardarMouseEntered

    private void btn_GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarMouseExited
        Guardar.setBackground(new Color(18, 90, 173));
        btn_Guardar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_GuardarMouseExited

    private void GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseEntered

    }//GEN-LAST:event_GuardarMouseEntered

    private void GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseExited

    }//GEN-LAST:event_GuardarMouseExited

    private void GuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarMousePressed

    private void box_Marca_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_Marca_vehiculoMousePressed
        if (box_Marca_vehiculo.getText().equals("Toyota")) {

            box_Marca_vehiculo.setText("");
            box_Marca_vehiculo.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_box_Marca_vehiculoMousePressed

    private void box_Marca_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_Marca_vehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_Marca_vehiculoActionPerformed

    private void box_Placa_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_Placa_vehiculoMousePressed
        if (box_Placa_vehiculo.getText().equals("STR 243")) {

            box_Placa_vehiculo.setText("");
            box_Placa_vehiculo.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_box_Placa_vehiculoMousePressed

    private void box_Color_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_Color_vehiculoMousePressed
        if (box_Color_vehiculo.getText().equals("Verde")) {

            box_Color_vehiculo.setText("");
            box_Color_vehiculo.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_box_Color_vehiculoMousePressed

    private void box_Color_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_Color_vehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_Color_vehiculoActionPerformed

    private void box_Fotos_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_Fotos_vehiculoMousePressed

    }//GEN-LAST:event_box_Fotos_vehiculoMousePressed

    private void box_Marca_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_Marca_vehiculoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_box_Marca_vehiculoMouseExited

    private void btn_Ver_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ver_vehiculoMousePressed
        /* para que nos permita dejar pasar de panel a panlel tenenmos que comvertir el jpanel panel contenedor en  la clase portal
        en protegido o publico y chulear que sea estatico una ves cambiemos esta configuracion en cuztomice codigo nos permitira 
        facil mente ir de un lado al otro con el boton
         */
        vehiculo vehiculo = new vehiculo();
        Portal paneles = new Portal();

        vehiculo.setSize(780, 540); //tamaño del panel
        vehiculo.setLocation(0, 0); //posicion dentro del panel principal 

        paneles.PanelContenedor.removeAll();
        paneles.PanelContenedor.add(vehiculo, BorderLayout.CENTER);
        paneles.PanelContenedor.revalidate();
        paneles.PanelContenedor.repaint();

    }//GEN-LAST:event_btn_Ver_vehiculoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Colores;
    private javax.swing.JLabel Fotos;
    private javax.swing.JPanel Guardar;
    private javax.swing.JLabel Marcas;
    private javax.swing.JLabel Placas;
    private javax.swing.JPanel Ver_Vehiculo;
    private javax.swing.JTextField box_Color_vehiculo;
    private javax.swing.JTextField box_Fotos_vehiculo;
    private javax.swing.JTextField box_Marca_vehiculo;
    private javax.swing.JTextField box_Placa_vehiculo;
    private javax.swing.JLabel btn_Guardar;
    private javax.swing.JLabel btn_Ver_vehiculo;
    private javax.swing.JSeparator jSeparatorApellido;
    private javax.swing.JSeparator jSeparatorIdentificacion;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JSeparator jSeparatortelefono;
    private Vista.PanelesRedondeados panel_Regis_usuario;
    private javax.swing.JLabel txt_Vehiculo;
    // End of variables declaration//GEN-END:variables
}
