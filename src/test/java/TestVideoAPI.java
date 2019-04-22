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
         count= responseResult.getResponse().getHdCount();
         System.out.print(count.getCountFalse()+ count.getCountTrue());
    }
}
