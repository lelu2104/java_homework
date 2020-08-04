package HomeWork8_1;

public class Animal extends RandomString{
    //поля
    String nick;
    int age;

    //конструктор
    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    //геттер - возвращает значение переменной
    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    //сеттер -изменяем значение переменной
    private void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(int age) {
            this.age = age;
    }

    //переопределяем toString
    @Override
    public String toString() {
        return "Animal{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}

