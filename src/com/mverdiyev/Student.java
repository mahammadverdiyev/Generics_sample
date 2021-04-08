package com.mverdiyev;

public abstract class Student
{
    private double averageScore;
    private final String name;

    public Student(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract void calculateAverageScore();

    public double getAverageScore()
    {
        return averageScore;
    }

    protected void setAverageScore(double averageScore)
    {
        if(averageScore >= 0)
            this.averageScore = averageScore;
    }
}
