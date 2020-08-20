import java.util.*;
public class MissingNum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int counta = 0, ct=0,cc=0,cg =0;
		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i)=='A')
			{
				counta+=1;
			}
			else if(s.charAt(i)=='C')
			{
				cc++;
			}
			else if(s.charAt(i)=='T')
			{
				ct++;
			}
			else if(s.charAt(i)=='G')
			{
				cg++;
			}
		}
		if(counta>cc && counta >ct && counta > cg)
		{
			System.out.print(counta);
		}
		if(cc> counta && cc>ct && cc > cg)
		{
			System.out.print(cc);
		}
		if(ct>cc && ct>counta && ct > cg)
		{
			System.out.print(ct);
		}
		else 
		{
			System.out.print(cg);
		}
		
		
		 
		   
	}
}

