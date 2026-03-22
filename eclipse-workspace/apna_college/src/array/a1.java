package array;

public class a1 {

public static void main(String args[]) {
	int numbers[]= {1,2,3,4};
	int max = numbers[0];
	int min = numbers[0];
	for(int i=1; i<numbers.length; i++) {
	           if(numbers[i] < min) {
	               min = numbers[i];
	           }
	           if(numbers[i] > max) {
	               max = numbers[i];
	           }
	       }
	       System.out.println("Largest number is : " + max);
	       System.out.println("Smallest number is : " + min);
	   }

	}
