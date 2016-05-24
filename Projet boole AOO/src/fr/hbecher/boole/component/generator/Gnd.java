package fr.hbecher.boole.component.generator;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Generator;

/**
 * Représente un générateur d'état bas.
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Generator
 */
public class Gnd extends Generator
{
	public Gnd(Circuit circuit)
	{
		super("Gnd", circuit, 0, 1);
	}

	@Override
	public boolean getState(int port)
	{
		return false;
	}
}