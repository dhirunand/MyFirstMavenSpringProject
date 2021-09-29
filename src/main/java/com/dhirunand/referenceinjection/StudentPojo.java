package com.dhirunand.referenceinjection;

public class StudentPojo {
    private String studentName;
    private AddressOfStudent addressOfStudent;

    public StudentPojo() {
    }

    public StudentPojo(String studentName, AddressOfStudent addressOfStudent) {
        this.studentName = studentName;
        this.addressOfStudent = addressOfStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public AddressOfStudent getAddressOfStudent() {
        return addressOfStudent;
    }

    public void setAddressOfStudent(AddressOfStudent addressOfStudent) {
        this.addressOfStudent = addressOfStudent;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "studentName='" + studentName + '\'' +
                ", addressOfStudent=" + addressOfStudent +
                '}';
    }
}
