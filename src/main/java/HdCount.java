public class HdCount {
    private int countTrue;
    private int countFalse;

    public HdCount (int cTrue, int cFalse){
        countTrue=cTrue;
        countFalse=cFalse;
    }

    public int getCountTrue() {
        return countTrue;
    }

    public void setCountTrue(int countTrue) {
        this.countTrue = countTrue;
    }

    public int getCountFalse() {
        return countFalse;
    }

    public void setCountFalse(int countFalse) {
        this.countFalse = countFalse;
    }
}
