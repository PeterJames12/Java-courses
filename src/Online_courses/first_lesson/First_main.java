package Online_courses.first_lesson;


public class First_main {

    public static void main(String[] args) {

        first("Hello, U-Rise!");

    }


    private static void first(String str) {
        int persent = 100;
        double happiness = 0.99;
        boolean say = true;

        System.out.println(str);
        System.out.println("There is" + say + ", that there are" + persent + " percent sucess with"
                + happiness + "happiness.");

    }
}
