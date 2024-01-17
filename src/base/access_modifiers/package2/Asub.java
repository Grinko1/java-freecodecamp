package base.access_modifiers.package2;

import base.access_modifiers.package1.A;

public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);
        System.out.println(c.protectedMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedAMessage);
    }
}
