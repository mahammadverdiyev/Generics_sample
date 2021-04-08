package com.mverdiyev;

public class UniversityStudent extends Student
{
    private final int firstExam;
    private final int secondExam;
    private final int thirdExam;

    public UniversityStudent(String name,int firstExam, int secondExam, int thirdExam)
    {
        super(name);

        this.firstExam = firstExam;
        this.secondExam = secondExam;
        this.thirdExam = thirdExam;

        calculateAverageScore();
    }

    @Override
    public void calculateAverageScore()
    {

    }

    public int getFirstExam()
    {
        return firstExam;
    }

    public int getSecondExam()
    {
        return secondExam;
    }

    public int getThirdExam()
    {
        return thirdExam;
    }
}
