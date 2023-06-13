import java.util.Scanner;
class EmployeeT
{
    int empid;
    String name;
    String address;
    float salary;
    EmployeeT()
    {

    }
    EmployeeT(int empid,String name,float salary,String address)
    {
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}    


   
    class Teacher extends EmployeeT
    {
        String dept,sub;
        Teacher(int empid,String name,float salary,String address,String dept,String sub)
        {

        
       
            super(empid,name,salary,address);
            this.dept=dept;
            this.sub=sub;
        }    
        public void display()
        {
            System.out.println("\n Teacher id\n" +empid);
            System.out.println("\n Teacher name\n" +name);
            System.out.println("\n Teacher salary\n" +salary);
            System.out.println("\n Teacher Address\n" +address);
            System.out.println("\n Teacher department\n" +dept);
            System.out.println("\n Teacher subject\n" +sub);
        }    

        
    }
    public class Techarrays
    {
   
        public static void main(String[] args)
        {
      
            System.out.println("Enter number of  Teachers");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Enter Teachers details one by one");
            Teacher teacher[]=new Teacher[n];
            Scanner sc1=new Scanner(System.in);
            int tid;
            String name;
            float salary;
            String add;
            String dept,sub;
            for(int i=0;i<n;i++)
            {
          
                System.out.println("Enter Teacher id");
                tid=sc1.nextInt();
                System.out.println("Enter Teacher name");
                name=sc1.next();
                System.out.println("Enter Teacher salary");
                salary=sc1.nextFloat();
                System.out.println("Enter Teacher Address");
                add=sc1.next();
                System.out.println("Enter Teacher department");
                dept=sc1.next();
                System.out.println("Enter Teacher subject");
                sub=sc1.next();
                Teacher t=new Teacher(tid,name,salary,add,dept,sub);
                teacher[i]=t;
            }    
           
            for(Teacher x:teacher)
            {
            x.display();
            System.out.println("\n");
            }
   }    }     
              


          
