<METHOD_START> public static java.lang.String java.lang.String ( AlterKeyspaceSpecification org.springframework.cassandra.core.cql.generator.AlterKeyspaceSpecification ) { return new org.springframework.cassandra.core.cql.generator.AlterKeyspaceCqlGenerator ( org.springframework.cassandra.core.cql.generator.AlterKeyspaceSpecification ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public void ( AlterKeyspaceSpecification org.springframework.cassandra.core.cql.generator.AlterKeyspaceSpecification ) { super( org.springframework.cassandra.core.cql.generator.AlterKeyspaceSpecification ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.StringBuilder java.lang.StringBuilder ( java.lang.StringBuilder java.lang.StringBuilder ) { java.lang.StringBuilder = noNull ( java.lang.StringBuilder ) ; java.lang.StringBuilder ( java.lang.StringBuilder ) ; java.lang.StringBuilder ( java.lang.StringBuilder ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; return java.lang.StringBuilder ; }  <METHOD_END>
<METHOD_START> protected java.lang.StringBuilder java.lang.StringBuilder ( java.lang.StringBuilder java.lang.StringBuilder ) { return noNull ( java.lang.StringBuilder ) . append ( STRING ) . append ( spec ( ) . getName ( ) ) . append ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected java.lang.StringBuilder java.lang.StringBuilder ( java.lang.StringBuilder java.lang.StringBuilder ) { java.lang.StringBuilder = noNull ( java.lang.StringBuilder ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = spec ( ) . getOptions ( ) ; if ( ! java.util.Map<java.lang.String,java.lang.Object> . boolean ( ) ) { boolean boolean = true ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; if ( ! java.util.Map<java.lang.String,java.lang.Object> . boolean ( ) ) { for ( java.lang.String java.lang.String : java.util.Map<java.lang.String,java.lang.Object> . java.util.Set<java.lang.String> ( ) ) { if ( boolean ) { boolean = false ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; if ( java.lang.Object == null ) { continue; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; if ( java.lang.Object instanceof java.util.Map ) { optionValueMap ( ( java.util.Map<org.springframework.cassandra.core.cql.generator.Option,java.lang.Object> < Option , java.lang.Object > ) java.lang.Object , java.lang.StringBuilder ) ; continue; } java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.Object . java.lang.String ( ) ) ; } } } return java.lang.StringBuilder ; }  <METHOD_END>
