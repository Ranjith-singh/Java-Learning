package array;

public class a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,5,7,9,11,12},
					{6,10,12,13,14,15},
					{9,25,29,30,31,32},
					{15,55,59,63,64,65}};
		int b=0,c=a[b].length,d=a.length;
	while(b<c && b<d)
	{
		for(int i=b;i<c;i++)
		{
			System.out.print(a[b][i]+" ");
		}
		for(int i=b+1;i<d;i++)
		{
			System.out.print(a[i][c-1]+" ");
		}
		for(int i=c-2;i>=b;i--)
		{
			System.out.print(a[d-1][i]+" ");
		}
		for(int i=d-2;i>b;i--)
		{
			System.out.print(a[i][b]+" ");
		}
		b++;
		c--;
		d--;
		}
	}
	}

