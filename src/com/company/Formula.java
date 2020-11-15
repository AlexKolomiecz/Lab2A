package com.company;

import static java.lang.Math.*;

public class Formula {
    private Double sum;
    // Формула №1 для расчёта
    public Double calculate1(Double x, Double y, Double z) {
        return sin(log(y)+sin(PI*y*y))*pow(x*x+sin(z)+pow(E,cos(z)), 0.25);
    }
    // Формула №2 для расчёта
    public Double calculate2(Double x, Double y, Double z) {
        return pow(E, 0.5*x)/(sqrt(z+y)*log(pow(x, z)));
    }
    //Геттер для sum
    public Double Get() {
        return sum;
    }
    //Сеттер для sum
    public void Set(Double x) {
        sum = x;
    }
    //Прибавление результата к сумме
    public void Sum(Double result) {
        sum += result;
    }

    public Formula() {
        sum = 0.0;
    }
}
