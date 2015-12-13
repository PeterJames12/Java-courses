package Online_courses.second_lesson;


public class Method {

    public static void main(String[] args) {

        log("Start log");
        last(!true);
        log("Finish log");

    }

    private static void last(boolean b) {
        b = !b;
        System.out.println(b);
    }

    private static void log(String s) {

        System.out.println(s);
    }

}
