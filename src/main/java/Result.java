import java.util.ArrayList;
import java.util.List;

/**
 * This class will store the results captured from the each page of API response
 * For example, isMore data true/false,
 * list of all hd flag values from previous+current page
 * total page visited
 */
public class Result {
    private boolean isMore;
    private List<Boolean> hd;
    private static int pagesVisited;

    /**
     * Constructor to initialize 'more' flag and list of hd flag.
     */
    public Result(){
        setIsMore(true);
        hd= new ArrayList<Boolean>();
    }

    /**
     * This method is used to add the value of hd flag in the list
     * @param isHdVidoe
     */
    public  void addHdVideosResult(List<Boolean> isHdVidoe){
        hd.addAll(isHdVidoe);
    }

    public boolean isIsMore() {
        return isMore;
    }

    public void setIsMore(boolean isMore) {
        this.isMore = isMore;
    }

    public List<Boolean> getHd() {
        return hd;
    }

    public void setHd(List<Boolean> hd) {
        this.hd = hd;
    }

    public static int getPagesVisited() {
        return pagesVisited;
    }

    public void setPagesVisited(int pagesVisited) {
        this.pagesVisited = pagesVisited;
    }

    /**
     *
     * @return
     */
    public  HdCount getHdCount(){
        int countTrue=0;
        int countFalse=0;
        for (boolean value :hd){
            if (value){
                countTrue++;
            }
            else countFalse++;
        }
        return new HdCount(countTrue,countFalse);
    }
}
