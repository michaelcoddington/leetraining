package org.coddington.lesson7.part2.subPackageA;

/**
 * @author michaelcoddington
 */
public class Class2A {
    // this class is public, so any code anywhere can create an instance of it

    public String publicMember = "public member";

    String packageMember = "package-visible member";

    protected String protectedMember = "protected member";

    private String privateMember = "private member";

    public void publicMethod() {
        System.out.println("I'm public!");
    }

    void packageMethod() {
        System.out.println("I'm package!");
    }

    protected void protectedMethod() {
        System.out.println("I'm protected!");
    }

    private void privateMethod() {
        System.out.println("I'm private!");
    }

}
