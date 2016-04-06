package application;

public interface Composant
{
	
	
	
	/**
	 * numéro d'indentifiaction du composant
	 *
	 * @return numéro du composant
	 */
	public int numero_composant();

	/**
	 * chaîne de caractères identifiant le type du composant
	 *
	 * @return le type du composant, sous forme textuelle
	 */
	public String type_composant();

	/**
	 * nb de sortie du composant
	 *
	 * @return nb de sortie du composant
	 */
	public int nb_sortie();

	/**
	 * nb d'entrées du composant
	 *
	 * @return nb d'entrées du composant
	 */
	public int nb_entree();
	
	//en test 6 avril
	
	/**
	 * etat du composant
	 *
	 * @return etat du composant
	 */
	public int etat();
	
	/**
	 * changer l'�tat du composant
	 *
	 * @return rien
	 */
	public void changeretat(int nouvel_etat);
	//fin en test 6 avril
	
	
	/**
	 * donne le r�sultats du calcul effectu� par le composant
	 *
	 * @return r�sultat
	 */
	public boolean sortie();	
	
	
	
}
