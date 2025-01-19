/**
 *
 * @author BMW
 */
public class Implementation extends  java.rmi.server.UnicastRemoteObject implements Interface
{
    //double Pridected_PlatinumPrice=10000;
    //double Pridected_GoldPrice=1000;
    //double Pridected_SilverPrice=100;

    double Current_PlatinumPrice=10000;
    double Current_GoldPrice=1000;
    double Current_SilverPrice=100;
    Semaphore SharedSem;
    Buffer SharedBuffer;
    public Implementation() throws java.rmi.RemoteException
    {
        super();
        SharedSem=new Semaphore(1);//1 is the resource pool
        SharedBuffer=new Buffer(10000,1000,100);
    }
    public  double  Submit (double BuaghtsCount,int Type)
    {
        Submit_Thread thread=new Submit_Thread(SharedBuffer, SharedSem, BuaghtsCount,Type);
        thread.start();
        return 0;
    }
    public  prices GetPridectedPrice ()
    {
        prices prices_class=SharedBuffer.get();
        return prices_class;
    }
    public prices GetCurrentPrice()
    {
        prices prices_class=new prices(Current_PlatinumPrice, Current_GoldPrice, Current_SilverPrice);
        return prices_class;
    }
}
