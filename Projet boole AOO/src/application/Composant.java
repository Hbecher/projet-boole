package application;

public interface Composant
{
	
	
	
	/**
	 * numÃ©ro d'indentifiaction du composant
	 *
	 * @return numÃ©ro du composant
	 */
	public int numero_composant();

	/**
	 * chaÃ®ne de caractÃ¨res identifiant le type du composant
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
	 * nb d'entrÃ©es du composant
	 *
	 * @return nb d'entrÃ©es du composant
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
	 * changer l'état du composant
	 *
	 * @return rien
	 */
	public void changeretat(int nouvel_etat);
	//fin en test 6 avril
	
	
	/**
	 * donne le résultats du calcul effectué par le composant
	 *
	 * @return résultat
	 */
	public boolean sortie();	
	
	
	
}
