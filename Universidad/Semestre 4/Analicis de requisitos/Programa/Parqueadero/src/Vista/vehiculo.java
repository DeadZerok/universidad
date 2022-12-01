package Vista;

import Control.ControlUsuario;
import Recursos.BotonTabla;
import java.awt.Color;
import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

// libreriaas para busqueda
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.TableColumn;

public class vehiculo extends javax.swing.JPanel {

    public DefaultTableModel tabla;

    public TableRowSorter tablaFiltronom;
    public TableRowSorter tablafiltroplac;

    public vehiculo() {
        initComponents();
        this.Table_vehiculos.setDefaultRenderer(Object.class, new BotonTabla());

        tabla = (DefaultTableModel) Table_vehiculos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panel_Regis_Vehiculo = new Vista.PanelesRedondeados();
        txt_vehiculo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        box_busqueda_VehiculoNom = new javax.swing.JTextField();
        box_busqueda_Vehiculoplaca = new javax.swing.JTextField();
        Tabla_Vehiculos = new javax.swing.JScrollPane();
        Table_vehiculos = new javax.swing.JTable();
        eliminar_vehiculo = new javax.swing.JPanel();
        btn_eliminar_vehiculo = new javax.swing.JLabel();
        modificar_vehiculo = new javax.swing.JPanel();
        btn_modificar_vehiculo = new javax.swing.JLabel();
        agregar_vehiculo = new javax.swing.JPanel();
        btn_agregar_vehiculo = new javax.swing.JLabel();
        Actualiar_Vehiculo = new javax.swing.JPanel();
        btn_actualizar_vehiculo = new javax.swing.JLabel();

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

        txt_vehiculo.setBackground(new java.awt.Color(187, 187, 187));
        txt_vehiculo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_vehiculo.setText("Vehiculos");
        panel_Regis_Vehiculo.add(txt_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(250, 10));
        panel_Regis_Vehiculo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 320, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        panel_Regis_Vehiculo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 320, 20));

        box_busqueda_VehiculoNom.setBackground(new java.awt.Color(235, 235, 235));
        box_busqueda_VehiculoNom.setForeground(new java.awt.Color(102, 102, 102));
        box_busqueda_VehiculoNom.setText("Ingrese el nombre del usuario a buscar");
        box_busqueda_VehiculoNom.setBorder(null);
        box_busqueda_VehiculoNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box_busqueda_VehiculoNomMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_busqueda_VehiculoNomMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                box_busqueda_VehiculoNomMouseReleased(evt);
            }
        });
        box_busqueda_VehiculoNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_busqueda_VehiculoNomActionPerformed(evt);
            }
        });
        box_busqueda_VehiculoNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                box_busqueda_VehiculoNomKeyTyped(evt);
            }
        });
        panel_Regis_Vehiculo.add(box_busqueda_VehiculoNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, 60));

        box_busqueda_Vehiculoplaca.setBackground(new java.awt.Color(235, 235, 235));
        box_busqueda_Vehiculoplaca.setForeground(new java.awt.Color(102, 102, 102));
        box_busqueda_Vehiculoplaca.setText("Ingrese  la placa del vehiculo a buscar");
        box_busqueda_Vehiculoplaca.setBorder(null);
        box_busqueda_Vehiculoplaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box_busqueda_VehiculoplacaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box_busqueda_VehiculoplacaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                box_busqueda_VehiculoplacaMouseReleased(evt);
            }
        });
        box_busqueda_Vehiculoplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_busqueda_VehiculoplacaActionPerformed(evt);
            }
        });
        box_busqueda_Vehiculoplaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                box_busqueda_VehiculoplacaKeyTyped(evt);
            }
        });
        panel_Regis_Vehiculo.add(box_busqueda_Vehiculoplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 310, 60));

        Table_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Placa", "Color", "Nombre", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_vehiculos.setName(""); // NOI18N
        Table_vehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Table_vehiculosMousePressed(evt);
            }
        });
        Tabla_Vehiculos.setViewportView(Table_vehiculos);

        panel_Regis_Vehiculo.add(Tabla_Vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 700, 310));

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

        btn_eliminar_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_eliminar_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_eliminar_vehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        btn_eliminar_vehiculo.setText("Eliminar");
        btn_eliminar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminar_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminar_vehiculoMousePressed(evt);
            }
        });
        eliminar_vehiculo.add(btn_eliminar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 135, 33));

        panel_Regis_Vehiculo.add(eliminar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 135, 33));

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

        btn_modificar_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_modificar_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_modificar_vehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btn_modificar_vehiculo.setText("Modificar");
        btn_modificar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modificar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_modificar_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_modificar_vehiculoMousePressed(evt);
            }
        });
        modificar_vehiculo.add(btn_modificar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 135, 33));

        panel_Regis_Vehiculo.add(modificar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 135, 33));

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

        btn_agregar_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_agregar_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar_vehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-agregar.png"))); // NOI18N
        btn_agregar_vehiculo.setText("Agregar");
        btn_agregar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregar_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_agregar_vehiculoMousePressed(evt);
            }
        });
        agregar_vehiculo.add(btn_agregar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 135, 33));

        panel_Regis_Vehiculo.add(agregar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 440, 135, 33));

        Actualiar_Vehiculo.setBackground(new java.awt.Color(18, 90, 173));
        Actualiar_Vehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actualiar_Vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Actualiar_VehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Actualiar_VehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actualiar_VehiculoMousePressed(evt);
            }
        });
        Actualiar_Vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_actualizar_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_actualizar_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_actualizar_vehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btn_actualizar_vehiculo.setText("Actualizar");
        btn_actualizar_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_actualizar_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_actualizar_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_actualizar_vehiculoMousePressed(evt);
            }
        });
        Actualiar_Vehiculo.add(btn_actualizar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 135, 33));

        panel_Regis_Vehiculo.add(Actualiar_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 440, 135, 33));

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

    private void btn_actualizar_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizar_vehiculoMouseEntered
        Actualiar_Vehiculo.setBackground(new Color(29, 131, 72));
        btn_actualizar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_actualizar_vehiculoMouseEntered

    private void btn_actualizar_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizar_vehiculoMouseExited
        Actualiar_Vehiculo.setBackground(new Color(18, 90, 173));
        btn_actualizar_vehiculo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_actualizar_vehiculoMouseExited

    private void btn_actualizar_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizar_vehiculoMousePressed

        new ControlUsuario().LlenarTablaVehiculo(Table_vehiculos);
    }//GEN-LAST:event_btn_actualizar_vehiculoMousePressed

    private void Actualiar_VehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualiar_VehiculoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualiar_VehiculoMouseEntered

    private void Actualiar_VehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualiar_VehiculoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualiar_VehiculoMouseExited

    private void Actualiar_VehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualiar_VehiculoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualiar_VehiculoMousePressed

    private void box_busqueda_VehiculoNomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoNomMouseExited
        if (box_busqueda_VehiculoNom.getText().equals("")) {

            box_busqueda_VehiculoNom.setForeground(new Color(102, 102, 102));
            box_busqueda_VehiculoNom.setText("Ingrese el nombre del usuario a buscar");
        }
    }//GEN-LAST:event_box_busqueda_VehiculoNomMouseExited

    private void box_busqueda_VehiculoNomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoNomMousePressed
        box_busqueda_Vehiculoplaca.setForeground(new Color(102, 102, 102));
        box_busqueda_Vehiculoplaca.setText("Ingrese  la placa del vehiculo a buscar");

        if (box_busqueda_VehiculoNom.getText().equals("Ingrese el nombre del usuario a buscar")) {
            box_busqueda_VehiculoNom.setText("");
        }
        box_busqueda_VehiculoNom.setForeground(Color.black);
    }//GEN-LAST:event_box_busqueda_VehiculoNomMousePressed

    private void box_busqueda_VehiculoNomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoNomMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_box_busqueda_VehiculoNomMouseReleased

    private void box_busqueda_VehiculoNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_busqueda_VehiculoNomActionPerformed

    private void box_busqueda_VehiculoNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoNomKeyTyped
        box_busqueda_VehiculoNom.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                tablaFiltronom.setRowFilter(RowFilter.regexFilter(box_busqueda_VehiculoNom.getText(), 3));

            }

        });

        tablaFiltronom = new TableRowSorter(Table_vehiculos.getModel());

        Table_vehiculos.setRowSorter(tablaFiltronom);
    }//GEN-LAST:event_box_busqueda_VehiculoNomKeyTyped

    private void box_busqueda_VehiculoplacaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoplacaMouseExited

        if (box_busqueda_Vehiculoplaca.getText().equals("")) {

            box_busqueda_Vehiculoplaca.setForeground(new Color(102, 102, 102));
            box_busqueda_Vehiculoplaca.setText("Ingrese  la placa del vehiculo a buscar");
        }
    }//GEN-LAST:event_box_busqueda_VehiculoplacaMouseExited

    private void box_busqueda_VehiculoplacaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoplacaMousePressed
        box_busqueda_VehiculoNom.setForeground(new Color(102, 102, 102));
        box_busqueda_VehiculoNom.setText("Ingrese el nombre del usuario a buscar");

        if (box_busqueda_Vehiculoplaca.getText().equals("Ingrese  la placa del vehiculo a buscar")) {
            box_busqueda_Vehiculoplaca.setText("");
        }
        box_busqueda_Vehiculoplaca.setForeground(Color.black);
    }//GEN-LAST:event_box_busqueda_VehiculoplacaMousePressed

    private void box_busqueda_VehiculoplacaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoplacaMouseReleased
        //nothing
    }//GEN-LAST:event_box_busqueda_VehiculoplacaMouseReleased

    private void box_busqueda_VehiculoplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_busqueda_VehiculoplacaActionPerformed

    private void box_busqueda_VehiculoplacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_box_busqueda_VehiculoplacaKeyTyped
        box_busqueda_Vehiculoplaca.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                tablafiltroplac.setRowFilter(RowFilter.regexFilter(box_busqueda_Vehiculoplaca.getText().toUpperCase(), 1));

            }

        });

        tablafiltroplac = new TableRowSorter(Table_vehiculos.getModel());

        Table_vehiculos.setRowSorter(tablafiltroplac);
    }//GEN-LAST:event_box_busqueda_VehiculoplacaKeyTyped

    private void btn_eliminar_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminar_vehiculoMousePressed
        new ControlUsuario().eliminarTablaVehiculo(Table_vehiculos);
        new ControlUsuario().LlenarTablaVehiculo(Table_vehiculos);
    }//GEN-LAST:event_btn_eliminar_vehiculoMousePressed

    private void btn_modificar_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificar_vehiculoMousePressed

        if (Table_vehiculos.getSelectedRow() != -1) {

            String Marca = new ControlUsuario().marcaPosi(Table_vehiculos);
            String Placa = new ControlUsuario().PlacaPosi(Table_vehiculos);
            String Color = new ControlUsuario().ColorPosi(Table_vehiculos);
            String propietario = new ControlUsuario().PropietarioPosi(Table_vehiculos);
            String imagen = new ControlUsuario().Fotoposi(Table_vehiculos);

            String MarcaVeh = JOptionPane.showInputDialog("Dijete la marca", Marca);
            String placVeh = JOptionPane.showInputDialog("Dijete la placa", Placa);
            String colorVeh = JOptionPane.showInputDialog("Dijete el color", Color);
            String propietarioPosi = JOptionPane.showInputDialog("Dijite el nombre", propietario);
            String imagePosi = JOptionPane.showInputDialog("Dijite la url de la foto", imagen);

            new ControlUsuario().ModificarTablaVehiculo(Table_vehiculos, MarcaVeh, placVeh, colorVeh, propietarioPosi, imagePosi);
        } else {
            JOptionPane.showMessageDialog(null, "no has seleccionado ninguna fila para ser modificada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        new ControlUsuario().LlenarTablaVehiculo(Table_vehiculos);

    }//GEN-LAST:event_btn_modificar_vehiculoMousePressed
    int valor = 0;
    String url2;
//    metodo que permite utilizar el boton dentro del jtable
    private void Table_vehiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_vehiculosMousePressed

    }//GEN-LAST:event_Table_vehiculosMousePressed

//  retorna la posicion seleccionada en la fila de jtable
    public int posi() {
        return valor;
    }
    private void btn_agregar_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_vehiculoMousePressed
        new Portal().registroVehiculo();
    }//GEN-LAST:event_btn_agregar_vehiculoMousePressed

//    obtinen la direccion de la url de la foto segun la posicion en el jtable
    public void urkfoto(JLabel lbl) {
//           importa la direccion 
        String imagenurl = new ControlUsuario().image(Table_vehiculos);

        System.out.println("urkfoto + image url" + imagenurl);

//            crea un objeto Imagen
        Image Imagen = new ImageIcon(imagenurl).getImage();
//           modifica las dimeciones de la imagen
        ImageIcon Icono = new ImageIcon(Imagen.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));

//        sube la imagen al jlabel
        lbl.setIcon(Icono);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Actualiar_Vehiculo;
    private javax.swing.JPanel Background;
    private javax.swing.JScrollPane Tabla_Vehiculos;
    private javax.swing.JTable Table_vehiculos;
    private javax.swing.JPanel agregar_vehiculo;
    private javax.swing.JTextField box_busqueda_VehiculoNom;
    private javax.swing.JTextField box_busqueda_Vehiculoplaca;
    private javax.swing.JLabel btn_actualizar_vehiculo;
    private javax.swing.JLabel btn_agregar_vehiculo;
    private javax.swing.JLabel btn_eliminar_vehiculo;
    private javax.swing.JLabel btn_modificar_vehiculo;
    private javax.swing.JPanel eliminar_vehiculo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel modificar_vehiculo;
    private Vista.PanelesRedondeados panel_Regis_Vehiculo;
    private javax.swing.JLabel txt_vehiculo;
    // End of variables declaration//GEN-END:variables
}
