package br.ufu.facom.persim.view;

import java.awt.Dimension;
import java.awt.Toolkit;

//import javax.swing.JOptionPane;

public final class MainWindowFrame extends javax.swing.JFrame {
    
    public MainWindowFrame() {
        this.setMainWindowConfigurations();
        this.setDesktopConfigurations();
        this.visibilityConfigurations();
        //Notifications.showMessage("Testando!", "Testando 123 Hello World!!", Notifications.ATENTION_ICON);
    }
    
    private void setMainWindowConfigurations () {
        this.initComponents();
        this.setTitle("PERSIM - Personal Student Info. Manager");  
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(tela.width, tela.height); 
        this.setVisible(true);
        
    }
    
    private void setDesktopConfigurations () {
        this.calframe = new CalendarIFrame();
        this.desktopPane.add(this.calframe);
    }
                
    private void visibilityConfigurations() {
        this.periodosAnterioresMenu.setEnabled(false);
        this.periodosVigentesMenu.setEnabled(false);
        
        /*int answer = JOptionPane.showConfirmDialog(this, "Não há períodos cadastrados! Antes de começar "
                + "você deve cadastrar um novo período", 
                "Cadastre um novo período", JOptionPane.INFORMATION_MESSAGE , 
                JOptionPane.NO_OPTION);*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        periodoMenu = new javax.swing.JMenu();
        novoPeriodoMenuItem = new javax.swing.JMenuItem();
        periodosAnterioresMenu = new javax.swing.JMenu();
        periodosVigentesMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        periodoMenu.setText("Periodo");

        novoPeriodoMenuItem.setText("Novo Periodo");
        periodoMenu.add(novoPeriodoMenuItem);

        periodosAnterioresMenu.setText("Periodos Anteriores");
        periodoMenu.add(periodosAnterioresMenu);

        periodosVigentesMenu.setText("Periodos Vigentes");
        periodoMenu.add(periodosVigentesMenu);

        menuBar.add(periodoMenu);

        helpMenu.setText("Janelas");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindowFrame().setVisible(true);
            }
        });
    }
    //Atributos declarados
    private CalendarIFrame calframe;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem novoPeriodoMenuItem;
    private javax.swing.JMenu periodoMenu;
    private javax.swing.JMenu periodosAnterioresMenu;
    private javax.swing.JMenu periodosVigentesMenu;
    // End of variables declaration//GEN-END:variables
}
