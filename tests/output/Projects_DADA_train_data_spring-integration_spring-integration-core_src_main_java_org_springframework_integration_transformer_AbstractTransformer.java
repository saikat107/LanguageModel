<METHOD_START> @ java.lang.Override public final org.springframework.integration.transformer.Message<?> < ? > org.springframework.integration.transformer.Message<?> ( Message < ? > org.springframework.integration.transformer.Message<?> ) { try { java.lang.Object java.lang.Object = this . java.lang.Object ( org.springframework.integration.transformer.Message<> ) ; if ( java.lang.Object == null ) { return null ; } return ( java.lang.Object instanceof Message ) ? ( Message < ? > ) java.lang.Object : this . getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) . copyHeaders ( org.springframework.integration.transformer.Message<> . getHeaders ( ) ) . build ( ) ; } catch ( MessageTransformationException org.springframework.integration.transformer.MessageTransformationException ) { throw org.springframework.integration.transformer.MessageTransformationException ; } catch ( java.lang.Exception java.lang.Exception ) { throw new MessageTransformationException ( org.springframework.integration.transformer.Message<> , STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) throws java.lang.Exception ;  <METHOD_END>
