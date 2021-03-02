import java.util.Arrays;

/**
 * @Description: 插入排序
 * @Author: chenj
 * @Date: 2021/2/8
 **/
public class InsertionSort {

    public static void main(String[] args)
    {
        //给出无序数组
        int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };

        //输出无序数组
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        //输出有序数组
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr)
    {
        int len = arr.length;
        int temp = 0;

        for (int i = 1; i < len; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (arr[j] < arr[j - 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
