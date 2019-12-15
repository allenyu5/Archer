package per.archer.sort;

public class ShellSort {
	public static void main(String[] args) {
		int[] array = SortUtil.getSampleDataArray();
		SortUtil.displayArray(array);
		System.out.println("排序之后：");
		SortUtil.displayArray(sort(array));
	}
	
	public static int[] sort(int[] array) {
		// 希尔排序
		int gap = array.length;
		while (true) {
			gap /= 2; // 增量每次减半
			for (int i = 0; i < gap; i++) {
				for (int j = i + gap; j < array.length; j += gap) {// 这个循环里其实就是一个插入排序
					int temp = array[j];
					int k = j - gap;
					while (k >= 0 && array[k] > temp) {
						array[k + gap] = array[k];
						k -= gap;
					}
					array[k + gap] = temp;
				}
			}
			if (gap == 1)
				break;
		}
		return array;
	}

}
