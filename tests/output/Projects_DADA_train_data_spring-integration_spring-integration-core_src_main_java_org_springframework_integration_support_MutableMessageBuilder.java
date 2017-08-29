<METHOD_START> private void ( Message < T > org.springframework.integration.support.Message<T> ) { Assert . notNull ( org.springframework.integration.support.Message<T> , STRING ) ; if ( org.springframework.integration.support.Message<T> instanceof MutableMessage ) { this . org.springframework.integration.support.MutableMessage<T> = ( MutableMessage < T > ) org.springframework.integration.support.Message<T> ; } else { this . org.springframework.integration.support.MutableMessage<T> = new MutableMessage < T > ( org.springframework.integration.support.Message<T> . getPayload ( ) , org.springframework.integration.support.Message<T> . getHeaders ( ) ) ; } this . java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.integration.support.MutableMessage<T> . getRawHeaders ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( ) { return this . org.springframework.integration.support.MutableMessage<T> . getPayload ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return this . java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.integration.support.MutableMessageBuilder<T> < T > org.springframework.integration.support.MutableMessageBuilder<T> ( Message < T > org.springframework.integration.support.Message<T> ) { Assert . notNull ( org.springframework.integration.support.Message<T> , STRING ) ; return new org.springframework.integration.support.MutableMessageBuilder<T> < T > ( org.springframework.integration.support.Message<T> ) ; }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.integration.support.MutableMessageBuilder<T> < T > org.springframework.integration.support.MutableMessageBuilder<T> ( T T ) { return new org.springframework.integration.support.MutableMessageBuilder<T> < T > ( new MutableMessage < T > ( T ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> < T > org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.String , STRING ) ; if ( java.lang.Object == null ) { this . org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.lang.String ) ; } else { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> < T > org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( ! this . java.util.Map<java.lang.String,java.lang.Object> . boolean ( java.lang.String ) ) { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> < T > org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.lang.String ... java.lang.String[] ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> < java.lang.String > ( ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( StringUtils . hasLength ( java.lang.String ) ) { if ( java.lang.String . boolean ( STRING ) ) { java.util.List<java.lang.String> . boolean ( java.util.List<java.lang.String> ( java.lang.String , this . java.util.Map<java.lang.String,java.lang.Object> ) ) ; } else { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } } for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.lang.String ) ; } return this ; }  <METHOD_END>
<METHOD_START> private java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( java.lang.String java.lang.String , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> < java.lang.String > ( ) ; if ( java.util.Map<java.lang.String,java.lang.Object> != null ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map.Entry<java.lang.String,java.lang.Object> : java.util.Map<java.lang.String,java.lang.Object> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Object>> ( ) ) { if ( PatternMatchUtils . simpleMatch ( java.lang.String , java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) ) ) { java.util.List<java.lang.String> . boolean ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) ) ; } } } return java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> < T > org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.lang.String java.lang.String ) { if ( StringUtils . hasLength ( java.lang.String ) ) { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> < T > org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { if ( java.util.Map<java.lang.String,> != null ) { this . java.util.Map<java.lang.String,java.lang.Object> . void ( java.util.Map<java.lang.String,> ) ; } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> < T > org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { if ( java.util.Map<java.lang.String,> != null ) { for ( java.util.Map.Entry<java.lang.String,?> < java.lang.String , ? > java.util.Map.Entry<java.lang.String,?> : java.util.Map<java.lang.String,> . java.util.Set<java.util.Map.Entry<java.lang.String,>> ( ) ) { org.springframework.integration.support.AbstractIntegrationMessageBuilder<T> ( java.util.Map.Entry<java.lang.String,> . java.lang.String ( ) , java.util.Map.Entry<java.lang.String,> . getValue ( ) ) ; } } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override protected java.util.List<java.util.List<java.lang.Object>> < java.util.List<java.lang.Object> < java.lang.Object > > java.util.List<java.util.List<java.lang.Object>> ( ) { return ( java.util.List<java.util.List<java.lang.Object>> < java.util.List<java.lang.Object> < java.lang.Object > > ) this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( IntegrationMessageHeaderAccessor . SEQUENCE_DETAILS ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) { return this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( IntegrationMessageHeaderAccessor . CORRELATION_ID ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) { return this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( IntegrationMessageHeaderAccessor . SEQUENCE_NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) { return this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( IntegrationMessageHeaderAccessor . SEQUENCE_SIZE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.support.Message<T> < T > org.springframework.integration.support.Message<T> ( ) { return this . org.springframework.integration.support.MutableMessage<T> ; }  <METHOD_END>
