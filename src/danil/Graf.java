package Book;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Graf graf = new Graf();
        graf.setGraf(1,4);
        graf.setGraf(2,5);
        graf.setGraf(3,null);
        graf.setGraf(4,2);
        graf.setGraf(5,3);

        graf.pathFinder(1,3);

    }
    
    public static class Graf{

        public Map<Integer, Integer> graf = new HashMap<>();

        public void setGraf(Integer id_, Integer idSoseda){
            graf.put(id_, idSoseda);
        }

        public boolean pathFinder (int startId, int endId){
            boolean x;
            Integer a = graf.get(startId);
            if (a == endId){
                x = true;
                return x;
            } else {
                pathFinder (a, endId);
                x = false;
                return x;
            }
        }
    }

}
