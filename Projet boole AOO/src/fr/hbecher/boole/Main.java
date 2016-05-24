package fr.hbecher.boole;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.composite.Add3b;
import fr.hbecher.boole.component.generator.Itr;
import fr.hbecher.boole.component.receiver.Led;

public class Main
{
	public static void main(String[] args)
	{
		Circuit circuit = new Circuit("Main");

		Itr e1 = new Itr(circuit), e2 = new Itr(circuit), e3 = new Itr(circuit);

		Add3b add3b = new Add3b(circuit, e1.getOutput(), e2.getOutput(), e3.getOutput());

		Led led1 = new Led(circuit, add3b.getOutput(0)), led2 = new Led(circuit, add3b.getOutput(1));

		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				for(int k = 0; k < 2; k++)
				{
					System.out.println(e1.getState() + " " + e2.getState() + " " + e3.getState() + " -> " + led1.getState() + " " + led2.getState());

					e3.toggleState();
				}

				e2.toggleState();
			}

			e1.toggleState();
		}
	}
}
