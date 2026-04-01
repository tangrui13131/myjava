package myproduct;

public class anmial {
    String name;
    int age;
    public anmial(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void show(){
        System.out.println("SHOW: ");


    }
    public  void eat(){
        System.out.println("food");
    }
    public void read() {
        System.out.println("名字: " + name);
        System.out.println("年龄" + age);
    }




}
