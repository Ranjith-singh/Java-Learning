package concurency;

//Thread never run in Sequential format they always run in parallel

public class treadng_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=10;
		mathutils m1=new mathutils();
			thread1 t1=new thread1(m1);	//we need to pass the obj of mathutils as the arg to the constructors 
			Thread t2=new Thread(new Thread2(m1));
			t1.start();
			t2.start();	
	}
}
