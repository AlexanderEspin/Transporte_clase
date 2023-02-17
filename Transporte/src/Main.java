public class Main {
    public static void main(String[] args) {

        Tram t1= new Tram(80);
        Tram t2=new Tram(80);
        Bus b1= new Bus(50);
        Bus b2=new Bus(50);
        Metro m1= new Metro(120);
        Metro m2= new Metro(120);

        t1.calcularAutonomia();
        t1.cambiarBateria();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(m1);
        System.out.println(m2);

    }

}
