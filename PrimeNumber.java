package javaMis;

public class PrimeNumber {

public static void main(String []arg){

int a=45;

for(int i=2;i<=45;i++){
	
if(a%i==0){
System.out.print("Number is not prime");
break;
}

if(a%i==1){
	
	System.out.print("number is prime");
}

}

}
}
