<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new BucketOperation ( ( Field ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = Aggregation . bucket ( STRING ) . andOutputExpression ( STRING , NUMBER ) . as ( STRING ) . andOutput ( STRING ) . push ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { bucket ( STRING ) . andOutput ( STRING ) . as ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = Aggregation . bucket ( STRING ) . andOutputCount ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.aggregation.Document = bucket ( STRING ) . andOutput ( ArithmeticOperators . valueOf ( STRING ) . sum ( ) ) . as ( STRING ) . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.aggregation.Document = bucket ( STRING ) . withDefaultBucket ( STRING ) . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.aggregation.Document = bucket ( STRING ) . withDefaultBucket ( STRING ) . withBoundaries ( NUMBER ) . withBoundaries ( NUMBER , NUMBER ) . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutput ( STRING ) . sum ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutput ( STRING ) . sum ( NUMBER ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutput ( STRING ) . avg ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutput ( STRING ) . first ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutput ( STRING ) . last ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutput ( STRING ) . min ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutput ( STRING ) . push ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutput ( STRING ) . addToSet ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutputExpression ( STRING ) . sum ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) . andOutputExpression ( STRING ) . apply ( STRING , NUMBER ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketOperation org.springframework.data.mongodb.core.aggregation.BucketOperation = bucket ( STRING ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.BucketOperation . getFields ( ) . exposesSingleFieldOnly ( ) , is ( true ) ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.BucketOperation . getFields ( ) . getField ( STRING ) , is ( notNullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( Document org.springframework.data.mongodb.core.aggregation.Document ) { return ( Document ) ( ( Document ) org.springframework.data.mongodb.core.aggregation.Document . get ( STRING ) ) . get ( STRING ) ; }  <METHOD_END>
