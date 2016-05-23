package composant;

public class Transformateur implements Porte {

	boolean e1,e2,s;
	int i;
	String nom;
	String type;
	Porte porte;

	public Transformateur(String nom,String type){
		this.nom=nom;
		this.type=type;
	}

	public void Entree1(boolean e){
		e1=e;
		this.Operation();	
	}

	public void Entree2(boolean e){
		e2=e;
		this.Operation();
	}
	
	private void Operation(){
        boolean b;
		b=s;
		if(type.equals("Non ou")) s=!(e1||e2);
		if(type.equals("Non")) s=!e1;
		if(type.equals("Et")) s=(e1&&e2);
		if(type.equals("Ou")) s=(e1||e2);
		if(b!=s){
		if(i==1) porte.Entree1(s);
		if(i==2) porte.Entree2(s);
		}
	}

	public void niveau(){
		if(type.equals("Non")){
		 	System.out.println("Etat de l'entrée de la porte "+nom+" : "+e1);
		}
		else{
			System.out.println("Etat de l'entrée 1 de la porte "+nom+" : "+e1);
			System.out.println("Etat de l'entrée 2 de la porte "+nom+" : "+e2);	
		}
		System.out.println("Etat de la sortie de la porte "+nom+" : "+s);
	}

	public void relier(Porte porte,int n){
		this.porte=porte;
		i=n; 
	}

	public void niveauEntree1(){
		System.out.println("Etat de l'entrée 1 de la porte "+nom+" : "+e1);	
		
	}
	
	public void niveauEntree2(){
		System.out.println("Etat de l'entrée 2 de la porte "+nom+" : "+e2);	

	}
	
	public void niveauS(){
		System.out.println("Etat de la sortie de la porte "+nom+" : "+s);
	}

}

