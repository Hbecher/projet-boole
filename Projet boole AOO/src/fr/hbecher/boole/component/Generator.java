package fr.hbecher.boole.component;

/**
 * Représente un générateur de niveau.<br />
 * Un générateur a typiquement une seule sortie eu aucune entrée.
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Receiver
 * @see fr.hbecher.boole.component.Transformer
 */
public abstract class Generator extends Component
{
	/**
	 * Constructeur d'un générateur.
	 *
	 * @see fr.hbecher.boole.component.Component#Component(String, Circuit, int, int)
	 */
	public Generator(String type, Circuit circuit, int inPorts, int outPorts)
	{
		super(type, circuit, inPorts, outPorts);
	}
}