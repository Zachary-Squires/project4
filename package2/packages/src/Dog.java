public class Dog {
    public String name;
    public String breed;
    private int age;
    private int weight;
    public Dog(String name, String breed, int age, int weight){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    private String getBreed(){
        return breed;
    }

    //default int getAge(){
    //    return age;
    //}

    protected int getWeight(){
        return weight;
    }
}
