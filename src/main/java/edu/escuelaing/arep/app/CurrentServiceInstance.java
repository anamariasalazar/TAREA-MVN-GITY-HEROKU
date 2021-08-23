package edu.escuelaing.arep.app;


public class CurrentServiceInstance {
    private static CurrentServiceInstance _instance = new CurrentServiceInstance();
    private HttpStockService service1;
    private HttpStockService service2;
    private CurrentServiceInstance(){
        service1 = new IEXHttpStockService();
        service2 = new AlphaHttpStockService();
    }
    public static CurrentServiceInstance getInstance(){
        return _instance;
    }

    public HttpStockService getService(String tservice){
        if (tservice=="iex"){
            return service1;
        }

        else if (tservice=="alpha"){
            return service2;
        }
        return service1;
    }
}

