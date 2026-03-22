package ranjith;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=0;
		System.out.println("number from 1 to 10 ");
		/* while loop
		while(a<10)
		{
			System.out.println(++a);
			
		}
		#do while
		do
		{
			System.out.println(++a);
		}while(a<10);*/
		for(int i=0;i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
			
		}
	}

}
