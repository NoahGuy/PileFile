public class Pile extends AbstractTDA {

    private Noeud sommet = null;

    public Pile(){
        super();
    }


    @Override
    public void ajouter(Object element, int position) {


        ajouter(element);

    }

    @Override
    public void ajouter(Object element) {

        sommet = new Noeud(element, sommet);
        nbElements++;
        aviserObservateurs();
    }

    public Object getElement() {

        return null;
    }

    public int getPositionAjout() {

        return nbElements - 1;
    }

    @Override
    public Object supprimer(int position) {

        Object element = sommet.element;

        if (sommet != null) {
            sommet = sommet.suivant;
            nbElements--;
            aviserObservateurs();
        }
        return element;
    }

    @Override
    public String getNom() {

        return "Pile";
    }

    public Object[] toArray() {

        Object[] tab = new Object[nbElements];

        Noeud temp = sommet;
        for (int i = 0; i < nbElements; i++) {
            tab[i] = temp.element;
            temp = temp.suivant;
        }

        return tab;
    }
}
