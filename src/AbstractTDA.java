import java.util.Observable;

public abstract class AbstractTDA extends Observable implements InterfaceTDA {

    public class Noeud {

        public Object element;
        public Noeud suivant;

        public Noeud(Object element, Noeud suivant) {
            this.element = element;
            this.suivant = suivant;
        }
    }

    protected static final int MAX_CAPACITY = 10;
    protected static final int TDA_VIDE = 0;


    protected int nbElements;

    public AbstractTDA() {

    }


    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public boolean estVide() {

        return nbElements == 0;
    }

    @Override
    public int getNbElements() {

        return nbElements;
    }

    public void aviserObservateurs() {

        setChanged();
        notifyObservers(this);
    }
}
