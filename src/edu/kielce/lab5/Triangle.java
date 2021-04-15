package edu.kielce.lab5;

public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    private double side1;
    private double side2;
    private double side3;

    private byte typeOfConstructor;
    //1 - constructor with Point
    //2 - constructor with sides

    private byte typeOfTriangle;
    //1 - rectengular triangle (prostokątny)
    //2 - acute triangle (ostrokątny)
    //3 - obtuse triangle (rozwartokątny)


    public Triangle(Point point1, Point point2, Point point3) {
        this.vertex1 = point1;
        this.vertex2 = point2;
        this.vertex3 = point3;

        this.side1 = point1.distanceFromPoint(point2);
        this.side2 = point2.distanceFromPoint(point3);
        this.side3 = point1.distanceFromPoint(point3);

        this.typeOfConstructor = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        this.typeOfConstructor = 2;
    }

    public double getPerimeter()
    {
        return (side1 + side2 + side3);
    }

    public double getField(){
        double p = getPerimeter() / 2;
        double field = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return field;
    }

    public byte checkTypeOfTriangle(){
        byte temp;
        if(Math.pow(side3, 2) > Math.pow(side2,2) + Math.pow(side1, 2)){
            temp = 3;
        }
        else if(Math.pow(side3, 2) < Math.pow(side2,2) + Math.pow(side1, 2)){
            temp = 2;
        }
        else{
            temp = 1;
        }
        return temp;
    }


    public String toString() {
        String information = new String();
        switch (typeOfConstructor) {
            case 1:
                information = "Field = " + getField() +
                        "\t Perimiter = " + getPerimeter();
            case 2:
                information = "Field = " + getField() +
                        "\t Perimiter = " + getPerimeter();
        }
        return information;
    }

}

