public class Fish extends Animal {

    private final int gills;
    private final int fins;

    public Fish(int gills, int fins) {
        this.gills = gills;
        this.fins = fins;
    }

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
}
