package fr.hbecher.boole.component;

public abstract class Receiver extends Component
{
	public Receiver(String type, Circuit circuit)
	{
		super(type, circuit, 1, 0);
	}
}