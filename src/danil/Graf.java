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

        boolean j = graf.pathFinder(1,3);
        System.out.println(j);

    }

    public static class Graf{

        public Map<Integer, Integer> graf = new HashMap<>();

        public void setGraf(Integer id_, Integer idSoseda){
            graf.put(id_, idSoseda);
        }

        public boolean pathFinder (int startId, int endId){
            Integer a = graf.get(startId);
            System.out.println(startId + "->" + a);
            if (a == endId){
                System.out.println("done!");
                boolean x = true;
                return x;
            } else {
                boolean x = false;
                pathFinder (a, endId);
                if (x = !false){
                    return x;
                }
                else {
                    return false;
                }
            }
        }
    }

}
