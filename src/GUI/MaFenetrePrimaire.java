
package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.TableColumnModel; // Pourquoi ????
import Controllers.MaFenetrePrimaireCtrl;


public class MaFenetrePrimaire extends JFrame {

    private MaFenetrePrimaireCtrl controller;

    public MaFenetrePrimaire(MaFenetrePrimaireCtrl controller) {
        this.controller = controller;

        setTitle("Accueil");
        setSize(900, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Barre de menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Fermeture");
        JMenuItem menuItem11 = new JMenuItem("Item 1.1");
        JMenuItem menuItem12 = new JMenuItem("Item 1.2");
        menu1.add(menuItem11);
        menu1.add(menuItem12);

        JMenu menu2 = new JMenu("Options et aide");
        JMenuItem menuItem21 = new JMenuItem("Item 2.1");
        JMenuItem menuItem22 = new JMenuItem("A propos");
        menuItem22.setActionCommand("openAboutWindow");
        menuItem22.addActionListener(controller);
        menu2.add(menuItem21);
        menu2.add(menuItem22);

        menuBar.add(menu1);
        menuBar.add(menu2);
        setJMenuBar(menuBar);

        // Layout principal
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        // Panneau de gauche
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(Color.RED);
        JLabel topLabel = new JLabel("Label en haut");
        leftPanel.add(topLabel, BorderLayout.NORTH);

        Object[][] data = {
                {"Chocolat noir", Integer.valueOf(120), Float.valueOf(1.2f), Float.valueOf(10f)},
                {"Whiskey irlandais", Integer.valueOf(25), Float.valueOf(14.85f), Float.valueOf(5f)},
                {"Saumon d'Ecosse 200g", Integer.valueOf(30), Float.valueOf(4.90f), Float.valueOf(4f)},
                {"Chips 500g", Integer.valueOf(200), Float.valueOf(0.75f), Float.valueOf(50f)}
        };
        String[] nomsColonnes = {"Article", "Qu.", "Prix", "Montant"};

        JTable tableauArticle = new JTable(data, nomsColonnes);
        TableColumnModel columnModel = tableauArticle.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(20);
        columnModel.getColumn(2).setPreferredWidth(20);
        columnModel.getColumn(3).setPreferredWidth(20);
        JScrollPane scrollPane = new JScrollPane(tableauArticle);
        leftPanel.add(scrollPane, BorderLayout.CENTER);


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


        JPanel buttonsPanel = new JPanel(new GridLayout(2, 6));
        for (int i = 1; i <= 12; i++) { //On aurait pu se passer du for mais plus lisible pour nous
            if (i == 1) {
                JButton button = new JButton("+ Client");
                button.setActionCommand("openNewClientWindow");
                button.addActionListener(controller);
                button.setBackground(Color.YELLOW);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 2) {
                JButton button = new JButton("+ Article");
                button.setActionCommand("openNewArticleWindow");
                button.addActionListener(controller);
                button.setBackground(Color.YELLOW);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 3) {
                JButton button = new JButton("PRESS");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 4) {
                JButton button = new JButton("EAUX");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 5) {
                JButton button = new JButton("TABAC");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 6) {
                JButton button = new JButton("FRUITS");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 7) {
                JButton button = new JButton("<html><center>LEGU<br>MES</center></html>");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 8) {
                JButton button = new JButton("<html><center>ALCO<br>OLS</center></html>");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 9) {
                JButton button = new JButton("LOTTO");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 10) {
                JButton button = new JButton("<html><center>DIVERS<br>6 %</center></html>");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else if (i == 11) {
                JButton button = new JButton("<html><center>DIVERS<br>21 %</center></html>");
                button.setBackground(Color.pink);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            } else {
                JButton button = new JButton("Z");
                button.setBackground(Color.CYAN);
                Insets margin = new Insets(10, 10, 10, 10);
                button.setMargin(margin);
                button.setPreferredSize(new Dimension(button.getPreferredSize().width * 5 / 10, button.getPreferredSize().height / 2));
                buttonsPanel.add(button);
            }


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
            if (i == 1)
            {
                JButton yellowButton = new JButton("C. CREDIT");
                yellowButton.setBackground(Color.YELLOW);
                yellowButtonsPanel.add(yellowButton);
            }
            if (i == 1)
            {
                JButton yellowButton = new JButton("CHEQUES");
                yellowButton.setBackground(Color.YELLOW);
                yellowButtonsPanel.add(yellowButton);
            }
            if (i == 1)
            {
                JButton yellowButton = new JButton("MAESTRO");
                yellowButton.setBackground(Color.YELLOW);
                yellowButtonsPanel.add(yellowButton);
            }
            if (i == 1)
            {
                JButton yellowButton = new JButton("CASH");
                yellowButton.setBackground(Color.YELLOW);
                yellowButtonsPanel.add(yellowButton);
            }
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
        SwingUtilities.invokeLater(() -> {
            MaFenetrePrimaireCtrl controller = new MaFenetrePrimaireCtrl();
            new MaFenetrePrimaire(controller);
        });
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


