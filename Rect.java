public class Rect{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rect(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void get_info(Rect rec1, Rect rec2){
        System.out.println(rec1.x1 + " " + rec1.y1 + " " + rec1.x2 + " " + rec1.y2);
        System.out.println(rec2.x1 + " " + rec2.y1 + " " + rec2.x2 + " " + rec2.y2);
    }

    public void check_overlap(Rect rect1, Rect rect2){
        if((rect1.x2 < rect2.x1) || (rect2.x2 < rect1.x1)){
            System.out.println("Rectangles dont overlap");
        }
        else if((rect1.y2 < rect2.y1) || (rect2.y2 < rect1.y1)){
            System.out.println("Rectangles dont overlap");
        }
        else if (rect2.x1 < rect1.x2){
            System.out.printf("The coordinates for overlapping rectangle are %d %d %d %d",rect2.x1,rect2.y1,rect1.x2,rect1.y2);
        }
        else if (rect2.x1 < rect1.x2 && (rect2.y2 > rect1.y1 && rect2.y2 < rect1.y2)){
            System.out.printf("The coordinates for overlapping rectangle are %d %d %d %d",rect2.x1,rect2.y2,rect1.x2,rect1.y1);
        }
        else if (rect1.x1 < rect2.x2){
            System.out.printf("The coordinates for overlapping rectangle are %d %d %d %d",rect1.x1,rect1.y1,rect2.x2,rect2.y2);
        }
        else if (rect1.x1 < rect2.x2 && (rect1.y2 > rect2.y1 && rect1.y2 < rect2.y2)){
            System.out.printf("The coordinates for overlapping rectangle are %d %d %d %d",rect1.x1,rect1.y2,rect2.x2,rect2.y1);
        }
    }
}

    