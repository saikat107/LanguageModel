<METHOD_START> public void void ( java.util.Map<java.lang.String,org.springframework.integration.endpoint.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.endpoint.Expression> ) { this . java.util.Map<java.lang.String,org.springframework.integration.endpoint.Expression> = ( java.util.Map<java.lang.String,org.springframework.integration.endpoint.Expression> != null ) ? java.util.Map<java.lang.String,org.springframework.integration.endpoint.Expression> : java.util.Collections .< java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.endpoint.Expression> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . java.util.concurrent.atomic.AtomicLong . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return ( int ) this . java.util.concurrent.atomic.AtomicLong . long ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return this . java.util.concurrent.atomic.AtomicLong . long ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final org.springframework.integration.endpoint.Message<T> < T > org.springframework.integration.endpoint.Message<T> ( ) { return org.springframework.integration.endpoint.Message<T> ( java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected org.springframework.integration.endpoint.Message<T> < T > org.springframework.integration.endpoint.Message<T> ( java.lang.Object java.lang.Object ) { Message < T > org.springframework.integration.endpoint.Message<T> = null ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . java.util.Map<java.lang.String,java.lang.Object> ( ) ; if ( java.lang.Object instanceof Message < ? > ) { try { org.springframework.integration.endpoint.Message<T> = ( Message < T > ) java.lang.Object ; } catch ( java.lang.Exception java.lang.Exception ) { throw new MessagingException ( STRING , java.lang.Exception ) ; } if ( ! CollectionUtils . isEmpty ( java.util.Map<java.lang.String,java.lang.Object> ) ) { AbstractIntegrationMessageBuilder < T > org.springframework.integration.endpoint.AbstractIntegrationMessageBuilder<T> = this . getMessageBuilderFactory ( ) . fromMessage ( org.springframework.integration.endpoint.Message<T> ) ; org.springframework.integration.endpoint.AbstractIntegrationMessageBuilder<T> . copyHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) ; org.springframework.integration.endpoint.Message<T> = org.springframework.integration.endpoint.AbstractIntegrationMessageBuilder<T> . build ( ) ; } } else if ( java.lang.Object != null ) { T T = null ; try { T = ( T ) java.lang.Object ; } catch ( java.lang.Exception java.lang.Exception ) { throw new MessagingException ( STRING , java.lang.Exception ) ; } AbstractIntegrationMessageBuilder < T > org.springframework.integration.endpoint.AbstractIntegrationMessageBuilder<T> = this . getMessageBuilderFactory ( ) . withPayload ( T ) ; if ( ! CollectionUtils . isEmpty ( java.util.Map<java.lang.String,java.lang.Object> ) ) { org.springframework.integration.endpoint.AbstractIntegrationMessageBuilder<T> . copyHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) ; } org.springframework.integration.endpoint.Message<T> = org.springframework.integration.endpoint.AbstractIntegrationMessageBuilder<T> . build ( ) ; } if ( this . boolean && org.springframework.integration.endpoint.Message<T> != null ) { this . java.util.concurrent.atomic.AtomicLong . long ( ) ; } return org.springframework.integration.endpoint.Message<T> ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,org.springframework.integration.endpoint.Expression> < java.lang.String , Expression > java.util.Map.Entry<java.lang.String,org.springframework.integration.endpoint.Expression> : this . java.util.Map<java.lang.String,org.springframework.integration.endpoint.Expression> . entrySet ( ) ) { java.lang.Object java.lang.Object = this . evaluateExpression ( java.util.Map.Entry<java.lang.String,org.springframework.integration.endpoint.Expression> . getValue ( ) ) ; if ( java.lang.Object != null ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.util.Map.Entry<java.lang.String,org.springframework.integration.endpoint.Expression> . getKey ( ) , java.lang.Object ) ; } } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( )  <METHOD_END>
