<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { new AnnotationBeanWiringInfoResolver ( ) . resolveWiringInfo ( null ) ; fail ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {		} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationBeanWiringInfoResolver org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver = new AnnotationBeanWiringInfoResolver ( ) ; BeanWiringInfo org.springframework.beans.factory.annotation.BeanWiringInfo = org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver . resolveWiringInfo ( STRING ) ; assertNull ( STRING , org.springframework.beans.factory.annotation.BeanWiringInfo ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationBeanWiringInfoResolver org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver = new AnnotationBeanWiringInfoResolver ( ) ; BeanWiringInfo org.springframework.beans.factory.annotation.BeanWiringInfo = org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver . resolveWiringInfo ( new org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolverTests.Soap ( ) ) ; assertNotNull ( STRING , org.springframework.beans.factory.annotation.BeanWiringInfo ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationBeanWiringInfoResolver org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver = new AnnotationBeanWiringInfoResolver ( ) ; BeanWiringInfo org.springframework.beans.factory.annotation.BeanWiringInfo = org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver . resolveWiringInfo ( new org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolverTests.WirelessSoap ( ) ) ; assertNotNull ( STRING , org.springframework.beans.factory.annotation.BeanWiringInfo ) ; assertFalse ( org.springframework.beans.factory.annotation.BeanWiringInfo . indicatesAutowiring ( ) ) ; assertEquals ( org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolverTests.WirelessSoap .class . java.lang.String ( ) , org.springframework.beans.factory.annotation.BeanWiringInfo . getBeanName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationBeanWiringInfoResolver org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver = new AnnotationBeanWiringInfoResolver ( ) ; BeanWiringInfo org.springframework.beans.factory.annotation.BeanWiringInfo = org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver . resolveWiringInfo ( new org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolverTests.NamedWirelessSoap ( ) ) ; assertNotNull ( STRING , org.springframework.beans.factory.annotation.BeanWiringInfo ) ; assertFalse ( org.springframework.beans.factory.annotation.BeanWiringInfo . indicatesAutowiring ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.annotation.BeanWiringInfo . getBeanName ( ) ) ; }  <METHOD_END>