package ru.stqa.pft.sandbox;

/**
 * Created by Nadya on 6/19/2017.
 */
public class PointDistance {

  {
    public static double distance(double x1, double y1, double x2, double y2)
    {
      return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
    public static void main(String[] args)
    {
      double x2, x1, y2, y1;
      double distance;

      Distance d = new Distance();

      System.out.println("Ввести координату x для точки Point 1: ");
      x1 = d.nextDouble();

      System.out.println("Ввести координату y для точки Point 1: ");
      y1 = d.nextDouble();

      System.out.println("Ввести координату x для точки Point 2:");
      x2 = d.nextDouble();

      System.out.println("Ввести координату y для точки Point 2:" );
      y2 = d.nextDouble();

      distance = distance(x1,y1,x2,y2);

      System.out.println("The distance between the two points is " + distance + " .");

    }

  }


