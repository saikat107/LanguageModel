<METHOD_START> protected void ( ) { org.springframework.data.mongodb.core.query.Document = new Document ( ) ; org.springframework.data.mongodb.core.query.Document = new Document ( ) ; }  <METHOD_END>
<METHOD_START> public static < T extends org.springframework.data.mongodb.core.query.BasicQuery > org.springframework.data.mongodb.core.query.IsQuery<T> < T > org.springframework.data.mongodb.core.query.IsQuery<T> ( ) { return new org.springframework.data.mongodb.core.query.IsQuery<T> < T > ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.query.IsQuery<T> < T > org.springframework.data.mongodb.core.query.IsQuery<T> ( int int ) { this . int = int ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.query.IsQuery<T> < T > org.springframework.data.mongodb.core.query.IsQuery<T> ( long long ) { this . long = long ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.query.IsQuery<T> < T > org.springframework.data.mongodb.core.query.IsQuery<T> ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.query.IsQuery<T> < T > org.springframework.data.mongodb.core.query.IsQuery<T> ( java.lang.String java.lang.String ) { if ( org.springframework.data.mongodb.core.query.Document == null ) { org.springframework.data.mongodb.core.query.Document = new Document ( ) ; } org.springframework.data.mongodb.core.query.Document . put ( java.lang.String , NUMBER ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.query.IsQuery<T> < T > org.springframework.data.mongodb.core.query.IsQuery<T> ( java.lang.String java.lang.String ) { if ( org.springframework.data.mongodb.core.query.Document == null ) { org.springframework.data.mongodb.core.query.Document = new Document ( ) ; } org.springframework.data.mongodb.core.query.Document . put ( java.lang.String , - NUMBER ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.query.IsQuery<T> < T > org.springframework.data.mongodb.core.query.IsQuery<T> ( java.lang.String java.lang.String , Direction org.springframework.data.mongodb.core.query.Direction ) { org.springframework.data.mongodb.core.query.Document . put ( java.lang.String , Direction . ASC . equals ( org.springframework.data.mongodb.core.query.Direction ) ? NUMBER : - NUMBER ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.query.IsQuery<T> < T > org.springframework.data.mongodb.core.query.IsQuery<T> ( Criteria org.springframework.data.mongodb.core.query.Criteria ) { this . org.springframework.data.mongodb.core.query.Document . putAll ( org.springframework.data.mongodb.core.query.Criteria . getCriteriaObject ( ) ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Description org.springframework.data.mongodb.core.query.Description ) { BasicQuery org.springframework.data.mongodb.core.query.BasicQuery = new BasicQuery ( this . org.springframework.data.mongodb.core.query.Document , this . org.springframework.data.mongodb.core.query.Document ) ; org.springframework.data.mongodb.core.query.BasicQuery . setSortObject ( org.springframework.data.mongodb.core.query.Document ) ; org.springframework.data.mongodb.core.query.BasicQuery . skip ( this . long ) ; org.springframework.data.mongodb.core.query.BasicQuery . limit ( this . int ) ; if ( StringUtils . hasText ( this . java.lang.String ) ) { org.springframework.data.mongodb.core.query.BasicQuery . withHint ( this . java.lang.String ) ; } org.springframework.data.mongodb.core.query.Description . appendValue ( org.springframework.data.mongodb.core.query.BasicQuery ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( T T ) { if ( T == null ) { return false ; } if ( ! new IsEqual < Document > ( org.springframework.data.mongodb.core.query.Document ) . matches ( T . getQueryObject ( ) ) ) { return false ; } if ( ( T . getSortObject ( ) == null || T . getSortObject ( ) . isEmpty ( ) ) && ! org.springframework.data.mongodb.core.query.Document . isEmpty ( ) ) { if ( ! new IsEqual < Document > ( org.springframework.data.mongodb.core.query.Document ) . matches ( T . getSortObject ( ) ) ) { return false ; } } if ( ! new IsEqual < Document > ( org.springframework.data.mongodb.core.query.Document ) . matches ( T . getFieldsObject ( ) ) ) { return false ; } if ( ! new IsEqual < java.lang.String > ( this . java.lang.String ) . matches ( T . getHint ( ) ) ) { return false ; } if ( ! new IsEqual ( this . long ) . matches ( T . getSkip ( ) ) ) { return false ; } if ( ! new IsEqual < java.lang.Integer > ( this . int ) . matches ( T . getLimit ( ) ) ) { return false ; } return true ; }  <METHOD_END>
