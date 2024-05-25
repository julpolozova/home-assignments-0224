package ru.sberbank.jd.lesson02;

/**
 * Реализация интерфейса для определения наибольшего общего делителя двух целых чисел.
 */
public class NodImpl implements Nod {
    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель
     */
    public int calculate(int first, int second) {
        if (first == 0 || second == 0) {
            return 0;
        }
        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return first;
    }
}


