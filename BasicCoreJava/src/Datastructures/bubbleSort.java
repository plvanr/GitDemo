package Datastructures;

import java.lang.reflect.Array;

public class bubbleSort {
	
	void bubbleSort(int a[]) {
	
		int n = a.length; 
	
	for(int i=0;i<n-1;i++) 
	
		for (int j=0;j<n-i-1;j++) 
		
			if (a[j] > a[j+1]) 
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			printArray(a);
				
			}
	}
	
		 // Prints the array 
    void printArray(int a[]) 
    { 
    	int n = a.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(a[i] + " "); 
        System.out.println(); 
    } 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,7,3,2,9,5};
		int n=a.length;
		
		
		bubbleSort ob=new bubbleSort();
		int a1[]= {6,7,3,2,9,5};
		ob.bubbleSort(a1);
		ob.printArray(a1);

	}



		
	}


