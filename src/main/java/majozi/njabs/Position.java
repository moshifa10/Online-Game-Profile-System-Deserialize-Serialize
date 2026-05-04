package majozi.njabs;

public class Position {

    private int x;
    private int y;
    private String direction;

    public Position(int x, int y, String direction){
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }
}
