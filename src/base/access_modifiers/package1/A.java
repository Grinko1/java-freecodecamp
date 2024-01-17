package base.access_modifiers.package1;
import base.access_modifiers.package2.*;
public class A {
    protected String protectedAMessage="This is protected A message";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
        System.out.println(c);
        B b = new B();

    }
}
