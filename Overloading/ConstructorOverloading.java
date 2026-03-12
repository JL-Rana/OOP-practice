class Box {
    double width;
    double height;
    double depth;

    Box (double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    Box (double len){
        width=height=depth=len;
    }

    Box (){
        width=-1;
        height=-1;
        depth=-1;
    }

    void volume() {
        double vol=width*height*depth;
        System.out.println("Volume of the Box: "+vol);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args){

        Box box1 = new Box();
        box1.volume();

        Box box2 = new Box(100);
        box2.volume();

        Box box3 = new Box(100,12,15);
        box3.volume();
    }
}
