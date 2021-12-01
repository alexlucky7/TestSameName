package base;

public class BaseClass {

    private String name;
    private Integer number;

    public void getByIdInBase() {

    }

    public BaseClass() {
    }

    public BaseClass(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
