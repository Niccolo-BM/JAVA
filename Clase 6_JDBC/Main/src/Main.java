import Controller.StudentController;

public class Main {
    public static void main(String[] args) {
        //System.out.println("JAVA DataBase Connectivity (JDBC)");
        /*  1. hacer consultas

            2. Objet relational mapping (ORM)
                Transformar clases a tablas (atributos, relacion)
                    -> si el atributo no esta en la DB o hace referencia a otra tabla

            3. Diver Manage = Gestiona una lista de driver de DB, establece una conexion de DB la JAVA

            4. Connection = Representa la conexion con una DB en Especifico

            5. Statement = Ejecutasr consultas fijas en SQL fijas
                           Para consultas multiples  -> PreparedStatement, es mas eficiente

            6. PreparedStatement = Extinede el Statement, mas eficiente par consultas de SQL que se repiten y
                                    permite especificar parametros dentro de la Consulta

            7. ResultSet = Resultado de la consulta SQL, proporciona metodos para leer los datos de este resultado

            // Estructura recomendada
                Separacion de responsabilidades Modelo-Vista-Controlador (MVC) -  ENCARPETADO

                - Entity = Entidad
                - DataBase = Configuracion JDBC
                - Modelo = Para sentecias SQL
                - Controller = Controlador
        */

        StudentController objStudenteController = new StudentController();

        objStudenteController.create();



    }
}
