<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( BeanFactory org.springframework.jms.support.destination.BeanFactory ) { Assert . notNull ( org.springframework.jms.support.destination.BeanFactory , STRING ) ; this . org.springframework.jms.support.destination.BeanFactory = org.springframework.jms.support.destination.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.jms.support.destination.BeanFactory ) { this . org.springframework.jms.support.destination.BeanFactory = org.springframework.jms.support.destination.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.support.destination.Destination org.springframework.jms.support.destination.Destination ( Session org.springframework.jms.support.destination.Session , java.lang.String java.lang.String , boolean boolean )			throws org.springframework.jms.support.destination.JMSException { Assert . state ( this . org.springframework.jms.support.destination.BeanFactory != null , STRING ) ; try { return this . org.springframework.jms.support.destination.BeanFactory . getBean ( java.lang.String , Destination .class ) ; } catch ( BeansException org.springframework.jms.support.destination.BeansException ) { throw new DestinationResolutionException ( STRING + java.lang.String + STRING , org.springframework.jms.support.destination.BeansException ) ; } }  <METHOD_END>
