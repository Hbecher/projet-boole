package fr.hbecher.boole.component.receiver;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Receiver;
import fr.hbecher.boole.component.connection.Output;

public class Led extends Receiver
{
	public Led(Circuit circuit, Output out)
	{
		super("Led", circuit);

		connect(0, out);
	}

	@Override
	public boolean getState(int port)
	{
		return getInput(0).getState();
	}
}