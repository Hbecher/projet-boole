package application.node.generateur;

import application.node.Generateur;

public class Gnd extends Generateur
{
	private int numero_composant;

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
		return "Gnd";
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
	public int sortie()
	{
		return 0;
	}
	//fin en test 6 avril
}
