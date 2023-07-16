package base_url;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static utilities.ManagementOnSchoolsAuth.generateToken;

public class Base_Url {
    public static RequestSpecification spec;
    public static void setSpec(){

        spec = new RequestSpecBuilder()
                .addHeader("Authorization", generateToken())
                .setBaseUri("https://managementonschools.com/app").build();
    }
}
