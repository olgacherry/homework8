import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] a = new int[12];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        double[] d = {1.57, 7.654, 9.986};
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);

        int[] c = {5, 58, 168, 987, 43, 641, 8751};
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println(c[3]);
        System.out.println(c[4]);
        System.out.println(c[5]);
        System.out.println(c[6]);
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] a = new int[12];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(a[0] + ",");
        System.out.print(a[1] + ",");
        System.out.print(a[2]);
        System.out.println();
        double[] d = {1.57, 7.654, 9.986};
        System.out.print(d[0] + ",");
        System.out.print(d[1] + ",");
        System.out.print(d[2]);
        System.out.println();
        int[] c = {5, 58, 168, 987, 43, 641, 8751};
        System.out.print(c[0] + ",");
        System.out.print(c[1] + ",");
        System.out.print(c[2] + ",");
        System.out.print(c[3] + ",");
        System.out.print(c[4] + ",");
        System.out.print(c[5] + ",");
        System.out.print(c[6]);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] a = new int[12];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(a[2] + ",");
        System.out.print(a[1] + ",");
        System.out.print(a[0]);
        System.out.println();
        double[] d = {1.57, 7.654, 9.986};
        System.out.print(d[2] + ",");
        System.out.print(d[1] + ",");
        System.out.print(d[0]);
        System.out.println();
        int[] c = {5, 58, 168, 987, 43, 641, 8751};
        System.out.print(c[6] + ",");
        System.out.print(c[5] + ",");
        System.out.print(c[4] + ",");
        System.out.print(c[3] + ",");
        System.out.print(c[2] + ",");
        System.out.print(c[1] + ",");
        System.out.print(c[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4");
        int[]arr = {1,2,3};
        for( int i = 0; i< arr.length; i++){
            if (arr[i] %2 !=0){
                arr[i]+=1;
                System.out.println(Arrays.toString(arr));

            }
        }




    }

}
