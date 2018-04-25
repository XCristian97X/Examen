package huevoSorpresa;
/**
 * 
 * @author Cristian_Lopera_Sanchez
 */
public class HuevoSorpresaCristianLopera {
    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
     /**
     * @return Devuelve el atributon unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades el set de unidades
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return Devuelve el atributo precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio el set de precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return Devuelve el atributo sorpresa.
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa el set de sorpresa.
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return Devuelve el precio máximo
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * @param precio_max el set de precio_max
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }
    
/*Constructor por defecto*/
public HuevoSorpresaCristianLopera(){}


/*Constructor por parámetros*/
public HuevoSorpresaCristianLopera(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}


/*Método que devuelve el número de huevos sorpresa que tiene la tienda*/
public int obtenerUnidades(){return this.getUnidades();}

/*Método que devuelve el precio que tiene cada huevo sorpresa*/
public double obtenerPrecio(){return this.getPrecio();}



/*Método que permite modificar el número de huevos sorpresa que tiene la tienda*/
public void modificarUnidades(int unidades){this.setUnidades(unidades);}


/*Método que permite sacar huevos sopresa si se tiene suficiente dinero y hay 
suficientes huevos sorpresas, este método se probará con JUnit*/
/**
 * 
 * @param unidades Son las unidades de huevos disponibles.
 * @param dinero Es el dinero del comprador
 * @param sorpresa Es el nuevo parámetro introducido.
 * @throws Exception Es la excepción que salta si ocurre algún error.
 */
public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}


/*Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual el aumento 
que se indica siempre que no se sobrepase el precio máximo de venta, este método se probará con JUnit*/
/**
 * 
 * @param aumento Es el aumento que se aplicará.
 * @throws Exception Es la excepción que salta si ocurre algún error.
 */
public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}
}