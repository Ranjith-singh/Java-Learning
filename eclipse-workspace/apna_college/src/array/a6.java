package array;

public class a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		int b=0,c=a[b].length,d=a.length;
		for(int i=b;i<c;i++)
		{
			System.out.print(a[b][i]+" ");
		}
		b++;
		for(int j=b;j<d;j++)
		{
			System.out.print(a[j][c-1]+" ");
		}
		c--;
		for(int i=c-1;i>b;i--)
		{
			System.out.print(a[d-1][i]+" ");
		}
	}

}
