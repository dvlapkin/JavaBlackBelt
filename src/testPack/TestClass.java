package testPack;

public class TestClass {
    private int priv=11;
    protected int prot=22;
    int i=33;
    public int pub=44;
    public static void method(){
        TestClass tc = new TestClass();
        System.out.println(tc.priv);
    }
}

class TestClassMod{
    static void method(){
        TestClass tc = new TestClass();
        System.out.println(tc.prot);
    }
}
