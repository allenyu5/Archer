package per.archer.sort;

public class SortUtil {
	public static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print(arr[arr.length - 1] + ";");
		System.out.println("");
	}

	public static int[] getSampleDataArray() {
		int[] arrayData = { 123, 32423, 345, 4, 654, 7, 658, 67, 9789, 78, 98909, 546, 57, 676, 56, 68, 67, 867, 436, 7,
				9789, 78978, 9, 67, 967, 9 };
		return arrayData;
	}
}
