public class Pet {
    private int petID;
    private String name;
    private String species;
    private String breed;
    private int age;
    private int ownerID;
    private CareProfile careProfile;

    public Pet(int petID, String name, String species, String breed, int age, int ownerID, CareProfile careProfile) {
        this.petID = petID;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.ownerID = ownerID;
        this.careProfile = careProfile;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public CareProfile getCareProfile() {
        return careProfile;
    }

    public void setCareProfile(CareProfile careProfile) {
        this.careProfile = careProfile;
    }

    @Override
    public String toString() {
        return "Pet ID: " + petID + ", Name: " + name + ", Species: " + species + ", Breed: " + breed + ", Age: " + age + ", Owner ID: " + ownerID + ", Care Profile: [" + careProfile + "]";
    }
}




