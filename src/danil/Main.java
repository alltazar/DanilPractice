package danil;

public class Main {

    public static void main (String[] args){

        Rect rect1 = new Rect(3, 7);
        Rect rect2 = new Rect(2, 4);
        Rect rect3 = new Rect(5, 5);

        System.out.println(Rect.squareAll(rect1,rect2,rect3));

        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(6);

        System.out.println(Circle.squareAll(circle1,circle2,circle3));

        Lines line1 = new Lines(2,6,7,1);
        Lines line2 = new Lines(2,3,7,8);

        System.out.println(Lines.dot(line1,line2));



//        Uzel u1 = new Uzel();
//        u1.setToArr(5);
//        u1.setToArr(1);
//        u1.setToArr(7);
//        u1.setToArr(5);
//
//        Uzel u2 = new Uzel();
//        u2.setToArr(2);
//        u2.setToArr(1);
//        u2.setToArr(0);
//        u2.setToArr(5);
//
//        //System.out.println(u1.arr);
//
//        u1.delToArr(5);
//
//        //System.out.println(u1.arr);
//        //System.out.println(u2.getArr());
//
//        Cont cont = new Cont();
//        cont.setToCont(1, u1);
//        cont.setToCont(2, u2);
//
//        System.out.println(cont.getCont());

    }

}
