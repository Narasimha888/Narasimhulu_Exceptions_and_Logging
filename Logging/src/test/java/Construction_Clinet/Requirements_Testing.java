/**
 * 
 */
package Construction_Clinet;

import static org.junit.Assert.*;

import org.junit.Test;


public class Requirements_Testing {
	Material_Standard_Server object=new Material_Standard_Server();
	@Test
	public void test() {
	assertEquals("1200INR",object.Constructions_Materials("standard materials",0));
	assertEquals("1500INR",object.Constructions_Materials("above standard materials",0));
	assertEquals("1800INR",object.Constructions_Materials("high standard materials",0));
	assertEquals("2500INR",object.Constructions_Materials("high standard materials and fully automated home",8));
	}

}
