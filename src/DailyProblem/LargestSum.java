package DailyProblem;

public class LargestSum {

	public static void main(String[] args) {
		int arr[]= {5,1,1,5};
		int sum = findLargestSum(arr);
		System.out.println(sum);

	}

	private static int findLargestSum(int[] arr) {
		int sum =arr[0];
		for(int i =1;i<arr.length-1;i++)
		{
			if(arr[i+1]>arr[i])
			{
				sum =sum+arr[i+1];
			}
		}
		return sum;
	}

}
