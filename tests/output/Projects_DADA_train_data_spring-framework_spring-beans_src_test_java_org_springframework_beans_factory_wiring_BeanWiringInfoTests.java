<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new BeanWiringInfo ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new BeanWiringInfo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new BeanWiringInfo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new BeanWiringInfo ( - NUMBER , true ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new BeanWiringInfo ( NUMBER , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanWiringInfo org.springframework.beans.factory.wiring.BeanWiringInfo = new BeanWiringInfo ( BeanWiringInfo . AUTOWIRE_BY_NAME , true ) ; assertTrue ( org.springframework.beans.factory.wiring.BeanWiringInfo . indicatesAutowiring ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanWiringInfo org.springframework.beans.factory.wiring.BeanWiringInfo = new BeanWiringInfo ( STRING ) ; assertFalse ( org.springframework.beans.factory.wiring.BeanWiringInfo . indicatesAutowiring ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanWiringInfo org.springframework.beans.factory.wiring.BeanWiringInfo = new BeanWiringInfo ( BeanWiringInfo . AUTOWIRE_BY_NAME , true ) ; assertTrue ( org.springframework.beans.factory.wiring.BeanWiringInfo . getDependencyCheck ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanWiringInfo org.springframework.beans.factory.wiring.BeanWiringInfo = new BeanWiringInfo ( BeanWiringInfo . AUTOWIRE_BY_TYPE , false ) ; assertFalse ( org.springframework.beans.factory.wiring.BeanWiringInfo . getDependencyCheck ( ) ) ; }  <METHOD_END>
