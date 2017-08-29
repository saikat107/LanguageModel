<METHOD_START> @ java.lang.Override public final void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final java.lang.String java.lang.String ( ) { return StringUtils . hasText ( this . java.lang.String ) ? this . java.lang.String : this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.context.BeanFactory ) { Assert . notNull ( org.springframework.integration.context.BeanFactory , STRING ) ; this . org.springframework.integration.context.BeanFactory = org.springframework.integration.context.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.integration.context.ApplicationContext ) throws org.springframework.integration.context.BeansException { Assert . notNull ( org.springframework.integration.context.ApplicationContext , STRING ) ; this . org.springframework.integration.context.ApplicationContext = org.springframework.integration.context.ApplicationContext ; }  <METHOD_END>
<METHOD_START> public void void ( DestinationResolver < MessageChannel > org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> ) { Assert . notNull ( org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> , STRING ) ; this . org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> = org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.context.Expression org.springframework.integration.context.Expression ( ) { return this . org.springframework.integration.context.Expression ; }  <METHOD_END>
<METHOD_START> public final void void ( Expression org.springframework.integration.context.Expression ) { this . org.springframework.integration.context.Expression = org.springframework.integration.context.Expression ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final void void ( ) { this . java.util.Properties = IntegrationContextUtils . getIntegrationProperties ( this . org.springframework.integration.context.BeanFactory ) ; try { if ( this . org.springframework.integration.context.MessageBuilderFactory == null ) { if ( this . org.springframework.integration.context.BeanFactory != null ) { this . org.springframework.integration.context.MessageBuilderFactory = IntegrationUtils . getMessageBuilderFactory ( this . org.springframework.integration.context.BeanFactory ) ; } else { this . org.springframework.integration.context.MessageBuilderFactory = new DefaultMessageBuilderFactory ( ) ; } } this . void ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { if ( java.lang.Exception instanceof java.lang.RuntimeException ) { throw ( java.lang.RuntimeException ) java.lang.Exception ; } throw new BeanInitializationException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( ) java.lang.Exception {	}  <METHOD_END>
<METHOD_START> protected final org.springframework.integration.context.BeanFactory org.springframework.integration.context.BeanFactory ( ) { return this . org.springframework.integration.context.BeanFactory ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.context.TaskScheduler org.springframework.integration.context.TaskScheduler ( ) { if ( this . org.springframework.integration.context.TaskScheduler == null && this . org.springframework.integration.context.BeanFactory != null ) { this . org.springframework.integration.context.TaskScheduler = IntegrationContextUtils . getTaskScheduler ( this . org.springframework.integration.context.BeanFactory ) ; } return this . org.springframework.integration.context.TaskScheduler ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> < MessageChannel > org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> ( ) { if ( this . org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> == null ) { this . org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> = new BeanFactoryChannelResolver ( this . org.springframework.integration.context.BeanFactory ) ; } return this . org.springframework.integration.context.DestinationResolver<org.springframework.integration.context.MessageChannel> ; }  <METHOD_END>
<METHOD_START> protected void void ( TaskScheduler org.springframework.integration.context.TaskScheduler ) { Assert . notNull ( org.springframework.integration.context.TaskScheduler , STRING ) ; this . org.springframework.integration.context.TaskScheduler = org.springframework.integration.context.TaskScheduler ; }  <METHOD_END>
<METHOD_START> public final org.springframework.integration.context.ConversionService org.springframework.integration.context.ConversionService ( ) { if ( this . org.springframework.integration.context.ConversionService == null && this . org.springframework.integration.context.BeanFactory != null ) { synchronized ( this ) { if ( this . org.springframework.integration.context.ConversionService == null ) { this . org.springframework.integration.context.ConversionService = IntegrationUtils . getConversionService ( this . org.springframework.integration.context.BeanFactory ) ; } } if ( this . org.springframework.integration.context.ConversionService == null && this . org.springframework.integration.context.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.context.Log . debug ( STRING + this . java.lang.String ( ) + STRING + STRING ) ; } } return this . org.springframework.integration.context.ConversionService ; }  <METHOD_END>
<METHOD_START> protected void void ( ConversionService org.springframework.integration.context.ConversionService ) { this . org.springframework.integration.context.ConversionService = org.springframework.integration.context.ConversionService ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.integration.context.ApplicationContext == null ? null : this . org.springframework.integration.context.ApplicationContext . getId ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.context.ApplicationContext org.springframework.integration.context.ApplicationContext ( ) { return this . org.springframework.integration.context.ApplicationContext ; }  <METHOD_END>
<METHOD_START> protected java.util.Properties java.util.Properties ( ) { return this . java.util.Properties ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.context.MessageBuilderFactory org.springframework.integration.context.MessageBuilderFactory ( ) { if ( this . org.springframework.integration.context.MessageBuilderFactory == null ) { this . org.springframework.integration.context.MessageBuilderFactory = new DefaultMessageBuilderFactory ( ) ; } return this . org.springframework.integration.context.MessageBuilderFactory ; }  <METHOD_END>
<METHOD_START> public void void ( MessageBuilderFactory org.springframework.integration.context.MessageBuilderFactory ) { this . org.springframework.integration.context.MessageBuilderFactory = org.springframework.integration.context.MessageBuilderFactory ; }  <METHOD_END>
<METHOD_START> protected < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) { return this . org.springframework.integration.context.ConversionService . convert ( this . java.util.Properties . java.lang.String ( java.lang.String ) , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < T > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { if ( java.lang.Object == null ) { return null ; } if ( java.lang.Class<T> . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) { return ( T ) java.lang.Object ; } if ( java.lang.Object instanceof Advised ) { TargetSource org.springframework.integration.context.TargetSource = ( ( Advised ) java.lang.Object ) . getTargetSource ( ) ; if ( org.springframework.integration.context.TargetSource == null ) { return null ; } try { return java.lang.Object ( org.springframework.integration.context.TargetSource . getTarget ( ) , java.lang.Class<T> ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return ( this . java.lang.String != null ) ? this . java.lang.String : super. java.lang.String ( ) ; }  <METHOD_END>