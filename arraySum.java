
public class arraySum {
	

	public int sumOfArray (Integer[] a,int index) {
		
		int sum;
		if (0 == index)
		{
			return a[0];
		}
			
		else {
			sum = sumOfArray(a, index-1) + a[index--];
			return sum;
		}
	
	}
}
