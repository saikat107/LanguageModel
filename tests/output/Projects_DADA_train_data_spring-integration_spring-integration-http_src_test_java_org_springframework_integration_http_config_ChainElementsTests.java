<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.http.config.ApplicationContext ( STRING ) ; fail ( STRING ) ; } catch ( BeanDefinitionParsingException org.springframework.integration.http.config.BeanDefinitionParsingException ) { final java.lang.String java.lang.String = STRING + STRING + STRING ; final java.lang.String java.lang.String = org.springframework.integration.http.config.BeanDefinitionParsingException . getMessage ( ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , java.lang.String . boolean ( java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.http.config.ApplicationContext org.springframework.integration.http.config.ApplicationContext ( java.lang.String java.lang.String ) throws java.lang.Exception { PropertiesFactoryBean org.springframework.integration.http.config.PropertiesFactoryBean = new PropertiesFactoryBean ( ) ; org.springframework.integration.http.config.PropertiesFactoryBean . setLocation ( new ClassPathResource ( STRING ) ) ; org.springframework.integration.http.config.PropertiesFactoryBean . afterPropertiesSet ( ) ; java.util.Properties java.util.Properties = org.springframework.integration.http.config.PropertiesFactoryBean . getObject ( ) ; java.lang.StringBuffer java.lang.StringBuffer = new java.lang.StringBuffer ( ) ; java.lang.StringBuffer . java.lang.StringBuffer ( java.util.Properties . java.lang.String ( STRING ) ) . java.lang.StringBuffer ( java.util.Properties . java.lang.String ( java.lang.String ) ) . java.lang.StringBuffer ( java.util.Properties . java.lang.String ( STRING ) ) ; java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( java.lang.StringBuffer . java.lang.String ( ) . byte[] ( ) ) ; GenericApplicationContext org.springframework.integration.http.config.GenericApplicationContext = new GenericApplicationContext ( ) ; XmlBeanDefinitionReader org.springframework.integration.http.config.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.integration.http.config.GenericApplicationContext ) ; org.springframework.integration.http.config.XmlBeanDefinitionReader . setValidationMode ( XmlBeanDefinitionReader . VALIDATION_XSD ) ; org.springframework.integration.http.config.XmlBeanDefinitionReader . loadBeanDefinitions ( new InputStreamResource ( java.io.ByteArrayInputStream ) ) ; org.springframework.integration.http.config.GenericApplicationContext . refresh ( ) ; return org.springframework.integration.http.config.GenericApplicationContext ; }  <METHOD_END>
