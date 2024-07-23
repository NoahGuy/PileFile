import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;


public class MenuBar extends Observable {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem pile;
    private JMenuItem file;
    private JMenuItem liste;

    private AbstractTDA tda;
    private PanneauPrincipal panneauPrincipal;
    
    public MenuBar(PanneauPrincipal panneauPrincipal) {
        
        initComposants(panneauPrincipal);
    }

    private void initComposants(PanneauPrincipal panneauPrincipal) {

        this.panneauPrincipal = panneauPrincipal;

        menuBar = new JMenuBar();

        menu = new JMenu("Type de TDA");
        pile = new JMenuItem("Pile");
        file = new JMenuItem("File");
        liste = new JMenuItem("Liste");

        associerEcouteurs();

        menu.add(pile);
        menu.add(file);
        menu.add(liste);
        menuBar.add(menu);
    }

    public void associerEcouteurs() {

        pile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tda = new Pile();

                aviserObservateurs();
            }
        });

        file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tda = new File();
                aviserObservateurs();
            }
        });

        liste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tda = new Liste();
                aviserObservateurs();
            }
        });
    }

    JMenuBar getMenuBar() {

        return menuBar;
    }

    private void aviserObservateurs() {

        addObserver(panneauPrincipal);

        setChanged();
        notifyObservers(tda);
    }
}
