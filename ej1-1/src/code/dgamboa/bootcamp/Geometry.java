package code.dgamboa.bootcamp;

import static java.lang.Math.sin;

public class Geometry {
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double thirdAngle(double alpha, double beta){
        var sumAllAngles = 180;
        var sumOfGivenAngles = alpha + beta;
        return sumAllAngles - sumOfGivenAngles;
    }

    public static double lawOfSins(double sideA, double angleA, double angleB){


        double sinA = sin(angleA), sinB = sin(angleB);
        double sideB = sideA * (sinB / sinA);
        double sideC = sideA * (sin(angleA)/sin(angleB));
        return sideB;
    }

    public static boolean isTriangle(double x,double y,double z){

        var maxNum = x>y && x>z ? x : y>z ? y : z;
        var sum = 0.0;
        if(maxNum == x){
            sum = y + z;
            return maxNum < sum ? true : false;
        }
        else if(maxNum == y){
            sum = x + z;
            return maxNum < sum ? true : false;
        }
        else {
            sum = y + x;
            return maxNum < sum ? true : false;
        }
    }

    public static double distance(double coordinateXAPoint, double coordinateYAPoint, double coordinateXBPoint, double coordinateYBPoint){

        var xDistance = Math.pow((coordinateXBPoint-coordinateXAPoint), 2);
        var yDistance = Math.pow((coordinateYBPoint-coordinateYAPoint), 2);
        return Math.sqrt(xDistance + yDistance);
    }
}
