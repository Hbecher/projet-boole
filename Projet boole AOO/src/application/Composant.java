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
	 * entrées du composant
	 *
	 * @return entrée du composant
	 */
	public int entree(int numero_port, int nouvel_etat);
	
	/**
	 * sorties du composant
	 *
	 * @return sortie du composant
	 */
	public int sortie(int numero_port);
	
	/**
	 * sorties du composant
	 *
	 * @return sortie du composant
	 */
	public int etat();
	//fin en test 6 avril
}
