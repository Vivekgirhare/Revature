package jan19;

class IpAddressnotFound extends Exception{
    public IpAddressnotFound()
    {

    }
    public IpAddressnotFound(String message)
    {
        super(message);

    }
    public static void validateIp(String ipaddress) throws IpAddressnotFound {
        if (ipaddress=="192.168.2.2")
        {
            System.out.println("connected");
        }
        else {
            throw new IpAddressnotFound("Please enter valid IP Address");
        }
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) throws IpAddressnotFound {
        // IpAddressnotFound ipAddressnotFound=new IpAddressnotFound();
        IpAddressnotFound.validateIp("192.168.2.2");
    }
}