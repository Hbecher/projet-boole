package fr.hbecher.boole.component.connection;

import fr.hbecher.boole.component.Component;

/**
 * Représente un port d'entrée d'un composant.
 *
 * @see fr.hbecher.boole.component.connection.Output
 */
public class Input
{
	/**
	 * Valeur utilisée lorsque le port n'est pas connecté (pour ne pas mettre {@code null}).
	 */
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

	/**
	 * Le composant auquel appartient le port.
	 */
	private final Component owner;

	/**
	 * Le numéro du port.
	 */
	private final int port;

	/**
	 * Le port de sortie du composant connecté.
	 */
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

	/**
	 * Connecte le port au port de sortie {@code output}.
	 *
	 * @param output le port de sortie
	 */
	public void connect(Output output)
	{
		if(!output.equals(source))
		{
			disconnect();

			source = output;

			output.connect(this);
		}
	}

	/**
	 * Déonnecte le port de sortie.<br />
	 * (Aucun port spécifié car une entrée n'admet au plus qu'une connexion)
	 */
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
		return 31 * owner.hashCode();
	}
}
