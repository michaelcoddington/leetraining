package org.coddington.lesson7.part2.subPackageA.subPackageB;

import org.coddington.lesson7.part2.subPackageA.Class2A;

/**
 * @author michaelcoddington
 */
class Class3B extends Class2A {

    public void printTheProtectedMember() {
        // this works because Class2B is a subclass of Class2A.  protectedMember has PROTECTED visibility,
        // so it can be accessed by any class in the same package as Class2A,
        // OR
        // any subclass of Class2A, no matter what package the subclass is in.
        // so even though Class2B is not in the same package as Class2A, Class2B can still access this member.
        System.out.println(protectedMember);
    }

}
