
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;


public class RegistroUsuarios extends javax.swing.JPanel {

 
    public RegistroUsuarios() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        panel_Regis_usuario = new Vista.PanelesRedondeados();
        txt_usuario = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        Identificacion = new javax.swing.JLabel();
        Ver_usuario = new javax.swing.JPanel();
        btn_Ver_usuario = new javax.swing.JLabel();
        Guardar = new javax.swing.JPanel();
        btn_Guardar = new javax.swing.JLabel();
        box_Nombre_usuario = new javax.swing.JTextField();
        box_Apellido_usuario = new javax.swing.JTextField();
        box_Identificacion_usuario = new javax.swing.JTextField();
        box_telefono_usuario = new javax.swing.JTextField();
        jSeparatorNombre = new javax.swing.JSeparator();
        jSeparatorApellido = new javax.swing.JSeparator();
        jSeparatorIdentificacion = new javax.swing.JSeparator();
        jSeparatortelefono = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 540));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setToolTipText("");
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Regis_usuario.setBackground(new java.awt.Color(235, 235, 235));
        panel_Regis_usuario.setBordeInferiorDerecho(50);
        panel_Regis_usuario.setBordeInferiorIzquierdo(50);
        panel_Regis_usuario.setBordeSuperiorDerecho(50);
        panel_Regis_usuario.setBordeSuperiorIzquierdo(50);
        panel_Regis_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_usuario.setBackground(new java.awt.Color(187, 187, 187));
        txt_usuario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_usuario.setText("Registro Usuarios");
        panel_Regis_usuario.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Nombre.setBackground(new java.awt.Color(0, 0, 0));
        Nombre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Nombre.setText("Nombre");
        panel_Regis_usuario.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 80, -1, -1));

        Apellido.setBackground(new java.awt.Color(0, 0, 0));
        Apellido.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Apellido.setText("Apellido");
        panel_Regis_usuario.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 140, -1, -1));

        telefono.setBackground(new java.awt.Color(0, 0, 0));
        telefono.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        telefono.setText("telefono ");
        panel_Regis_usuario.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 260, -1, -1));

        Identificacion.setBackground(new java.awt.Color(0, 0, 0));
        Identificacion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Identificacion.setText("Identificacion");
        panel_Regis_usuario.add(Identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 200, -1, -1));

        Ver_usuario.setBackground(new java.awt.Color(18, 90, 173));
        Ver_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ver_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ver_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ver_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Ver_usuarioMousePressed(evt);
            }
        });
        Ver_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Ver_usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Ver_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ver_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Ver_usuario.setText("Ver usuario");
        btn_Ver_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Ver_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Ver_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_Ver_usuarioMousePressed(evt);
            }
        });
        Ver_usuario.add(btn_Ver_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        panel_Regis_usuario.add(Ver_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 330, 120, 30));

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
        Guardar.getAccessibleContext().setAccessibleName("");

        box_Nombre_usuario.setBackground(new java.awt.Color(235, 235, 235));
        box_Nombre_usuario.setForeground(new java.awt.Color(204, 204, 204));
        box_Nombre_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_Nombre_usuario.setText("juan");
        box_Nombre_usuario.setBorder(null);
        box_Nombre_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_Nombre_usuarioMousePressed(evt);
            }
        });
        box_Nombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_Nombre_usuarioActionPerformed(evt);
            }
        });
        panel_Regis_usuario.add(box_Nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 300, -1));

        box_Apellido_usuario.setBackground(new java.awt.Color(235, 235, 235));
        box_Apellido_usuario.setForeground(new java.awt.Color(204, 204, 204));
        box_Apellido_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_Apellido_usuario.setText("perez");
        box_Apellido_usuario.setBorder(null);
        box_Apellido_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_Apellido_usuarioMousePressed(evt);
            }
        });
        panel_Regis_usuario.add(box_Apellido_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 300, -1));

        box_Identificacion_usuario.setBackground(new java.awt.Color(235, 235, 235));
        box_Identificacion_usuario.setForeground(new java.awt.Color(204, 204, 204));
        box_Identificacion_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_Identificacion_usuario.setText("100224423");
        box_Identificacion_usuario.setBorder(null);
        box_Identificacion_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_Identificacion_usuarioMousePressed(evt);
            }
        });
        box_Identificacion_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_Identificacion_usuarioActionPerformed(evt);
            }
        });
        panel_Regis_usuario.add(box_Identificacion_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 300, -1));

        box_telefono_usuario.setBackground(new java.awt.Color(235, 235, 235));
        box_telefono_usuario.setForeground(new java.awt.Color(204, 204, 204));
        box_telefono_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_telefono_usuario.setText("3214567567");
        box_telefono_usuario.setBorder(null);
        box_telefono_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_telefono_usuarioMousePressed(evt);
            }
        });
        panel_Regis_usuario.add(box_telefono_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 300, -1));
        panel_Regis_usuario.add(jSeparatorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 350, 10));
        panel_Regis_usuario.add(jSeparatorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 350, 10));
        panel_Regis_usuario.add(jSeparatorIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 350, 10));
        panel_Regis_usuario.add(jSeparatortelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 350, 10));

        Background.add(panel_Regis_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 560, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void Ver_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver_usuarioMouseEntered

    }//GEN-LAST:event_Ver_usuarioMouseEntered

    private void Ver_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver_usuarioMouseExited
        
    }//GEN-LAST:event_Ver_usuarioMouseExited

    private void Ver_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver_usuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ver_usuarioMousePressed

    private void GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseEntered
        
    }//GEN-LAST:event_GuardarMouseEntered

    private void GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseExited
        
    }//GEN-LAST:event_GuardarMouseExited

    private void GuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarMousePressed

    private void box_Nombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_Nombre_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_Nombre_usuarioActionPerformed

    private void box_Identificacion_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_Identificacion_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_Identificacion_usuarioActionPerformed

    private void box_Nombre_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_Nombre_usuarioMousePressed
        if (box_Nombre_usuario.getText().equals("juan")) {

            box_Nombre_usuario.setText("");
                box_Nombre_usuario.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_box_Nombre_usuarioMousePressed

    private void box_Apellido_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_Apellido_usuarioMousePressed
        if (box_Apellido_usuario.getText().equals("perez")) {

            box_Apellido_usuario.setText("");
            box_Apellido_usuario.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_box_Apellido_usuarioMousePressed

    private void box_Identificacion_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_Identificacion_usuarioMousePressed
        if (box_Identificacion_usuario.getText().equals("100224423")) {

            box_Identificacion_usuario.setText("");
            box_Identificacion_usuario.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_box_Identificacion_usuarioMousePressed

    private void box_telefono_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_telefono_usuarioMousePressed
        if (box_telefono_usuario.getText().equals("3214567567")) {

            box_telefono_usuario.setText("");
            box_telefono_usuario.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_box_telefono_usuarioMousePressed

    private void btn_GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarMouseEntered
        Guardar.setBackground(new Color(115, 198, 182));
        btn_Guardar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btn_GuardarMouseEntered

    private void btn_GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarMouseExited
        Guardar.setBackground(new Color(18, 90, 173));
        btn_Guardar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btn_GuardarMouseExited

    private void btn_Ver_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ver_usuarioMouseEntered
        Ver_usuario.setBackground(new Color(14,76,172));
        btn_Ver_usuario .setForeground(new Color(204, 209, 209));
    }//GEN-LAST:event_btn_Ver_usuarioMouseEntered

    private void btn_Ver_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ver_usuarioMouseExited
        Ver_usuario.setBackground(new Color(18, 90, 173));
        btn_Ver_usuario.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btn_Ver_usuarioMouseExited

    private void btn_Ver_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ver_usuarioMousePressed
       /* para que nos permita dejar pasar de panel a panlel tenenmos que comvertir el jpanel panel contenedor en  la clase portal
        en protegido o publico y chulear que sea estatico una ves cambiemos esta configuracion en cuztomice codigo nos permitira 
        facil mente ir de un lado al otro con el boton
        */
        Usuario usuario = new Usuario();
        Portal paneles = new Portal();
        
        usuario.setSize(780, 540);//tamaño del panel
        usuario.setLocation(0, 0); //posicion dentro del panel principal 
        
        
        
        paneles.PanelContenedor.removeAll();
        paneles.PanelContenedor.add(usuario, BorderLayout.CENTER);
        paneles.PanelContenedor.revalidate();
        paneles.PanelContenedor.repaint();
    }//GEN-LAST:event_btn_Ver_usuarioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Guardar;
    private javax.swing.JLabel Identificacion;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel Ver_usuario;
    private javax.swing.JTextField box_Apellido_usuario;
    private javax.swing.JTextField box_Identificacion_usuario;
    private javax.swing.JTextField box_Nombre_usuario;
    private javax.swing.JTextField box_telefono_usuario;
    private javax.swing.JLabel btn_Guardar;
    private javax.swing.JLabel btn_Ver_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparatorApellido;
    private javax.swing.JSeparator jSeparatorIdentificacion;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JSeparator jSeparatortelefono;
    private Vista.PanelesRedondeados panel_Regis_usuario;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
