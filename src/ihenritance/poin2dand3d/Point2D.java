package ihenritance.poin2dand3d;

import java.util.Arrays;

public class Point2D {
    private float x=0f;
    private float y=0f;

    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x= x;
        this.y= y;
    }

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = y;
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = {x,y};
        return arr;
    }

    public String toString() {
        return "x= "+getX()+"\n"
               + "y= "+getY()+"\n"
                + "Position: "+Arrays.toString(getXY());
    }
}
