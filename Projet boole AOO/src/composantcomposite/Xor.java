package composantcomposite;

import composant.Transformateur;

public class Xor
{
	boolean a, b, s;

	public Xor(boolean e1, boolean e2)
	{
		a = e1;
		b = e2;
		Operation();
	}


	private void Operation()
	{
		//selection des portes logiques pour Xor
		Transformateur Add1 = new Transformateur("Add1", "Et");
		Transformateur Add2 = new Transformateur("Add2", "Et");
		Transformateur Non1 = new Transformateur("Non1", "Non");
		Transformateur Non2 = new Transformateur("Non2", "Non");
		Transformateur Or = new Transformateur("Or", "Ou");

		//cablage pour Xor
		Non1.relier(Add1, 1);
		Non2.relier(Add2, 2);
		Add1.relier(Or, 1);
		Add2.relier(Or, 2);

		//Entrée
		Non1.Entree1(a);
		Non2.Entree1(b);
		Add1.Entree2(b);
		Add2.Entree1(a);

		//Sortie
		s = Or.Sortie();
	}

	public boolean Sortie()
	{
		return s;
	}

}
