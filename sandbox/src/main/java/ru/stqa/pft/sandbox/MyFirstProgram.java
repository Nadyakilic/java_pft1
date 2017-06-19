package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexey");

    Square s= new Square(5);  //sozdali objekt square
    System.out.println("Ploshad kvadrata so storonoj " + s.l+ "=" + s.area ());//atribut s.l

    Rectangle r = new Rectangle(4, 6);// chast koda v kotoroj sozdayutsya objektu.
    System.out.println( "Ploshad pryamougolnika so storonami " + r.a + " i " +r.b + " = " + r.area());

  }

  public static void hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }


}









