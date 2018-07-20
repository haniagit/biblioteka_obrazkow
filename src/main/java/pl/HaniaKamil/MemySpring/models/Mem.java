package pl.HaniaKamil.MemySpring.models;

public class Mem {


    private String name;
    private String address;
    private boolean favourite;

    public Mem(){
    }

    public Mem(String name, String address, boolean favourite) {
        this.name = name;
        this.address = address;
        this.favourite = favourite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return "Nazwa: " + name +
                ", adres: " + address +
                ", ulubiony: " +
                favourite;
    }
}
