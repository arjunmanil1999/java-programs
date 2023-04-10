class CPU
{
double price;
class Processor
{
double cores;
String manufacturer;
double getcache()
{
return 4.3;
}
}
protected class RAM
{
double memory;
String manufacturer;
double getclockspeed()
{
return 5.5;
}
}
}
public class CPUdetails
{
public static void main(String[] args)
{
CPU cpu=new CPU();
CPU.Processor processor=cpu.new Processor();
CPU.RAM ram=cpu.new RAM();
System.out.println("Processor-cache:"+processor.getcache());
System.out.println("Ram-clock-speed:"+ram.getclockspeed());
}
}
