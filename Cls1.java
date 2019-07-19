interface hasTail{
int getTailLength();
}

abstract class Puma implements hasTail{
protected int getTailLength(){
return 4;
}
}

class Cls1 extends Puma{
public static void main(String args[])
{
Puma p1=new Puma();
System.out.println(p1.getTailLength());
}
int getTailLength()
{
return 2;
}
}
