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
}
