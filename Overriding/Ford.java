package Overriding;


class CarClass 
{
    public Number speedLimit() 
    {
        return 10;
    }
}
class Ford extends CarClass 
{
    public Integer speedLimit()
    {
        return 55;
    }
    public static void main(String args[])
    {
    	CarClass obj = new Ford();
    	Number num= obj.speedLimit();
    	System.out.println("Speed Limit is: "+num);
    }
}
