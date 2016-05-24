package fr.hbecher.boole.component.transformer;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Transformer;
import fr.hbecher.boole.component.connection.Output;

public class Not extends Transformer
{
	public Not(Circuit circuit, Output out)
	{
		super("Not", circuit, 1, 1);

		connect(0, out);
	}

	@Override
	public boolean getState(int port)
	{
		return !getInput(0).getState();
	}
}