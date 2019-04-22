import  io.restassured.response.Response;
import org.testng.Assert;

public class ResponseResult {

    private static int pageNum=0;
    Result result;
    private io.restassured.response.Response response;
    public Result getResponse(){
        result=new Result();
        Request request = new Request();
        do {
            pageNum++;
           response = request.getVideoByPage(pageNum);
           Assert.assertEquals(response.statusCode(),200);
           result.setIsMore(response.jsonPath().getBoolean("more"));
           result.addHdVideosResult(response.jsonPath().<Boolean>getList("response.flags.hd"));
        }while (result.isIsMore());
        result.setPagesVisited(pageNum);
        return result;
    }
}
