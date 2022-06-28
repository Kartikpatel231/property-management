package com.mycompany.property.management.studentInformation;

import java.util.Scanner;

public class Details {
    CollageInformation collage;
    StudentInformation student;

    public void Detail() {
        collage = new CollageInformation();
        student = new StudentInformation();
    }


        public static void main(String[] args){
            Details obj=new Details();
           //obj.run();
            CollageInformation obj1=new CollageInformation();
            StudentInformation obj2=new StudentInformation();
            StudentDetailM ram=obj1.setCollageDetail();
            StudentDetailM Stu=obj1.setStudentDetail();

                Scanner ob = new Scanner(System.in);
                System.out.println("1).CollageInformation \n.2)StudentInformation \n3)BothInformation");
                System.out.println("Enter your choice");
                int n = ob.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Collage Information");
                        obj2.getCollageInformation(ram);
                        //  StudentDetailM stuobj = collage.setCollageDetail();
                        //   student.getCollageInformation(stuobj);
                        break;
                    case 2:
                        System.out.println("Student Information");
                        obj2.getStudentInformation(Stu);
                        //  StudentDetailM s1 = collage.setStudentDetail();
                        //  student.getStudentInformation(s1);
                        break;
                    case 3:
                        System.out.println("Both Information");
                        System.out.println("Student Information");
                        obj2.getStudentInformation(Stu);
                        //   StudentDetailM s2 = collage.setStudentDetail();
                        //   student.getStudentInformation(s2);
                        System.out.println("Collage Information");
                        obj2.getCollageInformation(ram);

                        //   StudentDetailM s3 = collage.setCollageDetail();
                        //   student.getCollageInformation(s3);
                        break;
                    default:
                        System.out.println("please input value correctly");
                }


            //System.out.println(ram);

           // System.out.println(obj2.getStudentInformation(ram));


        /*StudentDetailM  cobj= collage.setCollageDetail();
        student.getCollageInformation(cobj);
        StudentDetailM stuobj=collage.setStudentDetail();
        student.getStudentInformation(stuobj)
    */}

}
