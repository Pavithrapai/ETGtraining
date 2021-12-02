package com.sonata;

public class CountDuplicate {
		public static void main(String args[])
		{
			int arr[] = {1,2,3,4,5,2,8,6,6,7,4,3,1,1};
			int count=0;
			System.out.print("The number of duplicate elements in the array are: ");
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j]) 
					{
						  count++;
						  break;
					}
				}
	         }
			System.out.print(count);
}
}
