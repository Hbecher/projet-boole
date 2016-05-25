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
	/**
	 * L'état de l'interrupteur.
	 */
	private boolean state = false;

	public Itr(Circuit circuit)
	{
		this(circuit, false);
	}

	/**
	 * Constructeur permettant de définir l'état initial de l'interrupteur.
	 *
	 * @param state l'état initial
	 */
	public Itr(Circuit circuit, boolean state)
	{
		super("Itr", circuit, 0, 1);

		this.state = state;
	}

	/**
	 * Inverse l'état de l'interrupteur.
	 */
	public void toggleState()
	{
		setState(!state);
	}

	/**
	 * Définit le nouvel état de l'interrupteur.
	 *
	 * @param state le nouvel état
	 */
	public void setState(boolean state)
	{
		this.state = state;

		update();
	}

	@Override
	public boolean getState(int port)
	{
		return port == 0 && state;
	}
}