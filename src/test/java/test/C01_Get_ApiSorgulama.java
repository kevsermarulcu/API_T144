package test;

import groovy.transform.ASTTest;
import io.restassured.response.Response;
import jdk.jfr.Timespan;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {

   /* https://restful-booker.herokuapp.com/booking/10 url ine
   bit GET request gönderdiğimizde dönen response un
   status code unun 200,
   content type ının application/json; charset=utf-8,
   ve Server isimli Header ın değerinin Cowboy,
   ve status line ın HTTP/1.1 200 OK
   ve response süresinin 5 sn den kısa olduğunu manuel olarak test ediniz
    */
    @Test
    public void get01(){

        // 1- göndereceğimiz request için gerekli olan url ve ihtiyacımız varsa request body hazırla
        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2- eğer soruda bize verilmişse expected data hazırla

        // 3- bize dönen response u actual data olarak kaydet
        Response response = given().when().get(url);
        response.prettyPrint();

        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Content type : " + response.getContentType());
        System.out.println("Server Header Degeri : " + response.getHeader("Server"));
        System.out.println("Status Line : " + response.getStatusLine());
        System.out.println("Response Suresi : " + response.getTime());

        // 4- expected data ile actual datayı karşılastırmamız yani Assertion yapmamız gerek





    }


}
