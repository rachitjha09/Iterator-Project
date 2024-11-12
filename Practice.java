import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<Integer> data =new ArrayList<>(Arrays.asList(2,1,7,3,4,6,4,3,1,2,9,11,13,14));
        for(int i = 0; i< data.size(); i++){
            System.out.print(data.get(i) + " ");
        }
        System.out.println();

        //loop again using an iterator
        Set<Integer> set= new HashSet<>(data);
        data=new ArrayList<>(set);
        Iterator<Integer> it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}