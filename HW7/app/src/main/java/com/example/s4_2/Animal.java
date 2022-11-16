package com.example.s4_2;

import java.util.ArrayList;
import java.util.List;

public class Animal {
     String name;
     String details;
     int thumbnailDrawable;

    public Animal(String name, String details, int thumbnailDrawable) {
        this.name = name;
        this.details = details;
        this.thumbnailDrawable = thumbnailDrawable;
    }

    public static List<Animal> getAnimalList() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Macska", "asdasdasdasdasdasd", R.drawable.cat));
        animalList.add(new Animal("Diszno", "asdasdasdasdasdasd", R.drawable.disznyo));
        animalList.add(new Animal("Kutya", "asdasdasdasdasdasd", R.drawable.dog));
        animalList.add(new Animal("Zsiraf", "asdasdasdasdasdasd", R.drawable.giraffe));
        animalList.add(new Animal("Lo", "asdasdasdasdasdasd", R.drawable.horse));
        animalList.add(new Animal("Oroszlan", "asdasdasdasdasdasd", R.drawable.lion));
        animalList.add(new Animal("Polip1", "asdasdasdasdasdasd", R.drawable.octopus));
        animalList.add(new Animal("Polip2", "asdasdasdasdasdasd", R.drawable.octopus2));
        animalList.add(new Animal("Polip3", "asdasdasdasdasdasd", R.drawable.octopus3));
        animalList.add(new Animal("Nyul", "asdasdasdasdasdasd", R.drawable.rabbit));
        animalList.add(new Animal("Barany", "asdasdasdasdasdasd", R.drawable.sheep));
        return animalList;
    }
}
