<METHOD_START> protected void ( Field org.springframework.data.mongodb.core.aggregation.Field ) { Assert . notNull ( org.springframework.data.mongodb.core.aggregation.Field , STRING ) ; this . org.springframework.data.mongodb.core.aggregation.Field = org.springframework.data.mongodb.core.aggregation.Field ; this . org.springframework.data.mongodb.core.aggregation.AggregationExpression = null ; this . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs = org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs ; }  <METHOD_END>
<METHOD_START> protected void ( AggregationExpression org.springframework.data.mongodb.core.aggregation.AggregationExpression ) { Assert . notNull ( org.springframework.data.mongodb.core.aggregation.AggregationExpression , STRING ) ; this . org.springframework.data.mongodb.core.aggregation.AggregationExpression = org.springframework.data.mongodb.core.aggregation.AggregationExpression ; this . org.springframework.data.mongodb.core.aggregation.Field = null ; this . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs = org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs ; }  <METHOD_END>
<METHOD_START> protected void ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<?,?> < ? , ? > org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<?,?> ) { this( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<,> , org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<,> . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs ); }  <METHOD_END>
<METHOD_START> protected void ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<?,?> < ? , ? > org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<?,?> , org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs ) { Assert . notNull ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<,> , STRING ) ; Assert . notNull ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs , STRING ) ; this . org.springframework.data.mongodb.core.aggregation.Field = org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<,> . org.springframework.data.mongodb.core.aggregation.Field ; this . org.springframework.data.mongodb.core.aggregation.AggregationExpression = org.springframework.data.mongodb.core.aggregation.BucketOperationSupport<,> . org.springframework.data.mongodb.core.aggregation.AggregationExpression ; this . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs = org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs ; }  <METHOD_END>
<METHOD_START> public abstract org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.ExpressionBucketOperationBuilderSupport<B,T> < B , T > org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.ExpressionBucketOperationBuilderSupport<B,T> ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] );  <METHOD_END>
<METHOD_START> public abstract B B ( AggregationExpression org.springframework.data.mongodb.core.aggregation.AggregationExpression );  <METHOD_END>
<METHOD_START> public abstract B B ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( new AggregationExpression ( ) { @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { return new Document ( STRING , NUMBER ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { return new Document ( STRING , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { Document org.springframework.data.mongodb.core.aggregation.Document = new Document ( ) ; org.springframework.data.mongodb.core.aggregation.Document . put ( STRING , org.springframework.data.mongodb.core.aggregation.AggregationExpression == null ? org.springframework.data.mongodb.core.aggregation.AggregationOperationContext . getReference ( org.springframework.data.mongodb.core.aggregation.Field ) . toString ( ) : org.springframework.data.mongodb.core.aggregation.AggregationExpression . toDocument ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) ) ; if ( ! org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs . boolean ( ) ) { org.springframework.data.mongodb.core.aggregation.Document . put ( STRING , org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs . org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) ) ; } return org.springframework.data.mongodb.core.aggregation.Document ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.ExposedFields org.springframework.data.mongodb.core.aggregation.ExposedFields ( ) { return org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs . org.springframework.data.mongodb.core.aggregation.ExposedFields ( ) ; }  <METHOD_END>
<METHOD_START> protected abstract T T ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs );  <METHOD_END>
<METHOD_START> protected T T ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output ) { return T ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output ) ) ; }  <METHOD_END>
<METHOD_START> protected void ( java.lang.String java.lang.String , T T , java.lang.Object [] java.lang.Object[] ) { super( new org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.SpelExpressionOutput ( java.lang.String , java.lang.Object[] ) , T ); }  <METHOD_END>
<METHOD_START> protected void ( java.lang.Object java.lang.Object , T T ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( T , STRING ) ; this . java.lang.Object = java.lang.Object ; this . T = T ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) ; }  <METHOD_END>
<METHOD_START> public B B ( java.lang.Number java.lang.Number ) { return B ( new org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . java.lang.String ( ) , java.util.Collections . java.util.Set<java.lang.Number> ( java.lang.Number ) ) ) ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) ; }  <METHOD_END>
<METHOD_START> public B B ( ) { return B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) ; }  <METHOD_END>
<METHOD_START> public B B ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { Assert . hasText ( java.lang.String , STRING ) ; Assert . notNull ( java.lang.Object , STRING ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( java.lang.Object[] . int + NUMBER ) ; java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; java.util.List<java.lang.Object> . boolean ( java.util.Arrays . java.util.List<java.lang.Object> ( java.lang.Object[] ) ) ; return B ( new org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput ( java.lang.String , java.util.List<java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> protected abstract B B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput );  <METHOD_END>
<METHOD_START> private B B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators ) { return this . B ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Accumulators . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public T T ( java.lang.String java.lang.String ) { if ( java.lang.Object instanceof org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput ) { return this . T . T ( ( ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput ) this . java.lang.Object ) . org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput ( java.lang.String ) ) ; } if ( java.lang.Object instanceof Field ) { throw new java.lang.IllegalStateException ( STRING ) ; } return this . T . T ( new org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.AggregationExpressionOutput ( Fields . field ( java.lang.String ) , ( AggregationExpression ) java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> private void ( ) { this . java.util.List<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> = new java.util.ArrayList<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> < org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output > ( ) ; }  <METHOD_END>
<METHOD_START> private void ( java.util.Collection<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> < org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output > java.util.Collection<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> , org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output ) { this . java.util.List<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> = new java.util.ArrayList<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> < org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output > ( java.util.Collection<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> . int ( ) + NUMBER ) ; this . java.util.List<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> . boolean ( java.util.Collection<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> ) ; this . java.util.List<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> . boolean ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.mongodb.core.aggregation.ExposedFields org.springframework.data.mongodb.core.aggregation.ExposedFields ( ) { if ( boolean ( ) ) { return ExposedFields . from ( new ExposedField ( STRING , true ) ) ; } ExposedFields org.springframework.data.mongodb.core.aggregation.ExposedFields = ExposedFields . from ( ) ; for ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output : java.util.List<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> ) { org.springframework.data.mongodb.core.aggregation.ExposedFields = org.springframework.data.mongodb.core.aggregation.ExposedFields . and ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output . org.springframework.data.mongodb.core.aggregation.ExposedField ( ) ) ; } return org.springframework.data.mongodb.core.aggregation.ExposedFields ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output ) { Assert . notNull ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output , STRING ) ; return new org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Outputs ( this . java.util.List<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> , org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return java.util.List<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { Document org.springframework.data.mongodb.core.aggregation.Document = new Document ( ) ; for ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output : java.util.List<org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output> ) { org.springframework.data.mongodb.core.aggregation.Document . put ( org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output . org.springframework.data.mongodb.core.aggregation.ExposedField ( ) . getName ( ) , org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.Output . toDocument ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) ) ; } return org.springframework.data.mongodb.core.aggregation.Document ; }  <METHOD_END>
<METHOD_START> protected void ( Field org.springframework.data.mongodb.core.aggregation.Field ) { Assert . notNull ( org.springframework.data.mongodb.core.aggregation.Field , STRING ) ; this . org.springframework.data.mongodb.core.aggregation.ExposedField = new ExposedField ( org.springframework.data.mongodb.core.aggregation.Field , true ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.mongodb.core.aggregation.ExposedField org.springframework.data.mongodb.core.aggregation.ExposedField ( ) { return org.springframework.data.mongodb.core.aggregation.ExposedField ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.util.Collection<? extends java.lang.Object> < ? extends java.lang.Object > java.util.Collection<? extends java.lang.Object> ) { super( Fields . field ( java.lang.String ) ); Assert . hasText ( java.lang.String , STRING ) ; Assert . notNull ( java.util.Collection<> , STRING ) ; this . java.lang.String = java.lang.String ; this . java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( java.util.Collection<> ) ; }  <METHOD_END>
<METHOD_START> private void ( Field org.springframework.data.mongodb.core.aggregation.Field , org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput ) { super( org.springframework.data.mongodb.core.aggregation.Field ); this . java.lang.String = org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput . java.lang.String ; this . java.util.List<java.lang.Object> = org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput . java.util.List<java.lang.Object> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = java.util.List<java.lang.Object> ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) ; return new Document ( java.lang.String , java.util.List<java.lang.Object> . int ( ) == NUMBER ? java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) : java.util.List<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> protected java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( java.util.List<java.lang.Object> != null ? java.util.List<java.lang.Object> . int ( ) : NUMBER ) ; for ( java.lang.Object java.lang.Object : java.util.List<java.lang.Object> ) { if ( java.lang.Object instanceof Field ) { java.util.List<java.lang.Object> . boolean ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext . getReference ( ( Field ) java.lang.Object ) . toString ( ) ) ; } else if ( java.lang.Object instanceof Fields ) { for ( Field org.springframework.data.mongodb.core.aggregation.Field : ( Fields ) java.lang.Object ) { java.util.List<java.lang.Object> . boolean ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext . getReference ( org.springframework.data.mongodb.core.aggregation.Field ) . toString ( ) ) ; } } else if ( java.lang.Object instanceof AggregationExpression ) { java.util.List<java.lang.Object> . boolean ( ( ( AggregationExpression ) java.lang.Object ) . toDocument ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) ) ; } else { java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; } } return java.util.List<java.lang.Object> ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.mongodb.core.aggregation.Field org.springframework.data.mongodb.core.aggregation.Field ( ) { return org.springframework.data.mongodb.core.aggregation.ExposedField ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput ( java.lang.String java.lang.String ) { final Field org.springframework.data.mongodb.core.aggregation.Field = Fields . field ( java.lang.String ) ; return new org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput ( org.springframework.data.mongodb.core.aggregation.Field , this ) { @ java.lang.Override protected org.springframework.data.mongodb.core.aggregation.Field org.springframework.data.mongodb.core.aggregation.Field ( ) { return org.springframework.data.mongodb.core.aggregation.Field ; } @ java.lang.Override protected java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { return org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput .this . java.util.List<java.lang.Object> ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.mongodb.core.aggregation.Field org.springframework.data.mongodb.core.aggregation.Field ( ) { return org.springframework.data.mongodb.core.aggregation.Field ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { return org.springframework.data.mongodb.core.aggregation.BucketOperationSupport.OperationOutput .this . java.util.List<java.lang.Object> ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Object [] java.lang.Object[] ) { super( Fields . field ( java.lang.String ) ); Assert . hasText ( java.lang.String , STRING ) ; Assert . notNull ( java.lang.Object[] , STRING ) ; this . java.lang.String = java.lang.String ; this . java.lang.Object[] = java.lang.Object[] . java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { return ( Document ) org.springframework.data.mongodb.core.aggregation.SpelExpressionTransformer . transform ( java.lang.String , org.springframework.data.mongodb.core.aggregation.AggregationOperationContext , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> protected void ( Field org.springframework.data.mongodb.core.aggregation.Field , AggregationExpression org.springframework.data.mongodb.core.aggregation.AggregationExpression ) { super( org.springframework.data.mongodb.core.aggregation.Field ); this . org.springframework.data.mongodb.core.aggregation.AggregationExpression = org.springframework.data.mongodb.core.aggregation.AggregationExpression ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { return org.springframework.data.mongodb.core.aggregation.AggregationExpression . toDocument ( org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) ; }  <METHOD_END>
