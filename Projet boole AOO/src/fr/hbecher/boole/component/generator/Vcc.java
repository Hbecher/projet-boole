package fr.hbecher.boole.component.generator;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Generator;

public class Vcc extends Generator
{
	public Vcc(Circuit circuit)
	{
		super("Vcc", circuit);
	}

	@Override
	public boolean getState(int port)
	{
		return true;
	}
}