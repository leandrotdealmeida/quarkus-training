package org.acme.quickstart.chapter5ProgramModel;

import javax.json.bind.annotation.JsonbProperty;

public class Dev {

    private String name;
    @JsonbProperty("favorite-language")
    String favoriteLanguage;
    private int age;

    public Dev() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
