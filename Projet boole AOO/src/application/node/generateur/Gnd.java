package application.node.generateur;

import application.node.Generateur;

public class Gnd extends Generateur
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
