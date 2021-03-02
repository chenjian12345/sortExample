import java.util.Arrays;

/**
 * @Description: 希尔排序
 * @Author: chenj
 * @Date: 2021/2/8
 **/
public class ShellSort {

    public static void main(String[] args)
    {
        //给出无序数组
        int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };

        //输出无序数组
        System.out.println(Arrays.toString(arr));

        shellSort(arr);

        //输出有序数组
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr)
    {
        int len = arr.length;
        int temp = 0;

        for (int gap = (int) Math.floor(len / 2); gap > 0; gap = (int) Math.floor(gap / 2))
        {
            for (int i = 0; i < len; i++)
            {
                while (i + gap < len && arr[i] > arr[i + gap])
                {
                    temp = arr[i + gap];
                    arr[i + gap] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
