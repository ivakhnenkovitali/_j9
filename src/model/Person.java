package model;


///пример асоциации- при создании класаа
//// прописка в квартиру и добавление... 


public class Person {
    private String name;
    private Flat regFlat;

    public Person(String name, Flat regFlat) {
        this.name = name;
        this.regFlat = regFlat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flat getRegFlat() {
        return regFlat;
    }

    public void setRegFlat(Flat regFlat) {
        this.regFlat = regFlat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", regFlat=").append(regFlat);
        sb.append('}');
        return sb.toString();
    }
}
