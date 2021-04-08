package com.mverdiyev;

public class SchoolStudent extends Student
{
    private final int examScore;

    public SchoolStudent(String name,int examScore)
    {
        super(name);
        this.examScore = examScore;

        calculateAverageScore();
    }

    @Override
    public void calculateAverageScore()
    {
        super.setAverageScore(examScore);
    }

    public int getExamScore()
    {
        return examScore;
    }
}
