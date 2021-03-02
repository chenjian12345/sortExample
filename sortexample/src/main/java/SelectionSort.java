import java.util.Arrays;

/**
 * @Description: 选择排序
 * @Author: chenj
 * @Date: 2021/2/8
 **/
public class SelectionSort {

    public static void main(String[] args)
    {
        //给出无序数组
        int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };

        //输出无序数组
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        //输出有序数组
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr)
    {
        int len = arr.length;
        int temp = 0;

        for (int i = 0; i < len - 1; i++)
        {
            int minIndex = i;
            temp = arr[i];
            for (int j = i + 1; j < len; j++)
            {
                if (arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }
            }

            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
