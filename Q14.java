package javaMis;

public class Q14 {
	public int adder(int n){
		
		return 0x100 + n++;
	}


	public static void  main(String arg[]){
		
				Q14 obj=new Q14();
				int x=obj.adder(3);
		
	System.out.print(x);	
	}

}
