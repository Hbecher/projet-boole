package fr.hbecher.boole.component;

import fr.hbecher.boole.component.connection.Input;
import fr.hbecher.boole.component.connection.Output;

public abstract class Component
{
	private final String type;
	private final int id;
	private final Circuit circuit;
	protected final Input[] inputs;
	protected final Output[] outputs;

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

	public void update()
	{

	}

	public abstract boolean getState(int port);

	public final void connect(int localPort, Input input)
	{
		getOutput(localPort).connect(input);
	}

	public final void connect(int localPort, Output output)
	{
		getInput(localPort).connect(output);
	}

	public final void disconnect(int localPort)
	{
		getInput(localPort).disconnect();
	}

	public final void disconnect(int localPort, Input input)
	{
		getOutput(localPort).disconnect(input);
	}
}