package ihenritance.poin2dand3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public float[] getXYZ(){
        float[] arr={getX(),getY(), z};
        return arr;
    }

    @Override
    public String toString() {
        return "x= "+getX()+"\n"
                + "y= "+getY()+"\n"
                + "z= "+ getZ()+"\n"
                + "Position: "+ Arrays.toString(getXYZ());
    }
}
