package fr.hbecher.boole.component;

import fr.hbecher.boole.component.connection.Input;
import fr.hbecher.boole.component.connection.Output;

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
	protected final Input[] internalInputs;
	protected final Output[] internalOutputs;

	public Composite(String type, Circuit circuit, int inPorts, int outPorts)
	{
		super(type, circuit, inPorts, outPorts);

		internal = new Circuit(type + "-internal");
		internalInputs = new Input[outPorts];
		internalOutputs = new Output[inPorts];

		for(int i = 0; i < outPorts; i++)
		{
			internalInputs[i] = new Input(this, i);
		}

		for(int i = 0; i < inPorts; i++)
		{
			internalOutputs[i] = new Output(this, i);
		}
	}

	protected void connectInternal(int localPort, Input input)
	{
		getOutput(localPort).connect(input);
	}

	protected void connectInternal(int localPort, Output output)
	{
		getInput(localPort).connect(output);
	}

	protected void disconnectInternal(int localPort)
	{
		getInput(localPort).disconnect();
	}

	protected void disconnectInternal(int localPort, Input input)
	{
		getOutput(localPort).disconnect(input);
	}
}