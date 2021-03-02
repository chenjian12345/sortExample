import java.util.Arrays;

/**
 * @Description: 冒泡排序
 * @Author: chenj
 * @Date: 2021/2/8
 **/
public class BubbleSort {

    public static void main(String[] args)
    {
        //给出无序数组
        int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };

        //输出无序数组
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        //输出有序数组
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr)
    {
        int len = arr.length;
        int temp = 0;

        for (int i = 1; i < len; i++)
        {
            boolean hasChange = false;
            for (int j = 0; j < len - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    hasChange = true;
                }
            }

            if (!hasChange)
            {
                break;
            }
        }

    }
}
