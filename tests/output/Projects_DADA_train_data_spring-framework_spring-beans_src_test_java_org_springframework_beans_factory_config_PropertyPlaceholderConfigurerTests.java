<METHOD_START> @ Before public void void ( ) { org.springframework.beans.factory.config.AbstractBeanDefinition = rootBeanDefinition ( TestBean .class ) . addPropertyValue ( STRING , STRING + java.lang.String + STRING ) . getBeanDefinition ( ) ; org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( java.lang.String , java.lang.String ) ; java.lang.System . java.lang.String ( java.lang.String , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( java.lang.String , java.lang.String ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer ( ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setProperties ( java.util.Properties ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { java.lang.System . java.lang.String ( java.lang.String ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.beans.factory.config.DefaultListableBeanFactory . registerBeanDefinition ( STRING , genericBeanDefinition ( TestBean .class ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ) ; PropertyPlaceholderConfigurer org.springframework.beans.factory.config.PropertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer ( ) ; Resource org.springframework.beans.factory.config.Resource = new ClassPathResource ( STRING , this . java.lang.Class<? extends org.springframework.beans.factory.config.PropertyPlaceholderConfigurerTests> ( ) ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setLocation ( org.springframework.beans.factory.config.Resource ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( STRING , STRING ) ; org.springframework.beans.factory.config.AbstractBeanDefinition = rootBeanDefinition ( TestBean .class ) . addPropertyValue ( STRING , STRING + java.lang.String + STRING ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ; registerWithGeneratedName ( org.springframework.beans.factory.config.AbstractBeanDefinition , org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; TestBean org.springframework.beans.factory.config.TestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getName ( ) , equalTo ( java.lang.String ) ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getSex ( ) , equalTo ( STRING ) ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( ) ; registerWithGeneratedName ( org.springframework.beans.factory.config.AbstractBeanDefinition , org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; TestBean org.springframework.beans.factory.config.TestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getName ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { registerWithGeneratedName ( org.springframework.beans.factory.config.AbstractBeanDefinition , org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; TestBean org.springframework.beans.factory.config.TestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getName ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { registerWithGeneratedName ( org.springframework.beans.factory.config.AbstractBeanDefinition , org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setSystemPropertiesMode ( PropertyPlaceholderConfigurer . SYSTEM_PROPERTIES_MODE_OVERRIDE ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; TestBean org.springframework.beans.factory.config.TestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getName ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { registerWithGeneratedName ( org.springframework.beans.factory.config.AbstractBeanDefinition , org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; java.lang.System . java.lang.String ( java.lang.String ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setSystemPropertiesMode ( PropertyPlaceholderConfigurer . SYSTEM_PROPERTIES_MODE_OVERRIDE ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; TestBean org.springframework.beans.factory.config.TestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getName ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { registerWithGeneratedName ( org.springframework.beans.factory.config.AbstractBeanDefinition , org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; java.lang.System . java.lang.String ( java.lang.String ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setSearchSystemEnvironment ( false ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setSystemPropertiesMode ( PropertyPlaceholderConfigurer . SYSTEM_PROPERTIES_MODE_OVERRIDE ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; TestBean org.springframework.beans.factory.config.TestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getName ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; AbstractBeanDefinition org.springframework.beans.factory.config.AbstractBeanDefinition = rootBeanDefinition ( TestBean .class ) . addPropertyValue ( STRING , STRING + java.lang.String + STRING ) . addPropertyValue ( STRING , STRING + java.lang.String + STRING ) . getBeanDefinition ( ) ; org.springframework.beans.factory.config.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.config.AbstractBeanDefinition ) ; org.springframework.beans.factory.config.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.config.AbstractBeanDefinition ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setIgnoreUnresolvablePlaceholders ( true ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; java.lang.System . java.lang.String ( java.lang.String , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( java.lang.String , java.lang.String ) ; java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( java.lang.String , java.lang.String ) ; PropertyPlaceholderConfigurer org.springframework.beans.factory.config.PropertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer ( ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setSystemPropertiesMode ( PropertyPlaceholderConfigurer . SYSTEM_PROPERTIES_MODE_OVERRIDE ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setProperties ( java.util.Properties ) ; java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( java.lang.String , java.lang.String ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; TestBean org.springframework.beans.factory.config.TestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING , TestBean .class ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getName ( ) , equalTo ( java.lang.String ) ) ; TestBean org.springframework.beans.factory.config.TestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING , TestBean .class ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getName ( ) , equalTo ( java.lang.String ) ) ; assertThat ( org.springframework.beans.factory.config.TestBean . getCountry ( ) , equalTo ( java.lang.String ) ) ; java.lang.System . java.lang.String ( java.lang.String ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PropertyPlaceholderConfigurer org.springframework.beans.factory.config.PropertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer ( ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setPlaceholderPrefix ( STRING ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setPlaceholderSuffix ( STRING ) ; DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.beans.factory.config.DefaultListableBeanFactory . registerBeanDefinition ( STRING , rootBeanDefinition ( TestBean .class ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ) ; java.lang.System . java.lang.String ( STRING , STRING ) ; java.lang.System . java.lang.String ( STRING , STRING ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; java.lang.System . java.lang.String ( STRING ) ; java.lang.System . java.lang.String ( STRING ) ; assertThat ( org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) . getName ( ) , is ( STRING ) ) ; assertThat ( org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) . getSex ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PropertyPlaceholderConfigurer org.springframework.beans.factory.config.PropertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer ( ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setNullValue ( STRING ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( STRING , STRING ) ; DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.beans.factory.config.DefaultListableBeanFactory . registerBeanDefinition ( STRING , rootBeanDefinition ( TestBean .class ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; assertThat ( org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) . getName ( ) , nullValue ( ) ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PropertyPlaceholderConfigurer org.springframework.beans.factory.config.PropertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer ( ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( STRING , STRING ) ; DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.beans.factory.config.DefaultListableBeanFactory . registerBeanDefinition ( STRING , rootBeanDefinition ( TestBean .class ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; assertThat ( org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) . getName ( ) , equalTo ( STRING ) ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PropertyPlaceholderConfigurer org.springframework.beans.factory.config.PropertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer ( ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . setTrimValues ( true ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( STRING , STRING ) ; DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.beans.factory.config.DefaultListableBeanFactory . registerBeanDefinition ( STRING , rootBeanDefinition ( TestBean .class ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ) ; org.springframework.beans.factory.config.PropertyPlaceholderConfigurer . postProcessBeanFactory ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) ; assertThat ( org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( TestBean .class ) . getName ( ) , equalTo ( STRING ) ) ; java.util.Map<java.lang.String,java.lang.String> ( ) . java.lang.String ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private static java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.util.Collections .class . java.lang.Class<?>[] ( ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.lang.System . java.util.Map<java.lang.String,java.lang.String> ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { if ( STRING . boolean ( java.lang.Class<> . java.lang.String ( ) ) ) { try { java.lang.reflect.Field java.lang.reflect.Field = java.lang.Class<> . java.lang.reflect.Field ( STRING ) ; java.lang.reflect.Field . void ( true ) ; java.lang.Object java.lang.Object = java.lang.reflect.Field . java.lang.Object ( java.util.Map<java.lang.String,java.lang.String> ) ; if ( java.lang.Object != null && java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) . boolean ( STRING ) ) { return ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ) java.lang.Object ; } } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.RuntimeException ( java.lang.Exception ) ; } } } java.lang.Class<?> < ? > java.lang.Class<?> ; try { java.lang.Class<?> = java.lang.Class . java.lang.Class<?> ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.RuntimeException ( java.lang.Exception ) ; } try { java.lang.reflect.Field java.lang.reflect.Field = java.lang.Class<> . java.lang.reflect.Field ( STRING ) ; java.lang.reflect.Field . void ( true ) ; java.lang.Object java.lang.Object = java.lang.reflect.Field . java.lang.Object ( null ) ; return ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ) java.lang.Object ; } catch ( java.lang.NoSuchFieldException java.lang.NoSuchFieldException ) { } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.RuntimeException ( java.lang.Exception ) ; } try { java.lang.reflect.Field java.lang.reflect.Field = java.lang.Class<> . java.lang.reflect.Field ( STRING ) ; java.lang.reflect.Field . void ( true ) ; java.lang.Object java.lang.Object = java.lang.reflect.Field . java.lang.Object ( null ) ; return ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ) java.lang.Object ; } catch ( java.lang.NoSuchFieldException java.lang.NoSuchFieldException ) { } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.RuntimeException ( java.lang.Exception ) ; } throw new java.lang.IllegalStateException ( ) ; }  <METHOD_END>