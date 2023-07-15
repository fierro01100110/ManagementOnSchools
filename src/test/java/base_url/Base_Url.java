package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Base_Url {
    public static RequestSpecification spec;
    public static void setSpec(){
        spec=new RequestSpecBuilder().setBaseUri("https://managementonschools.com").build();
    }
}
