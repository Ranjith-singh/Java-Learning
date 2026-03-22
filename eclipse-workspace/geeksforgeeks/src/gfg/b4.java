package gfg;

import java.util.*;

public class b4 {
	
	public static ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        int si=0,ei=n,mid;
        int st=-1,ed=-1;
        ArrayList<Integer> a=new ArrayList<>();
        while(si<ei)
        {
            mid=(si+ei)/2;
            if(arr[mid]==x)
            {
                for(int i=si;i<ei;i++)
                {
                    if(arr[i]==x)
                    {
                        if(st==-1)
                        {
                            st=i;
                            ed=i;
                        }
                        else
                        {
                            ed=i;
                        }
                    }
                }
                break;
            }
            else if(arr[mid]<x)
            {
                si=mid+1;
            }
            else
            {
                ei=mid;
            }
        }
        a.add(st);
        a.add(ed);
        return a;
    }
	
	public static void maxand(int a[])
	{
		int n=a.length,max=0;
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if((a[i]&(a[i]-1))!=0)
			{
				for(int j=0;j<i;j++)
				{
					if((a[i]&a[j])>max)
					{
						max=(a[i]&a[j]);
					}
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,6,6,6,7,7,7,8};
		System.out.println(find(arr,arr.length,8));
		int a[]= {4,8,18,16};
		maxand(a);
		char c='c'+1;
		System.out.println(c);
	}

}
