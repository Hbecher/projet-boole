package application.node.recepteur;

import application.node.Recepteur;

public class Led extends Recepteur
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
}
