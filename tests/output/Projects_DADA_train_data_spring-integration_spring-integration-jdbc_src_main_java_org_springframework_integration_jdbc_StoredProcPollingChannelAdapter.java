<METHOD_START> public void ( StoredProcExecutor org.springframework.integration.jdbc.StoredProcExecutor ) { Assert . notNull ( org.springframework.integration.jdbc.StoredProcExecutor , STRING ) ; this . org.springframework.integration.jdbc.StoredProcExecutor = org.springframework.integration.jdbc.StoredProcExecutor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.Message<java.lang.Object> < java.lang.Object > org.springframework.integration.jdbc.Message<java.lang.Object> ( ) { java.lang.Object java.lang.Object = java.lang.Object ( ) ; if ( java.lang.Object == null ) { return null ; } return this . getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) . build ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( ) { final java.lang.Object java.lang.Object ; java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> = java.util.Map<java.lang.String,?> ( ) ; if ( java.util.Map<java.lang.String,> . boolean ( ) ) { java.lang.Object = null ; } else { if ( this . boolean && java.util.Map<java.lang.String,> . int ( ) == NUMBER ) { java.lang.Object = java.util.Map<java.lang.String,> . java.util.Collection<> ( ) . java.util.Iterator<> ( ) . next ( ) ; } else if ( this . boolean && java.util.Map<java.lang.String,> . int ( ) > NUMBER ) { throw new MessagingException ( STRING + STRING ) ; } else { java.lang.Object = java.util.Map<java.lang.String,> ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ( ) { return this . org.springframework.integration.jdbc.StoredProcExecutor . executeStoredProcedure ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
