import java.util.*;
public class Exercise26 {
    public static void main(String[] args) throws Exception {
        int[] array_nums = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        int i = 0;
        for (int j = 0, l = array_nums.length; j < l;) {
            if (array_nums[j] == 0)
                j++;
            else {             
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
                j++;
            }
        }

       
        while (i < array_nums.length)
            array_nums[i++] = 0;

        System.out.print("\n the array: \n");
        for ( i=0;i< array_nums.length;i++)
            System.out.print(array_nums + "  ");
        System.out.print("\n");
    }
}
