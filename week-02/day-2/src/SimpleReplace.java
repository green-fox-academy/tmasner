public class SimpleReplace {
    public static void main(String... args){
        String Example = "In a dishwasher far far away";

        String newExample = Example.replaceAll("dishwasher", "galaxy");

        // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
        // Please fix it for me!
        // Expected output: In a galaxy far far away


        System.out.println(newExample);
    }
}
