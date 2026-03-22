package functions;

import java.util.*;

public class f3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no's \n if enough enter break");
		int pos=0,neg=0,zeros=0;
		for(;;)
		{
			String a=sc.next();
			if(a.toLowerCase().equals("break"))
			{
				sc.close();
				break;
			}
			else if((Integer.valueOf(a))>0)
			{
				pos++;
			}
			else if((Integer.valueOf(a))<0)
			{
				neg++;
			}
			else
			{
				zeros++;
			}
		}
		System.out.println("The no of positive no's are "+pos);
		System.out.println("The no of negetive no's are "+neg);
		System.out.println("The no of zeros no's are "+zeros);
	}
}
