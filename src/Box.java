public class Box {
    private int width;
    private int height;
    private int length;
    public Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Box(int length){
    }
    public void scale(int scalingFactor){
        this.height *= scalingFactor;
        this.width *= scalingFactor;
    }
    public int getVolume(){
        return this.height * this.width * this.length;
    }
    public int getSurfaceArea(){
        return (6 * (length * height)) + (2 *(height * width));
    }
    public  boolean isCube(){
        if(this.length != this.height && this.length != width){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "";
       return "Volume:" + getVolume() + "\nSurfacearea:" + getSurfaceArea();
    }
     public static void main(String[] arg){
        Box b = new Box(3, 4, 5);
        System.out.println(b.toString());
     }
}
