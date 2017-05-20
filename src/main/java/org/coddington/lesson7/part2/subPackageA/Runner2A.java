package org.coddington.lesson7.part2.subPackageA;

/**
 * @author michaelcoddington
 */
class Runner2A {

    public static void main(String[] arguments) {
        Class2A c2a = new Class2A();

        // Any code can access a public member or method of Class2A
        System.out.println(c2a.publicMember);
        c2a.publicMethod();

        // Runner2A can see these because Runner2A is in the same package as Class2A
        System.out.println(c2a.packageMember);
        c2a.packageMethod();

        // Runner2A can see these because Runner2A is in the same package as Class2A
        System.out.println(c2a.protectedMember);
        c2a.protectedMethod();
    }

}
