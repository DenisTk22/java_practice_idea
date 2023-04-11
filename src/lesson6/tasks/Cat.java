//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//а) информационной системой ветеринарной клиники
//б) архивом выставки котов
//в) информационной системой Театра кошек Ю. Д. Куклачёва
//Можно записать в текстовом виде, не обязательно реализовывать в java.


package lesson6.tasks;

public class Cat {
    public String name;
    public int age;
    public boolean isIll;
    public String diagnoz;
    public Owner owner;


    //конструктор, нажать Alt+insert
    public Cat(String name, int age, boolean isIll, String diagnoz, Owner owner) {
        this.name = name;
        this.age = age;
        this.isIll = isIll;
        this.diagnoz = diagnoz;
        this.owner = owner;
    }
// вызов override: ctrl + o. Задаем формат вывода
    @Override
    public String toString() {
        return String.format("Cat {name = %s, age = %s, isIll = %s, diagnoz = %s, owner = %s}", name, age, isIll, diagnoz, owner);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((diagnoz == null) ? 0 : diagnoz.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Cat cat = (Cat)o;
        return cat.name.equals(this.name) && cat.age == this.age && cat.diagnoz.equals(this.diagnoz);
    }
}
