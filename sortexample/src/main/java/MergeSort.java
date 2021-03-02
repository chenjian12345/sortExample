import java.util.Arrays;

/**
 * @Description: 合并排序
 * @Author: chenj
 * @Date: 2021/2/8
 **/
public class MergeSort {

    public static void main(String[] args)
    {
        //给出无序数组
        int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };

        //输出无序数组
        System.out.println(Arrays.toString(arr));

        //输出有序数组
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr)
    {
        if (arr.length < 2)
        {
            return arr;
        }

        int len = arr.length;
        int middle = len / 2;
        int[] left = new int[middle];
        int[] right = new int[len - middle];
        System.arraycopy(arr, 0, left, 0, middle);
        System.arraycopy(arr, middle, right, 0, len - middle);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right)
    {
        int[] mergeArr = new int[left.length + right.length];
        int index = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length)
        {
            if (left[leftIndex] > right[rightIndex])
            {
                mergeArr[index++] = right[rightIndex++];
            }
            else
            {
                mergeArr[index++] = left[leftIndex++];
            }
        }

        while (leftIndex < left.length)
        {
            mergeArr[index++] = left[leftIndex++];
        }
        while (rightIndex < right.length)
        {
            mergeArr[index++] = right[rightIndex++];
        }

        return mergeArr;
    }
}
