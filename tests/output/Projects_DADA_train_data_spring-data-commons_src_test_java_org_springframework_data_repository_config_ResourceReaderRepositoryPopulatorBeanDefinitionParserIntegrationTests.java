<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.data.repository.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.data.repository.config.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.repository.config.DefaultListableBeanFactory ) ; org.springframework.data.repository.config.XmlBeanDefinitionReader . loadBeanDefinitions ( org.springframework.data.repository.config.ClassPathResource ( ) ) ; BeanDefinition org.springframework.data.repository.config.BeanDefinition = org.springframework.data.repository.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.repository.config.BeanDefinition ) . isNotNull ( ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.config.DefaultListableBeanFactory . getBean ( STRING ) ; assertThat ( java.lang.Object ) . isInstanceOf ( ResourceReaderRepositoryPopulator .class ) ; java.lang.Object java.lang.Object = ReflectionTestUtils . getField ( java.lang.Object , STRING ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Jackson2ResourceReader .class ) ; java.lang.Object java.lang.Object = ReflectionTestUtils . getField ( java.lang.Object , STRING ) ; void ( java.lang.Object , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.data.repository.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.data.repository.config.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.repository.config.DefaultListableBeanFactory ) ; org.springframework.data.repository.config.XmlBeanDefinitionReader . loadBeanDefinitions ( org.springframework.data.repository.config.ClassPathResource ( ) ) ; BeanDefinition org.springframework.data.repository.config.BeanDefinition = org.springframework.data.repository.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.repository.config.BeanDefinition ) . isNotNull ( ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.config.DefaultListableBeanFactory . getBean ( STRING ) ; assertThat ( java.lang.Object ) . isInstanceOf ( ResourceReaderRepositoryPopulator .class ) ; java.lang.Object java.lang.Object = ReflectionTestUtils . getField ( java.lang.Object , STRING ) ; assertThat ( java.lang.Object ) . isInstanceOf ( UnmarshallingResourceReader .class ) ; java.lang.Object java.lang.Object = ReflectionTestUtils . getField ( java.lang.Object , STRING ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Jaxb2Marshaller .class ) ; java.lang.Object java.lang.Object = ReflectionTestUtils . getField ( java.lang.Object , STRING ) ; void ( java.lang.Object , STRING ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { assertThat ( java.lang.Object ) . isInstanceOf ( java.util.List .class ) ; java.util.List<?> < ? > java.util.List<?> = ( java.util.List<?> < ? > ) java.lang.Object ; assertThat ( java.util.List<> ) . isNotEqualTo ( empty ( ) ) ; java.lang.Object java.lang.Object = java.util.List<> . get ( NUMBER ) ; assertThat ( java.lang.Object ) . isInstanceOf ( ClassPathResource .class ) ; ClassPathResource org.springframework.data.repository.config.ClassPathResource = ( ClassPathResource ) java.lang.Object ; assertThat ( org.springframework.data.repository.config.ClassPathResource . getPath ( ) ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.repository.config.ClassPathResource org.springframework.data.repository.config.ClassPathResource ( ) { return new ClassPathResource ( STRING , org.springframework.data.repository.config.ResourceReaderRepositoryPopulatorBeanDefinitionParserIntegrationTests .class ) ; }  <METHOD_END>
