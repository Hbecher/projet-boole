package fr.hbecher.boole.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un circuit logique.<br />
 * Un circuit contient plusieurs composants, dont un identifiant unique est attribué à leur création dans le circuit.
 * Un circuit peut être ouvert (ports de libre) ou fermé (tous les ports sont connectés à un composant du circuit).
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Composite
 */
public class Circuit
{
	private final List<Component> components = new ArrayList<>();
	private final String name;
	private int nextId = 0;

	public Circuit(String name)
	{
		this.name = name;
	}

	/**
	 * Ajoute un composant dans le circuit et renvoie son identifiant interne.
	 *
	 * @param component le composant
	 * @return L'identifiant attribué
	 */
	public int addComponent(Component component)
	{
		components.add(component);

		return nextId++;
	}

	/**
	 * Retire le composant du circuit, s'il est dans le circuit.
	 *
	 * @param component le composant
	 */
	public void removeComponent(Component component)
	{
		components.remove(component);
	}

	/**
	 * Exécute le circuit.
	 */
	public void run()
	{
		components.stream().filter(component -> component instanceof Generator).forEachOrdered(Component::update);
	}

	/**
	 * Indique si le circuit est ouvert ou fermé.
	 *
	 * @return Le type du circuit
	 */
	public boolean isClosed()
	{
		for(Component component : components)
		{
			if(!component.isAllConnected())
			{
				return false;
			}
		}

		return true;
	}

	public String getName()
	{
		return name;
	}
}