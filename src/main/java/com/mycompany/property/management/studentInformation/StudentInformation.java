package com.mycompany.property.management.studentInformation;

public class StudentInformation {
    public void getStudentInformation(StudentDetailM Sobj){
        System.out.println("Student Id = "+Sobj.getStid());
        System.out.println("Student Name = "+Sobj.getStname());
        System.out.println("Student DateOfBirth = "+Sobj.getSt_date_Of_birth());
        System.out.println("Student Phone no = "+Sobj.getSt_Phone_number());
        }
        public void getCollageInformation(StudentDetailM Cobj){
        System.out.println("Collage Id = "+Cobj.getCid());
        System.out.println("Collage Name = "+Cobj.getCname());
        System.out.println("Collage Department = "+Cobj.getCdepartment());
        System.out.println("Collage Address = "+Cobj.getCaddress());
        }
}
