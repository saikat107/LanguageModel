<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new ClassNameBeanWiringInfoResolver ( ) . resolveWiringInfo ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClassNameBeanWiringInfoResolver org.springframework.beans.factory.wiring.ClassNameBeanWiringInfoResolver = new ClassNameBeanWiringInfoResolver ( ) ; java.lang.Long java.lang.Long = new java.lang.Long ( NUMBER ) ; BeanWiringInfo org.springframework.beans.factory.wiring.BeanWiringInfo = org.springframework.beans.factory.wiring.ClassNameBeanWiringInfoResolver . resolveWiringInfo ( java.lang.Long ) ; assertNotNull ( org.springframework.beans.factory.wiring.BeanWiringInfo ) ; assertEquals ( STRING , java.lang.Long . java.lang.Class<? extends java.lang.Long> ( ) . java.lang.String ( ) , org.springframework.beans.factory.wiring.BeanWiringInfo . getBeanName ( ) ) ; }  <METHOD_END>