package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Character{
    @Id
    private Long id;
    private String name;
    private String nameOfSeries;
    private boolean gender;
    private String hairColor;
    private String specialAbilities;
    private String affiliation;

    public Character(){

    }
    
    public Character(String nameOfSeries, String name, boolean gender, String hairColor, String specialAbilities, String affiliation) {
        this.nameOfSeries = nameOfSeries;
        this.name = name;
        this.gender = gender;
        this.hairColor = hairColor;
        this.specialAbilities = specialAbilities;
        this.affiliation = affiliation;
    }
    
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNameOfSeries() {
        return this.nameOfSeries;
    }

    public void setNameOfSeries(String nameOfSeries) {
        this.nameOfSeries = nameOfSeries;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSpecialAbilities() {
        return this.specialAbilities;
    }

    public void setSpecialAbilities(String specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    public String getAffiliation() {
        return this.affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

}



    

    