

/**
 *
 * @author BMW
 */
public class Submit_Thread extends Thread
{
    double BuaghtsCount=0;
    int Type=0;

    Buffer buffer;
    Semaphore sema;
    public Submit_Thread(Buffer buffer, Semaphore sema, double BuaghtsCount,int Type)
    {
        super();
        this.buffer=buffer;
        this.sema=sema;
        this.BuaghtsCount=BuaghtsCount;
        this.Type=Type;
    }
    @Override
    public void run()
    {
        sema.P();
        buffer.set(BuaghtsCount, Type);
        sema.V();
    }
}
