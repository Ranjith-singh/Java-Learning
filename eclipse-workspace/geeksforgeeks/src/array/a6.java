package array;

public class a6 {

	public static int max_sub(int a[],int n)
	{
        int max=a[0],sum=a[0];
        for(int i=1;i<n;i++)
        {
        	sum=Math.max(a[i],sum+a[i]);
        	max=Math.max(max,sum);
        }
        return max;
	}

	public static int max_sub1(int a[],int n)
	{
        int max=a[0];
        for(int i=0;i<n;i++)
        {
        	int curr=0;
        	for(int j=i;j<n;j++)
        	{
        		curr=curr+a[j];
        		max=Math.max(max,curr);
        	}
        }
        return max;
	}
	public static int alternate(int a[],int n)
	{
		int max=1,sum=1;
		for(int i=1;i<n;i++)
		{
			if((a[i-1]%2==0 && a[i]%2!=0) || (a[i-1]%2!=0 && a[i]%2==0))
			{
				sum++;
				max=Math.max(max,sum);
			}
			else
			{
				sum=1;
			}
		}
		return max;
	}

	public static int cir_max(int a[],int n)
	{
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			int sum=a[i],res=a[i];
			for(int j=(i+1)%n;(j%n)!=i;j=(j+1)%n)
			{
				sum=Math.max(sum+a[j],a[j]);
				res=Math.max(res,sum);
			}
			max=Math.max(max,res);
		}
		return max;
	}

	public static int cir_max1(int a[],int n)
	{
		int max1=a[0],sum1=a[0];
		int min=a[0],sum2=a[0];
		int sum=a[0];
		for(int i=1;i<n;i++)
		{
			sum1=Math.max(sum1+a[i],a[i]);
			max1=Math.max(max1,sum1);
			sum2=Math.min(sum2+a[i],a[i]);
			min=Math.min(min,sum2);
			sum=sum+a[i];
		}
		if(max1<0)
		{
			return max1;
		}
		int max2=sum-min;
		return Math.max(max1,max2);
	}

	public static int cir_max2(int a[],int n)
	{
		int max1=max_sub(a,a.length);
		if(max1<0)
		{
			return max1;
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			a[i]=-a[i];
		}
		int max2=sum+max_sub(a,a.length);
		return Math.max(max1,max2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,2,4,-2,6,3};
		System.out.println(max_sub(a,a.length)+" "+max_sub1(a,a.length));
		int a1[]= {2,4,9,12,13};
		System.out.println(alternate(a1,a1.length));
		int a2[]= {-3,-4,-5};
		System.out.println(cir_max(a2,a2.length)+" "+cir_max1(a2,a2.length)+" "+cir_max2(a2,a2.length));
	}

}
