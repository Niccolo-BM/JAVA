package Entity;

public class Student {
   int id;
   String name;
   int age;

   public Student (){
   }
   public Student(int id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
   }

   public Student(String name, int age) {
      this.name = name;
      this.age = age;
   }


   public int getId() {
      return this.id;
   }
   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }
   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return this.age;
   }
   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "Student{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", age=" + age +
              '}';
   }
}
