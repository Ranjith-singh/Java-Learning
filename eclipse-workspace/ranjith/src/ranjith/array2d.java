package ranjith;
import java.util.Scanner;

public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int marks[][]= {{1,2,3,4,5},{6,7,8,9,0}};
		int marks[][]=new int[2][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
