<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.jdbc.config.ApplicationContext ( STRING ) ; fail ( STRING ) ; } catch ( BeanDefinitionParsingException org.springframework.integration.jdbc.config.BeanDefinitionParsingException ) { assertTrue ( org.springframework.integration.jdbc.config.BeanDefinitionParsingException . getMessage ( ) . contains ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.jdbc.config.ApplicationContext ( STRING ) ; fail ( STRING ) ; } catch ( BeanDefinitionParsingException org.springframework.integration.jdbc.config.BeanDefinitionParsingException ) { assertTrue ( org.springframework.integration.jdbc.config.BeanDefinitionParsingException . getMessage ( ) . contains ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.jdbc.config.ApplicationContext ( STRING ) ; fail ( STRING ) ; } catch ( BeanDefinitionParsingException org.springframework.integration.jdbc.config.BeanDefinitionParsingException ) { assertTrue ( org.springframework.integration.jdbc.config.BeanDefinitionParsingException . getMessage ( ) . contains ( STRING + STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.jdbc.config.ApplicationContext ( STRING ) ; fail ( STRING ) ; } catch ( BeanDefinitionParsingException org.springframework.integration.jdbc.config.BeanDefinitionParsingException ) { assertTrue ( org.springframework.integration.jdbc.config.BeanDefinitionParsingException . getMessage ( ) . contains ( STRING + STRING ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.jdbc.config.ApplicationContext org.springframework.integration.jdbc.config.ApplicationContext ( java.lang.String java.lang.String ) throws java.lang.Exception { PropertiesFactoryBean org.springframework.integration.jdbc.config.PropertiesFactoryBean = new PropertiesFactoryBean ( ) ; org.springframework.integration.jdbc.config.PropertiesFactoryBean . setLocation ( new ClassPathResource ( STRING ) ) ; org.springframework.integration.jdbc.config.PropertiesFactoryBean . afterPropertiesSet ( ) ; java.util.Properties java.util.Properties = org.springframework.integration.jdbc.config.PropertiesFactoryBean . getObject ( ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.util.Properties . java.lang.String ( STRING ) ) . java.lang.StringBuilder ( java.util.Properties . java.lang.String ( java.lang.String ) ) . java.lang.StringBuilder ( java.util.Properties . java.lang.String ( STRING ) ) ; java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( java.lang.StringBuilder . java.lang.String ( ) . byte[] ( ) ) ; GenericApplicationContext org.springframework.integration.jdbc.config.GenericApplicationContext = new GenericApplicationContext ( ) ; XmlBeanDefinitionReader org.springframework.integration.jdbc.config.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.integration.jdbc.config.GenericApplicationContext ) ; org.springframework.integration.jdbc.config.XmlBeanDefinitionReader . setValidationMode ( XmlBeanDefinitionReader . VALIDATION_XSD ) ; org.springframework.integration.jdbc.config.XmlBeanDefinitionReader . loadBeanDefinitions ( new InputStreamResource ( java.io.ByteArrayInputStream ) ) ; org.springframework.integration.jdbc.config.GenericApplicationContext . refresh ( ) ; return org.springframework.integration.jdbc.config.GenericApplicationContext ; }  <METHOD_END>