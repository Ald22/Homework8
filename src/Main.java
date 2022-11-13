public class Main {
    public static void main(String[] args) {
        int [] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }
        // Домашнее задание
        System.out.println("Домашнее задание");
        // Задача 1
        System.out.println("Задача 1.1");

        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weight[i]);
        }

        //Задача 1.2
        System.out.println("Задача 1.2");
        double [] arr = { 1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        //Задача 1.3
        System.out.println("Задача 1.3");
        double [] myWeight = new double [4];
        myWeight [0] = 72.2;
        myWeight [1] = 70.5;
        myWeight [2] = 68;
        myWeight [3] = 66.5;
        for (int my = 0; my < myWeight.length; my++) {
            System.out.println(myWeight[my]);

        }

        // Задача 2
        System.out.println("Задача 2.1");
        System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);

        System.out.println("Задача 2.2");
        System.out.println(arr [0] + ", " + arr[1] + ", " + arr[2]);

        System.out.println("Задача 2.3");
        System.out.println(myWeight [0] + ", " + myWeight[1] + ", " + myWeight[2] + ", " + myWeight[3]);

        // Задача 3
        System.out.println("Задача 3.1");
        System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);

        System.out.println("Задача 3.2");
        System.out.println(arr [2] + ", " + arr[1] + ", " + arr[0]);

        System.out.println("Задача 3.3");
        System.out.println(myWeight[3] + ", " + myWeight[2] + ", " + myWeight[1] + ", " + myWeight[0]);

        // Задача 4
        System.out.println("Задача 4");
        int [] weight2 = new int [] {1, 2 , 3};
        weight2 [0] = 1;
        weight2 [1] = 2;
        weight2 [2] = 3;
        for (int a = 0; a < 3; a++) {
            if (a % 2 == 0) {
                a++;
                System.out.println(a+1);
            }
        }






    }


    }
