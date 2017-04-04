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
        
        TwoRect twoRect1 = new TwoRect(2,10,7,10);
        TwoRect twoRect2 = new TwoRect(6,6,4,5);

        System.out.println(TwoRect.checkRect(twoRect1,twoRect2));



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
