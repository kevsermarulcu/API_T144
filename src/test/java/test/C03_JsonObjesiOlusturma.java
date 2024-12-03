package test;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class C03_JsonObjesiOlusturma {
     /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.

    {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":1
    }
    */

    @Test
    public void jsonObj01(){

        JSONObject ilkJsonObje = new JSONObject();

        ilkJsonObje.put("title","Ahmet");
        ilkJsonObje.put("body","Merhaba");
        ilkJsonObje.put("userId","1");

        System.out.println(ilkJsonObje);
    }

    @Test
    public void jsonObje02(){
        /*
                {
                 "firstname":"Jim",
                 "additionalneeds":"Breakfast",
                 "bookingdates":{
                         "checkin":"2018-01-01",
                         "checkout":"2019-01-01"
                                 },
                  "totalprice":111,
                  "depositpaid":true,
                  "lastname":"Brown"
                  }
         */
        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin","2018-02-10");
        bookingdates.put("checkout","2018-03-10");

        JSONObject outerJson = new JSONObject();
        outerJson.put("firstname","jim");
        outerJson.put("additionalneeds","Breakfast");
        outerJson.put("totalprice","111");
        outerJson.put("depositpaid","true");
        outerJson.put("lastname","Brown");
        outerJson.put("bookingdates",bookingdates);

        System.out.println(outerJson);

    }
}
