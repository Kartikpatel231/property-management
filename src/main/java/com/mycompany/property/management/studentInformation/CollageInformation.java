package com.mycompany.property.management.studentInformation;

import java.util.Scanner;

public class CollageInformation {
    Scanner ob = new Scanner(System.in);

    public StudentDetailM setStudentDetail() {
        StudentDetailM stuobj = new StudentDetailM();
        System.out.println("Student Information");
        System.out.println("Enter student Id");
        stuobj.setStid(ob.nextInt());
        System.out.println("Enter student Name");
        stuobj.setStname(ob.next());
        ob.nextLine();
        System.out.println("Enter Student dateOfBirth");
        stuobj.setSt_date_Of_birth(ob.next());
        ob.nextLine();
        System.out.println("Enter Student Phoneno");
        stuobj.setSt_Phone_number(ob.nextInt());
        return stuobj;
    }
       public StudentDetailM setCollageDetail() {
           StudentDetailM stuobj = new StudentDetailM();
        System.out.println("Collage Information");
        System.out.println("Enter collage id");
        stuobj.setCid(ob.nextInt());
        System.out.println("Enter collage name");
        stuobj.setCname(ob.next());
        ob.nextLine();
        System.out.println("Enter collage department");
        stuobj.setCdepartment(ob.next());
        ob.nextLine();
        System.out.println("Enter collage address");
        stuobj.setCaddress(ob.next());
        return stuobj;

    }
}
