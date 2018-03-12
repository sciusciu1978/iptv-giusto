
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominatore
 */
public class AscoltaSelezioneServer implements ListSelectionListener{
    ServerFrame frame;
    public AscoltaSelezioneServer(ServerFrame frame){
        this.frame=frame;
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        if(frame.jListServer.getSelectedIndex()==-1){ //nessuna selezione attiva
            frame.jButtonEliminaServer.setEnabled(false);
            frame.jLabelContatto.setText("");
        }
        else{
            frame.jButtonEliminaServer.setEnabled(true);
        
            String selezione=frame.jListServer.getSelectedValue();
            String contatto=frame.iptv.contattoServer(selezione);//cercare il server selezionato
            frame.jLabelContatto.setText(contatto);
        }
    }
    
}
