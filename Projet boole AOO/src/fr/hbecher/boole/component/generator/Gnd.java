package fr.hbecher.boole.component.generator;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Generator;

public class Gnd extends Generator
{
	public Gnd(Circuit circuit)
	{
		super("Gnd", circuit);
	}

	@Override
	public boolean getState(int port)
	{
		return false;
	}
}