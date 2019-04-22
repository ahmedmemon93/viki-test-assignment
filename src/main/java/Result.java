import java.util.ArrayList;
import java.util.List;

public class Result {
    private static boolean isMore;
    private List<Boolean> hd;
    private int pagesVisited;

    public Result(){
        this.setMore(true);
        hd= new ArrayList<Boolean>();
    }
    public  void addHdVideosResult(List<Boolean> isHdVidoe){
        hd.addAll(isHdVidoe);
    }
    public boolean isMore() {
        return isMore;
    }

    public void setMore(boolean more) {
        isMore = more;
    }

    public List<Boolean> getHd() {
        return hd;
    }

    public void setHd(List<Boolean> hd) {
        this.hd = hd;
    }

    public static boolean isIsMore() {
        return isMore;
    }

    public static void setIsMore(boolean isMore) {
        Result.isMore = isMore;
    }

    public int getPagesVisited() {
        return pagesVisited;
    }

    public void setPagesVisited(int pagesVisited) {
        this.pagesVisited = pagesVisited;
    }

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
