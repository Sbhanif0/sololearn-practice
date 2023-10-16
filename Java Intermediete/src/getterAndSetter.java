public class getterAndSetter {

    public static void main(String[] args) {

        getSet gs = new getSet();
        getSet.stB(10);
        gs.setG(50);
        System.out.println(gs.gtB() + gs.getG());// 10+50=60;

        GettersAndSetters.setterName("sbhanif");

        GettersAndSetters gettersAndSetters = new GettersAndSetters();
        gettersAndSetters.setAge(20);

        final String name = "Name : ";
        final String age = "Age : ";

        System.out.println(name + GettersAndSetters.getterName() + "\n" + age + gettersAndSetters.getAge());
        // name = "sb"; final variable cannot modify;
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
