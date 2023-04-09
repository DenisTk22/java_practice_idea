package lesson5.oop;

public class Animal { // public - модификатор доступа, виден во всем проекте
    //public Animal() {} // пустой контруктор, пишит по умолчанию Java
    //поля класса - это переменные внутри класса, private - модификатор доступа, поле будет видно только внутри данного класса
    public String type;
    public String color;
    public int lengsCount;
    public int age;

    public Animal(){ //конструктр со значениями по умолчанию
        this.type = "cat";
        this.color = "white";
        this.lengsCount = 4;
        this.age = 1;
    }
    public Animal(String type) { //конструктр со значениями по умолчанию с неопределнным type
        this.type = type;
        this.color = "white";
        this.lengsCount = 4;
        this.age = 1;
    }
    public Animal(String type, String color, int lengsCount, int age){ // конструктор, который мы создаем сами
        // обращение, присвой этому объекту тип type и тд.
        this.type = type;
        this.color = color;
        this.lengsCount = lengsCount;
        this.age = age;
    }
    public void eat(){
        System.out.println("Животное кушает");
}
    Animal animal = new Animal("dog", "black", 4, 2); //new Animal("dog", "black", 4, 2) это экземпляр класса, уже конкретное животное

}
