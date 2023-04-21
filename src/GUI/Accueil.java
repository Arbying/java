
package GUI;

import javax.swing.*;
import java.awt.*;

    public class Accueil extends JFrame {

        public Accueil() {
            setTitle("Accueil");
            setSize(900, 450);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Barre de menu
            JMenuBar menuBar = new JMenuBar();
            JMenu menu1 = new JMenu("Menu 1");
            JMenuItem menuItem11 = new JMenuItem("Item 1.1");
            JMenuItem menuItem12 = new JMenuItem("Item 1.2");
            menu1.add(menuItem11);
            menu1.add(menuItem12);

            JMenu menu2 = new JMenu("Menu 2");
            JMenuItem menuItem21 = new JMenuItem("Item 2.1");
            JMenuItem menuItem22 = new JMenuItem("Item 2.2");
            menu2.add(menuItem21);
            menu2.add(menuItem22);

            menuBar.add(menu1);
            menuBar.add(menu2);
            setJMenuBar(menuBar);

            // Layout principal
            JPanel mainPanel = new JPanel(new GridLayout(1, 2));

            // Panneau de gauche
            JPanel leftPanel = new JPanel(new BorderLayout());
            leftPanel.setBackground(Color.PINK);
            JLabel topLabel = new JLabel("Label en haut");
            leftPanel.add(topLabel, BorderLayout.NORTH);

            JLabel totalLabel = new JLabel("Total");
            JLabel montantLabel = new JLabel("Montant");
            JPanel bottomLeftPanel = new JPanel(new FlowLayout());
            bottomLeftPanel.add(totalLabel);
            bottomLeftPanel.add(montantLabel);
            leftPanel.add(bottomLeftPanel, BorderLayout.SOUTH);

            // Panneau de droite
            JPanel rightPanel = new JPanel(new BorderLayout());

            JTextField textBox = new JTextField();
            rightPanel.add(textBox, BorderLayout.NORTH);

/*            JPanel buttonsPanel = new JPanel(new GridLayout(2, 6));
            for (int i = 1; i <= 12; i++) {
                JButton button = new JButton(String.valueOf(i));
                button.setBackground(Color.RED);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            }
            rightPanel.add(buttonsPanel, BorderLayout.CENTER);
*/
            JPanel buttonsPanel = new JPanel(new GridLayout(2, 6));
            for (int i = 1; i <= 12; i++) {
                JButton button = new JButton(String.valueOf(i));
                button.setBackground(Color.RED);
                Insets margin = new Insets (10,10,10,10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            }
            rightPanel.add(buttonsPanel, BorderLayout.CENTER);


            JPanel lowerRightPanel = new JPanel(new FlowLayout());
            JPanel gridButtonsPanel = new JPanel(new GridLayout(4, 3));
            for (int i = 1; i <= 12; i++) {
                JButton gridButton = new JButton(String.valueOf(i));
                gridButtonsPanel.add(gridButton);
            }
            lowerRightPanel.add(gridButtonsPanel);

            JButton xButton = new JButton("X");
            xButton.setPreferredSize(new Dimension(xButton.getPreferredSize().width, gridButtonsPanel.getPreferredSize().height * 4 / 4));
            lowerRightPanel.add(xButton);

            JPanel yellowButtonsPanel = new JPanel(new GridLayout(4, 1));
            for (int i = 1; i <= 4; i++) {
                JButton yellowButton = new JButton("Bouton " + i);
                yellowButton.setBackground(Color.YELLOW);
                yellowButtonsPanel.add(yellowButton);
            }
            lowerRightPanel.add(Box.createRigidArea(new Dimension(20, 0))); // Modifier la valeur 10 à 20 pour déplacer les boutons jaunes plus à droite
            lowerRightPanel.add(yellowButtonsPanel);

            rightPanel.add(lowerRightPanel, BorderLayout.SOUTH);

            mainPanel.add(leftPanel);
            mainPanel.add(rightPanel);
            add(mainPanel);

            setVisible(true);
        }



        public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Accueil());
    }
}
