<METHOD_START> void ( Part org.springframework.data.neo4j.repository.query.derived.builder.Part , BooleanOperator org.springframework.data.neo4j.repository.query.derived.builder.BooleanOperator , java.lang.Class<?> < ? > java.lang.Class<?> ) { this . org.springframework.data.neo4j.repository.query.derived.builder.Part = org.springframework.data.neo4j.repository.query.derived.builder.Part ; this . org.springframework.data.neo4j.repository.query.derived.builder.BooleanOperator = org.springframework.data.neo4j.repository.query.derived.builder.BooleanOperator ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public abstract java.util.List<org.springframework.data.neo4j.repository.query.derived.builder.Filter> < Filter > java.util.List<org.springframework.data.neo4j.repository.query.derived.builder.Filter> ( java.util.Stack<java.lang.Object> < java.lang.Object > java.util.Stack<java.lang.Object> );  <METHOD_END>
<METHOD_START> boolean boolean ( ) { return org.springframework.data.neo4j.repository.query.derived.builder.Part . getType ( ) . name ( ) . startsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return org.springframework.data.neo4j.repository.query.derived.builder.Part . getProperty ( ) . getSegment ( ) ; }  <METHOD_END>
<METHOD_START> void void ( Part org.springframework.data.neo4j.repository.query.derived.builder.Part , Filter org.springframework.data.neo4j.repository.query.derived.builder.Filter ) { if ( org.springframework.data.neo4j.repository.query.derived.builder.Part . getProperty ( ) . next ( ) != null ) { org.springframework.data.neo4j.repository.query.derived.builder.Filter . setOwnerEntityType ( org.springframework.data.neo4j.repository.query.derived.builder.Part . getProperty ( ) . getOwningType ( ) . getType ( ) ) ; org.springframework.data.neo4j.repository.query.derived.builder.Filter . setNestedPropertyType ( org.springframework.data.neo4j.repository.query.derived.builder.Part . getProperty ( ) . getType ( ) ) ; org.springframework.data.neo4j.repository.query.derived.builder.Filter . setPropertyName ( org.springframework.data.neo4j.repository.query.derived.builder.Part . getProperty ( ) . getLeafProperty ( ) . getSegment ( ) ) ; org.springframework.data.neo4j.repository.query.derived.builder.Filter . setNestedPropertyName ( org.springframework.data.neo4j.repository.query.derived.builder.Part . getProperty ( ) . getSegment ( ) ) ; } }  <METHOD_END>
