package fr.hbecher.boole.component.connection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.hbecher.boole.component.Component;

/**
 * Représente un port de sortie d'un composant.
 *
 * @see fr.hbecher.boole.component.connection.Input
 */
public class Output
{
	/**
	 * Le composant auquel appartient le port.
	 */
	private final Component owner;

	/**
	 * Le numéro du port.
	 */
	private final int port;

	/**
	 * La liste des ports d'entrée des composants connectés.<br />
	 */
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

	/**
	 * Retourne un aperçu des ports d'entrée connectés sous forme de liste non modifiable.
	 *
	 * @return les ports d'entrée connectés
	 */
	public List<Input> getDests()
	{
		return Collections.unmodifiableList(dests);
	}

	/**
	 * Renvoie l'état de la sortie.
	 *
	 * @return l'état de la sortie
	 */
	public boolean getState()
	{
		return owner.getState(port);
	}

	/**
	 * Indique si le port est connecté au port d'entrée {@code input}.
	 *
	 * @param port le port d'entrée
	 * @return Si le port est connecté ou non à {@code input}
	 */
	public boolean isConnected(Input port)
	{
		return dests.contains(port);
	}

	/**
	 * Indique si le port est connecté à un composant.
	 *
	 * @return Si le port est connecté
	 */
	public boolean isConnected()
	{
		return dests.size() > 0;
	}

	/**
	 * Connecte le port au port d'entrée {@code input}.
	 *
	 * @param input le port d'entrée
	 */
	public void connect(Input input)
	{
		if(!dests.contains(input))
		{
			dests.add(input);

			input.connect(this);
		}
	}

	/**
	 * Déonnecte le port du port d'entrée {@code input}.<br />
	 * ({@code input} est spécifié car le port peut être connecté à plusieurs composants différents, voire à plusieurs ports d'un même composant)
	 *
	 * @param input le port d'entrée
	 */
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
		return 31 * owner.hashCode();
	}
}
