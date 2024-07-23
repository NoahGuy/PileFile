public interface InterfaceTDA {

    public Object[] toArray();

    public void ajouter(Object element, int position);
    public void ajouter(Object element);

    public Object supprimer(int position);

    public boolean estVide();

    public int getNbElements();

    public String getNom();
    public Object getElement();
}
