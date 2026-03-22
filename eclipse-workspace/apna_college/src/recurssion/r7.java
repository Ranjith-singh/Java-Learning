package recurssion;

public class r7 {
	
	public static void towerofhonoi(int n,String s,String h,String d)
	{
		if(n==1)
		{
			System.out.println("move the disk from "+s+" to "+d);
			return;
		}
		towerofhonoi(n-1,s,d,h);
		System.out.println("move the disk from "+s+" to "+d);
		towerofhonoi(n-1,h,s,d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		String s="source",h="helper",d="dest";
		towerofhonoi(n,s,h,d);
	}

}
