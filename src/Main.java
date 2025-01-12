public class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String Vectors(double getX, double getY, double getZ) {
        String xStr, yStr, zStr, vectorFormat;
        xStr = String.format("%.2f", getX);
        yStr = String.format("%.2f", getY);
        zStr = String.format("%.2f", getZ);
        vectorFormat = xStr + yStr + zStr;
        return vectorFormat;
    }

    public double getMagnitude(double getX, double getY, double getZ) {
        double result;
        result = Math.sqrt(Math.pow(getX, 2) + Math.pow(getY, 2) + Math.pow(getZ, 2));
        return result;
    }

    public String normalize(double getX, double getY, double getZ, double getMagnitude) {
        double normalVectorX, normalVectorY, normalVectorZ;
        String normalVector;
        normalVectorX = getX / getMagnitude;
        normalVectorY = getY / getMagnitude;
        normalVectorZ = getZ / getMagnitude;
        normalVector = String.format("%.2f", normalVectorX) + String.format("%.2f", normalVectorY) + String.format("%.2f", normalVectorZ);
        return normalVector;
    }

    public String add(double getX, double getY, double getZ) {
        double getX2, getY2, getZ2;
        String addedVector;


    }

    public String multiply(double getX, double getY, double getZ) {
        double constant, multiVectorX, multiVectorY, multiVectorZ;
        String multipliedVector;
        multiVectorX = getX * constant;
    }

    public dotProduct

    public angleBetween
    
    public crossProduct

    public static void main(String[] args) {

    }
}