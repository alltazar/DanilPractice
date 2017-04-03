package danil;

import java.util.ArrayList;
import java.util.List;

public class Circle {
    private int r_;

    Circle (int r){
        r_ = r;
    }

    public int getR_(){
        return r_;
    }

    public double square(){
        return Math.PI*r_*r_;
    }

    public static double squareAll(Circle... circles){
        List<Double> arr = new ArrayList<>();
        for (Circle r : circles){
            arr.add(r.square());
        }
        int allS = 0;
        for (int i = 0; i < circles.length; i++){
            allS += arr.get(i);
        }
        return allS;
    }
}
