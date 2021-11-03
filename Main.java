//Unit 2, Topic 2.1, Classes and Objects, 11/01/21, version 0.1

// Part 1 
    public class Student {
        // These are INSTANCE VARIABLES. 
        private int studentID;
        private int gradeLevel;
        private double gradePointAvg;
        private String studentName; 

    }
        
        // Creating a Constructor
        // More than one constructor is know as OVERLOADING 
        // Generally this type of constructor should just make a default

        // Part 2  
        public Student() {
            this.studentID = 0; 
            this.gradeLevel = 0;
            this.gradePointAvg = 0.0;
            this.studentName = "";

        
        }

        //Value Constructor 
        public Student(int studentID, int gradeLevel, double gradePointAvg, String studentName) {
            this.studentID = studentID;
            this.gradeLevel = gradeLevel;
            this.gradePointAvg = gradePointAvg;
            this.studentName = studentName;
    }


        public static void main(String[] args) {
            Student student0 = new Student();
            Student student1 = new Student(12345678, 11, 3.5, "MF DOOM");

            
        }


    