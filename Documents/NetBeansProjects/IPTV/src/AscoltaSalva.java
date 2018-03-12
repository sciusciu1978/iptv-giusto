
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
public class AscoltaSalva implements ActionListener{
    GestioneIptv iptv;

    public AscoltaSalva(GestioneIptv iptv) {
        this.iptv = iptv;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        FileOutputStream out = null;
        try {
            File f = new File("dati.dat"); //puntatore a un file che io stò cercando
            //cerco di aprirlo in scrittura di oggetti
            out = new FileOutputStream(f, false); //append? true o false
            ObjectOutputStream write = new ObjectOutputStream(out);
            write.writeObject(iptv);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AscoltaSalva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Errore di scrittura");
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(AscoltaSalva.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
