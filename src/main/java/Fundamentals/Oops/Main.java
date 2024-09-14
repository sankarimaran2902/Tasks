package Fundamentals.Oops;
 class Animal         //Hierarchical Main Disadvantage is We have to create new objects for calling each methods.
   {
        String name;
        int age;
        public void makesound()
        {
            System.out.println("animals sounds");
        }
    }
    class Dog extends Animal
    {
        @Override public void makesound()
        {
            System.out.println("dog barks");       //println-To print output in a new line
        }
        void fetch(String name,int age)
        {
            this.name=name;
            this.age=age;
            System.out.println("Name:"+name);
            System.out.println("Age:" +age);
        }
    }
    class Cat extends Animal
    {
        String color;
        @Override public void makesound()
        {
            System.out.println("meooooow");
        }
        public void climb(String name,int age,String color)
        {
            this.name=name;
            this.age=age;
            this.color=color;
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Color:"+color);
            System.out.print("cat is climbing");
        }
    }


    public class Main
    {
        public static void main(String[] args)
        {
            String name ="Vichu";    // Initialise the variables with values
            int age=3;
            String color="Blue";
            Animal aa=new Animal();//Creating an object for accessing the method in Animal class
            aa.makesound();
            Dog dg=new Dog(); // creating an object for Dog class
            dg.makesound();
            dg.fetch(name,age);
            Cat ct=new Cat(); //Creating Object for Accessing the method in Cat Class
            ct.makesound();
            ct.climb(name,age,color);

        }
    }








