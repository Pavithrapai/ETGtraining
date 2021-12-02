package com.sonata;

public class IdentifyTwoLargeNum {
	public static void main(String args[])
	{
		int arr[] = {10,40,60,20,30,80};
		int lar1=arr[0];
		int lar2=arr[1];
		int temp;
		//System.out.println(:)
		for(int i=0;i<arr.length;i++)     
        {
             if(lar1<lar2)
                {
                    temp=lar1;
                    lar1=lar2;
                    lar2=temp;
                }
              for(i=2;i<arr.length;i++)
             {
               if (arr[i] > lar1)
			   {
				lar2 = lar1;
				lar1 = arr[i];
			   }
			  else if (arr[i] > lar2 && arr[i] != lar1)
			   {
				lar2 = arr[i];
			   }
             }
        }
        System.out.println("First Largest is "+lar1);    
        System.out.println("Second Largest is "+lar2);  
        
	}
}

