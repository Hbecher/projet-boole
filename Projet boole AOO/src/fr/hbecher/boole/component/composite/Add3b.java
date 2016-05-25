package fr.hbecher.boole.component.composite;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Component;
import fr.hbecher.boole.component.Composite;
import fr.hbecher.boole.component.connection.Output;
import fr.hbecher.boole.component.transformer.And;
import fr.hbecher.boole.component.transformer.Or;

public class Add3b extends Composite
{
	private final Component c1, c2;

	public Add3b(Circuit circuit, Output out1, Output out2, Output out3)
	{
		super("Add3b", circuit, 3, 2);

		connect(0, out1);
		connect(1, out2);
		connect(2, out3);

		Xor xor = new Xor(internal, out1, out2);

		c1 = new Or(internal, new And(internal, xor.getOutput(), out3).getOutput(), new And(internal, out1, out2).getOutput());
		c2 = new Xor(internal, xor.getOutput(), out3);
	}

	@Override
	public boolean getState(int port)
	{
		return port == 0 ? c1.getState() : port == 1 && c2.getState();
	}
}
