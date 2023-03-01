import java.awt.geom.Area;

public class Traingle {
    private int x;
    private int y;
    private int z;
    public Traingle(int x,int y,int z){
    this.x=x;
    this.y=y;
    this.z=z;
    }
    public int Parameter(){
        return x*y*z;
    }
    public int area(){
        return x*y*z;
    }
    public static void main(String[] args)
    {
        Traingle t=new Traingle(3,4,5);
        System.out.println("Perimeter of traingle:"+t.Parameter());
        System.out.println("Area of traingle:"+t.area());
    }
}
