import java.util.*;
import java.lang.*;
class student1
{
    int rollno,sub1,sub2,sub3,total;
    String name,course,div;
    double per;
    Scanner sc=new Scanner(System.in);
    void student()
    {
        System.out.println("enter rollno");
        rollno=sc.nextInt();
        System.out.println("enter student name ");
        name=sc.next();
        System.out.println("enter course");
        course=sc.next();
        System.out.println("enter division");
        div=sc.next();
        System.out.println("enter sub1");
        sub1=sc.nextInt();
        System.out.println("enter sub2");
        sub2=sc.nextInt();
        System.out.println("enter sub3");
        sub3=sc.nextInt();
    }
    void totalmarks()
    {
        total=sub1+sub2+sub3;
        System.out.println("TOTAL :"+total);   
      
    }
    void details()
    {
     System.out.println("ROLL NO:"+rollno);
     System.out.println("NAME:"+name);
     System.out.println("COURSE:"+course);
     System.out.println("division:"+div);
     System.out.println("subjecct1:"+sub1);
     System.out.println("subject2:"+sub2);
     System.out.println("subject3:"+sub3);

    }
    
}

 public class Main

{
     public static void main (String args[]) 
     {
        int ch;
        Scanner s=new Scanner(System.in);
        student1 ob1=new student1();
        ob1.student();
        System.out.println("MAIN MENU\n  1:student details 2.MARKS DETAILS\n 3.EXIT");
        System.out.println("enter the choice ");
        ch=s.nextInt();
        switch(ch)
        {
            case 1:
                   ob1.details();
                   break;
            case 2:
                    ob1.totalmarks();
                    break;
            case 3:
                    System.out.println("thank you");
                    break;
          default :System.out.println("student details not there");    
                
        }
    }
}
