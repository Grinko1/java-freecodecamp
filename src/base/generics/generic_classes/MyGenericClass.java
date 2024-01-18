package base.generics.generic_classes;

public class MyGenericClass<T> {
    T x;

    public MyGenericClass(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }
}
