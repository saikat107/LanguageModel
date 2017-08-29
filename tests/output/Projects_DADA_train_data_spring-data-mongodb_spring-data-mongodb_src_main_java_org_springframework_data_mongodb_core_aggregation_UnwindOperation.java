<METHOD_START> public void ( Field org.springframework.data.mongodb.core.aggregation.Field ) { this( new ExposedField ( org.springframework.data.mongodb.core.aggregation.Field , true ) , false ); }  <METHOD_END>
<METHOD_START> public void ( Field org.springframework.data.mongodb.core.aggregation.Field , boolean boolean ) { Assert . notNull ( org.springframework.data.mongodb.core.aggregation.Field , STRING ) ; this . org.springframework.data.mongodb.core.aggregation.ExposedField = new ExposedField ( org.springframework.data.mongodb.core.aggregation.Field , true ) ; this . org.springframework.data.mongodb.core.aggregation.ExposedField = null ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void ( Field org.springframework.data.mongodb.core.aggregation.Field , Field org.springframework.data.mongodb.core.aggregation.Field , boolean boolean ) { Assert . notNull ( org.springframework.data.mongodb.core.aggregation.Field , STRING ) ; Assert . notNull ( org.springframework.data.mongodb.core.aggregation.Field , STRING ) ; this . org.springframework.data.mongodb.core.aggregation.ExposedField = new ExposedField ( org.springframework.data.mongodb.core.aggregation.Field , true ) ; this . org.springframework.data.mongodb.core.aggregation.ExposedField = new ExposedField ( org.springframework.data.mongodb.core.aggregation.Field , true ) ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { java.lang.String java.lang.String = org.springframework.data.mongodb.core.aggregation.AggregationOperationContext . getReference ( org.springframework.data.mongodb.core.aggregation.ExposedField ) . toString ( ) ; if ( ! boolean && org.springframework.data.mongodb.core.aggregation.ExposedField == null ) { return new Document ( STRING , java.lang.String ) ; } Document org.springframework.data.mongodb.core.aggregation.Document = new Document ( ) ; org.springframework.data.mongodb.core.aggregation.Document . put ( STRING , java.lang.String ) ; if ( org.springframework.data.mongodb.core.aggregation.ExposedField != null ) { org.springframework.data.mongodb.core.aggregation.Document . put ( STRING , org.springframework.data.mongodb.core.aggregation.ExposedField . getName ( ) ) ; } org.springframework.data.mongodb.core.aggregation.Document . put ( STRING , boolean ) ; return new Document ( STRING , org.springframework.data.mongodb.core.aggregation.Document ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.ExposedFields org.springframework.data.mongodb.core.aggregation.ExposedFields ( ) { return org.springframework.data.mongodb.core.aggregation.ExposedField != null ? ExposedFields . from ( org.springframework.data.mongodb.core.aggregation.ExposedField ) : ExposedFields . from ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.mongodb.core.aggregation.UnwindOperation.PathBuilder org.springframework.data.mongodb.core.aggregation.UnwindOperation.PathBuilder ( ) { return org.springframework.data.mongodb.core.aggregation.UnwindOperation.UnwindOperationBuilder . org.springframework.data.mongodb.core.aggregation.UnwindOperation.PathBuilder ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.core.aggregation.UnwindOperation.IndexBuilder org.springframework.data.mongodb.core.aggregation.UnwindOperation.IndexBuilder ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.core.aggregation.UnwindOperation.EmptyArraysBuilder org.springframework.data.mongodb.core.aggregation.UnwindOperation.EmptyArraysBuilder ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.core.aggregation.UnwindOperation.EmptyArraysBuilder org.springframework.data.mongodb.core.aggregation.UnwindOperation.EmptyArraysBuilder ( )  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.core.aggregation.UnwindOperation org.springframework.data.mongodb.core.aggregation.UnwindOperation ( )  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.core.aggregation.UnwindOperation org.springframework.data.mongodb.core.aggregation.UnwindOperation ( )  <METHOD_END>
<METHOD_START> private void ( ) {}  <METHOD_END>
<METHOD_START> public static org.springframework.data.mongodb.core.aggregation.UnwindOperation.PathBuilder org.springframework.data.mongodb.core.aggregation.UnwindOperation.PathBuilder ( ) { return new org.springframework.data.mongodb.core.aggregation.UnwindOperation.UnwindOperationBuilder ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.UnwindOperation org.springframework.data.mongodb.core.aggregation.UnwindOperation ( ) { if ( org.springframework.data.mongodb.core.aggregation.Field != null ) { return new org.springframework.data.mongodb.core.aggregation.UnwindOperation ( org.springframework.data.mongodb.core.aggregation.Field , org.springframework.data.mongodb.core.aggregation.Field , true ) ; } return new org.springframework.data.mongodb.core.aggregation.UnwindOperation ( org.springframework.data.mongodb.core.aggregation.Field , true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.UnwindOperation org.springframework.data.mongodb.core.aggregation.UnwindOperation ( ) { if ( org.springframework.data.mongodb.core.aggregation.Field != null ) { return new org.springframework.data.mongodb.core.aggregation.UnwindOperation ( org.springframework.data.mongodb.core.aggregation.Field , org.springframework.data.mongodb.core.aggregation.Field , false ) ; } return new org.springframework.data.mongodb.core.aggregation.UnwindOperation ( org.springframework.data.mongodb.core.aggregation.Field , false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.UnwindOperation.EmptyArraysBuilder org.springframework.data.mongodb.core.aggregation.UnwindOperation.EmptyArraysBuilder ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; org.springframework.data.mongodb.core.aggregation.Field = Fields . field ( java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.UnwindOperation.EmptyArraysBuilder org.springframework.data.mongodb.core.aggregation.UnwindOperation.EmptyArraysBuilder ( ) { org.springframework.data.mongodb.core.aggregation.Field = null ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.UnwindOperation.UnwindOperationBuilder org.springframework.data.mongodb.core.aggregation.UnwindOperation.UnwindOperationBuilder ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; org.springframework.data.mongodb.core.aggregation.Field = Fields . field ( java.lang.String ) ; return this ; }  <METHOD_END>
