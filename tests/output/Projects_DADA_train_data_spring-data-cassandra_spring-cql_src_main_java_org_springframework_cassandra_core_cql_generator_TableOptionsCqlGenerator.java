<METHOD_START> public void ( TableOptionsSpecification < T > org.springframework.cassandra.core.cql.generator.TableOptionsSpecification<T> ) { super( org.springframework.cassandra.core.cql.generator.TableOptionsSpecification<T> ); }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected T T ( ) { return ( T ) getSpecification ( ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.StringBuilder java.lang.StringBuilder ( java.util.Map<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> < Option , java.lang.Object > java.util.Map<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> , java.lang.StringBuilder java.lang.StringBuilder ) { java.lang.StringBuilder = noNull ( java.lang.StringBuilder ) ; if ( java.util.Map<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> == null || java.util.Map<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> . isEmpty ( ) ) { return java.lang.StringBuilder ; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; boolean boolean = true ; for ( java.util.Map . java.util.Map.Entry<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> < Option , java.lang.Object > java.util.Map.Entry<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> : java.util.Map<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> . entrySet ( ) ) { if ( boolean ) { boolean = false ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } Option org.springframework.cassandra.core.cql.generator.Option = java.util.Map.Entry<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> . getKey ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( singleQuote ( org.springframework.cassandra.core.cql.generator.Option . getName ( ) ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; java.lang.Object java.lang.Object = java.util.Map.Entry<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> . getValue ( ) ; java.lang.Object = java.lang.Object == null ? STRING : java.lang.Object . java.lang.String ( ) ; if ( org.springframework.cassandra.core.cql.generator.Option . escapesValue ( ) ) { java.lang.Object = escapeSingle ( java.lang.Object ) ; } if ( org.springframework.cassandra.core.cql.generator.Option . quotesValue ( ) ) { java.lang.Object = singleQuote ( java.lang.Object ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.Object ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; return java.lang.StringBuilder ; }  <METHOD_END>
