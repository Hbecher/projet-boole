package application.node;

import java.util.ArrayList;

public abstract class Recepteur implements Composite
{
	protected ArrayList<Boolean> entree = new ArrayList<Boolean>();
	
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
	
	public void entree(Boolean numero_port) {
		// TODO Auto-generated method stub
		entree.add(numero_port);
	}
}
