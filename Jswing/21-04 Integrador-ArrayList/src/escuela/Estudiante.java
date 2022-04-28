/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    // 4.1 - La finalidad de un constructor es obligar y controlar como se inicializa una instancia de una determinada clase
    // 5.1 - La finalidad de los metodos de acceso es establecer el valor inicial de algun atributo de forma explicita y devolver el valor de algun atributo para su uso
    
    // 1.1 - Una variable global es una variable accesible desde cualquier ambito
    // 1.2 - La diferencia entre un Array normal y una ArrayList es que una Array es una estrucura de datos de tamaño fijo, mientras que arraylist no lo es
    // 1.3 - Es el modelo de tabla que utiliza JTable cuando el programador no define específicamente ningún modelo de tabla. El DefaultTableModel almacena los datos para la JTable en un Vector de Vectores
    
    // 2.1 - Estoy usando: DefaultTableModel(int rowCount, int columnCount), y existen: DefaultTableModel(), DefaultTableModel(int rowCount, int columnCount), DefaultTableModel(Object[][] data, Object[] columNames), DefaultTableModel(OBject[] columnNames, int rowCount), DefaultTableModel(Vector columNames, int rowCount), DefaultTableModel(Vector data, Vector columnNames)
    // 3.1 - El metodo getText() extrae el texto de la variable
    // 3.2 - estudiante = new Estudiante();
    // 4-1 - para que los datos se almacenen en un vector de tipo objeto
    // 6.1 - .setText() extrae el valor de la fila o columna colocada, en este caso, de la fila 0, y del artibuto ID, se le extrae el valor, y .toString, pasa todo la variable a String, como dice su nombre

package escuela;

public class Estudiante {
    String id;
    String nombre;
    String curso;
    String especialidad;
    
    public Estudiante(String id, String nombre, String curso, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
