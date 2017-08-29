<METHOD_START> protected void ( JsonObjectMapper < ? , P > org.springframework.integration.support.json.JsonObjectMapper<?,P> ) { this . org.springframework.integration.support.json.JsonObjectMapper<?,P> = org.springframework.integration.support.json.JsonObjectMapper<,P> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.support.json.BeanFactory ) throws org.springframework.integration.support.json.BeansException { this . org.springframework.integration.support.json.BeanFactory = org.springframework.integration.support.json.BeanFactory ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.support.json.MessageBuilderFactory org.springframework.integration.support.json.MessageBuilderFactory ( ) { if ( ! this . boolean ) { if ( this . org.springframework.integration.support.json.BeanFactory != null ) { this . org.springframework.integration.support.json.MessageBuilderFactory = IntegrationUtils . getMessageBuilderFactory ( this . org.springframework.integration.support.json.BeanFactory ) ; } this . boolean = true ; } return this . org.springframework.integration.support.json.MessageBuilderFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.support.json.Message<?> < ? > org.springframework.integration.support.json.Message<?> ( JsonInboundMessageMapper org.springframework.integration.support.json.JsonInboundMessageMapper , java.lang.String java.lang.String ) throws java.lang.Exception { if ( this . org.springframework.integration.support.json.JsonInboundMessageMapper == null ) { this . org.springframework.integration.support.json.JsonInboundMessageMapper = org.springframework.integration.support.json.JsonInboundMessageMapper ; } P P = this . P ( java.lang.String ) ; if ( org.springframework.integration.support.json.JsonInboundMessageMapper . isMapToPayload ( ) ) { java.lang.Object java.lang.Object = this . java.lang.Object ( P , java.lang.String ) ; return org.springframework.integration.support.json.MessageBuilderFactory ( ) . withPayload ( java.lang.Object ) . build ( ) ; } else { return this . org.springframework.integration.support.json.Message<?> ( P , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( P P , java.lang.String java.lang.String ) throws java.lang.Exception { try { return this . org.springframework.integration.support.json.JsonObjectMapper<,P> . fromJson ( P , this . org.springframework.integration.support.json.JsonInboundMessageMapper . getPayloadType ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING + this . org.springframework.integration.support.json.JsonInboundMessageMapper . getPayloadType ( ) + STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( P P , java.lang.String java.lang.String , java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.integration.support.json.JsonInboundMessageMapper . getHeaderTypes ( ) . containsKey ( java.lang.String ) ? this . org.springframework.integration.support.json.JsonInboundMessageMapper . getHeaderTypes ( ) . get ( java.lang.String ) : java.lang.Object .class ; try { return this . org.springframework.integration.support.json.JsonObjectMapper<,P> . fromJson ( P , ( java.lang.reflect.Type ) java.lang.Class<> ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.Class<> + STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.integration.support.json.Message<?> < ? > org.springframework.integration.support.json.Message<?> ( P P , java.lang.String java.lang.String ) throws java.lang.Exception ;  <METHOD_END>
<METHOD_START> protected abstract P P ( java.lang.String java.lang.String ) throws java.lang.Exception ;  <METHOD_END>
