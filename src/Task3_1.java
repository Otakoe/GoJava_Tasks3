import java.nio.channels.ScatteringByteChannel;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

        /*Написать программу которая:
        1. на вход через консоль принимает размер массива
        2. на вход через консоль принимает массив чисел (весь массив вводится в одну строку через пробел)
        3. найти минимальное число в массиве и вывести в консоль (без использования сортировки)
        4. найти максимальное число в массиве и вывести в консоль (без использования сортировки)
        5. посчитать кол-во повторений числа 5 и вывести в консоль
        6. вывести в консоль отсортированный массив*/

public class Task3_1 {
    public static void main(String[] args)  {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        int []ar;
        while(true) {
            try {
                ar = new int[sc.nextInt()];
                for (int i = 0; i < ar.length; i++)
                    ar[i] = Integer.parseInt(sc.next());
                //поиск наименьшего
                b=ar[0];
                for (int i=0;i<ar.length;i++){
                    a=ar[i];
                    if (b > a)
                        b = a;
                }
                System.out.println("Наименьшее число = "+b);
                //поиск наибольшего
                for(int i=0;i<ar.length;i++){
                    a=ar[i];
                    if(b<a)
                        b=a;
                }
                System.out.println("Наибольшее число = "+b);
                //колво повторений числа 5
                c=0;
                for(int i=0;i<ar.length;i++){
                    if(ar[i]==5)
                        c++;
                }
                System.out.println("Число 5 повторяется "+c+" раз");
                //вывод отсортированного массива
                Arrays.sort(ar);
                System.out.println("Отсортированный массив "+Arrays.toString(ar));

            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("неверный ввод");
            }

        }
    }

}
