import java.util.*;
public class WeirdAlgo {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long  n = sc.nextInt();
double num = Math.pow(10,6);
if (n == 1) {
	System.out.print(n);
	System.exit(0);

}
if(n > num)
{
	System.exit(0);
	}


System.out.print(n+" ");
while(n>=1)
{
	
if(n%2 == 0)
{
n = n/2;
System.out.print(n+" ");
}
else 
{
n =( n*3)+1;

System.out.print(n+" ");
}
if( n<=1) {
	System.exit(0);

}
}
}
}
	

	


