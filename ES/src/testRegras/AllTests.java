package testRegras;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.platform.suite.api.SelectClasses;;

@RunWith(JUnitPlatform.class)
@SelectClasses({FerramentasTest.class, EstruturaTest.class, ResultadosTest.class })
public class AllTests {
}
