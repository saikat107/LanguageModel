<METHOD_START> @ Test public void void ( ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , STRING , null , STRING , false , true ) ; RuntimeBeanReference org.springframework.cassandra.config.xml.RuntimeBeanReference = getPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) , STRING ) ; assertThat ( org.springframework.cassandra.config.xml.RuntimeBeanReference ) . isNotNull ( ) ; assertThat ( org.springframework.cassandra.config.xml.RuntimeBeanReference . getBeanName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , STRING , null , null , false , false ) ; BeanDefinition org.springframework.cassandra.config.xml.BeanDefinition = org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) ; assertThat ( org.springframework.cassandra.config.xml.BeanDefinition . getPropertyValues ( ) . contains ( STRING ) ) . isFalse ( ) ; assertThat ( org.springframework.cassandra.config.xml.BeanDefinition . getPropertyValues ( ) . isEmpty ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , STRING , null , STRING , false , false ) ; java.lang.String java.lang.String = getPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) , STRING ) ; assertThat ( java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , STRING , null , null , false , false ) ; BeanDefinition org.springframework.cassandra.config.xml.BeanDefinition = org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) ; assertThat ( org.springframework.cassandra.config.xml.BeanDefinition . getPropertyValues ( ) . contains ( STRING ) ) . isFalse ( ) ; assertThat ( org.springframework.cassandra.config.xml.BeanDefinition . getPropertyValues ( ) . isEmpty ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , STRING , STRING , null , true , true ) ; RuntimeBeanReference org.springframework.cassandra.config.xml.RuntimeBeanReference = getPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) , STRING ) ; assertThat ( org.springframework.cassandra.config.xml.RuntimeBeanReference ) . isNotNull ( ) ; assertThat ( org.springframework.cassandra.config.xml.RuntimeBeanReference . getBeanName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.cassandra.config.xml.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.cassandra.config.xml.ExpectedException . expectMessage ( STRING ) ; ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , STRING , null , STRING , true , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , STRING , STRING , null , true , false ) ; java.lang.String java.lang.String = getPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) , STRING ) ; assertThat ( java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.cassandra.config.xml.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.cassandra.config.xml.ExpectedException . expectMessage ( STRING ) ; ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , STRING , null , STRING , true , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.cassandra.config.xml.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.cassandra.config.xml.ExpectedException . expectMessage ( STRING ) ; ParsingUtils . addProperty ( null , STRING , STRING , STRING , false , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.cassandra.config.xml.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.cassandra.config.xml.ExpectedException . expectMessage ( STRING ) ; ParsingUtils . addProperty ( BeanDefinitionBuilder . genericBeanDefinition ( ) , null , STRING , STRING , false , true ) ; }  <METHOD_END>
