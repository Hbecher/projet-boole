package application.node.generateur;

import application.node.Generateur;

public class Itr extends Generateur
{
	@Override
	public boolean teste()
	{
		return false;
	}

	@Override
	public int numero_composant()
	{
		return 0;
	}

	@Override
	public String type_composant()
	{
		return null;
	}

	@Override
	public int nb_sortie()
	{
		return 0;
	}

	@Override
	public int nb_entree()
	{
		return 0;
	}
}
