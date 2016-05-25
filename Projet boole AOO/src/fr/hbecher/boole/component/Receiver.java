package fr.hbecher.boole.component;

/**
 * Représente un récepteur.<br />
 * Un récepteur a typiquement une seule entrée eu aucune sortie.
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Generator
 * @see fr.hbecher.boole.component.Transformer
 */
public abstract class Receiver extends Component
{
	/**
	 * Constructeur d'un récepteur.
	 *
	 * @see fr.hbecher.boole.component.Component#Component(String, Circuit, int, int)
	 */
	public Receiver(String type, Circuit circuit, int inPorts, int outPorts)
	{
		super(type, circuit, inPorts, outPorts);
	}
}