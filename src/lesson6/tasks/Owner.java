package lesson6.tasks;

public class Owner {
    public String name;
    public String phone;
    public Owner(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("Owner {name = %s, phone = %s}", name, phone);
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
        return cat.name.equals(this.name);
    }
}
