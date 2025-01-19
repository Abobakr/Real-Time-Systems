

/**
 *
 * @author BMW
 */
public interface Interface extends java.rmi.Remote
{
    
    double Submit (double BuaghtsCount,int Type) throws java.rmi.RemoteException;
    prices GetPridectedPrice () throws java.rmi.RemoteException;
    prices GetCurrentPrice() throws java.rmi.RemoteException;
}
