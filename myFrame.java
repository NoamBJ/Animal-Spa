import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myFrame extends JFrame implements ActionListener {
    CentreSPALinkedList ll = new CentreSPALinkedList();

    String txt = "Les animaux actuellement présents sont: \n";

    JButton button;
    JButton button2;
    JTextArea txt1;
    JTextArea txt2;
    JTextArea txt3;
    JTextArea txt4;
    JTextArea txt5;
    JPanel panel2;

    myFrame() {
        super("Centre SPA d'Oulin");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.WHITE);
        this.setLayout(new BorderLayout());
        this.setSize(1000, 700);

        // Creation de Panel
        // *
        // *
        // *
        // *
        // *

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.yellow);
        panel1.setOpaque(true);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(Color.white);
        panel2.setOpaque(true);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setBackground(Color.GREEN);
        panel3.setOpaque(true);

        // Creation de Label
        // *
        // *
        // *
        // *
        // *

        JLabel label2 = new JLabel();
        label2.setText("Espèce : ");

        JLabel label3 = new JLabel();
        label3.setText("Couleur : ");

        JLabel label4 = new JLabel();
        label4.setText("Nom : ");

        JLabel label5 = new JLabel();
        label5.setText("Identifiant de l'animal: ");

        // Creation de TextArea
        // *
        // *
        // *
        // *
        // *

        txt1 = new JTextArea();

        txt1.setPreferredSize(new Dimension(150, 20));
        txt1.setBackground(Color.white);

        txt2 = new JTextArea();

        txt2.setPreferredSize(new Dimension(150, 20));
        txt2.setBackground(Color.white);

        txt3 = new JTextArea();

        txt3.setPreferredSize(new Dimension(150, 20));
        txt3.setBackground(Color.white);

        txt4 = new JTextArea();

        txt4.setPreferredSize(new Dimension(150, 20));
        txt4.setBackground(Color.white);

        txt5 = new JTextArea();
        txt5.setText(txt);
        txt5.setEditable(false);

        // Creation de Button
        // *
        // *
        // *
        // *
        // *

        button = new JButton("Valider l'entrée");
        button.setSize(new Dimension(100, 20));
        button.addActionListener(this);

        button2 = new JButton("Valider la sortie");
        button2.setSize(new Dimension(100, 20));
        button2.addActionListener(this);

        panel1.add(label2);
        panel1.add(txt1);
        panel1.add(label3);
        panel1.add(txt2);
        panel1.add(label4);
        panel1.add(txt3);
        panel1.add(button);

        panel2.add(txt5);

        panel3.add(label5);
        panel3.add(txt4);
        panel3.add(button2);

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);

        // this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String before = txt5.getText();

            String esp = txt1.getText();
            String couleur = txt2.getText();
            String nom = txt3.getText();

            if (esp.equalsIgnoreCase("chat")) {

            } else if (esp.equalsIgnoreCase("chien")) {

            }

            String a = "La " + esp + " " + couleur + " " + nom + " (Numéro x)"
                    + " vous dit ...\n";
            txt5.setText(before + a);

        }

        if (e.getSource() == button2) {

            // charo
        }

    }
}