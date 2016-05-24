package composant;

public class Generateur implements Porte
{

	boolean s;
	int i;
	String nom;
	String type;
	String mode;
	Porte porte;

	public Generateur(String nom, String type)
	{
		this.nom = nom;
		this.type = type;
		Operation();
	}

	public Generateur(String nom, String type, String mod)
	{
		this.nom = nom;
		this.type = type;
		this.mode = mod;
		Operation();
	}

	private void Operation()
	{
		boolean b = s;
		if(type.equals("Gnd"))
		{
			s = true;
			mode = "Haut";
		}
		if(type.equals("Itr"))
		{
			s = mode.equals("Haut");
		}
		if(type.equals("Vcc"))
		{
			s = false;
			mode = "Bas";
		}
		if(b != s)
		{
			if(i == 1)
			{
				porte.Entree1(s);
			}
			if(i == 2)
			{
				porte.Entree2(s);
			}
		}
	}

	public void relier(Porte porte, int n)
	{
		this.porte = porte;
		i = n;
	}

	public void mode()
	{
		System.out.println("Mode de la sortie du g�n�rateur " + nom + " : " + s);
	}

	@Override
	public void Entree1(boolean e)
	{
		// TODO Auto-generated method stub
		System.out.println("Erreur: Entr�e dans un g�n�rateur");
	}

	@Override
	public void Entree2(boolean e)
	{
		System.out.println("Erreur: Entr�e dans un g�n�rateur");
		// TODO Auto-generated method stub

	}

	public boolean Sortie()
	{
		return s;
	}
}
