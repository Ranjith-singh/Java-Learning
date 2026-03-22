package practice;

public class a16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[]= {2,1,4,3};
		int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < lsf)
            {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        System.out.println(op);
	}

}
