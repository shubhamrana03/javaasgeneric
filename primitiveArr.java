import java.util.*;
class pt
{
   public static <Arr> void display(Arr[] arrayb)
	{
	   for(Arr x:arrayb)
		{
		   System.out.print(x+" ");
		}
		System.out.println();
	}
}
 class primitiveArr
{
	public static void main(String[] s)
	{

		Integer arr[]={11,12,13,14,15,16,17};
		Double ar1[]={2.3,5.6,4.0,3.1,8.9};
		String ar2[]={"chitkara","university","!"};
		Character ar3[]={'A','B','C','D','E'};
		pt.display(arr);
		pt.display(ar1);
		pt.display(ar2);
		pt.display(ar3);
	}
}