public class getterAndSetter {

    public static void main(String[] args) {

        getSet gs = new getSet();
        getSet.stB(10);
        gs.setG(50);
        System.out.println("get set test " + (gs.gtB() + gs.getG()));// 10+50=60; use () bracket for wrapping math
                                                                     // function

        GettersAndSetters.setterName("sbhanif");

        GettersAndSetters gettersAndSetters = new GettersAndSetters();
        gettersAndSetters.setAge(20);

        final String name = "Name : ";
        final String age = "Age : ";

        System.out.println(name + GettersAndSetters.getterName() + "\n" + age + gettersAndSetters.getAge());
        // name = "sb"; final variable cannot modify;

        // Work for return
        Return returnCl = new Return();
        returnCl.name("sbhanif");// change value dynamically
        returnCl.ageFunc(50); // change value dynamically
        System.out.println("Return Age => " + returnCl.ageReturn());

        returnCl.display(name + "sbhanif", age, 20);
    }

}

class GettersAndSetters {
    private static String name;
    private int age;

    public static void setterName(String nam) {
        name = nam;
    }

    public static String getterName() {
        return name;
    }

    public void setAge(int boyosh) {
        this.age = boyosh;
    }

    public int getAge() {
        return age;
    }
}

class getSet {

    private static int b = 4;
    private int g = 4;

    static void stB(int bb) {
        b = bb;
    }

    int gtB() {
        return b;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

}

class Return {
    // learn return
    private int age;

    String name(String name) {

        System.out.println("Return Name => " + name);
        return name;
    }

    public void ageFunc(int boyosh) {
        age = boyosh;
    }

    // return the age
    public int ageReturn() {
        return age; // return korle value mokto hoye jai kintu
                    // display hoy na, variable nam dore display korale display hoi
    }

    void display(final String nam, final String head, final int boyosh) {
        ageFunc(boyosh);
        System.out.println(nam + "\n" + head + boyosh + " Years");
    }

}
