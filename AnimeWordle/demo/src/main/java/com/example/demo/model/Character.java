package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
//This is our Character Creation class, where a character is made based on specific characteristics.
public class Character{
    @Id
    private Long id;
    private String name;
    private String nameOfSeries;
    private boolean gender;
    private String hairColor;
    private String specialAbilities;
    private String affiliation;

    public Character(String nameOfSeries, String name, boolean gender, String hairColor, String specialAbilities, String affiliation) {
        this.nameOfSeries = nameOfSeries;
        this.name = name;
        this.gender = gender;
        this.hairColor = hairColor;
        this.specialAbilities = specialAbilities;
        this.affiliation = affiliation;
    }

    public Character(){
        this(" ", " ", true, " ", " ", " ");
    }
    
    /**
     * Compares two objects if they are equal.
     * If the objects being compared have the same reference, it's the same object
     * 
     * If the objects being compared are both character objects, then comparison
     * between each field is done and a message is printed in console accordingly, 
     * but this doesn't check if two characters have the same name because
     * name check is a separate check
     * 
     * otherwise, the objects are not equal
     * @param anObject Object to be compared
     * @return true if the two objects share the same reference or if the character's attributes are all equal, false otherwise
     */
    @Override
    public boolean equals(Object anObject) {
        if(this == anObject) {
            System.out.println("this is the same object");
            return true;
        }
        else if(anObject instanceof Character character) {
            boolean equals = true;
            if(nameOfSeries.equalsIgnoreCase(character.getNameOfSeries())) {
                System.out.println("Correct name of series");
            }
            else {
                System.out.println("Wrong name of series");
                equals = false;
            }
            
            if(gender == character.getGender()) {
                System.out.println("Correct gender");
            }
            else {
                System.out.println("Wrong gender");
                equals = false;
            }
            
            if(hairColor.equalsIgnoreCase(character.getHairColor())) {
                System.out.println("Correct hair color");
            }
            else {
                System.out.println("Wrong hair color");
                equals = false;
            }
            
            if(specialAbilities.equalsIgnoreCase(character.getSpecialAbilities())) {
                System.out.println("Correct special ability");
            }
            else {
                System.out.println("Wrong special ability");
                equals = false;
            }
            
            if(affiliation.equalsIgnoreCase(character.getAffiliation())) {
                System.out.println("Correct affiliation");
            }
            else {
                System.out.println("Wrong affiliation");
                equals = false;
            }
            
            return equals;
        }
        
        return false;
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



    

    