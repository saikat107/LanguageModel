<METHOD_START> public void void ( JmsListenerEndpointRegistry org.springframework.jms.config.JmsListenerEndpointRegistry ) { this . org.springframework.jms.config.JmsListenerEndpointRegistry = org.springframework.jms.config.JmsListenerEndpointRegistry ; }  <METHOD_END>
<METHOD_START> public org.springframework.jms.config.JmsListenerEndpointRegistry org.springframework.jms.config.JmsListenerEndpointRegistry ( ) { return this . org.springframework.jms.config.JmsListenerEndpointRegistry ; }  <METHOD_END>
<METHOD_START> public void void ( MessageHandlerMethodFactory org.springframework.jms.config.MessageHandlerMethodFactory ) { this . org.springframework.jms.config.MessageHandlerMethodFactory = org.springframework.jms.config.MessageHandlerMethodFactory ; }  <METHOD_END>
<METHOD_START> public org.springframework.jms.config.MessageHandlerMethodFactory org.springframework.jms.config.MessageHandlerMethodFactory ( ) { return this . org.springframework.jms.config.MessageHandlerMethodFactory ; }  <METHOD_END>
<METHOD_START> public void void ( JmsListenerContainerFactory < ? > org.springframework.jms.config.JmsListenerContainerFactory<?> ) { this . org.springframework.jms.config.JmsListenerContainerFactory<?> = org.springframework.jms.config.JmsListenerContainerFactory<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.jms.config.BeanFactory ) { this . org.springframework.jms.config.BeanFactory = org.springframework.jms.config.BeanFactory ; if ( org.springframework.jms.config.BeanFactory instanceof ConfigurableBeanFactory ) { this . java.lang.Object = ( ( ConfigurableBeanFactory ) org.springframework.jms.config.BeanFactory ) . getSingletonMutex ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { void ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { synchronized ( this . java.lang.Object ) { for ( org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor : this . java.util.List<org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor> ) { this . org.springframework.jms.config.JmsListenerEndpointRegistry . registerListenerContainer ( org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor . org.springframework.jms.config.JmsListenerEndpoint , org.springframework.jms.config.JmsListenerContainerFactory<?> ( org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor ) ) ; } this . boolean = true ; } }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.JmsListenerContainerFactory<?> < ? > org.springframework.jms.config.JmsListenerContainerFactory<?> ( org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor ) { if ( org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor . org.springframework.jms.config.JmsListenerContainerFactory<> != null ) { return org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor . org.springframework.jms.config.JmsListenerContainerFactory<> ; } else if ( this . org.springframework.jms.config.JmsListenerContainerFactory<> != null ) { return this . org.springframework.jms.config.JmsListenerContainerFactory<> ; } else if ( this . java.lang.String != null ) { Assert . state ( this . org.springframework.jms.config.BeanFactory != null , STRING ) ; this . org.springframework.jms.config.JmsListenerContainerFactory<?> = this . org.springframework.jms.config.BeanFactory . getBean ( this . java.lang.String , JmsListenerContainerFactory .class ) ; return this . org.springframework.jms.config.JmsListenerContainerFactory<> ; } else { throw new java.lang.IllegalStateException ( STRING + JmsListenerContainerFactory .class . java.lang.String ( ) + STRING + org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor . org.springframework.jms.config.JmsListenerEndpoint + STRING ) ; } }  <METHOD_END>
<METHOD_START> public void void ( JmsListenerEndpoint org.springframework.jms.config.JmsListenerEndpoint , JmsListenerContainerFactory < ? > org.springframework.jms.config.JmsListenerContainerFactory<?> ) { Assert . notNull ( org.springframework.jms.config.JmsListenerEndpoint , STRING ) ; Assert . hasText ( org.springframework.jms.config.JmsListenerEndpoint . getId ( ) , STRING ) ; org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor = new org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor ( org.springframework.jms.config.JmsListenerEndpoint , org.springframework.jms.config.JmsListenerContainerFactory<> ) ; synchronized ( this . java.lang.Object ) { if ( this . boolean ) { this . org.springframework.jms.config.JmsListenerEndpointRegistry . registerListenerContainer ( org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor . org.springframework.jms.config.JmsListenerEndpoint , org.springframework.jms.config.JmsListenerContainerFactory<?> ( org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor ) , true ) ; } else { this . java.util.List<org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor> . boolean ( org.springframework.jms.config.JmsListenerEndpointRegistrar.JmsListenerEndpointDescriptor ) ; } } }  <METHOD_END>
<METHOD_START> public void void ( JmsListenerEndpoint org.springframework.jms.config.JmsListenerEndpoint ) { void ( org.springframework.jms.config.JmsListenerEndpoint , null ) ; }  <METHOD_END>
<METHOD_START> public void ( JmsListenerEndpoint org.springframework.jms.config.JmsListenerEndpoint , JmsListenerContainerFactory < ? > org.springframework.jms.config.JmsListenerContainerFactory<?> ) { this . org.springframework.jms.config.JmsListenerEndpoint = org.springframework.jms.config.JmsListenerEndpoint ; this . org.springframework.jms.config.JmsListenerContainerFactory<?> = org.springframework.jms.config.JmsListenerContainerFactory<> ; }  <METHOD_END>
