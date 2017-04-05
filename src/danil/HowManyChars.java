package danil;

public class HowManyChars {

    public double howManyChars(String s, char c) {
        double count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            }
        }
        double result = count/s.length();
        return result;
    }
}
