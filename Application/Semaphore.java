/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author BMW
 */
public class Semaphore extends Thread
{
    int value;
     public Semaphore(int i)
    {
        value=i;
    }
    public synchronized void P()
    {
        if(value<=0)
        try
        {
            wait();
        }
        catch(InterruptedException Exp)
        {
            System.out.println(Exp.toString());
        }
        value--;
    }
    public synchronized void V()
    {
        value++;
        //notifyAll();
        notify();
    }
}
