package fr.hbecher.boole.component.generator;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Generator;

/**
 * Représente un générateur d'état haut.
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Generator
 */
public class Vcc extends Generator
{
	public Vcc(Circuit circuit)
	{
		super("Vcc", circuit, 0, 1);
	}

	@Override
	public boolean getState(int port)
	{
		return port == 0;
	}
}