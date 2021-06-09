import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        X x = new Y();
        List<X> list1 = new ArrayList<>();

    }
}

class X{

}

class Y extends X{

}

class Info<T>{

}