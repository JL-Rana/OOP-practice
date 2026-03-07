
package Object;

class Box2 {
    double width;
    double height;
    double depth;

    Box2(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    public void volume(){
        System.out.print("Volume of your box is: ");
        System.out.println(width*height*depth);
    }
}

public class Constructor {
    public static void main(String[] args){

        Box2 box1 = new Box2(12,3,23);

        box1.volume();

    }
}
