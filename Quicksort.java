package assignment8;

public class Quicksort {
	
	    int numbers[];
	    int len;

	    public void sort(int Arr[]) 
	    {
	        if(Arr == null || Arr.length == 0 )   return;
	        numbers = Arr;
	        len = Arr.length;
	        rec_sort(0, len - 1);		
	    }

	    private void rec_sort(int low, int high) 	//Recursive Function
	    {
	        int i = low, j = high;
	        int pivot = numbers[low + (high-low)/2];
	        while (i <= j) 
	        {
	            while(numbers[i] < pivot)	i++;
	            while(numbers[j] > pivot)	j--;
	            if(i <= j) 
	            {
	            	int swap =  numbers[i];
	            	numbers[i] = numbers[j];
	            	numbers[j] = swap;
	                i++;
	                j--;
	            }
	        }
	        if(low < j)  rec_sort(low, j);
	        if(i < high)  rec_sort(i, high);
	    }
	    
	    public void display()			//Display Function
	    {
	    	if(numbers == null || numbers.length == 0 )  return;
	    	for(int i:numbers)	System.out.printf("%d ",i);
	    }

	}
	


