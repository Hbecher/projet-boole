package fr.hbecher.boole.component;

import fr.hbecher.boole.component.connection.Input;
import fr.hbecher.boole.component.connection.Output;

/**
 * Représente un composant logique, c'est la brique de base.<br />
 * Un composant peut être élémentaire (générateur, récepteur ou transformateur) ou composite (constitué de plusieurs composants ou composites)<br />
 * Chaque composant dispose de plusieurs ports d'entrée et de sortie, ceux-ci pouvant être connectés à d'autres composants.
 *
 * @see fr.hbecher.boole.component.Composite
 * @see fr.hbecher.boole.component.Circuit
 */
public abstract class Component
{
	/**
	 * Le type de composant.
	 */
	private final String type;

	/**
	 * L'identifiant du composant dans le circuit.
	 */
	private final int id;

	/**
	 * Le circuit auquel appartient le composant.
	 */
	private final Circuit circuit;

	/**
	 * Les ports d'entrée.
	 */
	protected final Input[] inputs;

	/**
	 * Les ports de sortie.
	 */
	protected final Output[] outputs;

	/**
	 * Le constructeur d'un composant.
	 *
	 * @param type     le type de composant
	 * @param circuit  le circuit auquel il appartient
	 * @param inPorts  le nombre de ports d'entrée
	 * @param outPorts le nombre de ports de sortie
	 */
	public Component(String type, Circuit circuit, int inPorts, int outPorts)
	{
		this.type = type;
		this.circuit = circuit;

		inputs = new Input[inPorts];
		outputs = new Output[outPorts];

		for(int i = 0; i < inPorts; i++)
		{
			inputs[i] = new Input(this, i);
		}

		for(int i = 0; i < outPorts; i++)
		{
			outputs[i] = new Output(this, i);
		}

		id = circuit.addComponent(this);
	}

	public String getType()
	{
		return type;
	}

	public int getId()
	{
		return id;
	}

	public Circuit getCircuit()
	{
		return circuit;
	}

	public Input getInput(int port)
	{
		return inputs[port];
	}

	public int getNumberOfInputs()
	{
		return inputs.length;
	}

	public Output getOutput(int port)
	{
		return outputs[port];
	}

	public int getNumberOfOutputs()
	{
		return outputs.length;
	}

	/**
	 * Indique si tous les ports du composant sont connectés à un autre composant dans le circuit.
	 *
	 * @return {@code true} si tous les ports du composant sont connectés
	 */
	public boolean isClosed()
	{
		for(Input input : inputs)
		{
			if(!input.isConnected())
			{
				return false;
			}
		}

		for(Output output : outputs)
		{
			if(!output.isConnected())
			{
				return false;
			}
		}

		return true;
	}

	/**
	 * Indique aux composants connectés en aval que l'état a changé et doit être mis à jour.<br />
	 * Transmission de l'information dans le circuit.
	 */
	// TODO update()
	public void update()
	{

	}

	/**
	 * Retourne l'état du composant sur le port de sortie {@code port} donné.<br />
	 * Chaque composant élémentaire ou composite doit implémenter cette méthode.<br />
	 * Un composant élémentaire utilisera le langage hôte pour calculer son état.<br />
	 * Un composite utilisera un langage "circuit" en se servant des composants élémentaires qui le composent (le processus est récursif).
	 *
	 * @param port le port de sortie
	 * @return L'état du port
	 */
	public abstract boolean getState(int port);

	/**
	 * Connecte le port de sortie {@code localPort} au port d'entrée {@code input} du composant à connecter.
	 *
	 * @param localPort le port de sortie
	 * @param input     le port d'entrée du composant à connecter
	 */
	public final void connect(int localPort, Input input)
	{
		getOutput(localPort).connect(input);
	}

	/**
	 * Connecte le port d'entrée {@code localPort} au port de sortie {@code output} du composant à connecter.
	 *
	 * @param localPort le port d'entrée
	 * @param output    le port de sortie du composant à connecter
	 */
	public final void connect(int localPort, Output output)
	{
		getInput(localPort).connect(output);
	}

	/**
	 * Déonnecte le port d'entrée {@code localPort}.
	 *
	 * @param localPort le port d'entrée
	 */
	public final void disconnect(int localPort)
	{
		getInput(localPort).disconnect();
	}

	/**
	 * Connecte le port de sortie {@code localPort} du port d'entrée {@code input} du composant à déconnecter.<br />
	 * Le composant est spécifié car une sortie peut être connectée à plusieurs entrées.
	 *
	 * @param localPort le port de sortie
	 * @param input     le port d'entrée du composant à connecter
	 */
	public final void disconnect(int localPort, Input input)
	{
		getOutput(localPort).disconnect(input);
	}
}