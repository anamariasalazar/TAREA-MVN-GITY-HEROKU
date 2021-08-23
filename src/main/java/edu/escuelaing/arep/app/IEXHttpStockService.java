package edu.escuelaing.arep.app;

public class IEXHttpStockService extends HttpStockService{
    String stock="aapl";
    @Override
    public String getURL() {
        return "https://cloud.iexapis.com/stable/stock/"+stock+"/quote?token=pk_1297558dfa2b4a1d82d3b01539bb9e5c";
    }

    @Override
    public void setStock(String stock) {
        this.stock = stock;

    }

    @Override
    public String getStock() {
        return stock;
    }
}