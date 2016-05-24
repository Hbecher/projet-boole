package fr.hbecher.boole.component.connection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.hbecher.boole.component.Component;

public class Output
{
	private final Component owner;
	private final int port;
	private final List<Input> dests = new ArrayList<Input>();

	public Output(Component owner, int port)
	{
		this.owner = owner;
		this.port = port;
	}

	public Component getOwner()
	{
		return owner;
	}

	public int getPort()
	{
		return port;
	}

	public List<Input> getDests()
	{
		return Collections.unmodifiableList(dests);
	}

	public boolean getState()
	{
		return owner.getState(port);
	}

	public boolean isConnected(Input port)
	{
		return dests.contains(port);
	}

	public boolean isConnected()
	{
		return dests.size() > 0;
	}

	public void connect(Input input)
	{
		if(!dests.contains(input))
		{
			dests.add(input);

			input.connect(this);
		}
	}

	public void disconnect(Input input)
	{
		if(dests.contains(input))
		{
			input.disconnect();

			dests.remove(input);
		}
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}

		if(!(o instanceof Output))
		{
			return false;
		}

		Output that = (Output) o;

		return owner.equals(that.getOwner()) && dests.equals(that.getDests());
	}

	@Override
	public int hashCode()
	{
		return owner.hashCode() + dests.hashCode();
	}
}
