
package clasesprincipales;

public class Clientes {
    private int id_clientes ; 
    private String nombreCliente ;
    private String dniCliente ; 
    
    public Clientes() {
    }

    public Clientes(int id_clientes, String nombreCliente, String dniCliente) {
        this.id_clientes = id_clientes;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
    }

    /**
     * @return the id_clientes
     */
    public int getId_clientes() {
        return id_clientes;
    }

    /**
     * @param id_clientes the id_clientes to set
     */
    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the dniCliente
     */
    public String getDniCliente() {
        return dniCliente;
    }

    /**
     * @param dniCliente the dniCliente to set
     */
    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }
}
