package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import GUI.NewClient;
import GUI.NewArticle;
import GUI.APropos;

import autres.*;
import personnes.*;



public class MaFenetrePrimaireCtrl implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // C'est ici que l'evenement se traite
        String command = e.getActionCommand();
        if ("openNewClientWindow".equals(command)) {
            SwingUtilities.invokeLater(NewClient::new);
        }
        if ("openNewArticleWindow".equals(command)) {
            SwingUtilities.invokeLater(NewArticle::new);
        }
        if ("openAboutWindow".equals(command)) {
            SwingUtilities.invokeLater(APropos::new);
        }
    }


}
