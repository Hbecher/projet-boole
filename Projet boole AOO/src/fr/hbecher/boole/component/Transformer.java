package fr.hbecher.boole.component;

public abstract class Transformer extends Component
{
	public Transformer(String type, Circuit circuit, int inPorts, int outPorts)
	{
		super(type, circuit, inPorts, outPorts);
	}
}