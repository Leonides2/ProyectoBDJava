
package logic;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class Pedido {
    
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static int IDindex = 0;
    private int ID;
    private String Tipo;
    private String Talla;
    private int Cantidad;
    private String CodigoDiseno;
    private String TipoPedido;
    private String FormaPago;
    private String Direccion;
    private int NumeroCliente;
    private String NombreCliente;
    
    DefaultTableModel modeloTabla= new DefaultTableModel();
    
    public Pedido(){}
    
    public Pedido(String Tipo, String Talla, int Cantidad, String CodigoDiseno, String TipoPedido, String FormaPago,String Direccion, int NumeroCliente, String NombreCliente) {
        IDindex++;
        ID = IDindex;
        this.Tipo = Tipo;
        this.Talla = Talla;
        this.Cantidad = Cantidad;
        this.CodigoDiseno = CodigoDiseno;
        this.TipoPedido = TipoPedido;
        this.FormaPago = FormaPago;
        this.Direccion = Direccion;
        this.NumeroCliente = NumeroCliente;
        this.NombreCliente = NombreCliente;
        pedidos.add(this);
    }

    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public int getID() {
        return ID;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getCodigoDiseno() {
        return CodigoDiseno;
    }

    public void setCodigoDiseno(String CodigoDiseno) {
        this.CodigoDiseno = CodigoDiseno;
    }

    public String getTipoPedido() {
        return TipoPedido;
    }

    public void setTipoPedido(String TipoPedido) {
        this.TipoPedido = TipoPedido;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public int getNumeroCliente() {
        return NumeroCliente;
    }

    public void setNumeroCliente(int NumeroCliente) {
        this.NumeroCliente = NumeroCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
    
    public DefaultTableModel generarModeloTabla(){
         Iterator<Pedido> iterator = pedidos.iterator();
         modeloTabla = new DefaultTableModel();
         
         modeloTabla.addColumn("ID"); 
         modeloTabla.addColumn("Tipo");
         modeloTabla.addColumn("Talla");
         modeloTabla.addColumn("Cantidad");
         modeloTabla.addColumn("Codigo");
         modeloTabla.addColumn("Tipo de pedido");
         modeloTabla.addColumn("Forma de pago");
         modeloTabla.addColumn("Direccion de entrega");
         modeloTabla.addColumn("Numero de cliente");
         modeloTabla.addColumn("Nombre cliente");
         
         while(iterator.hasNext()){
            Pedido pedido = iterator.next();
            Object [] filas = new Object[10];
            
            filas[0] = "" + pedido.getID();
            filas[1] = pedido.getTipo();
            filas[2] = pedido.getTalla();
            filas[3] = pedido.getCantidad();
            filas[4] = pedido.getCodigoDiseno();
            filas[5] = pedido.getTipoPedido();
            filas[6] = pedido.getFormaPago();
            filas[7] = (pedido.getDireccion().equals("")) ?  "-----": pedido.getDireccion();
            filas[8] = pedido.getNumeroCliente();
            filas[9] = pedido.getNombreCliente();
             
            modeloTabla.addRow(filas);
            
         }
         
         return modeloTabla;
     }
    
    public DefaultTableModel generarModeloTabla(int i) {
        // Crear el modelo de tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();

        // Agregar columnas al modelo de tabla
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Talla");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Tipo de pedido");
        modeloTabla.addColumn("Forma de pago");
        modeloTabla.addColumn("Direccion de entrega");
        modeloTabla.addColumn("Numero de cliente");
        modeloTabla.addColumn("Nombre cliente");

        // Iterar sobre la lista de pedidos
        Iterator<Pedido> iterator = pedidos.iterator();
        while (iterator.hasNext()) {
            Pedido pedido = iterator.next();

            // Verificar si el número de cliente coincide
            if (pedido.getNumeroCliente() == i) {
              
                Object[] fila = new Object[10];
                fila[0] = pedido.getID();
                fila[1] = pedido.getTipo();
                fila[2] = pedido.getTalla();
                fila[3] = pedido.getCantidad();
                fila[4] = pedido.getCodigoDiseno();
                fila[5] = pedido.getTipoPedido();
                fila[6] = pedido.getFormaPago();
                fila[7] = pedido.getDireccion().isEmpty() ? "-----" : pedido.getDireccion();
                fila[8] = pedido.getNumeroCliente();
                fila[9] = pedido.getNombreCliente();

                // Agregar la fila al modelo de tabla
                modeloTabla.addRow(fila);
            }
        }

        return modeloTabla;
    }
    
     public DefaultTableModel generarModeloTabla(ArrayList<Pedido> Lista){
         Iterator<Pedido> iterator = Lista.iterator();
         modeloTabla = new DefaultTableModel();
         
         modeloTabla.addColumn("ID"); 
         modeloTabla.addColumn("Tipo");
         modeloTabla.addColumn("Talla");
         modeloTabla.addColumn("Cantidad");
         modeloTabla.addColumn("Codigo");
         modeloTabla.addColumn("Tipo de pedido");
         modeloTabla.addColumn("Forma de pago");
         modeloTabla.addColumn("Direccion de entrega");
         modeloTabla.addColumn("Numero de cliente");
         modeloTabla.addColumn("Nombre cliente");
         
         while(iterator.hasNext()){
            Pedido pedido = iterator.next();
            Object [] filas = new Object[10];
            
            filas[0] = "" + pedido.getID();
            filas[1] = pedido.getTipo();
            filas[2] = pedido.getTalla();
            filas[3] = pedido.getCantidad();
            filas[4] = pedido.getCodigoDiseno();
            filas[5] = pedido.getTipoPedido();
            filas[6] = pedido.getFormaPago();
            filas[7] = (pedido.getDireccion().equals("")) ?  "-----": pedido.getDireccion();
            filas[8] = pedido.getNumeroCliente();
            filas[9] = pedido.getNombreCliente();
             
            modeloTabla.addRow(filas);
            
         }
         
         return modeloTabla;
     }
    
    public void editarPedido(Pedido pedido, int index){
        pedidos.set(index, pedido);
    }
    
    public static Pedido getPedidoByID(int i){
        for(Pedido pedido: pedidos){
            if(pedido.ID == i){
                return pedido;
            }
        }
        return null;
    }
    
    public int cantidadBinario(){
        return convertidorBinario(Cantidad);
    }
    
    private int convertidorBinario(int i) {
        // Caso base: si i es 0 o 1, su representación binaria es él mismo.
        if (i == 0 || i == 1) {
            return i;
        } else {
            // Llamada recursiva: desplazamos a la izquierda el resultado de la división de i entre 2
            return (i % 2) + 10 * convertidorBinario(i / 2);
        }
    }
    
    
    public DefaultTableModel ordenarPedidosPorCodigoDiseno() {
        // Paso 1: Copiar datos a un arreglo primitivo de cadenas de texto
        String[] codigosDiseno = new String[pedidos.size()];
        for (int i = 0; i < pedidos.size(); i++) {
            codigosDiseno[i] = pedidos.get(i).getCodigoDiseno();
        }

        // Paso 2: Implementar el algoritmo de merge sort
        mergeSort(codigosDiseno, 0, codigosDiseno.length - 1);

        // Paso 3: Actualizar el ArrayList pedidos basado en el orden del arreglo ordenado
        ArrayList<Pedido> pedidosOrdenados = new ArrayList<>();
        for (String codigo : codigosDiseno) {
            for (Pedido pedido : pedidos) {
                if (pedido.getCodigoDiseno().equals(codigo)) {
                    pedidosOrdenados.add(pedido);
                    break;
                }
            }
        }

         DefaultTableModel ListaOrdenada = generarModeloTabla(pedidosOrdenados);
         return ListaOrdenada;
    }
    
    public DefaultTableModel ordenarPedidosPorNumeroCliente() {
        // Paso 1: Copiar datos a un arreglo primitivo
        int[] numerosCliente = new int[pedidos.size()];
        for (int i = 0; i < pedidos.size(); i++) {
            numerosCliente[i] = pedidos.get(i).getNumeroCliente();
        }

        // Paso 2: Implementar el algoritmo de inserción
        insertionSort(numerosCliente);

        // Paso 3: Actualizar el ArrayList pedidos basado en el orden del arreglo ordenado
        ArrayList<Pedido> pedidosOrdenados = new ArrayList<>();
        for (int numero : numerosCliente) {
            for (Pedido pedido : pedidos) {
                if (pedido.getNumeroCliente() == numero) {
                    pedidosOrdenados.add(pedido);
                    break;
                }
            }
        }

        DefaultTableModel ListaOrdenada = generarModeloTabla(pedidosOrdenados);
        return ListaOrdenada;
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            
            // Desplazar los elementos del arreglo que son mayores que key hacia adelante
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
     private static void mergeSort(String[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
     
      private static void merge(String[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) >= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
