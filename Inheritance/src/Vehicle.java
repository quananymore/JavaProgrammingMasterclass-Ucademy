public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity; //van toc
    private int currentDirection;// huong di
//init contructors
    public Vehicle(String name,String size){
        this.name = name;
        this.size = size;

        this.currentDirection=0;
        this.currentVelocity=0;
    }

    public void steer(int direction){
        this.currentDirection +=direction;
        System.out.println("Vehicle.steer(): Moving at "+ currentVelocity+" degrees.");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void move(int velocity, int direction){
        currentVelocity=velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at "+currentVelocity+" in direction "+ currentDirection);

    }
    public void stop(){
        this.currentVelocity=0;
    }

}
