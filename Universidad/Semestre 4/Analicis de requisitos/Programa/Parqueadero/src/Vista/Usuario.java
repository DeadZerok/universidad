package Vista;

import Control.ControlUsuario;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

// libreriaas para busqueda
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;

public class Usuario extends javax.swing.JPanel {

    public DefaultTableModel tabla;

    public TableRowSorter tablaFiltronom;
    public TableRowSorter tablafiltroid;

    public Usuario() {
        initComponents();
        tabla = (DefaultTableModel) table_usuarios.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panel_usuario = new Vista.PanelesRedondeados();
        jSeparator2 = new javax.swing.JSeparator();
        txt_usuario = new javax.swing.JLabel();
        Tabla_Usuarios = new javax.swing.JScrollPane();
        table_usuarios = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        box_busqueda_usuarioId = new javax.swing.JTextField();
        box_busqueda_usuarioNom = new javax.swing.JTextField();
        eliminar_usuario = new javax.swing.JPanel();
        btn_eliminar_usuario = new javax.swing.JLabel();
        modificar_usuario = new javax.swing.JPanel();
        btn_modificar_usuario = new javax.swing.JLabel();
        Actualiar_usuario = new javax.swing.JPanel();
        btn_actualizar_usuario = new javax.swing.JLabel();
        agregar_usuario = new javax.swing.JPanel();
        btn_agregar_usuario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 540));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_usuario.setBackground(new java.awt.Color(235, 235, 235));
        panel_usuario.setForeground(new java.awt.Color(250, 250, 250));
        panel_usuario.setBordeInferiorDerecho(50);
        panel_usuario.setBordeInferiorIzquierdo(50);
        panel_usuario.setBordeSuperiorDerecho(50);
        panel_usuario.setBordeSuperiorIzquierdo(50);
        panel_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        panel_usuario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 320, 20));

        txt_usuario.setBackground(new java.awt.Color(187, 187, 187));
        txt_usuario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_usuario.setText("Usuarios");
        panel_usuario.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        table_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Identificacion", "Telefono "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_Usuarios.setViewportView(table_usuarios);

        panel_usuario.add(Tabla_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 700, 310));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(250, 10));
        panel_usuario.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 320, 20));

        box_busqueda_usuarioId.setBackground(new java.awt.Color(235, 235, 235));
        box_busqueda_usuarioId.setForeground(new java.awt.Color(102, 102, 102));
        box_busqueda_usuarioId.setText("Ingrese  la identificacion del usuario a buscar");
        box_busqueda_usuarioId.setBorder(null);
        box_busqueda_usuarioId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box_busqueda_usuarioIdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_busqueda_usuarioIdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                box_busqueda_usuarioIdMouseReleased(evt);
            }
        });
        box_busqueda_usuarioId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_busqueda_usuarioIdActionPerformed(evt);
            }
        });
        box_busqueda_usuarioId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                box_busqueda_usuarioIdKeyTyped(evt);
            }
        });
        panel_usuario.add(box_busqueda_usuarioId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 310, 60));

        box_busqueda_usuarioNom.setBackground(new java.awt.Color(235, 235, 235));
        box_busqueda_usuarioNom.setForeground(new java.awt.Color(102, 102, 102));
        box_busqueda_usuarioNom.setText("Ingrese el nombre del usuario a buscar");
        box_busqueda_usuarioNom.setBorder(null);
        box_busqueda_usuarioNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box_busqueda_usuarioNomMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_busqueda_usuarioNomMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                box_busqueda_usuarioNomMouseReleased(evt);
            }
        });
        box_busqueda_usuarioNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_busqueda_usuarioNomActionPerformed(evt);
            }
        });
        box_busqueda_usuarioNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                box_busqueda_usuarioNomKeyTyped(evt);
            }
        });
        panel_usuario.add(box_busqueda_usuarioNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, 60));

        eliminar_usuario.setBackground(new java.awt.Color(18, 90, 173));
        eliminar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminar_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminar_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminar_usuarioMousePressed(evt);
            }
        });
        eliminar_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar_usuario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_eliminar_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_eliminar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        btn_eliminar_usuario.setText("Eliminar");
        btn_eliminar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminar_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminar_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminar_usuarioMousePressed(evt);
            }
        });
        eliminar_usuario.add(btn_eliminar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 135, 33));

        panel_usuario.add(eliminar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 135, 33));

        modificar_usuario.setBackground(new java.awt.Color(18, 90, 173));
        modificar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificar_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificar_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modificar_usuarioMousePressed(evt);
            }
        });
        modificar_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_modificar_usuario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_modificar_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_modificar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btn_modificar_usuario.setText("Modificar");
        btn_modificar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modificar_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_modificar_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_modificar_usuarioMousePressed(evt);
            }
        });
        modificar_usuario.add(btn_modificar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 135, 33));

        panel_usuario.add(modificar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 135, 33));

        Actualiar_usuario.setBackground(new java.awt.Color(18, 90, 173));
        Actualiar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actualiar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Actualiar_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Actualiar_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actualiar_usuarioMousePressed(evt);
            }
        });
        Actualiar_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_actualizar_usuario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_actualizar_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_actualizar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btn_actualizar_usuario.setText("Actualizar");
        btn_actualizar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_actualizar_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_actualizar_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_actualizar_usuarioMousePressed(evt);
            }
        });
        Actualiar_usuario.add(btn_actualizar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 135, 33));

        panel_usuario.add(Actualiar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 440, 135, 33));

        agregar_usuario.setBackground(new java.awt.Color(18, 90, 173));
        agregar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregar_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregar_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregar_usuarioMousePressed(evt);
            }
        });
        agregar_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_agregar_usuario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_agregar_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-agregar.png"))); // NOI18N
        btn_agregar_usuario.setText("Agregar");
        btn_agregar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregar_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregar_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_agregar_usuarioMousePressed(evt);
            }
        });
        agregar_usuario.add(btn_agregar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 135, 33));

        panel_usuario.add(agregar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 440, 135, 33));

        Background.add(panel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 750, 510));

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

    private void box_busqueda_usuarioIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioIdMousePressed
        if (box_busqueda_usuarioId.getText().equals("Ingrese  la identificacion del usuario a buscar")) {
            box_busqueda_usuarioId.setText("");
        }
        box_busqueda_usuarioId.setForeground(Color.black);
    }//GEN-LAST:event_box_busqueda_usuarioIdMousePressed

    private void box_busqueda_usuarioIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioIdMouseReleased
        //nothing
    }//GEN-LAST:event_box_busqueda_usuarioIdMouseReleased

    private void box_busqueda_usuarioIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_busqueda_usuarioIdActionPerformed

    private void eliminar_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_usuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_usuarioMouseEntered

    private void eliminar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_usuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_usuarioMouseExited

    private void eliminar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_usuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_usuarioMousePressed

    private void Actualiar_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualiar_usuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualiar_usuarioMouseEntered

    private void Actualiar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualiar_usuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualiar_usuarioMouseExited

    private void Actualiar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualiar_usuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualiar_usuarioMousePressed

    private void modificar_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_usuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_usuarioMouseEntered

    private void modificar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_usuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_usuarioMouseExited

    private void modificar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_usuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_usuarioMousePressed

    private void btn_eliminar_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminar_usuarioMouseEntered
        eliminar_usuario.setBackground(new Color(236, 112, 99));
        btn_eliminar_usuario.setForeground(new Color(255, 255, 255));


    }//GEN-LAST:event_btn_eliminar_usuarioMouseEntered

    private void btn_eliminar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminar_usuarioMouseExited
        eliminar_usuario.setBackground(new Color(18, 90, 173));
        btn_eliminar_usuario.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_eliminar_usuarioMouseExited

    private void btn_agregar_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_usuarioMouseEntered
        agregar_usuario.setBackground(new Color(115, 198, 182));
        btn_agregar_usuario.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_agregar_usuarioMouseEntered

    private void btn_agregar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_usuarioMouseExited
        agregar_usuario.setBackground(new Color(18, 90, 173));
        btn_agregar_usuario.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_agregar_usuarioMouseExited

    private void btn_modificar_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificar_usuarioMouseEntered
        modificar_usuario.setBackground(new Color(46, 134, 193));
        btn_modificar_usuario.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_modificar_usuarioMouseEntered

    private void btn_modificar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificar_usuarioMouseExited
        modificar_usuario.setBackground(new Color(18, 90, 173));
        btn_modificar_usuario.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_modificar_usuarioMouseExited

    private void btn_agregar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_usuarioMousePressed
        new Portal().registroUsuario();

    }//GEN-LAST:event_btn_agregar_usuarioMousePressed

    private void agregar_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_usuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_usuarioMouseEntered

    private void agregar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_usuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_usuarioMouseExited

    private void agregar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_usuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_usuarioMousePressed

    private void btn_actualizar_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizar_usuarioMouseEntered
        Actualiar_usuario.setBackground(new Color(29, 131, 72));
        btn_actualizar_usuario.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_actualizar_usuarioMouseEntered

    private void btn_actualizar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizar_usuarioMouseExited
        Actualiar_usuario.setBackground(new Color(18, 90, 173));
        btn_actualizar_usuario.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_actualizar_usuarioMouseExited

    private void btn_actualizar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizar_usuarioMousePressed
        new ControlUsuario().LlenarTablaUsuario(table_usuarios);
    }//GEN-LAST:event_btn_actualizar_usuarioMousePressed

    private void btn_eliminar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminar_usuarioMousePressed
        new ControlUsuario().eliminarTabla(table_usuarios);
        new ControlUsuario().LlenarTablaUsuario(table_usuarios);
    }//GEN-LAST:event_btn_eliminar_usuarioMousePressed

    private void btn_modificar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificar_usuarioMousePressed

        if (table_usuarios.getSelectedRow() != -1) {

            String nombreposi = new ControlUsuario().nombrePosi(table_usuarios);
            String apellidoposi = new ControlUsuario().apellidoposi(table_usuarios);
            long identificacionposi = new ControlUsuario().identificacionPosi(table_usuarios);
            long telefonoposi = new ControlUsuario().telefonoPosi(table_usuarios);

            String nombre = JOptionPane.showInputDialog("Dijete el nombre", nombreposi);
            String apellido = JOptionPane.showInputDialog("Dijete el apellido", apellidoposi);
            String identificacion = JOptionPane.showInputDialog("Dijete el numero de identificacion", identificacionposi);
            String telefono = JOptionPane.showInputDialog("Dijete el numero de telefono", telefonoposi);

            new ControlUsuario().ModificarTabla(table_usuarios, nombre, apellido, Long.parseLong(identificacion), Long.parseLong(telefono));
        } else {
            JOptionPane.showMessageDialog(null, "no has seleccionado ninguna fila para ser modificada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        new ControlUsuario().LlenarTablaUsuario(table_usuarios);
    }//GEN-LAST:event_btn_modificar_usuarioMousePressed

    private void box_busqueda_usuarioIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioIdKeyTyped
        box_busqueda_usuarioId.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                tablafiltroid.setRowFilter(RowFilter.regexFilter(box_busqueda_usuarioId.getText(), 2));

            }

        });

        tablafiltroid = new TableRowSorter(table_usuarios.getModel());

        table_usuarios.setRowSorter(tablafiltroid);

    }//GEN-LAST:event_box_busqueda_usuarioIdKeyTyped

    private void box_busqueda_usuarioIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioIdMouseExited
        box_busqueda_usuarioNom.setForeground(new Color(102, 102, 102));
        box_busqueda_usuarioNom.setText("Ingrese el nombre del usuario a buscar");

        if (box_busqueda_usuarioId.getText().equals("")) {

            box_busqueda_usuarioId.setForeground(new Color(102, 102, 102));
            box_busqueda_usuarioId.setText("Ingrese  la identificacion del usuario a buscar");
        }
    }//GEN-LAST:event_box_busqueda_usuarioIdMouseExited

    private void box_busqueda_usuarioNomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioNomMouseExited
        if (box_busqueda_usuarioNom.getText().equals("")) {

            box_busqueda_usuarioNom.setForeground(new Color(102, 102, 102));
            box_busqueda_usuarioNom.setText("Ingrese el nombre del usuario a buscar");
        }
    }//GEN-LAST:event_box_busqueda_usuarioNomMouseExited

    private void box_busqueda_usuarioNomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioNomMousePressed
        box_busqueda_usuarioId.setForeground(new Color(102, 102, 102));
        box_busqueda_usuarioId.setText("Ingrese  la identificacion del usuario a buscar");

        if (box_busqueda_usuarioNom.getText().equals("Ingrese el nombre del usuario a buscar")) {
            box_busqueda_usuarioNom.setText("");
        }
        box_busqueda_usuarioNom.setForeground(Color.black);

    }//GEN-LAST:event_box_busqueda_usuarioNomMousePressed

    private void box_busqueda_usuarioNomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioNomMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_box_busqueda_usuarioNomMouseReleased

    private void box_busqueda_usuarioNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_busqueda_usuarioNomActionPerformed

    private void box_busqueda_usuarioNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_box_busqueda_usuarioNomKeyTyped
        box_busqueda_usuarioNom.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                tablaFiltronom.setRowFilter(RowFilter.regexFilter(box_busqueda_usuarioNom.getText(), 0));

            }

        });

        tablaFiltronom = new TableRowSorter(table_usuarios.getModel());

        table_usuarios.setRowSorter(tablaFiltronom);
    }//GEN-LAST:event_box_busqueda_usuarioNomKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Actualiar_usuario;
    private javax.swing.JPanel Background;
    public javax.swing.JScrollPane Tabla_Usuarios;
    private javax.swing.JPanel agregar_usuario;
    private javax.swing.JTextField box_busqueda_usuarioId;
    private javax.swing.JTextField box_busqueda_usuarioNom;
    private javax.swing.JLabel btn_actualizar_usuario;
    private javax.swing.JLabel btn_agregar_usuario;
    private javax.swing.JLabel btn_eliminar_usuario;
    private javax.swing.JLabel btn_modificar_usuario;
    private javax.swing.JPanel eliminar_usuario;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel modificar_usuario;
    private Vista.PanelesRedondeados panel_usuario;
    public javax.swing.JTable table_usuarios;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
