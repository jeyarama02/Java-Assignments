public class BlockOrder
{
    static
    {
        System.out.println(" FIRST STATIC BLOCK WILL EXECUTED");
    }
    {
        System.out.println("THIRD INSTANCE INITIALIZER BLOCK EXECUTED");
    }
    BlockOrder()
    {
        System.out.println("FINALLY CONSTRUCTOR WILL EXCUTE");
        
    }
    public static void main (String args[])
    {
        System.out.println("SECOND MAIN METHOD WILL EXECUTE");

        BlockOrder ob1=new BlockOrder();
        System.out.println("----------------");
        BlockOrder ob2=new BlockOrder();

    }
}
