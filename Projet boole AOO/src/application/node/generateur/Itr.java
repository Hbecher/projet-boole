package application.node.generateur;

import application.node.Generateur;

public class Itr extends Generateur
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
		return "Itr";
	}

	@Override
	public int nb_sortie()
	{
		return 1;
	}

	@Override
	public int nb_entree()
	{
		return 0;
	}
	
	//en test 6 avril
	public int sortie()
	{
		return 1;
	}
	//fin en test 6 avril
}
