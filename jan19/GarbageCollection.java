package jan19;

public class GarbageCollection
{
    public void justMethod()
    {
        GarbageCollection gv=new GarbageCollection();
        //out of scope ->ready for gc

    }
    public static void main(String[] args) {
        GarbageCollection garbageCollection1=new GarbageCollection();
        // garbageCollection1= null;//is ready for gc
        GarbageCollection garbageCollection2=new GarbageCollection();
        System.out.println(garbageCollection1.hashCode());
        System.out.println(garbageCollection2.hashCode());
        garbageCollection1=garbageCollection2;
        System.out.println(garbageCollection1.hashCode());
        System.out.println(garbageCollection2.hashCode());
        //first object is ready for gc


    }
}
