package composant;

public class Recepteur implements Porte{
	boolean e;
	int i;
	String nom;
	String type;
	String mode;

	public Recepteur(String nom,String type){
		this.nom=nom;
		this.type=type;
	}

	public void Entr�e1(boolean e1){
		e=e1;
		this.Operation();	
	}
	
	public void Entr�e2(boolean e1){
		e=e1;
		this.Operation();	
	}
	
	private void Operation(){
		if(e==true)
			mode="Haut";
		else
			mode="Bas";
	}

	public void EtatLed(){
		System.out.println("Mode de la "+nom+" : "+mode);	
		
	}
}
