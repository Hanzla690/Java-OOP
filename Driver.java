public class Driver {
    public static void main(String[] args) {
        Rect rect1 = new Rect(0, 0, 200, 200);
        Rect rect2 = new Rect(250, 250, 700, 700);

        rect1.check_overlap(rect1, rect2);
    }
}
