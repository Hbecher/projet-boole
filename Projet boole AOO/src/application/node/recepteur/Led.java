package application.node.recepteur;

import application.node.Recepteur;

public class Led extends Recepteur
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
