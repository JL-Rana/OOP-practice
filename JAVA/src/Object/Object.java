package Object;

    class Box {
    double width;
    double height;
    double depth;

    public void volume(){
        System.out.print("Volume of your box is: ");
        System.out.println(width*height*depth);
    }
}

public class Object {
    public static void main(String[] args){

        Box box1 = new Box();

        box1.width=10;
        box1.height=23;
        box1.depth=32;

        box1.volume();

    }
}
