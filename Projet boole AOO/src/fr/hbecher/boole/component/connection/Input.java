package fr.hbecher.boole.component.connection;

import fr.hbecher.boole.component.Component;

public class Input
{
	private static final Output DISCONNECTED = new Output(null, 0)
	{
		@Override
		public void connect(Input input)
		{
		}

		@Override
		public void disconnect(Input input)
		{
		}
	};

	private final Component owner;
	private final int port;
	private Output source = DISCONNECTED;

	public Input(Component owner, int port)
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

	public Output getSource()
	{
		return source;
	}

	public boolean getState()
	{
		return isConnected() && source.getState();
	}

	public boolean isConnected()
	{
		return source != DISCONNECTED;
	}

	public void connect(Output output)
	{
		if(!output.equals(source))
		{
			disconnect();

			source = output;

			output.connect(this);
		}
	}

	public void disconnect()
	{
		if(isConnected())
		{
			source.disconnect(this);

			source = DISCONNECTED;
		}
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}

		if(!(o instanceof Input))
		{
			return false;
		}

		Input input = (Input) o;

		return owner.equals(input.getOwner()) && source.equals(input.getSource());

	}

	@Override
	public int hashCode()
	{
		return 31 * owner.hashCode() + source.hashCode();
	}
}
