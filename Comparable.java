import java.util.ArrayList;
import java.util.*;

        class Students
        {
            int marks;
            int age;
            String name;
            public Students(int marks, int age, String name){
                this.marks = marks;
                this.age = age;
                this.name = name;
            }
            public int getMarks()
            {
                return marks;
            }
            public int getAge()
            {
                return age;
            }
            public String getName()
            {
                return name;
            }
            public String toString()
            {
                return "" + marks + "-" +age + "-" + name;
            }
        }
        // class Alpha implements Comparator<Student>
        // {
        //     public int compare(Student a, Student b)
        //     {
        //         if(a.age>b.age){
        //             return 1;
        //             else 
        //             return -1;
        //         }
        //     }
        // }



        class Comparable
    {
        public static void main(String[] args) {
        Students st1 = new Students(45, 18, "rohan");
        Students st2 = new Students(46, 17, "rohit");
        Students st3 = new Students(44, 19, "mehu");
        List<Students> list = new ArrayList();
        list.add(st1);        
        list.add(st2);        
        list.add(st3);        
        
        System.out.println(list);
        // Alpha a = new Alpha();

        Comparator.<Students> comp=(Students a, Students b)->
        {
            if(a.marks>b.marks){
                return 1;
                else
                return -1;
            }
        }
    }
    }

