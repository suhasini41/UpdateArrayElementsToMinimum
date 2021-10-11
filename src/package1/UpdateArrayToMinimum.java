package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateArrayToMinimum
{
	private int findMinimumChange(int[] a) {
		int size = a.length;
		int sum1 = 0;
		int sumOfArr =0;
		for(int n : a)
		{
			sum1 = sum1 + n;
		}
		System.out.println(sum1);
		int i=1;
		while(true)
		{
			sumOfArr = i * size;
			if(sumOfArr>sum1)
			{
				sumOfArr = i;
				break;
			}
			i++;
		}
		return sumOfArr;
	}
	@Test
	public void testCase1()
	{
		int[] a = {1,2,3,4,5};
		Assert.assertEquals(findMinimumChange(a), 4);
	}
	@Test
	public void testCase2()
	{
		int[] a = {1,1,2,1};
		Assert.assertEquals(findMinimumChange(a), 2);
	}
	@Test
	public void testCase3()
	{
		int[] a = {0,0,0,0,9};
		Assert.assertEquals(findMinimumChange(a), 2);
	}
	

}
