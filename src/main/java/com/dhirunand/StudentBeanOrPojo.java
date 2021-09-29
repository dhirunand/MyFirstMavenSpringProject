package com.dhirunand;

public class StudentBeanOrPojo {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public StudentBeanOrPojo(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public StudentBeanOrPojo() {
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("Setting Student Id, i.e setter injection");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "StudentBeanOrPojo{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
