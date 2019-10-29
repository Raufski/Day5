public class Zoo {
    public static void main(String[] args) {
        // define variable
        Parrot mybabyParrot;
        // Init the varable with new object of parrot class
        mybabyParrot = new Parrot();
        // set age field value
        mybabyParrot.setAge(15);
        // set name field value
        mybabyParrot.setName("Megan");
        // set weight field value
        mybabyParrot.setWeight(24.8);
        System.out.println("Age\t" + mybabyParrot.getAge());
        System.out.println("Name:\t" + mybabyParrot.getName());
        System.out.println ("Weight:\t" + mybabyParrot.getWeight() );

    }
}
