<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { try { ConfigurableApplicationContext org.springframework.data.gemfire.repository.sample.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( java.lang.String ) ; org.springframework.data.gemfire.repository.sample.ConfigurableApplicationContext . getBean ( PlantRepository .class ) ; } catch ( BeanCreationException org.springframework.data.gemfire.repository.sample.BeanCreationException ) { assertTrue ( org.springframework.data.gemfire.repository.sample.BeanCreationException . getCause ( ) instanceof java.lang.IllegalArgumentException ) ; assertEquals ( java.lang.String . java.lang.String ( STRING , java.lang.Long .class . java.lang.String ( ) , java.lang.String .class . java.lang.String ( ) ) , org.springframework.data.gemfire.repository.sample.BeanCreationException . getCause ( ) . getMessage ( ) ) ; throw ( java.lang.IllegalArgumentException ) org.springframework.data.gemfire.repository.sample.BeanCreationException . getCause ( ) ; } }  <METHOD_END>
