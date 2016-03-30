package application.node.generateur;

import application.node.Generateur;

public class Vcc extends Generateur
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
		return "Vcc";
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
}
