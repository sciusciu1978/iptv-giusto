
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
 * @author Dominatore
 */
public class AscoltaSalvaUtente implements ActionListener{
    GraficaIPTV frame;

    public AscoltaSalvaUtente(GraficaIPTV frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!frame.jTextUser.getText().trim().equals("")){
            String user = frame.jTextUser.getText().trim();
            String tel = frame.jTextTel.getText().trim();
            double prezzo = Double.parseDouble(frame.jSpinnerPrezzo.getValue().toString());
            String server = frame.jComboServer.getSelectedItem().toString();
            String note = frame.jTextNote.getText();
            
            try {
                frame.iptv.aggiungiNuovoAbbonato(server, prezzo, tel, user, note);
            } catch (MiaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            frame.aggiornaLista();
        }
    }
    
}
