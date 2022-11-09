
package Vista;


public class Inicio extends javax.swing.JPanel {

    public Inicio() {
        initComponents();
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        icono_logo = new javax.swing.JLabel();
        panelesRedondeados1 = new Vista.PanelesRedondeados();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 540));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/33x32.png"))); // NOI18N
        Background.add(icono_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 150));

        panelesRedondeados1.setBordeInferiorDerecho(50);
        panelesRedondeados1.setBordeInferiorIzquierdo(50);
        panelesRedondeados1.setBordeSuperiorDerecho(50);
        panelesRedondeados1.setBordeSuperiorIzquierdo(50);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("bienvenidos a su aplicativo el candado ");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout panelesRedondeados1Layout = new javax.swing.GroupLayout(panelesRedondeados1);
        panelesRedondeados1.setLayout(panelesRedondeados1Layout);
        panelesRedondeados1Layout.setHorizontalGroup(
            panelesRedondeados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelesRedondeados1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        panelesRedondeados1Layout.setVerticalGroup(
            panelesRedondeados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelesRedondeados1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        Background.add(panelesRedondeados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 630, 220));

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
    private javax.swing.JLabel jLabel1;
    private Vista.PanelesRedondeados panelesRedondeados1;
    // End of variables declaration//GEN-END:variables
}
