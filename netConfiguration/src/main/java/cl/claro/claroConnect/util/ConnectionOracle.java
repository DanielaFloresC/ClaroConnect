package cl.claro.claroConnect.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConnectionOracle {
		 
    protected void  conexion() throws IOException {
        
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/UsersDB");
            Connection conn = ds.getConnection();
                        
             
            
	        } catch (NamingException ex) {
	            System.err.println(ex);
	        } catch (SQLException ex) {
	            System.err.println(ex);
	        }
        
    }
}