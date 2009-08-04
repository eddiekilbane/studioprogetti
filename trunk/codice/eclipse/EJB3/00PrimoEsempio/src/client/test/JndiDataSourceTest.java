package client.test;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.sql.DataSource;



public class JndiDataSourceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Hashtable env = new Hashtable();
			//env.put(Context.INITIAL_CONTEXT_FACTORY,
//					"org.jnp.interfaces.NamingContextFactory");
			//env.put(Context.PROVIDER_URL, "localhost");
			//env.put("java.naming.factory.url.pkgs","org.jboss.naming:org.jnp.interfaces");
			//env.put(Context.SECURITY_PRINCIPAL, "username");
			//env.put(Context.SECURITY_CREDENTIALS, "password");

			Context ctx = new InitialContext();
			
			NamingEnumeration ne = ctx.list("");
						
			while(ne.hasMore()){
				javax.naming.NameClassPair item = (javax.naming.NameClassPair)ne.next();
			    String className = item.getClassName();
			    String nomeInNameSpace = item.getName();
			    System.out.print(""+className+":\t");
			    System.out.println(""+nomeInNameSpace);
			}
	        
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
