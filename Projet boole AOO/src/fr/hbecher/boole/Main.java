package fr.hbecher.boole;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Component;
import fr.hbecher.boole.component.composite.Xor;
import fr.hbecher.boole.component.generator.Gnd;
import fr.hbecher.boole.component.generator.Vcc;
import fr.hbecher.boole.component.receiver.Led;
import fr.hbecher.boole.component.transformer.Not;

public class Main
{
	public static void main(String[] args)
	{
		Circuit circuit = new Circuit("Main");

		Component e1 = new Gnd(circuit);
		Component e2 = new Vcc(circuit);

		Xor xor = new Xor(circuit, e1.getOutput(0), e2.getOutput(0));

		Not not = new Not(circuit, xor.getOutput(0));

		Led led = new Led(circuit, not.getOutput(0));

		// xnor
		System.out.println(led.getState(0));
		System.out.println(circuit.isClosed());
	}
}
