package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JPanel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

public class Portal extends javax.swing.JFrame {

    public Portal() {
        initComponents();
//      tamaño de la interfaz
        setSize(1100, 730);

//        ubicacion de la interfaz
        this.setLocationRelativeTo(null);

//        importar jpanel from
        Inicio inicio = new Inicio();

//      tamaño de la interfaz jpanel from
        inicio.setSize(780, 540);
        inicio.setLocation(0, 0);

        PanelContenedor.removeAll();
        PanelContenedor.add(inicio, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
//      Fecha

        Fechas();

//       Horas();
//        reloj
        Relojs reloj = new Relojs();

        reloj.run();
//    icono aplciacion

        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/32x32sin fondo.png")).getImage());

    }
//    variables
    int xRaton, yRaton;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Inicio = new javax.swing.JPanel();
        _principal = new javax.swing.JLabel();
        icono_inicio = new javax.swing.JLabel();
        btn_registro_usuarios = new javax.swing.JPanel();
        _registro_usuarios = new javax.swing.JLabel();
        icono_registro_usuario = new javax.swing.JLabel();
        btn_registro_vehiculo = new javax.swing.JPanel();
        _registro_vehiculo = new javax.swing.JLabel();
        icono_registro_vehiculo = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JPanel();
        _usuarios = new javax.swing.JLabel();
        icono_usuarios = new javax.swing.JLabel();
        btn_vehiculo = new javax.swing.JPanel();
        _vehiculo = new javax.swing.JLabel();
        icono_vehiculo = new javax.swing.JLabel();
        btn_pagos = new javax.swing.JPanel();
        _pagos = new javax.swing.JLabel();
        icono_pago = new javax.swing.JLabel();
        barra_superrior = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JPanel();
        cerrar_txt = new javax.swing.JLabel();
        Parte_superior = new javax.swing.JPanel();
        Dia_Mes_Año = new javax.swing.JLabel();
        Horas = new javax.swing.JLabel();
        PanelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setPreferredSize(new java.awt.Dimension(320, 730));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("El candado ");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 260, 30));

        btn_Inicio.setBackground(new java.awt.Color(18, 90, 173));
        btn_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_InicioMousePressed(evt);
            }
        });
        btn_Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _principal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        _principal.setForeground(new java.awt.Color(255, 255, 255));
        _principal.setText("Inicio ");
        btn_Inicio.add(_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        icono_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home blanca.png"))); // NOI18N
        btn_Inicio.add(icono_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        Menu.add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 320, 60));

        btn_registro_usuarios.setBackground(new java.awt.Color(14, 76, 172));
        btn_registro_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registro_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registro_usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registro_usuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_registro_usuariosMousePressed(evt);
            }
        });
        btn_registro_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _registro_usuarios.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        _registro_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        _registro_usuarios.setText("Registro usuario");
        btn_registro_usuarios.add(_registro_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        icono_registro_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        btn_registro_usuarios.add(icono_registro_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Menu.add(btn_registro_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 320, 60));

        btn_registro_vehiculo.setBackground(new java.awt.Color(14, 76, 172));
        btn_registro_vehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registro_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registro_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registro_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_registro_vehiculoMousePressed(evt);
            }
        });
        btn_registro_vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _registro_vehiculo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        _registro_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        _registro_vehiculo.setText("Registro Vehiculo");
        btn_registro_vehiculo.add(_registro_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        icono_registro_vehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vehiculo.png"))); // NOI18N
        btn_registro_vehiculo.add(icono_registro_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Menu.add(btn_registro_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 60));

        btn_usuarios.setBackground(new java.awt.Color(14, 76, 172));
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_usuariosMousePressed(evt);
            }
        });
        btn_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _usuarios.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        _usuarios.setForeground(new java.awt.Color(255, 255, 255));
        _usuarios.setText("usuarios");
        btn_usuarios.add(_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        icono_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        btn_usuarios.add(icono_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Menu.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 320, 60));

        btn_vehiculo.setBackground(new java.awt.Color(14, 76, 172));
        btn_vehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_vehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_vehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_vehiculoMousePressed(evt);
            }
        });
        btn_vehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _vehiculo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        _vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        _vehiculo.setText("Vehiculos");
        btn_vehiculo.add(_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        icono_vehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vihiculos_blanco.png"))); // NOI18N
        btn_vehiculo.add(icono_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Menu.add(btn_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 320, 60));

        btn_pagos.setBackground(new java.awt.Color(14, 76, 172));
        btn_pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pagosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_pagosMousePressed(evt);
            }
        });
        btn_pagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _pagos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        _pagos.setForeground(new java.awt.Color(255, 255, 255));
        _pagos.setText("pago");
        btn_pagos.add(_pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        icono_pago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagos.png"))); // NOI18N
        btn_pagos.add(icono_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        Menu.add(btn_pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 320, 60));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 730));

        barra_superrior.setBackground(new java.awt.Color(14, 76, 172));
        barra_superrior.setForeground(new java.awt.Color(255, 255, 255));
        barra_superrior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superriorMouseDragged(evt);
            }
        });
        barra_superrior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superriorMousePressed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(204, 204, 204));

        cerrar_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar_txt.setText("X");
        cerrar_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout btn_cerrarLayout = new javax.swing.GroupLayout(btn_cerrar);
        btn_cerrar.setLayout(btn_cerrarLayout);
        btn_cerrarLayout.setHorizontalGroup(
            btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_cerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_cerrarLayout.setVerticalGroup(
            btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_cerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barra_superriorLayout = new javax.swing.GroupLayout(barra_superrior);
        barra_superrior.setLayout(barra_superriorLayout);
        barra_superriorLayout.setHorizontalGroup(
            barra_superriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_superriorLayout.createSequentialGroup()
                .addGap(0, 1070, Short.MAX_VALUE)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_superriorLayout.setVerticalGroup(
            barra_superriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_superriorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(barra_superrior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 30));

        Parte_superior.setBackground(new java.awt.Color(14, 76, 172));
        Parte_superior.setToolTipText("");
        Parte_superior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Parte_superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dia_Mes_Año.setBackground(new java.awt.Color(255, 255, 255));
        Dia_Mes_Año.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        Dia_Mes_Año.setForeground(new java.awt.Color(255, 255, 255));
        Dia_Mes_Año.setText("Hoy es 29 de ocutbre de 2022");
        Parte_superior.add(Dia_Mes_Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, 30));

        Horas.setBackground(new java.awt.Color(255, 255, 255));
        Horas.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        Horas.setForeground(new java.awt.Color(255, 255, 255));
        Horas.setText("Hora: 11:43:12");
        Parte_superior.add(Horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, 30));

        Background.add(Parte_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 780, 190));

        PanelContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        Background.add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 780, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barra_superriorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superriorMousePressed

//        asigna la posicion del cursor a las variables
        xRaton = evt.getX();
        yRaton = evt.getY();
    }//GEN-LAST:event_barra_superriorMousePressed

    private void barra_superriorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superriorMouseDragged

//      nos permite arrastrar la aplicacion por la ventana de windos  
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xRaton, y - yRaton);
    }//GEN-LAST:event_barra_superriorMouseDragged

    private void cerrar_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_txtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrar_txtMouseClicked

    private void cerrar_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_txtMouseEntered

//        cuando pasamos el cursor por la boton cerrar se pondra automaticamente en rojo 
        btn_cerrar.setBackground(Color.RED);
        cerrar_txt.setForeground(Color.WHITE);
    }//GEN-LAST:event_cerrar_txtMouseEntered

    private void cerrar_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_txtMouseExited
//        cuando el cursor sale del boton vuelve a tomar los colores con los datos extablesidos
        btn_cerrar.setBackground(new Color(204, 204, 204));
        cerrar_txt.setForeground(Color.black);
    }//GEN-LAST:event_cerrar_txtMouseExited

    private void btn_InicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InicioMouseEntered
//        cuando pasamos el cursor por la boton inicio se pondra automaticamente en rgb selecciondo 
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());

        if (btn_Inicio.getBackground().getRGB() == -15840084) {
            setColor(btn_Inicio);
        }

    }//GEN-LAST:event_btn_InicioMouseEntered

    private void btn_registro_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registro_usuariosMouseEntered
//        cuando pasamos el cursor por la boton registro usuarios se pondra automaticamente en rgb selecciondo
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());
        if (btn_registro_usuarios.getBackground().getRGB() == -15840084) {
            setColor(btn_registro_usuarios);
        }

    }//GEN-LAST:event_btn_registro_usuariosMouseEntered

    private void btn_registro_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registro_vehiculoMouseEntered
//        cuando pasamos el cursor por la boton registro vehiculos se pondra automaticamente en rgb selecciondo 
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());
        if (btn_registro_vehiculo.getBackground().getRGB() == -15840084)
            setColor(btn_registro_vehiculo);
    }//GEN-LAST:event_btn_registro_vehiculoMouseEntered

    private void btn_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseEntered
//        cuando pasamos el cursor por la boton usuarios se pondra automaticamente en rgb selecciondo 
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());
        if (btn_usuarios.getBackground().getRGB() == -15840084)
            setColor(btn_usuarios);
    }//GEN-LAST:event_btn_usuariosMouseEntered

    private void btn_vehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vehiculoMouseEntered
//        cuando pasamos el cursor por la boton vehiculo se pondra automaticamente en rgb selecciondo 
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());
        if (btn_vehiculo.getBackground().getRGB() == -15840084)
            setColor(btn_vehiculo);
    }//GEN-LAST:event_btn_vehiculoMouseEntered

    private void btn_pagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pagosMouseEntered
//        cuando pasamos el cursor por la boton pagos se pondra automaticamente en rgb selecciondo 
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());
        if (btn_pagos.getBackground().getRGB() == -15840084)
            setColor(btn_pagos);
    }//GEN-LAST:event_btn_pagosMouseEntered

    private void btn_InicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InicioMouseExited
//        cuando  el cursor se sale del boton, regresa a el color que estaba en un prinsipio  
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());            
//        si el valor es diferente al del color cuando se salga del boton lo coloreara del color que estaba en principio

        if (btn_registro_usuarios.getBackground().getRGB() != -15840084 || btn_registro_vehiculo.getBackground().getRGB() != -15840084
                || btn_usuarios.getBackground().getRGB() != -15840084 || btn_vehiculo.getBackground().getRGB() != -15840084 || btn_pagos.getBackground().getRGB() != -15840084)
            resetColor(btn_Inicio);
    }//GEN-LAST:event_btn_InicioMouseExited

    private void btn_registro_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registro_usuariosMouseExited
//        cuando  el cursor se sale del boton, regresa a el color que estaba en un prinsipio  
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());
//        si el valor es diferente al del color cuando se salga del boton lo coloreara del color que estaba en principio
        if (btn_Inicio.getBackground().getRGB() != -15840084 || btn_registro_vehiculo.getBackground().getRGB() != -15840084
                || btn_usuarios.getBackground().getRGB() != -15840084 || btn_vehiculo.getBackground().getRGB() != -15840084 || btn_pagos.getBackground().getRGB() != -15840084)
            resetColor(btn_registro_usuarios);
    }//GEN-LAST:event_btn_registro_usuariosMouseExited

    private void btn_registro_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registro_vehiculoMouseExited
//        cuando  el cursor se sale del boton, regresa a el color que estaba en un prinsipio   
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());            
//        si el valor es diferente al del color cuando se salga del boton lo coloreara del color que estaba en principio

        if (btn_Inicio.getBackground().getRGB() != -15840084 || btn_registro_usuarios.getBackground().getRGB() != -15840084
                || btn_usuarios.getBackground().getRGB() != -15840084 || btn_vehiculo.getBackground().getRGB() != -15840084 || btn_pagos.getBackground().getRGB() != -15840084)
            resetColor(btn_registro_vehiculo);
    }//GEN-LAST:event_btn_registro_vehiculoMouseExited

    private void btn_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseExited
//        cuando  el cursor se sale del boton, regresa a el color que estaba en un prinsipio   
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());            
//        si el valor es diferente al del color cuando se salga del boton lo coloreara del color que estaba en principio

        if (btn_Inicio.getBackground().getRGB() != -15840084 || btn_registro_usuarios.getBackground().getRGB() != -15840084
                || btn_registro_vehiculo.getBackground().getRGB() != -15840084 || btn_vehiculo.getBackground().getRGB() != -15840084 || btn_pagos.getBackground().getRGB() != -15840084)
            resetColor(btn_usuarios);
    }//GEN-LAST:event_btn_usuariosMouseExited

    private void btn_vehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vehiculoMouseExited
//        cuando  el cursor se sale del boton, regresa a el color que estaba en un prinsipio    
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());            
//        si el valor es diferente al del color cuando se salga del boton lo coloreara del color que estaba en principio

        if (btn_Inicio.getBackground().getRGB() != -15840084 || btn_registro_usuarios.getBackground().getRGB() != -15840084
                || btn_registro_vehiculo.getBackground().getRGB() != -15840084 || btn_usuarios.getBackground().getRGB() != -15840084 || btn_pagos.getBackground().getRGB() != -15840084)
            resetColor(btn_vehiculo);
    }//GEN-LAST:event_btn_vehiculoMouseExited

    private void btn_pagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pagosMouseExited
//        cuando  el cursor se sale del boton, regresa a el color que estaba en un prinsipio 
//        para conocer el valor del color utilizamos System.out.println("Vista"+btn_usuarios.getBackground().getRGB());            
//        si el valor es diferente al del color cuando se salga del boton lo coloreara del color que estaba en principio
        if (btn_Inicio.getBackground().getRGB() != -15840084 || btn_registro_usuarios.getBackground().getRGB() != -15840084
                || btn_registro_vehiculo.getBackground().getRGB() != -15840084 || btn_usuarios.getBackground().getRGB() != -15840084 || btn_vehiculo.getBackground().getRGB() != -15840084)
            resetColor(btn_pagos);
    }//GEN-LAST:event_btn_pagosMouseExited

    private void btn_InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InicioMousePressed

        setColor(btn_Inicio);
        resetColor(btn_registro_usuarios);
        resetColor(btn_registro_vehiculo);
        resetColor(btn_usuarios);
        resetColor(btn_vehiculo);
        resetColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion
        Inicio inicio = new Inicio();
        inicio.setSize(780, 540);
        inicio.setLocation(0, 0);

//        primero rebueve el contenido que hay en el espacio asignado para que aparesca el panel
//        luego adiciona el panel que deaseamos 
// revalidateactivará una llamada para volver a pintar lo que el componente cree que son 'regiones sucias'. 
        PanelContenedor.removeAll();
        PanelContenedor.add(inicio, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
    }//GEN-LAST:event_btn_InicioMousePressed

    private void btn_registro_usuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registro_usuariosMousePressed

        resetColor(btn_Inicio);
        setColor(btn_registro_usuarios);
        resetColor(btn_registro_vehiculo);
        resetColor(btn_usuarios);
        resetColor(btn_vehiculo);
        resetColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion
        RegistroUsuarios registroUsuarios = new RegistroUsuarios();
        registroUsuarios.setSize(780, 540);
        registroUsuarios.setLocation(0, 0);

//        primero rebueve el contenido que hay en el espacio asignado para que aparesca el panel
//        luego adiciona el panel que deaseamos 
// revalidateactivará una llamada para volver a pintar lo que el componente cree que son 'regiones sucias'. 
        PanelContenedor.removeAll();
        PanelContenedor.add(registroUsuarios, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
    }//GEN-LAST:event_btn_registro_usuariosMousePressed


    private void btn_registro_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registro_vehiculoMousePressed

        resetColor(btn_Inicio);
        resetColor(btn_registro_usuarios);
        setColor(btn_registro_vehiculo);
        resetColor(btn_usuarios);
        resetColor(btn_vehiculo);
        resetColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion
        RegistroVehiculo registroVehiculo = new RegistroVehiculo();
        registroVehiculo.setSize(780, 540);
        registroVehiculo.setLocation(0, 0);

//        primero rebueve el contenido que hay en el espacio asignado para que aparesca el panel
//        luego adiciona el panel que deaseamos 
// revalidateactivará una llamada para volver a pintar lo que el componente cree que son 'regiones sucias'. 
        PanelContenedor.removeAll();
        PanelContenedor.add(registroVehiculo, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
    }//GEN-LAST:event_btn_registro_vehiculoMousePressed

    private void btn_usuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMousePressed

        resetColor(btn_Inicio);
        resetColor(btn_registro_usuarios);
        resetColor(btn_registro_vehiculo);
        setColor(btn_usuarios);
        resetColor(btn_vehiculo);
        resetColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion        
        Usuario usuario = new Usuario();
        usuario.setSize(780, 540);
        usuario.setLocation(0, 0);

//        primero rebueve el contenido que hay en el espacio asignado para que aparesca el panel
//        luego adiciona el panel que deaseamos 
// revalidateactivará una llamada para volver a pintar lo que el componente cree que son 'regiones sucias'. 
        PanelContenedor.removeAll();
        PanelContenedor.add(usuario, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
    }//GEN-LAST:event_btn_usuariosMousePressed

    private void btn_vehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vehiculoMousePressed

        resetColor(btn_Inicio);
        resetColor(btn_registro_usuarios);
        resetColor(btn_registro_vehiculo);
        resetColor(btn_usuarios);
        setColor(btn_vehiculo);
        resetColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion        
        vehiculo vehiculo = new vehiculo();
        vehiculo.setSize(780, 540);
        vehiculo.setLocation(0, 0);

        PanelContenedor.removeAll();
        PanelContenedor.add(vehiculo, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
    }//GEN-LAST:event_btn_vehiculoMousePressed

    private void btn_pagosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pagosMousePressed

        resetColor(btn_Inicio);
        resetColor(btn_registro_usuarios);
        resetColor(btn_registro_vehiculo);
        resetColor(btn_usuarios);
        resetColor(btn_vehiculo);
        setColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion        
        Pagos pagos = new Pagos();
        pagos.setSize(780, 540);
        pagos.setLocation(0, 0);

        PanelContenedor.removeAll();
        PanelContenedor.add(pagos, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
    }//GEN-LAST:event_btn_pagosMousePressed

    public void irUsuario() {

        resetColor(btn_Inicio);
        resetColor(btn_registro_usuarios);
        resetColor(btn_registro_vehiculo);
        setColor(btn_usuarios);
        resetColor(btn_vehiculo);
        resetColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion        
        Usuario usuario = new Usuario();
        usuario.setSize(780, 540);
        usuario.setLocation(0, 0);

//        primero rebueve el contenido que hay en el espacio asignado para que aparesca el panel
//        luego adiciona el panel que deaseamos 
// revalidateactivará una llamada para volver a pintar lo que el componente cree que son 'regiones sucias'. 
        PanelContenedor.removeAll();
        PanelContenedor.add(usuario, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
    }

    public void registroUsuario() {

        resetColor(btn_Inicio);
        setColor(btn_registro_usuarios);
        resetColor(btn_registro_vehiculo);
        resetColor(btn_usuarios);
        resetColor(btn_vehiculo);
        resetColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion
        RegistroUsuarios registroUsuarios = new RegistroUsuarios();
        registroUsuarios.setSize(780, 540);
        registroUsuarios.setLocation(0, 0);

//        primero rebueve el contenido que hay en el espacio asignado para que aparesca el panel
//        luego adiciona el panel que deaseamos 
// revalidateactivará una llamada para volver a pintar lo que el componente cree que son 'regiones sucias'. 
        PanelContenedor.removeAll();
        PanelContenedor.add(registroUsuarios, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();

    }

    public void registroVehiculo() {
        resetColor(btn_Inicio);
        resetColor(btn_registro_usuarios);
        setColor(btn_registro_vehiculo);
        resetColor(btn_usuarios);
        resetColor(btn_vehiculo);
        resetColor(btn_pagos);

//        se crea un objeto de la clase a llamar 
//        se le asigna el tamaño predeterminado
//        y se le asigna la ubicacion
        RegistroVehiculo registroVehiculo = new RegistroVehiculo();
        registroVehiculo.setSize(780, 540);
        registroVehiculo.setLocation(0, 0);

//        primero rebueve el contenido que hay en el espacio asignado para que aparesca el panel
//        luego adiciona el panel que deaseamos 
// revalidateactivará una llamada para volver a pintar lo que el componente cree que son 'regiones sucias'. 
        PanelContenedor.removeAll();
        PanelContenedor.add(registroVehiculo, BorderLayout.CENTER);
        PanelContenedor.revalidate();
        PanelContenedor.repaint();
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(14, 76, 172));
    }

    void Fechas() {
        LocalDate dato = LocalDate.now();

        int año, dia, mes;

        año = dato.getYear();
        mes = dato.getMonthValue();
        dia = dato.getDayOfMonth();

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
            "Octubre", "Noviembre", "Diciemrbre"};

        Dia_Mes_Año.setText("Hoy es " + dia + " de " + meses[mes - 1] + " de " + año + ",");

    }

    void Horas() {
        LocalDateTime horas = LocalDateTime.now();
        int hora, minutos, segundos;

        hora = horas.getHour();
        minutos = horas.getMinute();
        segundos = horas.getSecond();

        Horas.setText(" Hora: " + hora + ":" + minutos + ":" + segundos);

    }

    public class Relojs implements Runnable {

        String hora, minutos, segundos;
        String amPm;
        Calendar calendario;
        Thread hilo;

        public Relojs() {
            hilo = new Thread(this);
            hilo.start();
            setVisible(true);
        }

        @Override
        public void run() {
            Thread ct = Thread.currentThread();

            while (ct == hilo) {
                calcula();
                Horas.setText(" Hora: " + hora + ":" + minutos + ":" + segundos + " " + amPm);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }

        private void calcula() {
            Calendar calendario = new GregorianCalendar();
            Date HoraActual = new Date();

            calendario.setTime(HoraActual);
            amPm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

//            verificamos si la hora es am o pm
//            si es pm se le restaran 12 horas a la hora
//            si la hora es menor al 9 se va agregare un 0
            if (amPm.equals("PM")) {
                int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
                hora = h > 9 ? "" + h : "0" + h;
            } else {
                hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
            }
//            como para segundos y minutos no se restan doce horas no es necesario hacer el if
            minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);

        }
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
            java.util.logging.Logger.getLogger(Portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Dia_Mes_Año;
    private javax.swing.JLabel Horas;
    private javax.swing.JPanel Menu;
    protected static javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel Parte_superior;
    private javax.swing.JLabel _pagos;
    private javax.swing.JLabel _principal;
    private javax.swing.JLabel _registro_usuarios;
    private javax.swing.JLabel _registro_vehiculo;
    private javax.swing.JLabel _usuarios;
    private javax.swing.JLabel _vehiculo;
    private javax.swing.JPanel barra_superrior;
    private javax.swing.JPanel btn_Inicio;
    private javax.swing.JPanel btn_cerrar;
    private javax.swing.JPanel btn_pagos;
    private javax.swing.JPanel btn_registro_usuarios;
    private javax.swing.JPanel btn_registro_vehiculo;
    private javax.swing.JPanel btn_usuarios;
    private javax.swing.JPanel btn_vehiculo;
    private javax.swing.JLabel cerrar_txt;
    private javax.swing.JLabel icono_inicio;
    private javax.swing.JLabel icono_pago;
    private javax.swing.JLabel icono_registro_usuario;
    private javax.swing.JLabel icono_registro_vehiculo;
    private javax.swing.JLabel icono_usuarios;
    private javax.swing.JLabel icono_vehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
