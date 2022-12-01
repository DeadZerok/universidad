
package Modelo;


public class Vehiculo_ {
   
    private String Marca;
    private String Placa;
    private String Color;
    private String propietario;
    private String imagen;

    public Vehiculo_(String Marca, String Placa, String Color, String propietario, String imagen) {
        this.Marca = Marca;
        this.Placa = Placa;
        this.Color = Color;
        this.propietario = propietario;
        this.imagen=imagen ;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }    
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    
    
    
}
