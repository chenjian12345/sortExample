import java.util.Arrays;

/**
 * @Description: 快速排序
 * @Author: chenj
 * @Date: 2021/2/8
 **/
public class QuickSort {

    public static void main(String[] args)
    {
        //给出无序数组
        int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };

        //输出无序数组
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        //输出有序数组
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int middle = sort(arr, low, high);

            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }
    }

    private static int sort(int[] arr, int low, int high)
    {
        int temp = arr[low];

        while (low < high)
        {
            while (low < high && arr[high] >= temp)
            {
                high--;
            }

            if (low < high)
            {
                arr[low++] = arr[high];
            }

            while (low < high && arr[low] <= temp)
            {
                low++;
            }

            if (low < high)
            {
                arr[high--] = arr[low];
            }
        }

        arr[high] = temp;
        return high;
    }

}
