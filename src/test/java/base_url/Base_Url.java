package base_url;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Base_Url {
    public static RequestSpecification spec;
    public static void setSpec(){
        spec = new RequestSpecBuilder()
                .addHeader("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBZG1pbiIsImlhdCI6MTY4ODkyNDUxMCwiZXhwIjoxNjg4OTMzMTUwfQ.WFUmyb2eNaS2SMWeSlQE60Uf3iCicado6zS2shwMYD0vR6iPlvfq9R97vZStlnc6Z30uLYJG4u7W5-x1qq0ppA")
                .setBaseUri("https://managementonschools.com/app").build();

    }
}
