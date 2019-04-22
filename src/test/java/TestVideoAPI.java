import io.restassured.RestAssured;
import org.testng.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestVideoAPI {

    @BeforeMethod
    public void configRestAssure(){
        RestAssured.baseURI="http://api.viki.io/";
    }

    @Test
   public void testCountOfHdVideos(){
        HdCount count;
        ResponseResult responseResult = new ResponseResult();
        System.out.println("\nPlease wait while all the API pages are checked \n\n"+"********** Checking **************");
         count= responseResult.getResponse().getHdCount();
         System.out.println("\n\n*****Results******\n\n");
         System.out.println("Total pages visited  "+Result.getPagesVisited());
         System.out.println("Total count of Response.flags.hd  as True is "+count.getCountTrue());
         System.out.println("Total count of Response.flags.hd  as False is "+count.getCountFalse());
    }
}
