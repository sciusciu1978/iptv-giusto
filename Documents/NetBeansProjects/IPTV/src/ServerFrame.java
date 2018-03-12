
import javafx.scene.control.SelectionModel;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;


public class ServerFrame extends javax.swing.JFrame {

    GestioneIptv iptv;
    
    public ServerFrame(GestioneIptv iptv) {
        this.iptv=iptv;
        initComponents();
        setResizable(false); //non posso ridimensionare
        setLocation(210, 320);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //operazione che distrugge questa finestra soltanto
        jButtonAggiungiServer.addActionListener(new AscoltaAggiungiServer(iptv, this));
        jButtonEliminaServer.addActionListener(new AscoltaEliminaServer(iptv, this));
        // aggiungo ascoltatore al 'modello' SelectionModel della lista
        ListSelectionModel listModel = jListServer.getSelectionModel(); //recupero il SelectionModel della lista
        listModel.addListSelectionListener(new AscoltaSelezioneServer(this));
        
        aggiornaLista();
    }
    
    public void aggiornaLista(){
        
        DefaultListModel<String> model = new DefaultListModel<>(); //nuovo modello per la jList
        for (Server srv : iptv.server){ //a girare tutti i server
            model.addElement(srv.getNomeServer()); //aggiungo i nomi
        }
        jListServer.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListServer = new javax.swing.JList<>();
        jButtonEliminaServer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNomeServer = new javax.swing.JTextField();
        jTextContattoServer = new javax.swing.JTextField();
        jButtonAggiungiServer = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelInfo = new javax.swing.JLabel();
        jLabelContatto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista Server:");

        jListServer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListServer);

        jButtonEliminaServer.setText("Elimina");
        jButtonEliminaServer.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Contatto:");

        jButtonAggiungiServer.setText("Aggiungi");

        jLabelInfo.setText("Contatto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextNomeServer, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                            .addComponent(jTextContattoServer))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonAggiungiServer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonEliminaServer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelContatto)
                                            .addComponent(jLabelInfo))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEliminaServer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelContatto)))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNomeServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAggiungiServer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextContattoServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAggiungiServer;
    public javax.swing.JButton jButtonEliminaServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabelContatto;
    private javax.swing.JLabel jLabelInfo;
    public javax.swing.JList<String> jListServer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextContattoServer;
    public javax.swing.JTextField jTextNomeServer;
    // End of variables declaration//GEN-END:variables
}
