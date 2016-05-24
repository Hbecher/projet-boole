package fr.hbecher.boole.component.receiver;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Receiver;
import fr.hbecher.boole.component.connection.Output;

/**
 * Représente un récepteur simple affichant l'état de son entrée.
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Receiver
 */
public class Led extends Receiver
{
	public Led(Circuit circuit, Output out)
	{
		super("Led", circuit, 1, 0);

		connect(0, out);
	}

	@Override
	public boolean getState(int port)
	{
		return getInput(0).getState();
	}
}