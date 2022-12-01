package Vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio_sesion extends javax.swing.JFrame {

    int xRaton, yRaton;

    public Inicio_sesion() {
        initComponents();

//        posicion de la interfaz
        this.setLocationRelativeTo(null);

        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/32x32sin fondo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lateral_derecho = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        cerrar = new javax.swing.JPanel();
        cerrar_txt = new javax.swing.JLabel();
        barra_Superior_imagen = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        inicio = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        contrase = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_contraseña = new javax.swing.JPasswordField();
        inicio_seccion = new javax.swing.JPanel();
        btn_boton = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lateral_derecho.setBackground(new java.awt.Color(193, 247, 249));
        lateral_derecho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32sin fondo.png"))); // NOI18N
        lateral_derecho.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        city.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        lateral_derecho.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 470));

        cerrar.setBackground(new java.awt.Color(204, 204, 204));
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setPreferredSize(new java.awt.Dimension(30, 30));
        cerrar.setRequestFocusEnabled(false);

        cerrar_txt.setForeground(new java.awt.Color(0, 0, 0));
        cerrar_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar_txt.setText("X");
        cerrar_txt.setPreferredSize(new java.awt.Dimension(30, 30));
        cerrar_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lateral_derecho.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        barra_Superior_imagen.setBackground(new java.awt.Color(193, 247, 249));
        barra_Superior_imagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout barra_Superior_imagenLayout = new javax.swing.GroupLayout(barra_Superior_imagen);
        barra_Superior_imagen.setLayout(barra_Superior_imagenLayout);
        barra_Superior_imagenLayout.setHorizontalGroup(
            barra_Superior_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        barra_Superior_imagenLayout.setVerticalGroup(
            barra_Superior_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lateral_derecho.add(barra_Superior_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        jPanel1.add(lateral_derecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 270, 500));

        barra_superior.setBackground(new java.awt.Color(255, 255, 255));
        barra_superior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barra_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superiorMouseDragged(evt);
            }
        });
        barra_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barra_superiorLayout = new javax.swing.GroupLayout(barra_superior);
        barra_superior.setLayout(barra_superiorLayout);
        barra_superiorLayout.setHorizontalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        barra_superiorLayout.setVerticalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        inicio.setBackground(new java.awt.Color(0, 0, 0));
        inicio.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        inicio.setForeground(new java.awt.Color(0, 0, 0));
        inicio.setText("INICIAR SESION");
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 161, -1, -1));

        user.setBackground(new java.awt.Color(0, 0, 0));
        user.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.setText("USUARIO");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 208, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Ingrese su nombre de Usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 247, 387, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 271, 387, 10));

        contrase.setBackground(new java.awt.Color(0, 0, 0));
        contrase.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        contrase.setForeground(new java.awt.Color(0, 0, 0));
        contrase.setText("CONTRASEÑA");
        jPanel1.add(contrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 299, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 356, 387, 10));

        txt_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        txt_contraseña.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_contraseña.setForeground(new java.awt.Color(204, 204, 204));
        txt_contraseña.setText("************");
        txt_contraseña.setBorder(null);
        txt_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contraseñaMousePressed(evt);
            }
        });
        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 332, 387, -1));

        inicio_seccion.setBackground(new java.awt.Color(72, 97, 194));
        inicio_seccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_boton.setBackground(new java.awt.Color(204, 204, 204));
        btn_boton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btn_boton.setForeground(new java.awt.Color(255, 255, 255));
        btn_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_boton.setText("Inicia sesión");
        btn_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_botonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_botonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_botonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout inicio_seccionLayout = new javax.swing.GroupLayout(inicio_seccion);
        inicio_seccion.setLayout(inicio_seccionLayout);
        inicio_seccionLayout.setHorizontalGroup(
            inicio_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inicio_seccionLayout.setVerticalGroup(
            inicio_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(inicio_seccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 120, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/23x23.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void barra_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMousePressed

        xRaton = evt.getX();
        yRaton = evt.getY();
    }//GEN-LAST:event_barra_superiorMousePressed

    private void barra_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xRaton, y - yRaton);
    }//GEN-LAST:event_barra_superiorMouseDragged

    private void cerrar_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_txtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrar_txtMouseClicked

    private void cerrar_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_txtMouseEntered
        cerrar.setBackground(Color.RED);
        cerrar_txt.setForeground(Color.WHITE);
    }//GEN-LAST:event_cerrar_txtMouseEntered

    private void cerrar_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_txtMouseExited
        cerrar.setBackground(new Color(204, 204, 204));
        cerrar_txt.setForeground(Color.black);
    }//GEN-LAST:event_cerrar_txtMouseExited

    private void btn_botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_botonMouseEntered
        inicio_seccion.setBackground(new Color(88, 91, 191));
        btn_boton.setForeground(Color.black);
    }//GEN-LAST:event_btn_botonMouseEntered

    private void btn_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_botonMouseExited
        inicio_seccion.setBackground(new Color(72, 97, 194));
        btn_boton.setForeground(Color.white);
    }//GEN-LAST:event_btn_botonMouseExited

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Ingrese su nombre de Usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }

        if (String.valueOf(txt_contraseña.getPassword()).isEmpty()) {
            txt_contraseña.setText("************");
            txt_contraseña.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contraseñaMousePressed
        if (String.valueOf(txt_contraseña.getPassword()).equals("************")) {
            txt_contraseña.setText("");
            txt_contraseña.setForeground(Color.black);
        }

        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su nombre de Usuario");
            txt_usuario.setForeground(new Color(204, 204, 204));

        }


    }//GEN-LAST:event_txt_contraseñaMousePressed

    private void btn_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_botonMouseClicked

    }//GEN-LAST:event_btn_botonMouseClicked

    private void btn_botonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_botonMousePressed

//            variables que contienen el usuaario y contraseña definidos
        String Usuario = "usuario";
        String contraseña = "12345";

        String contra = new String(txt_contraseña.getPassword());
//          verifica si los datos escritos por teclado son corretos permitiendo la entrada a la aplicacion        
        if (txt_usuario.getText().equals(Usuario) && contra.equals(contraseña)) {
            Portal portal = new Portal();
            portal.setVisible(true);
//            cierra la ventana inicio seccion si los datos son correctos 
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "usuario o contraseña incorrecta");
        }


    }//GEN-LAST:event_btn_botonMousePressed

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_Superior_imagen;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JLabel btn_boton;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cerrar_txt;
    private javax.swing.JLabel city;
    private javax.swing.JLabel contrase;
    private javax.swing.JLabel inicio;
    private javax.swing.JPanel inicio_seccion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel lateral_derecho;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
