import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(123);
        list.add(222);
        list.add(323);
        list.add(412);
        list.add(112);
        list.add(132);
        list.add(162);
        list.add(192);
    System.err.println("List :"+list);
   List<Integer> list2= list.stream().filter(num->{
        while(num > 1)
        {
            num = num/10;
        }
        if(num ==1) return true;
        return false;

    }).collect(Collectors.toList());
    System.out.println("List :"+ list2);
}

}