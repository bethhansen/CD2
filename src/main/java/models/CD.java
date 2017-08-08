package models;

import java.util.ArrayList;

/**
 * Created by Guest on 8/8/17.
 */
public class CD {
    private final String content;
    private static ArrayList<CD> instances = new ArrayList<>();

    public CD (String content){
        this.content = content;
        instances.add(this);
    }

    public String getContent(){
        return content;
    }

    public static ArrayList<CD> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }
 }
