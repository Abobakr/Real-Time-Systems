

/**
 *
 * @author BMW
 */
public class Server
{
    public static void main(String[] args)
    {
        if (System.getSecurityManager()==null)
        {
            System.setSecurityManager(new java.rmi.RMISecurityManager());
        }
        try
        {
            Implementation obj = new Implementation();
            java.rmi.Naming.rebind("Server",obj);
            System.out.println("Server object bounded");
        }
        catch (Exception e)
        {
            System.out.println("CommImpl err: " + e.getMessage () );
            e.printStackTrace();
        }
    }

}
