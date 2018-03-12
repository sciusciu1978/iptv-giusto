
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
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
public class AscoltaNuovoUtente implements ActionListener{
    private GraficaIPTV frame;

    public AscoltaNuovoUtente(GraficaIPTV frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(frame.iptv.server.size()>0){
            frame.jTextUser.setEnabled(true);
            frame.jTextTel.setEnabled(true);
            frame.jSpinnerPrezzo.setEnabled(true);
            frame.jTextNote.setEnabled(true);
            frame.jButtonSalvaUtente.setEnabled(true);

            GregorianCalendar today = new GregorianCalendar();
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); //sdf contiene un formato di data da stampare
            frame.jTextData.setText(sdf.format(today.getTime()));

            frame.jComboServer.setEnabled(true);
            for(Server srv : frame.iptv.server){
                frame.jComboServer.addItem(srv.getNomeServer());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Nessun server presente");
        }
    }
    
}
