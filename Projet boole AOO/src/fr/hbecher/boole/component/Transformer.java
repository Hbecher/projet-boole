package fr.hbecher.boole.component;

/**
 * Représente un transformateur.<br />
 * Un transformateur a un nombre variable d'entrées et de sorties, suivant le composant.<br />
 * Comme son nom l'indique, il va transformer le niveau qu'il reçoit suivant la fonction logique qu'il représente.
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Generator
 * @see fr.hbecher.boole.component.Receiver
 */
public abstract class Transformer extends Component
{
	/**
	 * @see fr.hbecher.boole.component.Component#Component(String, Circuit, int, int)
	 */
	public Transformer(String type, Circuit circuit, int inPorts, int outPorts)
	{
		super(type, circuit, inPorts, outPorts);
	}
}