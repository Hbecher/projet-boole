package fr.hbecher.boole.component.composite;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Composite;
import fr.hbecher.boole.component.connection.Output;
import fr.hbecher.boole.component.transformer.And;
import fr.hbecher.boole.component.transformer.Not;
import fr.hbecher.boole.component.transformer.Or;

/**
 * Représente le "ou exclusif" logique.<br />
 * C'est un composite : il s'exprime en fonction de deux "et", de deux "non" et d'un "ou".
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Composite
 */
public class Xor extends Composite
{
	/**
	 * Le composant qui contient le résultat de la fonction logique, en l'occurrence un "ou".
	 */
	private final Or xor;

	public Xor(Circuit circuit, Output out1, Output out2)
	{
		super("Xor", circuit, 2, 1);

		connect(0, out1);
		connect(1, out2);

		xor = new Or(internal, new And(internal, out1, new Not(internal, out2).getOutput(0)).getOutput(0), new And(internal, new Not(internal, out1).getOutput(0), out2).getOutput(0));
	}

	@Override
	public boolean getState(int port)
	{
		return xor.getState(0);
	}
}
