class Student{
    String name;
    int roll;
    char section;

    Student(String name,int roll,char section) {
        this.name = name;
        this.roll = roll;
        this.section = section;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
        System.out.println("Section: "+section);
    }
}

class Blueprint{
    public static void main(String[] args) {
        Student sourish = new Student("Sourish Samanta",60,'A');
        sourish.display();
    }
}