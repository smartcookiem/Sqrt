package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int minNumber, int maxNumber) {
        int count = 0;

        for (int i = 10; i <= 90; i++) {
            if ((i * i >= minNumber) && (i * i <= maxNumber)) {
                count++;
            }
        }
        return count;
    }
}
