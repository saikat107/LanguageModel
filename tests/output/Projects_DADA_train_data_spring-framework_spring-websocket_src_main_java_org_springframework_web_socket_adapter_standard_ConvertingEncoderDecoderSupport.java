<METHOD_START> public void void ( EndpointConfig org.springframework.web.socket.adapter.standard.EndpointConfig ) { ApplicationContext org.springframework.web.socket.adapter.standard.ApplicationContext = org.springframework.web.socket.adapter.standard.ApplicationContext ( ) ; if ( org.springframework.web.socket.adapter.standard.ApplicationContext != null && org.springframework.web.socket.adapter.standard.ApplicationContext instanceof ConfigurableApplicationContext ) { ConfigurableListableBeanFactory org.springframework.web.socket.adapter.standard.ConfigurableListableBeanFactory = ( ( ConfigurableApplicationContext ) org.springframework.web.socket.adapter.standard.ApplicationContext ) . getBeanFactory ( ) ; org.springframework.web.socket.adapter.standard.ConfigurableListableBeanFactory . autowireBean ( this ) ; } }  <METHOD_END>
<METHOD_START> public void void ( ) {	}  <METHOD_END>
<METHOD_START> protected org.springframework.web.socket.adapter.standard.ConversionService org.springframework.web.socket.adapter.standard.ConversionService ( ) { ApplicationContext org.springframework.web.socket.adapter.standard.ApplicationContext = org.springframework.web.socket.adapter.standard.ApplicationContext ( ) ; Assert . state ( org.springframework.web.socket.adapter.standard.ApplicationContext != null , STRING ) ; try { return org.springframework.web.socket.adapter.standard.ApplicationContext . getBean ( java.lang.String , ConversionService .class ) ; } catch ( BeansException org.springframework.web.socket.adapter.standard.BeansException ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING , org.springframework.web.socket.adapter.standard.BeansException ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.web.socket.adapter.standard.ApplicationContext org.springframework.web.socket.adapter.standard.ApplicationContext ( ) { return ContextLoader . getCurrentWebApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.socket.adapter.standard.TypeDescriptor org.springframework.web.socket.adapter.standard.TypeDescriptor ( ) { return TypeDescriptor . valueOf ( java.lang.Class<?>[] ( ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.socket.adapter.standard.TypeDescriptor org.springframework.web.socket.adapter.standard.TypeDescriptor ( ) { return TypeDescriptor . valueOf ( java.lang.Class<?>[] ( ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > [] java.lang.Class<?>[] ( ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = GenericTypeResolver . resolveTypeArguments ( java.lang.Class<? extends org.springframework.web.socket.adapter.standard.ConvertingEncoderDecoderSupport> ( ) , org.springframework.web.socket.adapter.standard.ConvertingEncoderDecoderSupport .class ) ; if ( java.lang.Class<?>[] == null ) { throw new java.lang.IllegalStateException ( STRING + STRING + java.lang.Class<? extends org.springframework.web.socket.adapter.standard.ConvertingEncoderDecoderSupport> ( ) ) ; } return java.lang.Class<?>[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public M M ( T T ) throws org.springframework.web.socket.adapter.standard.EncodeException { try { return ( M ) org.springframework.web.socket.adapter.standard.ConversionService ( ) . convert ( T , org.springframework.web.socket.adapter.standard.TypeDescriptor ( ) , org.springframework.web.socket.adapter.standard.TypeDescriptor ( ) ) ; } catch ( ConversionException org.springframework.web.socket.adapter.standard.ConversionException ) { throw new EncodeException ( T , STRING , org.springframework.web.socket.adapter.standard.ConversionException ) ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( M M ) { return org.springframework.web.socket.adapter.standard.ConversionService ( ) . canConvert ( org.springframework.web.socket.adapter.standard.TypeDescriptor ( ) , org.springframework.web.socket.adapter.standard.TypeDescriptor ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public T T ( M M ) throws org.springframework.web.socket.adapter.standard.DecodeException { try { return ( T ) org.springframework.web.socket.adapter.standard.ConversionService ( ) . convert ( M , org.springframework.web.socket.adapter.standard.TypeDescriptor ( ) , org.springframework.web.socket.adapter.standard.TypeDescriptor ( ) ) ; } catch ( ConversionException org.springframework.web.socket.adapter.standard.ConversionException ) { if ( M instanceof java.lang.String ) { throw new DecodeException ( ( java.lang.String ) M , STRING , org.springframework.web.socket.adapter.standard.ConversionException ) ; } if ( M instanceof java.nio.ByteBuffer ) { throw new DecodeException ( ( java.nio.ByteBuffer ) M , STRING , org.springframework.web.socket.adapter.standard.ConversionException ) ; } throw org.springframework.web.socket.adapter.standard.ConversionException ; } }  <METHOD_END>