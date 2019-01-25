package data;

public class Area {

    int radius;

    public Area(int radius) {
        this.radius = radius;
    }

    double AreaOfACircle(){
        return  3.14257 * radius * radius;
    }
}
