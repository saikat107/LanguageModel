<METHOD_START> @ Test public void void ( ) { new ClassPathXmlApplicationContext ( java.lang.Class<? extends org.springframework.aop.config.AopNamespaceHandlerArgNamesTests> ( ) . java.lang.String ( ) + STRING , java.lang.Class<? extends org.springframework.aop.config.AopNamespaceHandlerArgNamesTests> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { new ClassPathXmlApplicationContext ( java.lang.Class<? extends org.springframework.aop.config.AopNamespaceHandlerArgNamesTests> ( ) . java.lang.String ( ) + STRING , java.lang.Class<? extends org.springframework.aop.config.AopNamespaceHandlerArgNamesTests> ( ) ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.aop.config.BeanCreationException ) { assertTrue ( org.springframework.aop.config.BeanCreationException . contains ( java.lang.IllegalArgumentException .class ) ) ; } }  <METHOD_END>
