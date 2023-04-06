public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger= logger;
    }
    public void Add(){
        System.out.println("Müşteri eklendi");
        DataBaseLogger logger =new DataBaseLogger();
        logger.Log("");
        this.logger.Log("log mesajı");
    }
}
