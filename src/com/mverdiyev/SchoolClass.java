package com.mverdiyev;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass<T extends Student> implements Comparable<SchoolClass<T>>
{
    private final String name;
    private final List<T> students = new ArrayList<>();
    private double classRank;

    public SchoolClass(String name,List<T> students)
    {
        this.name = name;
        this.students.addAll(students);

        calculateRank();
    }

    public void addStudent(T student)
    {
        students.add(student);
    }

    public List<T> getStudents()
    {
        return students;
    }

    private void calculateRank()
    {
        double sum = students.stream().mapToDouble(Student::getAverageScore).sum();
        int studentCount = students.size();

        classRank = sum / studentCount;
    }

    @Override
    public int compareTo(SchoolClass<T> thatClass)
    {
        return Double.compare(this.getClassRank(), thatClass.getClassRank());
    }

    public double getClassRank()
    {
        return classRank;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "SchoolClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
