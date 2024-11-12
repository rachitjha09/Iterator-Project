import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> data =new ArrayList<>(Arrays.asList(2,1,7,3,4));
        for(int i = 0; i< data.size(); i++){
            System.out.println(data.get(i));
        }

        //loop again using an iterator
        Iterator<Integer> it= data.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}