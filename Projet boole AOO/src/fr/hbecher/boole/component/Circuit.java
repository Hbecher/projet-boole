package fr.hbecher.boole.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Circuit
{
	private final List<Component> components = new ArrayList<Component>();
	private final String name;
	private int nextId = 0;

	public Circuit(String name)
	{
		this.name = name;
	}

	public int addComponent(Component component)
	{
		components.add(component);

		return nextId++;
	}

	public void removeComponent(Component component)
	{
		components.remove(component);
	}

	public boolean isClosed()
	{
		for(Component component : components)
		{
			if(!component.isClosed())
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