package fr.hbecher.boole.component;

public abstract class Generator extends Component
{
	public Generator(String type, Circuit circuit)
	{
		super(type, circuit, 0, 1);
	}
}