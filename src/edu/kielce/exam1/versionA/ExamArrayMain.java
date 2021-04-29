package edu.kielce.exam1.versionA;

public class ExamArrayMain {
    public static void main(String[] args) {
        ExamArray myExamArray = new ExamArray(8);

        myExamArray.insertToArray();
        myExamArray.printArray();
        System.out.println("\nAVG = " + myExamArray.averageOfArray());

    }

}
