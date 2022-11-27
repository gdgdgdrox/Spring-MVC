package springdemo.mvc;

public class Person {
    private String name;
    private Integer age;
    private String email;
    private boolean advertisementOptIn;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdvertisementOptIn() {
        return this.advertisementOptIn;
    }

    public boolean getAdvertisementOptIn() {
        return this.advertisementOptIn;
    }

    public void setAdvertisementOptIn(boolean advertisementOptIn) {
        this.advertisementOptIn = advertisementOptIn;
    }

}
