
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class AscoltaEliminaServer implements ActionListener{
    GestioneIptv iptv;
    ServerFrame frame;//oggetti dentro la finestra
    public AscoltaEliminaServer(GestioneIptv iptv, ServerFrame frame){
        this.iptv=iptv;
        this.frame=frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //quando clicco il pulsante Elimina devo capire qual'è la selezione attuale
        int selezione = JOptionPane.showConfirmDialog(frame, "Sei sicuro di voler eliminare il Server e tutti i suoi utenti?");
        if(selezione==0){ //controllo la risposta con un intero che mi rappresenta il pulsante premuto partendo da sinistra
        String selected=frame.jListServer.getSelectedValue();//ritorna la stringa selezionata
        //JOptionPane.showMessageDialog(null, selected);
        iptv.rimuoviServer(selected);
        frame.aggiornaLista();
        }
    }
}