package store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Product {
    private List<String> images;
    private String description;

    public Product(List<String> images, String description) {
        this.images = Collections.unmodifiableList(images);
        this.description = description;
    }

    // una forma es devolver una copia, pero te puede fallar los tests de performance en hackerRank (tenerlo en cuenta).
    /*public List<String> getImages(){
        return new ArrayList<>(images);
    }*/

    //otra forma es utilizando listas inmutables
    public List<String> getImages(){
        return images;
    }






}