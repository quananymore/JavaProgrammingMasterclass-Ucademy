public class main {
    public static void main(String[] args) {
        Point point = new Point(6,5);
        Point point1 = new Point(3,1);
        System.out.println(point.distance());
        System.out.println(point.distance(2,2));
        System.out.println(point.distance(point1));
        Point point2 = new Point();
        System.out.println(point2.distance());
    }
}
