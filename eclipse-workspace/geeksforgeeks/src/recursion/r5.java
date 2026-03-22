package recursion;

import java.util.ArrayList;
import java.util.List;

public class r5 {

	static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int j=0;j<m;j++)
        {
            al.add(matrix[0][j]);
        }
        for(int i=1;i<n;i++)
        {
            al.add(matrix[i][m-1]);
        }
        for(int j=m-2;j>0 && (n-1)>0;j--)
        {
            al.add(matrix[n-1][j]);
        }
        for(int i=n-1;i>0 && (m-1)>0;i--)
        {
            al.add(matrix[i][0]);
        }
        return al;
    }

	final int MOD = (int)1e9 + 7;
    static int count(String s,int i,int c,List<Character> li)
    {
        int n=s.length();
        if(i==n)
        {
            return 1;
        }
        if(li.contains(s.charAt(i)))
        {
        	System.out.println(s.charAt(i));
            int a=li.indexOf(s.charAt(i));
            c=(2*i)-(2*a);
            return c*count(s,i+1,c,li);
        }
        System.out.println(s.charAt(i));
        li.add(s.charAt(i));
        c=2*(i+1);
        return c*count(s,i+1,c,li);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,m=3;
		int matrix[][] = {{1, 2, 3}};
		System.out.println(boundaryTraversal(matrix,n,m));
		System.out.println(Math.pow(2,3));
		List<Character> li=new ArrayList<>();
		li.add('a');
		li.add('b');
		li.add('c');
		System.out.println(li.indexOf('a'));
		System.out.println(count("aba",0,1,li));
		System.out.println("\\hi");
	}

}
