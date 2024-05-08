
public class Code88 {

	public static int[] makeArray(int size)
    {   // s는 5로 size(int A[])는 5개의 정수를 담을 수 있는 1차원 배열
	    int A[] = new int[size];
    	for (int i = 0; i < size; i++)
		    A[i] = i * i;
    	return A;
    	
    }
    
	public static void main(String[] args) 
	{
		int s = 5;
		int B[] = makeArray(s);
		for (int i = 0; i < B.length; i++)
	        System.out.println(B[i]);

	}

}
