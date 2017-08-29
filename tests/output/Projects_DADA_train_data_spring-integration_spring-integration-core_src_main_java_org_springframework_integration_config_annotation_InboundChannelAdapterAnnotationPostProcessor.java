<METHOD_START> public void ( ConfigurableListableBeanFactory org.springframework.integration.config.annotation.ConfigurableListableBeanFactory ) { super( org.springframework.integration.config.annotation.ConfigurableListableBeanFactory ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return AnnotationUtils . VALUE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.reflect.Method java.lang.reflect.Method , java.util.List<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.List<java.lang.annotation.Annotation> ) { java.lang.String java.lang.String = MessagingAnnotationUtils . resolveAttribute ( java.util.List<java.lang.annotation.Annotation> , AnnotationUtils . VALUE , java.lang.String .class ) ; Assert . hasText ( java.lang.String , STRING ) ; MessageSource < ? > org.springframework.integration.config.annotation.MessageSource<?> = null ; try { org.springframework.integration.config.annotation.MessageSource<?> = org.springframework.integration.config.annotation.MessageSource<?> ( java.lang.Object , java.lang.String , java.lang.reflect.Method ) ; } catch ( NoSuchBeanDefinitionException org.springframework.integration.config.annotation.NoSuchBeanDefinitionException ) { if ( this . logger . isDebugEnabled ( ) ) { this . logger . debug ( STRING + org.springframework.integration.config.annotation.NoSuchBeanDefinitionException . getMessage ( ) + STRING ) ; } return null ; } SourcePollingChannelAdapter org.springframework.integration.config.annotation.SourcePollingChannelAdapter = new SourcePollingChannelAdapter ( ) ; org.springframework.integration.config.annotation.SourcePollingChannelAdapter . setOutputChannelName ( java.lang.String ) ; org.springframework.integration.config.annotation.SourcePollingChannelAdapter . setSource ( org.springframework.integration.config.annotation.MessageSource<> ) ; configurePollingEndpoint ( org.springframework.integration.config.annotation.SourcePollingChannelAdapter , java.util.List<java.lang.annotation.Annotation> ) ; return org.springframework.integration.config.annotation.SourcePollingChannelAdapter ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.config.annotation.MessageSource<?> < ? > org.springframework.integration.config.annotation.MessageSource<?> ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.reflect.Method java.lang.reflect.Method ) { if ( AnnotatedElementUtils . isAnnotated ( java.lang.reflect.Method , Bean .class . java.lang.String ( ) ) ) { java.lang.Object java.lang.Object = this . resolveTargetBeanFromMethodWithBeanAnnotation ( java.lang.reflect.Method ) ; Assert . isInstanceOf ( MessageSource .class , java.lang.Object , STRING + this . annotationType + STRING + STRING + MessageSource .class . java.lang.String ( ) + STRING ) ; return ( MessageSource < ? > ) java.lang.Object ; } else { MethodInvokingMessageSource org.springframework.integration.config.annotation.MethodInvokingMessageSource = new MethodInvokingMessageSource ( ) ; org.springframework.integration.config.annotation.MethodInvokingMessageSource . setObject ( java.lang.Object ) ; org.springframework.integration.config.annotation.MethodInvokingMessageSource . setMethod ( java.lang.reflect.Method ) ; java.lang.String java.lang.String = this . java.lang.String ( java.lang.String , java.lang.reflect.Method ) ; this . beanFactory . registerSingleton ( java.lang.String , org.springframework.integration.config.annotation.MethodInvokingMessageSource ) ; return ( MessageSource < ? > ) this . beanFactory . initializeBean ( org.springframework.integration.config.annotation.MethodInvokingMessageSource , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.reflect.Method java.lang.reflect.Method ) { return super. generateHandlerBeanName ( java.lang.String , java.lang.reflect.Method ) . replaceFirst ( IntegrationConfigUtils . HANDLER_ALIAS_SUFFIX + STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.annotation.MessageHandler org.springframework.integration.config.annotation.MessageHandler ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.util.List<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.List<java.lang.annotation.Annotation> ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
