package fr.hbecher.boole.component.generator;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Generator;

/**
 * Représente un interrupteur.<br />
 * Celui-ci peut être manipulé dynamiquement via {@code togglestate()} et {@code setState(boolean)}.
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Generator
 */
public class Itr extends Generator
{
	private boolean state = false;

	public Itr(Circuit circuit, boolean initState)
	{
		super("Itr", circuit, 0, 1);

		state = initState;
	}

	public void toggleState()
	{
		setState(!state);
	}

	public void setState(boolean state)
	{
		this.state = state;
	}

	@Override
	public boolean getState(int port)
	{
		return state;
	}
}