import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
public class Request {
    private String videoApiCall="/v4/videos.json?app=100250a&per_page=10&page=";
    private int pageNum=1;



    public Response getVideoByPage(int pageNum){
       return (Response) get(videoApiCall+Integer.toString(pageNum)).andReturn();
    }

}
