package ru.stqa.pft.sandbox;//opisivaet strukturu objekta, hranyashyu informaziyu o klassah.

/**
 * Created by Nadya on 6/16/2017.
 */
public class Square {
  public double l;// kvadrat opisivaetsya dlinoj ego storonu.

  public Square(double l) {// dobavlyaem konstruktor
    this.l = l;// v pervom sluchaem l eto atribut, a vo vtorom sluchae eto ta peremennaya, kot objyavlena kak argument funkzii.

  }

  public double area() {
    return this.l * this.l;//shtobu poluchit dostup k atributu objekta
  }
}
