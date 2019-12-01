package per.archer.sort;


public class SortTest {
	
	public static void main(String[] args) {
		quickSortTest(getSampleDataArray());
	}
	
	private static void quickSortTest(int[] data) {
		SortUtil.displayArray(data);
		System.out.println("Test for quick test!");
		QuickSort.quickSort(data, 0, data.length-1);
		SortUtil.displayArray(data);
	}
	
	private static int[] getSampleDataArray() {
		int[] arrayData = {123,32423,345,4,654,7,658,67,9789,78,98909,546,57,676,56,68,67,867,436,7,9789,78978,9,67,967,9};
		return arrayData;
	}

}
