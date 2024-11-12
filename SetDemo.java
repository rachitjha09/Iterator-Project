import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        /*Set<Integer> set=new TreeSet<>(
                Arrays.asList(600000, 70000, 8000, 9000, 1000)
        );
        set.add(1000);

         */

        Set<Integer> s1=new HashSet<>(Arrays.asList(1000,2000,3000));
        Set<Integer> s2=new HashSet<>(Arrays.asList(3000,4000,5000,6000));
        Set<Integer> set=new HashSet<>(s1);
        //To union -->set.addAll(s2);
        set.retainAll(s2); //<--to see the intersection



        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}