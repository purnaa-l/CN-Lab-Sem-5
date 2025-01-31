import java.util.*;
class Frame{
	int num;
	String data;
	
	Frame(int num, String data){
		this.num=num;
		this.data=data;
	}
}

public class CN2{
	public static void sort(Frame f[]){
	for(int i=0; i<f.length; i++){
		for(int j=0; j<f.length-1; j++){
			if(f[j].num>f[j+1].num){
				Frame temp=f[j];
				f[j]=f[j+1];
				f[j+1]=temp;
			}
		}
	}
	}
	
	public static void main(String args[]){
		System.out.println("Enter the number of frames: ");
		Scanner key=new Scanner(System.in);
		int n=key.nextInt();
		Frame f[]=new Frame[n];
		for(int i=0; i<n; i++){
			System.out.println("Enter the frame number: ");
			int fno=key.nextInt();
			System.out.println("Enter the frame data: ");
			String fdata=key.next();
			f[i]=new Frame(fno, fdata);
		}
			sort(f);
			System.out.println("The sorted frames are as follows: ");
			for(int i=0; i<f.length; i++){
				System.out.println(f[i].num+": "+f[i].data);
			}
		}
}
		
		
