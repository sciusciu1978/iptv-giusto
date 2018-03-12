
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scius
 */
public class AscoltaMenuGestisci implements ActionListener{
    GestioneIptv iptv;
    
    public AscoltaMenuGestisci(GestioneIptv iptv){
        this.iptv=iptv;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        new ServerFrame(iptv).setVisible(true);
    }
    
}
