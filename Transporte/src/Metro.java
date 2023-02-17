public class Metro extends Transporte implements Electrico {

    private String id;
    private static int idNumber;

    public Metro(int capacidad) {

        this.id = "Metro_" + (idNumber++);
        super.setCapacidad(capacidad);
    }

    @Override
    public void cambiarBateria() {
        System.out.println("Cambiar bateria " + id);
    }

    @Override
    public void calcularAutonomia() {
        System.out.println("Calcular autonomia " + id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Metro{");
        sb.append("id='").append(id).append('\'');
        sb.append(", capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }
}
