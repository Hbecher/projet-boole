package composantcomposite;
import composant.Transformateur;
import composantcomposite.Xor;


public class Add3b {
	boolean e1,e2,e3,s1,s2;
	
	public Add3b(boolean a,boolean b,boolean c){
		e1=a;
		e2=b;
		e3=c;
		Operation();
	}
	
	private void Operation(){
		
		//Sortie 1
        //selection des portes logiques pour Add3b
		Xor xor1=new Xor(e1,e2);
		boolean temp = xor1.Sortie();
		Xor xor2=new Xor(temp,e3);
		
		//Sortie 1
		s1=xor2.Sortie();
		
		//Sortie 2
		//Selection des portes logiques pour Add3b
		Transformateur Add1=new Transformateur("Add1","Et");
		Transformateur Add2=new Transformateur("Add2","Et");
		Transformateur Or =new Transformateur("Or","Ou");
		
		Xor xor=new Xor(e1,e2);
		boolean temp0,temp1 = xor.Sortie();
		Add2.Entree1(temp1);
		Add2.Entree2(e3);
		temp1 = Add2.Sortie();
		
		Add1.Entree1(e1);
		Add1.Entree2(e2);
		temp0 = Add1.Sortie();
		
		//Sortie 2
		Or.Entree1(temp0);
		Or.Entree2(temp1);
		s2=Or.Sortie();

	}
	
	public boolean Sortie1(){
		return s1;
	}
		
	public boolean Sortie2(){
		return s2;
	}		
		
}
