package application.node.recepteur;

import application.node.Recepteur;

public class Led extends Recepteur
{
	private int numero_composant;
	//en test 6 avril
	private int etat;
	//fin en test 6 avril

	@Override
	public boolean teste()
	{
		return false;
	}

	@Override
	public int numero_composant()
	{
		return numero_composant;
	}

	@Override
	public String type_composant()
	{
		return "Led";
	}

	@Override
	public int nb_sortie()
	{
		return 0;
	}

	@Override
	public int nb_entree()
	{
		return 1;
	}
	
	//en test 6 avril
	public int entree(int numero_port,int nouvel_etat)
	{
		if (nouvel_etat == 1) {etat = 1; return 1;};
		if (nouvel_etat == 0) {etat = 0; return 0;} else {return 0;}
	}
	
	public int etat()
	{
		if (etat == 1) {return 1;} else {return 0;}
	}
	//fin en test 6 avril
}
