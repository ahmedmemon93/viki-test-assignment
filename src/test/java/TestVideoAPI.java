import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestVideoAPI {
    /**
     * Before method will be call automatically before start of the test
     * and it will set the base url
     */
    @BeforeMethod
    public void configRestAssure() {
        RestAssured.baseURI = "http://api.viki.io/";
    }

    /**
     * This is test method which be called when you run mvn clean command
     * This method calls the respective classes and in the end prints the results. 
     */
    @Test
    public void testCountOfHdVideos() {
        HdCount count;
        ResponseResult responseResult = new ResponseResult();
        System.out.println("\nPlease wait while all the API pages are checked \n\n" + "********** Checking **************");
        count = responseResult.getResponse().getHdCount();
        System.out.println("\n\n*****Results******\n\n");
        System.out.println("Total pages visited  " + Result.getPagesVisited());
        System.out.println("Total count of Response.flags.hd  as True is " + count.getCountTrue());
        System.out.println("Total count of Response.flags.hd  as False is " + count.getCountFalse());
    }
}
