import model.Flat;
import model.Person;
/// пример прописка.......
public class Main {
    public static void main(String[] args) {
        Flat flat1 = new Flat("sovetskaya 1");
//пример -- агрегация не жостракая связь между объектами
        ///объект квартира относится к двум людям
        Person person1 = new Person("Мisha", flat1);
        Person person2 = new Person("Masha", flat1);
        System.out.println(person1);
        System.out.println(person2);
        person1 = null;
        person2 = null;
        System.out.println(flat1);
        Person person3 = new Person("vasya", flat1);
        System.out.println(person3.getRegFlat().getAddress());
    }
}
