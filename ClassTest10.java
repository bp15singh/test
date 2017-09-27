package javaMis;

public class ClassTest10 {
	public static void main (String []arg){
		
		Double 	object=new Double("2.4");
		
		int a=object.intValue();
		//System.out.println(a);
		byte b=object.byteValue();
		//System.out.println(b);
		float d=object.floatValue();
		//System.out.println(d);
		double c=object.doubleValue();
		//System.out.println(c);
		System.out.println(a+b+c+d);
	}

}
