<METHOD_START> public void ( ConfigurableListableBeanFactory org.springframework.integration.config.annotation.ConfigurableListableBeanFactory ) { super( org.springframework.integration.config.annotation.ConfigurableListableBeanFactory ); this . messageHandlerAttributes . addAll ( java.util.Arrays .< java.lang.String > java.util.List<java.lang.String> ( STRING , STRING , STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.annotation.MessageHandler org.springframework.integration.config.annotation.MessageHandler ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.util.List<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.List<java.lang.annotation.Annotation> ) { MessageSelector org.springframework.integration.config.annotation.MessageSelector ; if ( AnnotatedElementUtils . isAnnotated ( java.lang.reflect.Method , Bean .class . java.lang.String ( ) ) ) { java.lang.Object java.lang.Object = this . resolveTargetBeanFromMethodWithBeanAnnotation ( java.lang.reflect.Method ) ; if ( java.lang.Object instanceof MessageSelector ) { org.springframework.integration.config.annotation.MessageSelector = ( MessageSelector ) java.lang.Object ; } else if ( this . extractTypeIfPossible ( java.lang.Object , MessageFilter .class ) != null ) { checkMessageHandlerAttributes ( resolveTargetBeanName ( java.lang.reflect.Method ) , java.util.List<java.lang.annotation.Annotation> ) ; return ( MessageHandler ) java.lang.Object ; } else { org.springframework.integration.config.annotation.MessageSelector = new MethodInvokingSelector ( java.lang.Object ) ; } } else { Assert . isTrue ( boolean .class . boolean ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) || java.lang.Boolean .class . boolean ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) , STRING ) ; org.springframework.integration.config.annotation.MessageSelector = new MethodInvokingSelector ( java.lang.Object , java.lang.reflect.Method ) ; } MessageFilter org.springframework.integration.config.annotation.MessageFilter = new MessageFilter ( org.springframework.integration.config.annotation.MessageSelector ) ; java.lang.String java.lang.String = MessagingAnnotationUtils . resolveAttribute ( java.util.List<java.lang.annotation.Annotation> , STRING , java.lang.String .class ) ; if ( StringUtils . hasText ( java.lang.String ) ) { java.lang.String = this . beanFactory . resolveEmbeddedValue ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.annotation.MessageFilter . setDiscardWithinAdvice ( java.lang.Boolean . boolean ( java.lang.String ) ) ; } } java.lang.String java.lang.String = MessagingAnnotationUtils . resolveAttribute ( java.util.List<java.lang.annotation.Annotation> , STRING , java.lang.String .class ) ; if ( StringUtils . hasText ( java.lang.String ) ) { java.lang.String java.lang.String = this . beanFactory . resolveEmbeddedValue ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.annotation.MessageFilter . setThrowExceptionOnRejection ( java.lang.Boolean . boolean ( java.lang.String ) ) ; } } java.lang.String java.lang.String = MessagingAnnotationUtils . resolveAttribute ( java.util.List<java.lang.annotation.Annotation> , STRING , java.lang.String .class ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.annotation.MessageFilter . setDiscardChannelName ( java.lang.String ) ; } this . setOutputChannelIfPresent ( java.util.List<java.lang.annotation.Annotation> , org.springframework.integration.config.annotation.MessageFilter ) ; return org.springframework.integration.config.annotation.MessageFilter ; }  <METHOD_END>