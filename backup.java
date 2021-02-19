/**
 * Created by lenovo on 19/02/2021.
 */
public class backup {
    int[] a ={1,2,3,4,5,6,7,8,9,10};
    int [] c=new int[a.length];
    public void  print() {

        System.out.print("[");
        for (int i = 0; i <c.length ; i++) {

            if (i == c.length - 1)
                System.out.print(c[i]);
            else
                System.out.print(c[i] + ",");

        }
        System.out.println("]");
    }
    public void backup(){
        for (int i = 0; i <c.length ; i++) {
            c[i] = a[i];
        }
    }

    public static void main(String[] args) {
        backup n= new backup();
        n.print();
        n.backup();
        n.print();

    }

}
