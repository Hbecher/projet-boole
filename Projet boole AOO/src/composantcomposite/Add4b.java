package composantcomposite;

public class Add4b {

boolean s1,s2,s3,s4;
	
public int Aff4bC2(boolean e1,boolean e2,boolean e3,boolean e4)
{
	int i2,i3,i4,res;

	if(e2==true) i2=4; else i2=0;
	if(e3==true) i3=2; else i3=0;
	if(e4==true) i4=1; else i4=0;
	
	if(e1==false) res = (i4+i3+i2);
	else res = -(9 - (i4+i3+i2));
	
	return res;
	
}

public void Gen4bC2(int i)
{
	if(i<0) s1=true; else s1=false;
	if (i<0)
		i=Math.abs(i);
		i=9-i;
	
	if(i-4>=0)
	{
		s2=true;
		i=i-4;
	}
	else s2=false;
	
	if(i-2>=0)
	{
		s3=true;
		i=i-2;
	}
	else s3=false;
	
	if(i-1>=0)
	{
		s4=true;
		i=i-1;
	}
	else s4=false;
	
}

}
