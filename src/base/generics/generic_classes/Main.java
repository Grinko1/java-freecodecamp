package base.generics.generic_classes;

public class Main {
    public static void main(String[] args) {
//        MyIntClass myInt = new MyIntClass(1);
//        MyDoubleClass myDouble = new MyDoubleClass(3.14);
//        MyStringClass myStr = new MyStringClass("Hi");

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<String> myStr = new MyGenericClass<>("Hi");
    }
}
