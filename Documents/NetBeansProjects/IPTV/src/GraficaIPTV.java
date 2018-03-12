
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class GraficaIPTV extends javax.swing.JFrame {
    GestioneIptv iptv;
    
    public GraficaIPTV(GestioneIptv iptv) {
        this.iptv=iptv;
        this.setLocation(200, 300);
        initComponents(); //disegna la finestra impostata su NetBeans
        jMenuGestisci.addActionListener(new AscoltaMenuGestisci(iptv));
        jMenuSalva.addActionListener(new AscoltaSalva(iptv));
        jMenuNuovoUtente.addActionListener(new AscoltaNuovoUtente(this));
        this.jButtonSalvaUtente.addActionListener(new AscoltaSalvaUtente(this));
        aggiornaLista(); //appena si apre la finestra aggiorno la lista
        this.addWindowListener(new AscoltaEsci(this));
       
    }
    
    public void aggiornaLista(){
        
        DefaultListModel<String> model = new DefaultListModel<>(); //nuovo modello per la jList
        for (Server srv : iptv.server){ //a girare tutti i server
            if(srv.getNumeroAbbServer()>0){
                for (Abbonato abb : srv.abbonati){
                    model.addElement(abb.getUsername());
                }
            }
        }
        this.jListUtenti.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListUtenti = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextUser = new javax.swing.JTextField();
        jTextTel = new javax.swing.JTextField();
        jTextData = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextNote = new javax.swing.JTextArea();
        jButtonSalvaUtente = new javax.swing.JButton();
        jSpinnerPrezzo = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jComboServer = new javax.swing.JComboBox<>();
        jButtonEliminaUtente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSalva = new javax.swing.JMenuItem();
        jMenuNuovoUtente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuGestisci = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListUtenti);

        jLabel1.setText("Username:");

        jLabel2.setText("Telefono:");

        jLabel3.setText("Prezzo:");

        jLabel4.setText("Iscritto il:");

        jLabel5.setText("Note:");

        jTextUser.setEnabled(false);

        jTextTel.setEnabled(false);

        jTextData.setEnabled(false);

        jTextNote.setColumns(20);
        jTextNote.setRows(5);
        jTextNote.setEnabled(false);
        jScrollPane2.setViewportView(jTextNote);

        jButtonSalvaUtente.setText("Salva");
        jButtonSalvaUtente.setEnabled(false);

        jSpinnerPrezzo.setModel(new javax.swing.SpinnerNumberModel(10, 0, 50, 1));
        jSpinnerPrezzo.setEnabled(false);

        jLabel6.setText("Server:");

        jButtonEliminaUtente.setText("Elimina");
        jButtonEliminaUtente.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextUser))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jTextTel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSpinnerPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 82, Short.MAX_VALUE))
                                    .addComponent(jTextData, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboServer, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonSalvaUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminaUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinnerPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvaUtente)
                    .addComponent(jButtonEliminaUtente))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuSalva.setText("Salva");
        jMenu1.add(jMenuSalva);

        jMenuNuovoUtente.setText("Nuovo utente..");
        jMenu1.add(jMenuNuovoUtente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Server");

        jMenuGestisci.setText("Gestisci");
        jMenu2.add(jMenuGestisci);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(GraficaIPTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaIPTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaIPTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaIPTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                File f = new File("dati.dat");
                    GestioneIptv iptv=null;
                    FileInputStream in=null;
                try {
                    in = new FileInputStream(f);
                    ObjectInputStream read = new ObjectInputStream(in);
                    iptv=(GestioneIptv)read.readObject();
                    
                } catch (FileNotFoundException ex) {
                    iptv=new GestioneIptv();
                } catch (IOException ex) {
                    iptv=new GestioneIptv();
                    JOptionPane.showMessageDialog(null, "Errore di lettura del file");
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Errore di lettura del file");
                }
                finally{
                    try {
                        if(in!=null){
                            in.close();
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(GraficaIPTV.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                GraficaIPTV frame = new GraficaIPTV(iptv);
                frame.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminaUtente;
    public javax.swing.JButton jButtonSalvaUtente;
    public javax.swing.JComboBox<String> jComboServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListUtenti;
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuGestisci;
    private javax.swing.JMenuItem jMenuNuovoUtente;
    public javax.swing.JMenuItem jMenuSalva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JSpinner jSpinnerPrezzo;
    public javax.swing.JTextField jTextData;
    public javax.swing.JTextArea jTextNote;
    public javax.swing.JTextField jTextTel;
    public javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
}
