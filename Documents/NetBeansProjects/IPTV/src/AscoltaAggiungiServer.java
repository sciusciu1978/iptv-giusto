
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scius
 */
public class AscoltaAggiungiServer implements ActionListener{
    GestioneIptv iptv;
    ServerFrame frame;
    public AscoltaAggiungiServer(GestioneIptv iptv, ServerFrame frame){
        this.iptv=iptv;
        this.frame=frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String nome=frame.jTextNomeServer.getText().trim();
        String contatto=frame.jTextContattoServer.getText().trim();
        if(!nome.equals("") && !contatto.equals("")){
            try {
                iptv.aggiungiServer(nome, contatto);
                //aggiornare la lista
                frame.aggiornaLista();
                frame.jTextNomeServer.setText("");
                frame.jTextContattoServer.setText("");
                frame.jTextNomeServer.grabFocus();//autofocus
            } catch (MiaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Campi vuoti");
        }
    }
    
}
