import javax.swing.*;

public class Frame extends JFrame implements Runnable {

    private MenuBar menuBar;

    private PanneauPrincipal panneauPrincipal;

    private AbstractTDA tda;

    @Override
    public void run() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Pile File");

       // tda = menuBar.getTda();

        panneauPrincipal = new PanneauPrincipal();
        menuBar = new MenuBar(panneauPrincipal);
//        if (tda != null) {
//
//            tda.addObserver(panneauPrincipal);
//        }

        setContentPane(panneauPrincipal);
        setJMenuBar(menuBar.getMenuBar());
        setVisible(true);
    }
}
