public class Tram extends Transporte implements Electrico{

    private String id;
    private static int idNumber;

    public Tram(int capacidad){
        this.id= "Tram_" + idNumber++;
        super.setCapacidad(capacidad);
    }

    @Override
    public void cambiarBateria() {
        System.out.println("cargar bateria " + id);
    }

    @Override
    public void calcularAutonomia() {
        System.out.println("Calcular autonomia " + id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tram{");
        sb.append("id='").append(id).append('\'');
        sb.append(", capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }
}
