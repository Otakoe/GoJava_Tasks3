import java.util.ArrayList;
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
        int a,b,c,d;
        int len=0;
        Scanner sc = new Scanner(System.in);
        int []ar;
        ArrayList <Integer> massiv =new ArrayList <Integer>();
        while(true) {

 // ====  Вариант ввода без указания длины массива через ArrayList от 1: до 2: ======
            /*
    // 1:
            System.out.println("Введите числа. Для завершения ввода введите любое не число");
            while (sc.hasNextInt())
            {
                massiv.add(sc.nextInt());
            }
            len = massiv.size();
            ar=new int[len];
                    for (int i=0;i<len;i++)
                        ar[i]= massiv.get(i).intValue();

    // 2:
            */

 //  ==== Вариант вводе через запятую от 3: до 4:  ===================================
    // 3:
            System.out.println("Введите числа через какой-нибудь символ");
             String st = sc.nextLine();
             st= st.replaceAll("[^0-9,]", ",");
             //чтоб наверняка - пройдусь ещё раз если найдутся дубли запятых
            st= st.replaceAll(",,", ",");

            String []convert = st.split(",");
            System.out.println(convert.length);
            ar = new int[convert.length];
            len=0;
            for(String s:convert){
                System.out.println(s);
                ar[len]=Integer.parseInt(s);
                len++;
            }



            try {
                if(len>0){}
                else {
                    ar = new int[sc.nextInt()];
                    for (int i = 0; i < ar.length; i++)
                        ar[i] = Integer.parseInt(sc.next());
                }
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

                //Доп задание 1
                /*
                пример 2:
массив 1, 1, 1, 4, 6, 6.
Ответ - 3. Так как число 1 повторяется 3 раза. А число 6 повторяется 2 раза. Поскольку надо вывести максимум, выводим 3.

пример 3:
массив 2, 3, 3, 5, 5, 6
Ответ - 3. Так как 3 и 5 повторяются по 2 раза, неважно кого из них подсчитывать, цель - вывести максимум. В этом примере максимум повторений чисел является 2 раза.

                 */
                d=0;b=0;a=0;
                for(int i=0;i<ar.length-1;i++)
                {
                    c=0;
                    for(int k=i+1;k<ar.length;k++)
                    {
                        if(ar[i]==ar[k]) {
                            c++;
                            i++;
                        }
                    }
                    if(c>0){
                        b+=c;
                        if (c < a || a == 0)
                            a = c;
                    }
                    if(c>d)
                        d = c;



                }
                System.out.println("Наибольшее кол-во повторений одного числа "+(d+1));
                System.out.println("Кол-во повторений (дубликатов) чисел "+b);
                if(a>0)
                    System.out.println("Наименьшее кол-во поторений "+a);
                else
                    System.out.println("Все числа уникальные, повторений нет\n");

                //Доп задание 2
                /*

                 */

            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("неверный ввод\n");
            }



        }
    }

}
