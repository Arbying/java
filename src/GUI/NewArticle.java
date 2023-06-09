package GUI;

import javax.swing.*;
import java.awt.*;

public class NewArticle extends JFrame {

    public NewArticle() {
        setTitle("Nouvel article");
        setSize(450, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Layout principal
        JPanel mainPanel = new JPanel(new GridLayout(4, 2));

        // Label "Code Barre" + Textbox
        JLabel codeBarreLabel = new JLabel("Code Barre");
        JTextField codeBarreTextBox = new JTextField();
        codeBarreTextBox.setPreferredSize(new Dimension(codeBarreLabel.getPreferredSize().width, 10)); // Hauteur de 1 cm
        mainPanel.add(codeBarreLabel);
        mainPanel.add(codeBarreTextBox);

        // Label "Intitulé" + Textbox
        JLabel intituleLabel = new JLabel("Intitulé");
        JTextField intituleTextBox = new JTextField();
        intituleTextBox.setPreferredSize(new Dimension(intituleLabel.getPreferredSize().width, 10)); // Hauteur de 1 cm
        mainPanel.add(intituleLabel);
        mainPanel.add(intituleTextBox);

        // Label "Prix" + Textbox
        JLabel prixLabel = new JLabel("Prix");
        JTextField prixTextBox = new JTextField();
        prixTextBox.setPreferredSize(new Dimension(prixLabel.getPreferredSize().width, 10)); // Hauteur de 1 cm
        mainPanel.add(prixLabel);
        mainPanel.add(prixTextBox);

        // Label "Points" + Textbox
        JLabel pointsLabel = new JLabel("Points");
        JTextField pointsTextBox = new JTextField();
        pointsTextBox.setPreferredSize(new Dimension(pointsLabel.getPreferredSize().width, 10)); // Hauteur de 1 cm
        mainPanel.add(pointsLabel);
        mainPanel.add(pointsTextBox);

        // Boutons
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JButton enregistrerButton = new JButton("Enregistrer");
        JButton annulerButton = new JButton("Annuler");
        buttonsPanel.add(enregistrerButton);
        buttonsPanel.add(annulerButton);

        // Ajout des composants à la fenêtre
        add(mainPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NewArticle());
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }
}
