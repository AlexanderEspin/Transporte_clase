public abstract class Transporte {

    int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Transporte{");
        sb.append(", capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }
}
