package org.coddington.lesson7.part2;

import org.coddington.lesson7.part2.subPackageA.Class2A;
import org.coddington.lesson7.part2.subPackageA.subPackageB.Class2B;

/**
 * @author michaelcoddington
 */
public class Runner2 {

    public static void main(String[] arguments) {
        // we can do this because Class2A is a public class.
        // so even though it's defined in a different package, we can still "see" it from this package.
        Class2A c2a = new Class2A();

        // we can do this because publicMember and publicMethod have PUBLIC visibility
        System.out.println(c2a.publicMember);
        c2a.publicMethod();

        // we can't do this because packageMember and packageMethod have package visibility and Runner2 isn't in the same package
        // System.out.println(c2a.packageMember);
        // c2a.packageMethod();

        // we can't do this because protectedMember and protectedMethod have protected visibility
        // and Runner2 isn't a subclass of Class2A
        // System.out.println(c2a.protectedMember);
        // c2a.protectedMethod();

        // we can't do this because privateMember and privateMethod have private visibility,
        // so only Class2A itself can access then
        // System.out.println(c2a.privateMember);
        // c2a.privateMethod();


        // we can create an instance of Class2B because it is PUBLICally accessible.
        // if it has package access, we couldn't do this because Runner2 is in the org.coddington.lesson7.part2 package,
        // and Class2B is in the org.coddington.lesson7.part2.subPackageA.subPackageB package.
        Class2B c2b = new Class2B();
        c2b.printTheProtectedMember();

        // we can't do this because Class3B has package visibility and it's in a different package from Runner2.
        // Class3B c3b = new Class3B();


    }

}
