package com.mverdiyev;

public class CollegeStudent extends Student
{
    private final int firstExam;
    private final int secondExam;

    public CollegeStudent(String name, int firstExam, int secondExam)
    {
        super(name);
        this.firstExam = firstExam;
        this.secondExam = secondExam;

        calculateAverageScore();
    }

    @Override
    public void calculateAverageScore()
    {
        double averageScore =
                firstExam * 0.2 + secondExam * 0.3;

        super.setAverageScore(averageScore);
    }

    public int getFirstExam()
    {
        return firstExam;
    }

    public int getSecondExam()
    {
        return secondExam;
    }
}
