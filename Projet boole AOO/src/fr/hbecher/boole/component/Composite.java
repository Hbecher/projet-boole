package fr.hbecher.boole.component;

/**
 * Représente un composant composite.<br />
 * Un composant composite est un composant constitué de composants élémentaires et/ou de composants composites. On peut le voir comme un circuit<br />
 * Cette classe permet de "manipuler un circuit comme un composant".
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Circuit
 */
public abstract class Composite extends Component
{
	/**
	 * Le circuit interne du composite.
	 */
	protected final Circuit internal;

	public Composite(String type, Circuit circuit, int inPorts, int outPorts)
	{
		super(type, circuit, inPorts, outPorts);

		internal = new Circuit(type + "-internal");
	}
}