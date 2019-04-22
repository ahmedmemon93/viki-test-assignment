/**
 * This class is just to store the hdCount of hd true and false
 */
public class HdCount {
    private int countTrue;
    private int countFalse;

    /**
     * This constructor will save the total count of hd flag true and hd flag false
     *
     * @param cTrue
     * @param cFalse
     */
    public HdCount(int cTrue, int cFalse) {
        countTrue = cTrue;
        countFalse = cFalse;
    }

    /**
     * to get total count of hd flag with value false
     *
     * @return
     */
    public int getCountTrue() {
        return countTrue;
    }

    /**
     * to set total count of hd flag having value true.
     *
     * @param countTrue
     */
    public void setCountTrue(int countTrue) {
        this.countTrue = countTrue;
    }

    /**
     * get total count of hd false flag
     *
     * @return
     */
    public int getCountFalse() {
        return countFalse;
    }

    /**
     * set total count of hd true flag
     *
     * @param countFalse
     */
    public void setCountFalse(int countFalse) {
        this.countFalse = countFalse;
    }
}
