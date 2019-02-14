package Oracle;

import java.sql.SQLException;

public class test {
    
    public test() {
        super();
    }
    
    public static void main(String [] args) throws SQLException {
        String usr="system";
        String ps="system123";
        String surl="jdbc:oracle:thin:@localhost:1521:ORCL";
        ConexionOracle conexion=new ConexionOracle(usr, ps, surl);
        conexion.conectar();
        //conexion.crearTabla();
        //conexion.ingresarDatosBD("2", "Adrian", 23);
        //String d=conexion.LeerDatosBD();
        //System.out.println(d);
        String d=conexion.BuscarRegistroBD("2");
        System.out.println(d);
    }
    

}