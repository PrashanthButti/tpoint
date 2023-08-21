package Practice;

public class Copy_array {

	private static int i;

	public static void main(String[] args) {
		int a[]=new int[] {1,3,4,5};
		int[] b=new int[a.length];
		for(int i=0;i<a.length ;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length ;i++)
		{
		System.out.println(a[i]+" ");
		}
		System.out.println();
		System.out.println("new elements: ");
		for(int i=0;i<b.length ;i++)
		{
			System.out.println(b[i]+" ");
		}
	}

}

