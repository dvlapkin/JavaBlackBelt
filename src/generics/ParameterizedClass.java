public class ParameterizedClass {
    public static void main(String[] args){
        Pair<String, Integer> pair1= new Pair<>("hi",10);
        System.out.println(pair1.getValue1()+":"+pair1.getValue2());
        Pair<Double, Integer> pair2= new Pair<>(3.0,10);
        System.out.println(pair2.getValue1()+":"+pair2.getValue2());
    }

}

class Pair<V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
