<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfigurationWithValidatingSetter .class ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfiguration .class ) ; try { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.boot.context.properties.BeanCreationException ) { RelaxedBindingNotWritablePropertyException org.springframework.boot.context.properties.RelaxedBindingNotWritablePropertyException = ( RelaxedBindingNotWritablePropertyException ) org.springframework.boot.context.properties.BeanCreationException . getRootCause ( ) ; assertThat ( org.springframework.boot.context.properties.RelaxedBindingNotWritablePropertyException . getMessage ( ) ) . startsWith ( STRING + TestPropertySourceUtils . INLINED_PROPERTIES_PROPERTY_SOURCE_NAME + STRING + STRING + org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfiguration .class . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfigurationWithoutJSR303 .class ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfigurationWithJSR303 .class ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfiguration .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; ConfigurationPropertiesBindingPostProcessor org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor = this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( ConfigurationPropertiesBindingPostProcessor .class ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor , STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MockEnvironment org.springframework.boot.context.properties.MockEnvironment = new MockEnvironment ( ) ; org.springframework.boot.context.properties.MockEnvironment . setProperty ( STRING , STRING ) ; org.springframework.boot.context.properties.MockEnvironment . setProperty ( STRING , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . setEnvironment ( org.springframework.boot.context.properties.MockEnvironment ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfigurationWithJSR303 .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MockEnvironment org.springframework.boot.context.properties.MockEnvironment = new MockEnvironment ( ) ; org.springframework.boot.context.properties.MockEnvironment . setProperty ( STRING , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . setEnvironment ( org.springframework.boot.context.properties.MockEnvironment ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfigurationWithValidationAndInterface .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ValidatedPropertiesImpl .class ) . getFoo ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MockEnvironment org.springframework.boot.context.properties.MockEnvironment = new MockEnvironment ( ) ; org.springframework.boot.context.properties.MockEnvironment . setProperty ( STRING , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . setEnvironment ( org.springframework.boot.context.properties.MockEnvironment ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfigurationWithInitializer .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfigurationWithCustomValidator .class ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MockEnvironment org.springframework.boot.context.properties.MockEnvironment = new MockEnvironment ( ) ; org.springframework.boot.context.properties.MockEnvironment . setProperty ( STRING , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . setEnvironment ( org.springframework.boot.context.properties.MockEnvironment ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.TestConfigurationWithCustomValidator .class , org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithValidatingSetter .class ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; void ( STRING ) ; void ( STRING ) ; void ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , java.lang.String ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithEnum .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithEnum .class ) . getTheValue ( ) ) . isEqualTo ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum , org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ) ; void ( STRING , org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ) ; void ( STRING , org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ) ; void ( STRING , org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum , org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ... org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum[] ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , java.lang.String ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithEnum .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithEnum .class ) . getTheValues ( ) ) . contains ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum[] ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithValue .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithValue .class ) . getValue ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ConfigurationPropertiesWithFactoryBean . boolean = false ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) { @ java.lang.Override protected void void ( ) org.springframework.boot.context.properties.BeansException { assertThat ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ConfigurationPropertiesWithFactoryBean . boolean ) . as ( STRING ) . isFalse ( ) ; super. onRefresh ( ) ; } } ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ConfigurationPropertiesWithFactoryBean .class ) ; GenericBeanDefinition org.springframework.boot.context.properties.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.boot.context.properties.GenericBeanDefinition . setBeanClass ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FactoryBeanTester .class ) ; org.springframework.boot.context.properties.GenericBeanDefinition . setAutowireMode ( AbstractBeanDefinition . AUTOWIRE_BY_TYPE ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . registerBeanDefinition ( STRING , org.springframework.boot.context.properties.GenericBeanDefinition ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ConfigurationPropertiesWithFactoryBean . boolean ) . as ( STRING ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) org.springframework.boot.context.properties.BeansException { assertThat ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ConfigurationPropertiesWithFactoryBean . boolean ) . as ( STRING ) . isFalse ( ) ; super. onRefresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCharArray .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCharArray .class ) . getChars ( ) ) . isEqualTo ( STRING . char[] ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCharArrayExpansion .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCharArrayExpansion .class ) . getChars ( ) ) . isEqualTo ( STRING . char[] ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCharArray .class ) ; this . org.springframework.boot.context.properties.ExpectedException . expect ( BeanCreationException .class ) ; this . org.springframework.boot.context.properties.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , java.lang.String[] ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.RelaxedPropertyNames .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.RelaxedPropertyNames org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.RelaxedPropertyNames = this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.RelaxedPropertyNames .class ) ; assertThat ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.RelaxedPropertyNames . java.lang.String ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.RelaxedPropertyNames . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithNestedValue .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithNestedValue .class ) . getNested ( ) . getValue ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ConfigurationPropertiesWithoutAnnotation .class ) ; this . org.springframework.boot.context.properties.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.context.properties.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.MultiplePropertySourcesPlaceholderConfigurer .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.InternalOutputCapture . toString ( ) ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; TestPropertySourceUtils . addInlinedPropertiesToEnvironment ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . register ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertiesWithMap .class ) ; this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertiesWithMap .class ) . getMap ( ) ) . containsEntry ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( int int ) { try { this . org.springframework.boot.context.properties.AnnotationConfigApplicationContext . refresh ( ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.boot.context.properties.BeanCreationException ) { BindException org.springframework.boot.context.properties.BindException = ( BindException ) org.springframework.boot.context.properties.BeanCreationException . getRootCause ( ) ; assertThat ( org.springframework.boot.context.properties.BindException . getErrorCount ( ) ) . isEqualTo ( int ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithValidatingSetter org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithValidatingSetter ( ) { return new org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithValidatingSetter ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; if ( ! java.lang.String . boolean ( STRING ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithoutJSR303 org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithoutJSR303 ( ) { return new org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithoutJSR303 ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<> . boolean ( java.lang.Class<? extends org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithoutJSR303> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Errors org.springframework.boot.context.properties.Errors ) { ValidationUtils . rejectIfEmpty ( org.springframework.boot.context.properties.Errors , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithJSR303 org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithJSR303 ( ) { return new org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithJSR303 ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ javax.annotation.PostConstruct public void void ( ) { assertThat ( this . java.lang.String ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ValidatedPropertiesImpl org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ValidatedPropertiesImpl ( ) { return new org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ValidatedPropertiesImpl ( ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCustomValidator org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCustomValidator ( ) { return new org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCustomValidator ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.context.properties.Validator org.springframework.boot.context.properties.Validator ( ) { return new org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.CustomPropertyValidator ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<> == org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithCustomValidator .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Errors org.springframework.boot.context.properties.Errors ) { ValidationUtils . rejectIfEmpty ( org.springframework.boot.context.properties.Errors , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> public char [] char[] ( ) { return this . char[] ; }  <METHOD_END>
<METHOD_START> public void void ( char [] char[] ) { this . char[] = char[] ; }  <METHOD_END>
<METHOD_START> public char [] char[] ( ) { return this . char[] ; }  <METHOD_END>
<METHOD_START> public void void ( char [] char[] ) { this . char[] = char[] ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ) { this . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum = org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ( ) { return this . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum> < org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum > java.util.List<org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum> ( ) { return this . java.util.List<org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum> < org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum > java.util.List<org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum> ) { this . java.util.List<org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum> = java.util.List<org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.FooEnum> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Bean public static org.springframework.boot.context.properties.PropertySourcesPlaceholderConfigurer org.springframework.boot.context.properties.PropertySourcesPlaceholderConfigurer ( ) { return new PropertySourcesPlaceholderConfigurer ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.context.properties.Validator org.springframework.boot.context.properties.Validator ( ) { return new LocalValidatorFactoryBean ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { return this . java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { this . java.util.Map<java.lang.String,java.lang.String> = java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Exception { return java.lang.Object .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.ConfigurationPropertiesWithFactoryBean . boolean = true ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithNestedValue.Nested org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithNestedValue.Nested ( ) { return this . org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorTests.PropertyWithNestedValue.Nested ; }  <METHOD_END>
<METHOD_START> @ Bean public static org.springframework.boot.context.properties.PropertySourcesPlaceholderConfigurer org.springframework.boot.context.properties.PropertySourcesPlaceholderConfigurer ( ) { return new PropertySourcesPlaceholderConfigurer ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Bean public static org.springframework.boot.context.properties.PropertySourcesPlaceholderConfigurer org.springframework.boot.context.properties.PropertySourcesPlaceholderConfigurer ( ) { return new PropertySourcesPlaceholderConfigurer ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public static org.springframework.boot.context.properties.PropertySourcesPlaceholderConfigurer org.springframework.boot.context.properties.PropertySourcesPlaceholderConfigurer ( ) { return new PropertySourcesPlaceholderConfigurer ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>