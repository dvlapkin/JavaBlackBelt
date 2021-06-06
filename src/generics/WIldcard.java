import java.util.ArrayList;
import java.util.List;

public class WIldcard {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
       //list.add(5);

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListing(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("nok");
        list2.add("kok");
        showListing(list2);
    }
    static void showListing(List<?> list){
        System.out.println("list: "+list);
    }


}
