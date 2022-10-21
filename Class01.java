package j09;
class CRectangle{
	int width, height;
	
	public CRectangle(int w,int h) {     //建構元1 (a)
		width=w; height=h;
	}
	
	public CRectangle() {     //建構元2(b)
		/*width=10; height=8;*/
		this(10,8);            //  (c)
		
	}
	public void show() {     //output
		System.out.println(""+width);
		System.out.println(""+height);
	}
}



public class Class01 {

	public static void main(String[] args) {
	CRectangle rec1=new CRectangle(5,2);
	rec1.show();
	CRectangle rec2=new CRectangle();
	rec2.show();
		

	}

}
