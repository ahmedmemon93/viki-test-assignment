import org.testng.Assert;

/**
 * This class is used to get the response and
 * visit all the pages till 'more' flag is false
 */
public class ResponseResult {

    private static int pageNum = 0;
    Result result;
    private io.restassured.response.Response response;

    /**
     * This method will get the response and will
     * apply the logic to get all 'hd' flags in each page.
     * This also checks whether the API response is 200 or not,
     * If the response is other than success (200) the program will throw exception.
     *
     * @return
     */
    public Result getResponse() {
        result = new Result();
        Request request = new Request();
        do {
            pageNum++;
            response = request.getVideoByPage(pageNum);
            Assert.assertEquals(response.statusCode(), 200);
            result.setIsMore(response.jsonPath().getBoolean("more"));
            result.addHdVideosResult(response.jsonPath().<Boolean>getList("response.flags.hd"));
        } while (result.isIsMore());
        result.setPagesVisited(pageNum);
        return result;
    }
}
