package br.com.io.github.application.helper;

import com.google.gson.Gson;

public class Utils {

    private static Gson gson = new Gson();

    public Utils(){
        throw new IllegalStateException("Utility class");
    }

    public static String objectToJson(Object object){
        return gson.toJson(object);
    }

}
