
public class VariablesScope
{
    static int staticCount=0;
    int instanceCount=0;
    final int finalValue=100;
    public void scopes()
    {
        int localValue=10;
        if(localValue>5)
        {
            int blockVariable=50;
            System.out.println("BLOCK VARIABLE IS:"+ blockVariable);
        }
        System.out.println("STATIC VARIABLE IS:"+staticCount);
        System.out.println("THE INSTANCE  VARIABLE IS:"+instanceCount);
        System.out.println("THE FINAL VARIABLE IS:"+finalValue);
        System.out.println("THE LOCAL VARIABLE IS:"+localValue);
    }

public static void main (String args[])
{
    VariablesScope ob1=new VariablesScope();

    ob1.instanceCount=10;
    ob1.scopes();
}
}