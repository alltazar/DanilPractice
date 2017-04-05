package danil;

public class Lines {
    private double x1_;
    private double y1_;
    private double x2_;
    private double y2_;

    Lines(double x1, double y1, double x2, double y2){
        x1_ = x1;
        y1_ = y1;
        x2_ = x2;
        y2_ = y2;
    }

    public static boolean dot(Lines line1, Lines line2){
        double u_a = (((line2.x2_ - line2.x1_)*(line1.y1_ - line2.y1_) - (line2.y2_ - line2.y1_)*(line1.x1_ - line2.x1_))/((line2.y2_ - line2.y1_)*(line1.x2_ - line1.x1_) - (line2.x2_ - line2.x1_)*(line1.y2_ - line1.y1_)));
        double u_b = (((line1.x2_ - line1.x1_)*(line1.y1_ - line2.y1_) - (line1.y2_ - line1.y1_)*(line1.x1_ - line2.x1_))/((line2.y2_ - line2.y1_)*(line1.x2_ - line1.x1_) - (line2.x2_ - line2.x1_)*(line1.y2_ - line1.y1_)));
        if ((line2.y2_ - line2.y1_)*(line1.x2_ - line1.x1_) - (line2.x2_ - line2.x1_)*(line1.y2_ - line1.y1_) == 0) {
            return false;
        } else if (((line2.y2_ - line2.y1_)*(line1.x2_ - line1.x1_) - (line2.x2_ - line2.x1_)*(line1.y2_ - line1.y1_) == 0) && (line2.x2_ - line2.x1_)*(line1.y1_ - line2.y1_) - (line2.y2_ - line2.y1_)*(line1.x1_ - line2.x1_) == 0){
            return true;
        } else if ((0 <= u_a && u_a <= 1)&&(0 <= u_b && u_b <= 1)){
            return true;
        } else {
            return false;
        }
    }

}


