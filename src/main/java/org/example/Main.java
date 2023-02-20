package org.example;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");

        /*
        Расскажите про String в Java.

        В чем разница между == и equals()?

        Какая функция у оператора **return?**

        - Задача

          Необходимо реализовать следующий метод:

          1. Получаем на входе массив чисел.

          2. Все четные числа увеличиваем на единицу.

           3. Возвращаем кусок списка с 3-го по 7-й элемент.
          */

        int [] mass = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i;
        for (i = 0; i < mass.length; i++)
            if (mass[i] % 2 == 0)
                mass[i] = mass[i]++;
        for (i = 2; i < 7; i++)
            System.out.print(mass[i] + " ");

    }
}