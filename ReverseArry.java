/**
 * Created by lenovo on 19/02/2021.
 */
public class ReverseArry {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6};
        System.out.print("[");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println ("]");
        System.out.print("[");
        for (int i =arr1.length-1;i>=0; i--) {
            System.out.print(arr1[i]+" ");

        }
        System.out.println("]");
    }
}
