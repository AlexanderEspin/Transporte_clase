public class Bus extends Transporte implements Gasolina{

    private String id;
    private static int idNumber;

    public Bus(int capacidad){
        this.id= "Bus_" + (idNumber++);
        super.setCapacidad(capacidad);
    }


    @Override
    public void calcularAceleracion() {
        System.out.println("Calcular aceleración " + id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bus{");
        sb.append("id='").append(id).append('\'');
        sb.append(", capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }
}
