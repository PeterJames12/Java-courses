package Online_courses.second_lesson;


public class Method2 {

    public static void main(String[] args) {
        counts();
        java("We want learning java right now");
    }
    //third task
    public static void java(String java){
        System.out.println(java);
    }

    //second task
    public static void counts() {
        int first = 20;

        double db = 20.5;

        float fl = 27.4f;

        long lg = 1000000;

        byte bt = 4;

        boolean bl = !false;


        first+=12;

        db = db % first;

        fl = first-fl--;

        bt = 10 /2;

        lg = first * lg++;

        System.out.println(first);
        System.out.println(db);
        System.out.println(fl);
        System.out.println(lg);
        System.out.println(bt);
        System.out.println(bl);

    }

}

