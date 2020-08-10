public class Supermethod
{
 public static void main(String args[])
 {
 Dog d=new Dog();
 d.work();
 }
}
  class Animal
  {
    void eat()
    {
        System.out.println("eating grass");
    }
}
  class Dog extends Animal
  {
      void eat()
      {
          System.out.println("eating bread");
      }

      void bark()
      {
          System.out.println("dog is barking");
      }

      void work()
      {
          eat();
          super.eat();
          bark();
      }
  }

