package danil;

public class TwoRect {
    private double x_;
    private double y_;
    private double h_;
    private double w_;

    TwoRect(double x, double y, double h, double w){
        x_ = x;
        y_ = y;
        h_ = h;
        w_ = w;
    }

    public static boolean checkRect (TwoRect r1, TwoRect r2){
        if (r1.x_ + r1.w_ >= r2.x_ && r1.y_ - r1.h_ <= r2.y_) {
            return true;
        } else {
            return false;
        }
    }
}
