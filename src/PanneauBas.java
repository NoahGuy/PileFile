import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanneauBas extends JPanel {

    private AbstractTDA tda;

    private JButton btnAjouter, btnRetirer;

    public PanneauBas(AbstractTDA tda) {

        this.tda = tda;

        initComposants();
    }

    private void initComposants() {

        btnAjouter = new JButton("Ajouter");
        btnRetirer = new JButton("Retirer");

        btnAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tda != null) {

                    tda.ajouter(tda.getNbElements());
                }
            }
        });

        btnRetirer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (tda.getNbElements() != 0) {

                    tda.supprimer(0);
                }
            }
        });

        add(btnAjouter);
        add(btnRetirer);
    }
}
