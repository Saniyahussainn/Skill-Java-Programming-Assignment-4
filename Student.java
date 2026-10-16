class Student {
  int id;
  String name;

  void display() {
    System.out.println("Student ID: " + id);
    System.out.println("Student Name: " + name);
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.id = 101;
    s1.name = "Saniya";

    s2.id = 102;
    s2.name = "Vijay";

    System.out.println("First Student Details:");
    s1.display();

    System.out.println("Second Student Details:");
    s2.display();
  }
}