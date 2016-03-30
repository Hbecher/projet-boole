package application.node.transformateur;

import application.node.Transformateur;

public class Non extends Transformateur
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
		return "Non";
	}

	@Override
	public int nb_sortie()
	{
		return 1;
	}

	@Override
	public int nb_entree()
	{
		return 1;
	}
}
