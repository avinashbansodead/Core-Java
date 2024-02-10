package Object_AsReference;

public class Value 
{
private int x;
public Value(int x)
{
	this.x=x;
}

public int findValue(Value v2,Value v3,Val v4)
{
	int sum=this.x+v2.x+v3.x+v4.x;
	return sum;
}
}
