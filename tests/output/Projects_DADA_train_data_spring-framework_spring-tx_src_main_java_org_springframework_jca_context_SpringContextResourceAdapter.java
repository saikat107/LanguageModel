<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jca.context.ConfigurableEnvironment org.springframework.jca.context.ConfigurableEnvironment ( ) { return new StandardEnvironment ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BootstrapContext org.springframework.jca.context.BootstrapContext ) throws org.springframework.jca.context.ResourceAdapterInternalException { if ( org.springframework.jca.context.Log . isInfoEnabled ( ) ) { org.springframework.jca.context.Log . info ( STRING + org.springframework.jca.context.BootstrapContext ) ; } this . org.springframework.jca.context.ConfigurableApplicationContext = org.springframework.jca.context.ConfigurableApplicationContext ( org.springframework.jca.context.BootstrapContext ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jca.context.ConfigurableApplicationContext org.springframework.jca.context.ConfigurableApplicationContext ( BootstrapContext org.springframework.jca.context.BootstrapContext ) { ResourceAdapterApplicationContext org.springframework.jca.context.ResourceAdapterApplicationContext = new ResourceAdapterApplicationContext ( org.springframework.jca.context.BootstrapContext ) ; org.springframework.jca.context.ResourceAdapterApplicationContext . setClassLoader ( java.lang.Class<? extends org.springframework.jca.context.SpringContextResourceAdapter> ( ) . java.lang.ClassLoader ( ) ) ; java.lang.String [] java.lang.String[] = StringUtils . tokenizeToStringArray ( java.lang.String ( ) , java.lang.String ) ; if ( java.lang.String[] != null ) { void ( org.springframework.jca.context.ResourceAdapterApplicationContext , java.lang.String[] ) ; } org.springframework.jca.context.ResourceAdapterApplicationContext . refresh ( ) ; return org.springframework.jca.context.ResourceAdapterApplicationContext ; }  <METHOD_END>
<METHOD_START> protected void void ( BeanDefinitionRegistry org.springframework.jca.context.BeanDefinitionRegistry , java.lang.String [] java.lang.String[] ) { new XmlBeanDefinitionReader ( org.springframework.jca.context.BeanDefinitionRegistry ) . loadBeanDefinitions ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { org.springframework.jca.context.Log . info ( STRING ) ; this . org.springframework.jca.context.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageEndpointFactory org.springframework.jca.context.MessageEndpointFactory , ActivationSpec org.springframework.jca.context.ActivationSpec )			throws org.springframework.jca.context.ResourceException { throw new NotSupportedException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageEndpointFactory org.springframework.jca.context.MessageEndpointFactory , ActivationSpec org.springframework.jca.context.ActivationSpec ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.transaction.xa.XAResource [] javax.transaction.xa.XAResource[] ( ActivationSpec [] org.springframework.jca.context.ActivationSpec[] ) throws org.springframework.jca.context.ResourceException { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( java.lang.Object instanceof org.springframework.jca.context.SpringContextResourceAdapter && ObjectUtils . nullSafeEquals ( java.lang.String ( ) , ( ( org.springframework.jca.context.SpringContextResourceAdapter ) java.lang.Object ) . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return ObjectUtils . nullSafeHashCode ( java.lang.String ( ) ) ; }  <METHOD_END>
