package Control;

import Modelo.Usuario_;
import Modelo.Vehiculo_;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

public class ControlUsuario {

//    metodo que va registrar usuarios
    private static ArrayList<Usuario_> listaUsuarios = new ArrayList<>();
    private static ArrayList<Vehiculo_> listaVehiculos = new ArrayList<>();

    public void RegistrarUsuario(String nombreUsuario, String apellidoUsuario, long identificaionUsuario, long telefonoUsuario) {

        listaUsuarios.add(new Usuario_(nombreUsuario, apellidoUsuario, identificaionUsuario, telefonoUsuario));
        JOptionPane.showMessageDialog(null, "Se Registro El Cliente Con Exito");

    }

    public void LlenarTablaUsuario(JTable table) {
        DefaultTableModel tabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }
        };

        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Identificacion");
        tabla.addColumn("Telefono");

        Object[] datos = new Object[4];

        for (Usuario_ usuario : listaUsuarios) {
            datos[0] = usuario.getNombre();
            datos[1] = usuario.getApellido();
            datos[2] = usuario.getIdentificacion();
            datos[3] = usuario.getTelefono();

            tabla.addRow(datos);

        }

        table.setRowHeight(30);
        table.setModel(tabla);
        table.setAutoCreateRowSorter(true);

    }

    public void eliminarTabla(JTable table) {

        DefaultTableModel tabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }
        };

        if (table.getSelectedRow() != -1) {

//            debido a que estamos utilizando arraylis tenemos que eliminar es la
//            posicion del array donde se encuentran los datos
//            table.getSelectedRow() nos indica la posicion de la fila seleccionada
//            en la interfaz
            int respuesta;
            respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar la fila?", "Advertencia", JOptionPane.YES_NO_OPTION);

            if (respuesta == 0) {
                listaUsuarios.remove(table.getSelectedRow());
            }

        } else {
            JOptionPane.showMessageDialog(null, "no has seleccionado ninguna fila para ser eliminada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void ModificarTabla(JTable table, String nombreUsuario, String apellidoUsuario, long identificaionUsuario, long telefonoUsuario) {
        DefaultTableModel tabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }
        };

        Usuario_ usuariomod = new Usuario_(nombreUsuario, apellidoUsuario, identificaionUsuario, telefonoUsuario);

        if (table.getSelectedRow() != -1) {

//            debido a que estamos utilizando arraylis tenemos que eliminar es la
//            posicion del array donde se encuentran los datos
//            table.getSelectedRow() nos indica la posicion de la fila seleccionada
//            en la interfaz
            listaUsuarios.set(table.getSelectedRow(), usuariomod);

            JOptionPane.showMessageDialog(null, "Se Modifico El usuario Con Exito");

        } else {
            JOptionPane.showMessageDialog(null, "no has seleccionado ninguna fila para ser Modificada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }

    public String nombrePosi(JTable table) {

        return listaUsuarios.get(table.getSelectedRow()).getNombre();
    }

    public String apellidoposi(JTable table) {

        return listaUsuarios.get(table.getSelectedRow()).getApellido();
    }

    public long identificacionPosi(JTable table) {

        return listaUsuarios.get(table.getSelectedRow()).getIdentificacion();
    }

    public long telefonoPosi(JTable table) {

        return listaUsuarios.get(table.getSelectedRow()).getTelefono();
    }

    public void llenarListaBox(JComboBox caja) {

        Object[] nombre = new Object[1];

        for (Usuario_ usuario : listaUsuarios) {

            nombre[0] = usuario.getNombre() + " " + usuario.getApellido();
            caja.addItem(nombre[0]);
        }

    }

//    vehiculo
    public void RegistrarVehiculo(String MarcaVehiculo, String PlacaVehiculo, String ColorVehiculo, String fotoVehiculo, String imagen) {

        listaVehiculos.add(new Vehiculo_(MarcaVehiculo, PlacaVehiculo, ColorVehiculo, fotoVehiculo, imagen));

        JOptionPane.showMessageDialog(null, "Se Registro El vehiculo Con Exito");

    }

    public void LlenarTablaVehiculo(JTable table) {

        DefaultTableModel tabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }

        };

        tabla.addColumn("Marca");
        tabla.addColumn("Placa");
        tabla.addColumn("Color");
        tabla.addColumn("Nombre");
        tabla.addColumn("Foto");

        Object[] datosVehiculo = new Object[5];

        for (Vehiculo_ vehiculo : listaVehiculos) {

            datosVehiculo[0] = vehiculo.getMarca();
            datosVehiculo[1] = vehiculo.getPlaca();
            datosVehiculo[2] = vehiculo.getColor();
            datosVehiculo[3] = vehiculo.getPropietario();
            datosVehiculo[4] = new JLabel(new ImageIcon(vehiculo.getImagen()));
            tabla.addRow(datosVehiculo);

            System.out.println("hola" + vehiculo.getImagen());

        }

        table.setRowHeight(150);
        table.setModel(tabla);
        table.setAutoCreateRowSorter(true);
    }

    public void llenarListaBoxFacturaPropietario(JComboBox caja) {

        Object[] nombre = new Object[1];

        for (Vehiculo_ vehiculo : listaVehiculos) {

            nombre[0] = vehiculo.getPropietario();
            caja.addItem(nombre[0]);
        }

    }

    public void llenarListaBoxFacturaPlaca(JComboBox caja) {

        Object[] placa = new Object[1];

        for (Vehiculo_ vehiculo : listaVehiculos) {

            placa[0] = vehiculo.getPlaca();
            caja.addItem(placa[0]);
        }

    }

    public void eliminarTablaVehiculo(JTable table) {

        DefaultTableModel tabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }
        };

        if (table.getSelectedRow() != -1) {

//            debido a que estamos utilizando arraylis tenemos que eliminar es la
//            posicion del array donde se encuentran los datos
//            table.getSelectedRow() nos indica la posicion de la fila seleccionada
//            en la interfaz
            int respuesta;
            respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar la fila?", "Advertencia", JOptionPane.YES_NO_OPTION);

            if (respuesta == 0) {
                listaVehiculos.remove(table.getSelectedRow());
            }

        } else {
            JOptionPane.showMessageDialog(null, "no has seleccionado ninguna fila para ser eliminada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void ModificarTablaVehiculo(JTable table, String Marca, String Placa, String Color, String propietario, String imagen) {
        DefaultTableModel tabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }
        };

        Vehiculo_ vehiculomod = new Vehiculo_(Marca, Placa, Color, propietario, imagen);

        if (table.getSelectedRow() != -1) {

//            debido a que estamos utilizando arraylis tenemos que eliminar es la
//            posicion del array donde se encuentran los datos
//            table.getSelectedRow() nos indica la posicion de la fila seleccionada
//            en la interfaz
            listaVehiculos.set(table.getSelectedRow(), vehiculomod);

            JOptionPane.showMessageDialog(null, "Se Modifico El vehuculo Con Exito");

        } else {
            JOptionPane.showMessageDialog(null, "no has seleccionado ninguna fila para ser Modificada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }

    public String marcaPosi(JTable table) {

        return listaVehiculos.get(table.getSelectedRow()).getMarca();
    }

    public String PlacaPosi(JTable table) {

        return listaVehiculos.get(table.getSelectedRow()).getPlaca();
    }

    public String ColorPosi(JTable table) {

        return listaVehiculos.get(table.getSelectedRow()).getColor();
    }

    public String PropietarioPosi(JTable table) {

        return listaVehiculos.get(table.getSelectedRow()).getPropietario();
    }

    public String Fotoposi(JTable table) {
        return listaVehiculos.get(table.getSelectedRow()).getImagen();

    }

    public int posiTabla(JTable table) {
        return table.getSelectedRow();
    }

    public String image(JTable table) {
        return listaVehiculos.get(new Vista.vehiculo().posi()).getImagen();
    }
}
