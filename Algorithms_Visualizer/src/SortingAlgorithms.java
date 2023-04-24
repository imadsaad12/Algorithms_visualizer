import java.util.Arrays;

public class SortingAlgorithms {
	private int[] array;
	
	public SortingAlgorithms(int[] array) {
			this.array=array;
	}

	public void insertionSort() {
		System.out.println("Description : \n\nIn the implementation provided, the algorithm starts by iterating through the unsorted part of the array, assigning each element to a variable curr.\n\nThe algorithm then compares curr to the sorted elements in the array, moving them to the right until the correct position for curr is found."
				+ "\n\nThis is done by iterating backwards through the sorted elements and swapping curr with each element that is greater than it."
				+ " \n\nFinally, curr is inserted into its correct position in the sorted part of the array.\n");
	    for (int i = 0; i < array.length; i++) {
	        int curr = array[i];
	        int j = i - 1;

	        // draw the current state of the array
	        System.out.print("----------------------------------------------- Iteration "+i+" (i = "+i+") -----------------------------------------------\n \n \t \t \t \t \t");
	        for (int k = 0; k < array.length; k++) {
	            if (k == i) {
	                System.out.print(" |curr=" + array[k] + "| ");
	            } else if (k == j + 1) {
	                System.out.print(" |" + array[k] + "| ");
	            } else {
	                System.out.print("  " + array[k] + "  ");
	            }
	        }
	        System.out.println();

	        while (j >= 0 && array[j] > curr) {
	            array[j + 1] = array[j];

	            // draw the current state of the array with the swapped elements
	            System.out.print("\n\n\t    "+array[j]+" is greater than "+curr+" so swap ---->");
	            for (int k = 0; k < array.length; k++) {
	                if (k == i) {
	                    System.out.print(" |" + array[k] + "| ");
	                } else if (k == j + 1) {
	                    System.out.print("|curr=" + array[k] + "| ");
	                } else {
	                    System.out.print("  " + array[k] + "  ");
	                }
	            }
	            System.out.println();

	            j--;
	        }

	        array[j + 1] = curr;

	        // draw the current state of the array with the sorted element
	        System.out.print("\n \n  \t   Array after iteration "+i+" ---->");
	        for (int k = 0; k < array.length; k++) {
	            if (k == i) {
	                System.out.print(" |" + array[k] + "| ");
	            } else {
	                System.out.print("  " + array[k] + "  ");
	            }
	        }
	        System.out.println();
	        System.out.println();
	    }
	}

	public void selectionSort() {
		System.out.println("Description : \n\tFor each iteration, the current state of the array is logged with curr indicating the first element in the unsorted part and min indicating the minimum value in the unsorted part.\r\n"
				+ "\r\n"
				+ "\tWhen the minimum value is found in the unsorted part, a swap is performed between it and the current element in the sorted part. If no swap is needed, the logging indicates that the current element is already the minimum value.");
	    for (int i = 0; i < array.length - 1; i++) {
	        int minIndex = i;
	        System.out.print("----------------------------------------------- Iteration "+i+" (i = "+i+") -----------------------------------------------\n \n \t \t \t ");
	        for (int j = i + 1; j < array.length; j++) {
	        	System.out.print("\n\n \t \t \t\t \t");
	            // draw the current state of the array
	            for (int k = 0; k < array.length; k++) {

	                if (k == i) {
	                    System.out.print(" |curr=" + array[k] + "| ");
	                } else if (k == j) {
	                    System.out.print(" |" + array[k] + "| ");
	                } else if (k == minIndex) {
	                    System.out.print("|min=" + array[k] + "| ");
	                } else {
	                    System.out.print("  " + array[k] + "  ");
	                }
	            }


	            if (array[j] < array[minIndex]) {
	                minIndex = j;
	            }
	        }
	        if(minIndex!=i) {
	        	System.out.println("\n\n \t   ** Swapping **:  Minimum value in the unsorted part is ("+array[minIndex]+") so swapp it with the current value("+array[i]+")");
	        	int temp = array[minIndex];
	        	array[minIndex] = array[i];
	        	array[i] = temp;
	        }else {
	        	System.out.println("\n\n \t   ** No Swapping **: Since current element is the minimum no need to swap elements");
	        }

	        // draw the current state of the array after the swap
	        System.out.print("\n \n  \t   Array after iteration "+i+" ---->");
	        for (int k = 0; k < array.length; k++) {
	            if (k == i) {
	                System.out.print(" |" + array[k] + "| ");
	            } else {
	                System.out.print("  " + array[k] + "  ");
	            }
	        }
	        System.out.println();
	        System.out.println();
	    }
	}


	
}
