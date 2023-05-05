/**
 * Clase Producto
 *  Esta es la clase que representa un producto en la aplicación.
 */

public class Producto {
        private String nombre;
        private double precio;

        /** 
         * Constructor
         * Crea un nuevo objeto Producto con el nombre y el precio proporcionados como parámetros.
        */
        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        /**
         * getNombre 
         * @return Devuelve el nombre del producto.
         */

        public String getNombre() {
            return nombre;
        }

        /**
         * setNombre
         * Establece un nuevo nombre para el producto.
         * @param nombre
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * getPrecio
         * @return Devuelve el precio del producto.
         */
        public double getPrecio() {
            return precio;
        }

        /**
         * setPrecio
         * Establece un nuevo precio para el producto.
         * @param precio
         */

        public void setPrecio(double precio) {
            this.precio = precio;
        }   
}