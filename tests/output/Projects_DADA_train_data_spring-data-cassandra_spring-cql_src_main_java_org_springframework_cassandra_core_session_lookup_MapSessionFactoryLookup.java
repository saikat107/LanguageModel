<METHOD_START> public void ( ) {}  <METHOD_END>
<METHOD_START> public void ( java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> < java.lang.String , SessionFactory > java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> ) { void ( java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , SessionFactory org.springframework.cassandra.core.session.lookup.SessionFactory ) { void ( java.lang.String , org.springframework.cassandra.core.session.lookup.SessionFactory ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> < java.lang.String , SessionFactory > java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> ) { if ( java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> != null ) { this . java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> . putAll ( java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> ) ; } }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> < java.lang.String , SessionFactory > java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> ( ) { return java.util.Collections . java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> ( this . java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , SessionFactory org.springframework.cassandra.core.session.lookup.SessionFactory ) { Assert . notNull ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.cassandra.core.session.lookup.SessionFactory , STRING ) ; this . java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> . put ( java.lang.String , org.springframework.cassandra.core.session.lookup.SessionFactory ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.core.session.lookup.SessionFactory org.springframework.cassandra.core.session.lookup.SessionFactory ( java.lang.String java.lang.String ) throws org.springframework.cassandra.core.session.lookup.SessionFactoryLookupFailureException { Assert . notNull ( java.lang.String , STRING ) ; SessionFactory org.springframework.cassandra.core.session.lookup.SessionFactory = this . java.util.Map<java.lang.String,org.springframework.cassandra.core.session.lookup.SessionFactory> . get ( java.lang.String ) ; if ( org.springframework.cassandra.core.session.lookup.SessionFactory == null ) { throw new SessionFactoryLookupFailureException ( java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; } return org.springframework.cassandra.core.session.lookup.SessionFactory ; }  <METHOD_END>