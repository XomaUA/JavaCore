package com.company;
class Dog {

    public String name;
    public String breed;
    public int age;

    public Dog (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public void setName(String name) {this.name = name;}
    public void setBreed(String breed) {this.breed = breed;}
    public void setAge(int age) {this.age = age;}
}
public class Main {
    enum breed {
        BEAGLE, BULLDOG, TERRIER
    }

    public static void main(String[] args) {
        breed br1 = breed.BEAGLE;
        breed br2 = breed.BULLDOG;
        breed br3 = breed.TERRIER;

	Dog dog1 = new Dog("Bobik", "BEAGLE", 12);
	Dog dog2 = new Dog("Rex", "BULLDOG", 5);
	Dog dog3 = new Dog("Valera", "TERRIER", 6);

	public boolean equals(Object obj) {
	    if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Dog other = (Dog) obj;
        if (this.age != other.getAge()) return false;
        if (this.breed == null) {
            if (other.breed != null) return false;
                } else if (!this.breed.equals(other.getBreed())) return false;
            return true;
        if (this.name == null) {
            if (other.name != null) return false;
                } else if (!this.name.equals(other.getName())) return false;
            return true;
        }
    }
}

