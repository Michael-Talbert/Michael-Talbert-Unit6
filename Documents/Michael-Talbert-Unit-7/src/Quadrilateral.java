public abstract class Quadrilateral {
    public static final int NUMSIDES = 4;
    private int[] sides;
    private int[] angles;

    public Quadrilateral(int[] sides, int[] angles){
        this.sides = sides;
        this.angles = angles;
    }

    public int calculatePerimeter(){
        int perimeter = 0;
        for (int s:sides) {
            perimeter+=s;
        }
        return perimeter;
    }

    public abstract double calcArea();
}
