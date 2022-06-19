package ca.georgiancollege.comp1011assignment1;

import javafx.beans.property.SimpleStringProperty;

public class Country {

    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private int Population;

    //Creating a constructor for Country
    public Country(String Code, String Name, String Continent, String Region, int Population){

        this.Code = Code;
        this.Name = Name;
        this.Continent = Continent;
        this.Region = Region;
        this.Population = Population;


    }



    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int Population) {
        this.Population = Population;
    }


    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }
}
