package net.vitacraft.discord2fa;

public class CommonClass {
    private final String irs;

    public CommonClass(String instanceReferenceString){
        this.irs = instanceReferenceString;
    }

    public void testMethod(){
        System.out.println("Hello test! " + irs);
    }
}
