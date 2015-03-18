package com.praveen;

class Student2 
{
   String name;
   int rollno;
   Student2(String name,int rollno)
   {
    this.name = name;
    this.rollno = rollno;
   }
 
   public boolean equals(Object obj)
   {
    try
    {
     String name1 = this.name;
     int rollno1 = this.rollno;
     Student2 s2 = (Student2)obj; 
     String name2 = s2.name;
     int rollno2 = s2.rollno;
     if(name1.equals(name2) && rollno1 == rollno2)
     {
      return true;
     }
     else
     {
      return false;
     }
    }
    catch (ClassCastException c)
    {
     return false;
    }  
    catch (NullPointerException e)
    {
     return false;
    }

   }
   public static void main(String arg[])
   {
    Student2 s1 = new Student2 ("raju", 101);
    Student2 s2 = new Student2 ("giri", 102);
    Student2 s3 = new Student2 ("giri", 102);
  
    System.out.println(s1.equals(s2));
    System.out.println(s2.equals(s3));
    System.out.println(s1.equals(null));

   } 
}
