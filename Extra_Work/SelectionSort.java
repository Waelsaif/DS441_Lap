package Extra_Work;
class SelectionSort
{
	public void sort(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		{
			int minIndex = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[minIndex])
					minIndex = j;

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	void display(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {42,63,7,2,52,1};
		ob.sort(arr);
		System.out.println("Sorted array : ");
		ob.display(arr);
	}
}

