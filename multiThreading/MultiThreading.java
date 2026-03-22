
public class MultiThreading{
    static class Vehicle extends Thread{
        String name;
        Vehicle(String name){
            this.name= name;
        }
        public void run(){
            System.out.println(name+" vehicle is being run by"+ Thread.currentThread().getName());
        }
    }

    static class Vehicle1 implements Runnable{
        String name;
        Vehicle1(String name){
            this.name= name;
        }
        // @Override
        public void run(){
            System.out.println(name+" vehicle is being run by"+ Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        // Vehicle v1= new Vehicle("bike");
        // Vehicle v2= new Vehicle("car");
        // Vehicle v3= new Vehicle("tempo");
        // v1.start();
        // v2.start();
        // v3.start();

        Thread t1= new Thread(new Vehicle1("bike"));
        Thread t2= new Thread(new Vehicle1("car"));
        Thread t3= new Thread(new Vehicle1("tempo"));
        t1.start();
        t2.start();
        t3.start();
    }
}