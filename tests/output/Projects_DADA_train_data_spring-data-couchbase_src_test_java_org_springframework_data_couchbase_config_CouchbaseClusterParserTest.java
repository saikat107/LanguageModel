<METHOD_START> @ BeforeClass public static void void ( ) { org.springframework.data.couchbase.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; BeanDefinitionReader org.springframework.data.couchbase.config.BeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.couchbase.config.DefaultListableBeanFactory ) ; int int = org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; java.lang.System . java.io.PrintStream . void ( int ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) {	}  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getFactoryMethodName ( ) , is ( equalTo ( STRING ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , CouchbaseEnvironment .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , instanceOf ( RuntimeBeanReference .class ) ) ; RuntimeBeanReference org.springframework.data.couchbase.config.RuntimeBeanReference = ( RuntimeBeanReference ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( org.springframework.data.couchbase.config.RuntimeBeanReference . getBeanName ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getFactoryMethodName ( ) , is ( equalTo ( STRING ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.util.List .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , is ( instanceOf ( java.util.List .class ) ) ) ; java.util.List java.util.List = ( java.util.List<java.lang.String> < java.lang.String > ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( java.util.List . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( ( java.lang.String ) java.util.List . java.lang.Object ( NUMBER ) , is ( equalTo ( STRING ) ) ) ; assertThat ( ( java.lang.String ) java.util.List . java.lang.Object ( NUMBER ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , CouchbaseEnvironment .class ) ; GenericBeanDefinition org.springframework.data.couchbase.config.GenericBeanDefinition = ( GenericBeanDefinition ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( org.springframework.data.couchbase.config.GenericBeanDefinition . getBeanClassName ( ) , is ( equalTo ( CouchbaseEnvironmentFactoryBean .class . java.lang.String ( ) ) ) ) ; assertThat ( STRING , org.springframework.data.couchbase.config.GenericBeanDefinition . getPropertyValues ( ) . contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , CouchbaseEnvironment .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , instanceOf ( RuntimeBeanReference .class ) ) ; RuntimeBeanReference org.springframework.data.couchbase.config.RuntimeBeanReference = ( RuntimeBeanReference ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( org.springframework.data.couchbase.config.RuntimeBeanReference . getBeanName ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getFactoryMethodName ( ) , is ( equalTo ( STRING ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getIndexedArgumentValues ( ) . get ( NUMBER ) . getValue ( ) , instanceOf ( GenericBeanDefinition .class ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getIndexedArgumentValues ( ) . get ( NUMBER ) . getValue ( ) , instanceOf ( java.util.List .class ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , CouchbaseEnvironment .class ) ; GenericBeanDefinition org.springframework.data.couchbase.config.GenericBeanDefinition = ( GenericBeanDefinition ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( org.springframework.data.couchbase.config.GenericBeanDefinition . getBeanClassName ( ) , is ( equalTo ( CouchbaseEnvironmentFactoryBean .class . java.lang.String ( ) ) ) ) ; assertThat ( STRING , org.springframework.data.couchbase.config.GenericBeanDefinition . getPropertyValues ( ) . contains ( STRING ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.util.List .class ) ; java.util.List java.util.List = ( java.util.List<java.lang.String> < java.lang.String > ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( java.util.List . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( ( java.lang.String ) java.util.List . java.lang.Object ( NUMBER ) , is ( equalTo ( STRING ) ) ) ; assertThat ( ( java.lang.String ) java.util.List . java.lang.Object ( NUMBER ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
