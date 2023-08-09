package planetDefender;


import math.Vector2D;

public class Main {

    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(2, 2);
        Vector2D v2 = new Vector2D(5, 3);
        Vector2D v3 = new Vector2D(7, 4);
        Vector2D v4 = new Vector2D(1, 6);


        v1.rotate(-45);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

    }

}
