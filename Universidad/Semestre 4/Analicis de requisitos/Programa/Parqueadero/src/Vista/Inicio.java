package Vista;

public class Inicio extends javax.swing.JPanel {

    public Inicio() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panelesRedondeados1 = new Vista.PanelesRedondeados();
        icono_logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 540));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelesRedondeados1.setBackground(new java.awt.Color(235, 235, 235));
        panelesRedondeados1.setBordeInferiorDerecho(50);
        panelesRedondeados1.setBordeInferiorIzquierdo(50);
        panelesRedondeados1.setBordeSuperiorDerecho(50);
        panelesRedondeados1.setBordeSuperiorIzquierdo(50);

        icono_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/300x300.png"))); // NOI18N

        javax.swing.GroupLayout panelesRedondeados1Layout = new javax.swing.GroupLayout(panelesRedondeados1);
        panelesRedondeados1.setLayout(panelesRedondeados1Layout);
        panelesRedondeados1Layout.setHorizontalGroup(
            panelesRedondeados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelesRedondeados1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(icono_logo)
                .addGap(158, 158, 158))
        );
        panelesRedondeados1Layout.setVerticalGroup(
            panelesRedondeados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelesRedondeados1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(icono_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        Background.add(panelesRedondeados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 630, 450));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel icono_logo;
    private Vista.PanelesRedondeados panelesRedondeados1;
    // End of variables declaration//GEN-END:variables
}
