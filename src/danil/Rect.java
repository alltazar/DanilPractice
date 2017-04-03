package danil;

import java.util.ArrayList;
import java.util.List;

public class Rect {
    private int h_;
    private int w_;

    Rect (int h, int w){
        h_ = h;
        w_ = w;
    }

    public int getH_(){
        return h_;
    }

    public int getW_(){
        return w_;
    }

    public int square(){
        return h_*w_;
    }

    public static int squareAll(Rect... rects){
        List<Integer> arr = new ArrayList<>();
        for (Rect r : rects){
            arr.add(r.square());
        }
        int allS = 0;
        for (int i = 0; i < rects.length; i++){
            allS += arr.get(i);
        }
        return allS;
    }

}
