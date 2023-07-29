package utilities;





import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ObjectMapperUtils {



    //we will create a method to handle the exception which can occur by ObjectMapper().readValue()
    //Generic method =  returns any data type
    public static <T> T convertJsonToObject(String json,Class<T> cls){   //<T> means any data type
        try {
         return   new ObjectMapper().readValue(json,cls);
        } catch (IOException   e) {
            throw new RuntimeException(e);
        }

    }







    //This method will accept json data as String, then convert it any data type
    public static <T> T convertJsonToJavaObject(String json, Class<T> cls) {//Generic Method
        try {
            return new ObjectMapper().readValue(json, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}




