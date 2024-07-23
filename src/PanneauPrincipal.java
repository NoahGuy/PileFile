import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class PanneauPrincipal extends JPanel implements Observer {

    private AbstractTDA tda;
    //private MenuBar menuBar;

    private PanneauBas panneauBas;

    private PanneauAfficheTda panneauAffiche;


    public PanneauPrincipal() {



        initComposants();
    }

    private void initComposants() {


        setLayout(new BorderLayout());


    }

    @Override
    public void update(Observable o, Object arg) {

        removeAll();
        this.tda = (AbstractTDA) arg;
        tda.addObserver(this);

        panneauBas = new PanneauBas(tda);
        panneauAffiche = new PanneauAfficheTda(tda);

        add(panneauBas, BorderLayout.PAGE_END);
        add(panneauAffiche, BorderLayout.CENTER);

        revalidate();
        repaint();

    }
}
