/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardoisemagique;

/**
 *
 * @author jbben
 */
public class GraphicalInterface extends javax.swing.JFrame {

    /**
     * Creates new form GraphicalInterface
     */
    public GraphicalInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackendPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        delateButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        QuitMenuItem = new javax.swing.JMenuItem();
        DelateMenuItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        FormPointeurMenu = new javax.swing.JMenu();
        RoundMenuItem = new javax.swing.JMenuItem();
        SquareMenuItem = new javax.swing.JMenuItem();
        ColorPointeurMenu = new javax.swing.JMenu();
        RedMenuItem = new javax.swing.JMenuItem();
        GreenMenuBar = new javax.swing.JMenuItem();
        BlueMenuBar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackendPanel.setBackground(new java.awt.Color(255, 255, 255));

        MenuPanel.setBackground(new java.awt.Color(153, 153, 153));

        delateButton.setBackground(new java.awt.Color(204, 204, 204));
        delateButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delateButton.setForeground(new java.awt.Color(255, 0, 0));
        delateButton.setText("Effacer");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(delateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1211, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(delateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout BackendPanelLayout = new javax.swing.GroupLayout(BackendPanel);
        BackendPanel.setLayout(BackendPanelLayout);
        BackendPanelLayout.setHorizontalGroup(
            BackendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackendPanelLayout.setVerticalGroup(
            BackendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackendPanelLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 698, Short.MAX_VALUE))
        );

        FileMenu.setText("Fichier");

        QuitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        QuitMenuItem.setText("Quitter");
        FileMenu.add(QuitMenuItem);

        DelateMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        DelateMenuItem.setText("Effacer");
        FileMenu.add(DelateMenuItem);

        MenuBar.add(FileMenu);

        EditMenu.setText("Edition");

        FormPointeurMenu.setText("Forme du pointeur");

        RoundMenuItem.setText("Rond");
        FormPointeurMenu.add(RoundMenuItem);

        SquareMenuItem.setText("Carré");
        FormPointeurMenu.add(SquareMenuItem);

        EditMenu.add(FormPointeurMenu);

        ColorPointeurMenu.setText("Couleur du pointeur");

        RedMenuItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\jbben\\Documents\\MES DOCUMENTS\\Programmation\\Programmes Java\\ArdoiseMagique\\redPicture.jpg")); // NOI18N
        RedMenuItem.setText("Rouge");
        ColorPointeurMenu.add(RedMenuItem);

        GreenMenuBar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jbben\\Documents\\MES DOCUMENTS\\Programmation\\Programmes Java\\ArdoiseMagique\\greenPicture.jpg")); // NOI18N
        GreenMenuBar.setText("Vert");
        ColorPointeurMenu.add(GreenMenuBar);

        BlueMenuBar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jbben\\Documents\\MES DOCUMENTS\\Programmation\\Programmes Java\\ArdoiseMagique\\bluePicture.png")); // NOI18N
        BlueMenuBar.setText("Bleu");
        ColorPointeurMenu.add(BlueMenuBar);

        EditMenu.add(ColorPointeurMenu);

        MenuBar.add(EditMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackendPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(GraphicalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicalInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackendPanel;
    private javax.swing.JMenuItem BlueMenuBar;
    private javax.swing.JMenu ColorPointeurMenu;
    private javax.swing.JMenuItem DelateMenuItem;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu FormPointeurMenu;
    private javax.swing.JMenuItem GreenMenuBar;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JMenuItem QuitMenuItem;
    private javax.swing.JMenuItem RedMenuItem;
    private javax.swing.JMenuItem RoundMenuItem;
    private javax.swing.JMenuItem SquareMenuItem;
    private javax.swing.JButton delateButton;
    // End of variables declaration//GEN-END:variables
}
