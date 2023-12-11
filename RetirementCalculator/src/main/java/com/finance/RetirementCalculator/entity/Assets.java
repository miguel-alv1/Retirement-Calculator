public class Assets {
    // fields
    private int stocksVal;
    private int altAssetsVal;
    private int realEstate;
    private int cash;

    // empty constructor
    public Assets() {

    }

    public Assets(int stocksVal, int altAssetsVal, int realEstate, int cash){
        this.stocksVal = stocksVal;
        this.altAssetsVal = altAssetsVal;
        this.realEstate = realEstate;
        this.cash = cash;
    }

    public int getStocksVal() {
        return stocksVal;
    }

    public void setStocksVal(int stocksVal) {
        this.stocksVal = stocksVal;
    }

    public int getAltAssetsVal() {
        return altAssetsVal;
    }

    public void setAltAssetsVal(int altAssetsVal) {
        this.altAssetsVal = altAssetsVal;
    }

    public int getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(int realEstate) {
        this.realEstate = realEstate;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

}