package _p112_ControlVentas;

import java.util.ArrayList;

public class Tienda extends Cliente{
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private ArrayList<Cliente> clientes;
    public Tienda() {
        clientes = new ArrayList<>();
    }
    public Tienda(String nombre, String propietario, String domicilio) {
        this(); 
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getPropietario() {
        return Propietario;
    }
    public void setPropietario(String propietario) {
        Propietario = propietario;
    }
    public String getDomicilio() {
        return Domicilio;
    }
    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void setCliente(Cliente cliente1) {
        this.clientes.add(cliente1);
    }

    public double getTotal() {
        double total = 0.0;
        for (Cliente cliente : clientes){
            total += cliente.getTotal();
        }
        return total;
    }
    public void reporte() {
        System.out.println("Reporte de la tienda: " + Nombre);
        System.out.println("Propietario: " + Propietario);
        System.out.println("Domicilio: " + Domicilio);
        System.out.println("Total de ventas de la tienda: $" + getTotal());
        System.out.println("Reporte de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("\t>> " + cliente.toString());
        }

        System.out.println("\nReporte de ventas de los clientes :");
        for (Cliente cliente : clientes) {
            System.out.println("> Cliente : " + cliente.getNombre());
            for (Venta venta : cliente.getVentas()) {
                System.out.println("\t>> " + venta.toString());
                
            }
        }
    }
    public void reporteClientesSinVentas() {
        System.out.println("Reporte de clientes sin ventas : " + this);
        for (Cliente cliente : clientes) {
            if (cliente.getVentas().isEmpty()) {
                System.out.println(">> " + cliente);
            }
        }
    }
    
    public void reporteVentasClientes() {
        System.out.println("Reporte de ventas de los clientes : " + this);
        for (Cliente cliente : clientes) {
            if (!cliente.getVentas().isEmpty()) {
                System.out.println("> Cliente : " + cliente.getNombre());
                for (Venta venta : cliente.getVentas()) {
                    System.out.println("\t>> " + venta.toString());
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Tienda [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Domicilio=" + Domicilio + ", clientes=" + clientes + "]";
    }
    
    
}