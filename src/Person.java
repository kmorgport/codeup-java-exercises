public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String sayHello(){
        return "Hello this is "+ this.name+"!";
    }
     public static void main(String[] args){
        Person person1 = new Person("Kole");
        Person person2 = new Person("Kole");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1==person2);
     }
}
