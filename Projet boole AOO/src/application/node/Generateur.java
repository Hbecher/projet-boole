package application.node;

import java.util.ArrayList;

public abstract class Generateur implements Composite
{
	protected ArrayList<Boolean> sortie = new ArrayList<Boolean>();
	
	protected int etat; //en attendant
	/**
	 * etat du composant
	 *
	 * @return etat du composant
	 */
	public int etat()
	{
		return etat;
	}
	
	public void changeretat(int nouvel_etat) //en attendant les précision
	{
		etat=nouvel_etat;
	}


	public void sortie(boolean numero_port) {
		// TODO Auto-generated method stub
		sortie.add(numero_port);
	}
}
