import io.restassured.response.Response;

import static io.restassured.RestAssured.get;

/**
 * This class is to get http request using restAssured testing library.
 * It will call the url with dynamic page number and return the response
 */

public class Request {
    private String videoApiCall = "/v4/videos.json?app=100250a&per_page=10&page=";

    /**
     * This method calls the API and returns the response by API
     *
     * @param pageNum
     * @return
     */
    public Response getVideoByPage(int pageNum) {
        return get(videoApiCall + pageNum).andReturn();
    }

}
