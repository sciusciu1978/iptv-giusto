
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
public class AscoltaEsci implements WindowListener{
    GraficaIPTV frame;

    public AscoltaEsci(GraficaIPTV frame) {
        this.frame = frame;
    }
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int risp = JOptionPane.showConfirmDialog(null, "Vuoi salvare?");
        if(risp==0){
            //devo salvare
            frame.jMenuSalva.doClick();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
