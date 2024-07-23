public class File extends AbstractTDA {

    //private int sommet = TDA_VIDE;
    private Noeud debut = null;
    private Noeud fin = null;

    public File(){
        super();
    }
    @Override
    public Object[] toArray() {

        Object[] tab = new Object[nbElements];

        Noeud temp = debut;
        for (int i = 0; i < nbElements; i++) {
            tab[i] = temp.element;
            temp = temp.suivant;
        }

       return tab;
    }

    @Override
    public void ajouter(Object element, int position) {

        ajouter(element);
    }

    @Override
    public void ajouter(Object element) {


            if (nbElements == 0) {
                debut = new Noeud(element, null);
                fin = debut;
            }
            else {
                fin.suivant = new Noeud(element, null);

                fin = fin.suivant;
            }
            nbElements++;
            aviserObservateurs();



    }

    @Override
    public Object supprimer(int position) {

        Object element = null;
        if (nbElements != 0) {

            element = debut.element;
            debut = debut.suivant;
            nbElements--;

            if(debut == null) {
                fin = null;
            }
            aviserObservateurs();
        }
        return null;
    }

    @Override
    public String getNom() {

        return "File";
    }

    @Override
    public Object getElement() {
        return null;
    }

    public int getPositionAjout() {
        return (int) fin.element;
    }

    public int getPositionRetrait() {
        return (int) debut.element;
    }
}
