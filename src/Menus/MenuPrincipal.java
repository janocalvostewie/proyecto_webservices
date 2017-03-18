/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import static Menus.Tablas.rellenaUsuariosGeneral;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author janillo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {

        this.setAlwaysOnTop(true);
        
        initComponents();

        card = (CardLayout) pPrincipal.getLayout();
        card.addLayoutComponent(pLogin, "pLogin");
        card.addLayoutComponent(pApp, "pApp");
ModelosTablas.tablaConsultaGeneral();
    }
    public static int id_usuario;
    public static int id_na;
    public static CardLayout card;

    public static void ocultar_inicio() {

        //CardLayout card = (CardLayout) pPrincipal.getLayout();
        //card.first(pPrincipal);
        card.show(pPrincipal, "pLogin");

    }

    public static void mostrar_menus() {

        card = (CardLayout) pPrincipal.getLayout();
        card.show(pPrincipal, "pApp");
        tpUsuarios.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pLogin = new javax.swing.JPanel();
        pMiniLogin = new javax.swing.JPanel();
        bEntrar = new javax.swing.JButton();
        tfPass = new javax.swing.JTextField();
        tfUsuario = new javax.swing.JTextField();
        pApp = new javax.swing.JPanel();
        lpUsuario = new javax.swing.JLayeredPane();
        etiqNA = new javax.swing.JLabel();
        etiqUsuario = new javax.swing.JLabel();
        lpMenus = new javax.swing.JLayeredPane();
        bMenuCompras = new javax.swing.JButton();
        bMenuVentas = new javax.swing.JButton();
        bMenuUsuarios = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bMenuArticulos = new javax.swing.JButton();
        bMenuClientes1 = new javax.swing.JButton();
        tpUsuarios = new javax.swing.JTabbedPane();
        pConsultaUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtGeneralUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtUsuariosCompras = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtUsuariosTiendas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtUsuariosVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pInsertaUsuarios = new javax.swing.JPanel();
        bCreaUsus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROYECTO");

        pPrincipal.setLayout(new java.awt.CardLayout());

        pLogin.setBackground(new java.awt.Color(204, 255, 255));

        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMiniLoginLayout = new javax.swing.GroupLayout(pMiniLogin);
        pMiniLogin.setLayout(pMiniLoginLayout);
        pMiniLoginLayout.setHorizontalGroup(
            pMiniLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMiniLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pMiniLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(tfPass)
                    .addComponent(tfUsuario))
                .addGap(28, 28, 28))
        );
        pMiniLoginLayout.setVerticalGroup(
            pMiniLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMiniLoginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tfUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPass)
                .addGap(28, 28, 28)
                .addComponent(bEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(pMiniLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(510, 510, 510))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(pMiniLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(277, 277, 277))
        );

        pPrincipal.add(pLogin, "card5");

        lpUsuario.setLayer(etiqNA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsuario.setLayer(etiqUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpUsuarioLayout = new javax.swing.GroupLayout(lpUsuario);
        lpUsuario.setLayout(lpUsuarioLayout);
        lpUsuarioLayout.setHorizontalGroup(
            lpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpUsuarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(etiqUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(etiqNA, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpUsuarioLayout.setVerticalGroup(
            lpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpUsuarioLayout.createSequentialGroup()
                .addGroup(lpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiqUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(etiqNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bMenuUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        bMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        bMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenuUsuariosActionPerformed(evt);
            }
        });

        bSalir.setBackground(new java.awt.Color(255, 255, 255));
        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/exit.gif"))); // NOI18N
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        lpMenus.setLayer(bMenuCompras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMenus.setLayer(bMenuVentas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMenus.setLayer(bMenuUsuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMenus.setLayer(bSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMenus.setLayer(bMenuArticulos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMenus.setLayer(bMenuClientes1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpMenusLayout = new javax.swing.GroupLayout(lpMenus);
        lpMenus.setLayout(lpMenusLayout);
        lpMenusLayout.setHorizontalGroup(
            lpMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpMenusLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bMenuUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bMenuArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bMenuCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bMenuClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bMenuVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        lpMenusLayout.setVerticalGroup(
            lpMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpMenusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(bMenuVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMenuUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMenuArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMenuCompras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMenuClientes1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pConsultaUsuarios.setBackground(new java.awt.Color(204, 204, 204));

        jtGeneralUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtGeneralUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtGeneralUsuarios);

        jtUsuariosCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtUsuariosCompras);

        jtUsuariosTiendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtUsuariosTiendas);

        jtUsuariosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jtUsuariosVentas);

        jLabel1.setText("Trabajadores");

        jLabel2.setText("Tiendas");

        jLabel4.setText("Últimas Compras:");

        jLabel5.setText("Últimas Ventas");

        javax.swing.GroupLayout pConsultaUsuariosLayout = new javax.swing.GroupLayout(pConsultaUsuarios);
        pConsultaUsuarios.setLayout(pConsultaUsuariosLayout);
        pConsultaUsuariosLayout.setHorizontalGroup(
            pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConsultaUsuariosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConsultaUsuariosLayout.createSequentialGroup()
                        .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pConsultaUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(650, 650, 650))
                            .addGroup(pConsultaUsuariosLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConsultaUsuariosLayout.createSequentialGroup()
                        .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(88, 88, 88)
                        .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pConsultaUsuariosLayout.setVerticalGroup(
            pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConsultaUsuariosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConsultaUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConsultaUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(pConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tpUsuarios.addTab("Consulta Usuarios", pConsultaUsuarios);

        bCreaUsus.setText("jButton1");
        bCreaUsus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreaUsusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInsertaUsuariosLayout = new javax.swing.GroupLayout(pInsertaUsuarios);
        pInsertaUsuarios.setLayout(pInsertaUsuariosLayout);
        pInsertaUsuariosLayout.setHorizontalGroup(
            pInsertaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInsertaUsuariosLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(bCreaUsus)
                .addContainerGap(617, Short.MAX_VALUE))
        );
        pInsertaUsuariosLayout.setVerticalGroup(
            pInsertaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInsertaUsuariosLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(bCreaUsus)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        tpUsuarios.addTab("Creación de Usuarios", pInsertaUsuarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        tpUsuarios.addTab("tab3", jPanel3);

        javax.swing.GroupLayout pAppLayout = new javax.swing.GroupLayout(pApp);
        pApp.setLayout(pAppLayout);
        pAppLayout.setHorizontalGroup(
            pAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpMenus)
            .addComponent(lpUsuario)
            .addComponent(tpUsuarios)
        );
        pAppLayout.setVerticalGroup(
            pAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAppLayout.createSequentialGroup()
                .addComponent(lpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lpMenus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tpUsuarios))
        );

        pPrincipal.add(pApp, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        List<String> valores = new ArrayList<>();

        String[] vUsario = new String[5];
        valores = loguearse(tfUsuario.getText(), tfPass.getText());
        valores.toArray(vUsario);
        if (vUsario[0] == null) {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
        } else {

            id_usuario = Integer.parseInt(vUsario[0]);
            id_na = Integer.parseInt(vUsario[3]);
            etiqUsuario.setText(vUsario[1] + " " + vUsario[2]);
            etiqNA.setText(vUsario[4]);

            mostrar_menus();

        }

    }//GEN-LAST:event_bEntrarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        ocultar_inicio();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bCreaUsusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreaUsusActionPerformed
        // insertarUsuario( "PRUEBA", "PRUEBA", "PRUEBA", "PRUEBA", "PRUEBA", "PRUEBA", "0", "M");

    }//GEN-LAST:event_bCreaUsusActionPerformed

    private void bMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenuUsuariosActionPerformed

        tpUsuarios.setVisible(true);
        rellenaUsuariosGeneral();


    }//GEN-LAST:event_bMenuUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCreaUsus;
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bMenuArticulos;
    private javax.swing.JButton bMenuClientes1;
    private javax.swing.JButton bMenuCompras;
    private javax.swing.JButton bMenuUsuarios;
    private javax.swing.JButton bMenuVentas;
    private javax.swing.JButton bSalir;
    protected static javax.swing.JLabel etiqNA;
    protected static javax.swing.JLabel etiqUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jtGeneralUsuarios;
    public static javax.swing.JTable jtUsuariosCompras;
    public static javax.swing.JTable jtUsuariosTiendas;
    public static javax.swing.JTable jtUsuariosVentas;
    private static javax.swing.JLayeredPane lpMenus;
    private static javax.swing.JLayeredPane lpUsuario;
    private static javax.swing.JPanel pApp;
    private static javax.swing.JPanel pConsultaUsuarios;
    private javax.swing.JPanel pInsertaUsuarios;
    private static javax.swing.JPanel pLogin;
    private javax.swing.JPanel pMiniLogin;
    private static javax.swing.JPanel pPrincipal;
    private javax.swing.JTextField tfPass;
    private javax.swing.JTextField tfUsuario;
    private static javax.swing.JTabbedPane tpUsuarios;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> loguearse(java.lang.String arg0, java.lang.String arg1) {
        servicio_usuarios.Usuarios_Service service = new servicio_usuarios.Usuarios_Service();
        servicio_usuarios.Usuarios port = service.getUsuariosPort();
        return port.loguearse(arg0, arg1);
    }

}
