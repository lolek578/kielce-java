package edu.kielce.exam1.versionA;

public class ExamTriangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public ExamTriangle(){
        this.firstSide = 0;
        this.secondSide = 0;
        this.thirdSide = 0;
    }

    public ExamTriangle(ExamTriangle triangle){
        firstSide = triangle.firstSide;
        secondSide = triangle.secondSide;
        thirdSide = triangle.thirdSide;
    }

    public ExamTriangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    //return perimeter of triangle
    public double getPerimeter()
    {
        return (firstSide + secondSide + thirdSide);
    }

    //return field of triangle
    public double getField(){
        double p = getPerimeter() / 2;
        double field = Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
        return field;
    }

    public final Boolean isEquilateral(){
        boolean success = true;
        if(firstSide != secondSide || firstSide != thirdSide || secondSide != thirdSide){
            success = false;
        }
        return success;
    }
}

