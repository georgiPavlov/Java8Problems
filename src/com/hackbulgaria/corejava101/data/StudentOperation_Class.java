package com.hackbulgaria.corejava101.data;

import com.hackbulgaria.corejava101.StudentOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by georgipavlov on 11.03.16.
 */
public class StudentOperation_Class  implements StudentOperations {
    private List<Student> students;

    public StudentOperation_Class(){
        students = StudentsDataFactory.getAllStudents();
    }


    @Override
    public double getAverageMark() {
        return  students
                .stream()
                .mapToDouble(s -> s.getGrade())
                .average()
                .getAsDouble();


    }

    @Override
    public List<Student> getAllPassing() {
        return students
                .stream()
                .filter(s -> s.getGrade() >= 3.0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> getAllFailing() {
        return students
                .stream()
                .filter(s -> s.getGrade() < 3.0)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Boolean, List<Student>> splitStudentsByMarks(float splitMark) {
        return students
                .stream()
                .collect(Collectors.groupingBy(s -> s.getGrade() > splitMark ));
    }

    @Override
    public List<Student> orderByMarkDescending() {
        return null;
    }

    @Override
    public List<Student> orderByMarkAscending() {
        return null;
    }

    @Override
    public List<Student> getStudentsWithLowestMarks() {
        return null;
    }

    @Override
    public List<Student> getStudentsWithHighestMarks() {
        return null;
    }

    @Override
    public Map<Integer, List<Double>> getMarksDistributionByAge() {
        return null;
    }

    @Override
    public Map<Gender, Double> getAverageMarkByGender() {
        return null;
    }

    @Override
    public Map<Double, Integer> getMarksDistribution() {
        return null;
    }

    @Override
    public String getEmailToHeader() {
        return null;
    }

    @Override
    public Map<Gender, Map<Integer, List<Student>>> splitStudentMarksByGenderAndThenByAge() {
        return null;
    }
}
