import javax.swing.*;

public class PanneauAfficheTda extends JPanel {
    
    AbstractTDA  tda;
    
    public PanneauAfficheTda(AbstractTDA tda) {
        
        this.tda = tda;
        initComposants();
    }

    private void initComposants() {
        
        if (tda != null) {
            
            Object[] tab = tda.toArray();
            creerBoutons(tab);
        }
    }

    private void creerBoutons(Object[] tab) {

        if (tda.estVide()) {
            add (new JButton(tda.getNom() + " " + "vide"));
        }
        else {
            for (int i = 0; i < tab.length; i++) {

                if (tab[i] != null) {

                    JButton btn = new JButton(tab[i].toString());
                    add (btn);
                }
            }
        }
    }
}
