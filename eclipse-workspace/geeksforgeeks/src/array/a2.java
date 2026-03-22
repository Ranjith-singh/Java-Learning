package array;

import java.util.HashMap;

public class a2 {

	public static int romanToDecimal(String str)
    {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=str.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+map.get(str.charAt(i));
        }
        System.out.println(sum);
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!='I')
            {
                sum=sum-a;
            }
            else
            {
                a=a+2;
            }
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToDecimal("MMDCCCXCIII"));
	}

}
