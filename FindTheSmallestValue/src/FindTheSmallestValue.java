import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 2, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
//        int size;
//        int[] arr;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("enter a size");
//            size = sc.nextInt();
//            if (size > 20)
//                System.out.println("size does not exceed 20");
//        } while (size > 20);
//
//        //todo nhập giá trị cho các phần tử của mảng
//        arr = new int[size];
//        int i = 0;
//        while (i < arr.length) {
//            System.out.println("enter element " + (i + 1) + ": ");
//            arr[i] = sc.nextInt();
//            i++;
//        }
//
//        //todo in ra mảng đã nhập
//        System.out.printf("%-20s%s", "Elements in array: ", "");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + "\t");
//
//        }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
