<METHOD_START> public void ( PartTree org.springframework.data.solr.repository.query.PartTree , SolrParameterAccessor org.springframework.data.solr.repository.query.SolrParameterAccessor , MappingContext < ? , SolrPersistentProperty > org.springframework.data.solr.repository.query.MappingContext<?,org.springframework.data.solr.repository.query.SolrPersistentProperty> ) { super( org.springframework.data.solr.repository.query.PartTree , org.springframework.data.solr.repository.query.SolrParameterAccessor ); this . org.springframework.data.solr.repository.query.MappingContext<?,org.springframework.data.solr.repository.query.SolrPersistentProperty> = org.springframework.data.solr.repository.query.MappingContext<,org.springframework.data.solr.repository.query.SolrPersistentProperty> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.solr.repository.query.Query org.springframework.data.solr.repository.query.Query ( Part org.springframework.data.solr.repository.query.Part , java.util.Iterator<java.lang.Object> < java.lang.Object > java.util.Iterator<java.lang.Object> ) { PersistentPropertyPath < SolrPersistentProperty > org.springframework.data.solr.repository.query.PersistentPropertyPath<org.springframework.data.solr.repository.query.SolrPersistentProperty> = org.springframework.data.solr.repository.query.MappingContext<,org.springframework.data.solr.repository.query.SolrPersistentProperty> . getPersistentPropertyPath ( org.springframework.data.solr.repository.query.Part . getProperty ( ) ) ; return new SimpleQuery ( org.springframework.data.solr.repository.query.Criteria ( org.springframework.data.solr.repository.query.Part . getType ( ) , new Criteria ( org.springframework.data.solr.repository.query.PersistentPropertyPath<org.springframework.data.solr.repository.query.SolrPersistentProperty> . toDotPath ( SolrPersistentProperty . PropertyToFieldNameConverter . INSTANCE ) ) , java.util.Iterator<java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.solr.repository.query.Query org.springframework.data.solr.repository.query.Query ( Part org.springframework.data.solr.repository.query.Part , Query org.springframework.data.solr.repository.query.Query , java.util.Iterator<java.lang.Object> < java.lang.Object > java.util.Iterator<java.lang.Object> ) { if ( org.springframework.data.solr.repository.query.Query == null ) { return org.springframework.data.solr.repository.query.Query ( org.springframework.data.solr.repository.query.Part , java.util.Iterator<java.lang.Object> ) ; } PersistentPropertyPath < SolrPersistentProperty > org.springframework.data.solr.repository.query.PersistentPropertyPath<org.springframework.data.solr.repository.query.SolrPersistentProperty> = org.springframework.data.solr.repository.query.MappingContext<,org.springframework.data.solr.repository.query.SolrPersistentProperty> . getPersistentPropertyPath ( org.springframework.data.solr.repository.query.Part . getProperty ( ) ) ; return org.springframework.data.solr.repository.query.Query . addCriteria ( org.springframework.data.solr.repository.query.Criteria ( org.springframework.data.solr.repository.query.Part . getType ( ) , new Criteria ( org.springframework.data.solr.repository.query.PersistentPropertyPath<org.springframework.data.solr.repository.query.SolrPersistentProperty> . toDotPath ( SolrPersistentProperty . PropertyToFieldNameConverter . INSTANCE ) ) , java.util.Iterator<java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.solr.repository.query.Query org.springframework.data.solr.repository.query.Query ( Query org.springframework.data.solr.repository.query.Query , Query org.springframework.data.solr.repository.query.Query ) { Criteria org.springframework.data.solr.repository.query.Criteria = org.springframework.data.solr.repository.query.Query . getCriteria ( ) ; org.springframework.data.solr.repository.query.Criteria . setPartIsOr ( true ) ; if ( org.springframework.data.solr.repository.query.Criteria . hasSiblings ( ) ) { boolean boolean = true ; for ( Criteria org.springframework.data.solr.repository.query.Criteria : org.springframework.data.solr.repository.query.Criteria . getSiblings ( ) ) { if ( boolean ) { org.springframework.data.solr.repository.query.Criteria . setPartIsOr ( true ) ; boolean = false ; } org.springframework.data.solr.repository.query.Query . addCriteria ( org.springframework.data.solr.repository.query.Criteria ) ; } } else { org.springframework.data.solr.repository.query.Query . addCriteria ( org.springframework.data.solr.repository.query.Criteria ) ; } return org.springframework.data.solr.repository.query.Query ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.solr.repository.query.Query org.springframework.data.solr.repository.query.Query ( Query org.springframework.data.solr.repository.query.Query , Sort org.springframework.data.solr.repository.query.Sort ) { if ( org.springframework.data.solr.repository.query.Query == null ) { return null ; } return org.springframework.data.solr.repository.query.Query . addSort ( org.springframework.data.solr.repository.query.Sort ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.repository.query.Criteria org.springframework.data.solr.repository.query.Criteria ( Type org.springframework.data.solr.repository.query.Type , Criteria org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<?> < ? > java.util.Iterator<?> ) { Criteria org.springframework.data.solr.repository.query.Criteria = org.springframework.data.solr.repository.query.Criteria ; if ( org.springframework.data.solr.repository.query.Criteria == null ) { org.springframework.data.solr.repository.query.Criteria = new Criteria ( ) ; } switch ( org.springframework.data.solr.repository.query.Type ) { case TRUE : return org.springframework.data.solr.repository.query.Criteria . is ( true ) ; case FALSE : return org.springframework.data.solr.repository.query.Criteria . is ( false ) ; case SIMPLE_PROPERTY : return org.springframework.data.solr.repository.query.Criteria . is ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ; case NEGATING_SIMPLE_PROPERTY : return org.springframework.data.solr.repository.query.Criteria . is ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) . not ( ) ; case IS_NULL : return org.springframework.data.solr.repository.query.Criteria . isNull ( ) ; case IS_NOT_NULL : return org.springframework.data.solr.repository.query.Criteria . isNotNull ( ) ; case REGEX : return org.springframework.data.solr.repository.query.Criteria . expression ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) . toString ( ) ) ; case LIKE : case STARTING_WITH : return org.springframework.data.solr.repository.query.Criteria . startsWith ( java.lang.String[] ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ) ; case NOT_LIKE : return org.springframework.data.solr.repository.query.Criteria . startsWith ( java.lang.String[] ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ) . not ( ) ; case ENDING_WITH : return org.springframework.data.solr.repository.query.Criteria . endsWith ( java.lang.String[] ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ) ; case CONTAINING : return org.springframework.data.solr.repository.query.Criteria . contains ( java.lang.String[] ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ) ; case AFTER : case GREATER_THAN : return org.springframework.data.solr.repository.query.Criteria . greaterThan ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ; case GREATER_THAN_EQUAL : return org.springframework.data.solr.repository.query.Criteria . greaterThanEqual ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ; case BEFORE : case LESS_THAN : return org.springframework.data.solr.repository.query.Criteria . lessThan ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ; case LESS_THAN_EQUAL : return org.springframework.data.solr.repository.query.Criteria . lessThanEqual ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ; case BETWEEN : return org.springframework.data.solr.repository.query.Criteria . between ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) , java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ; case IN : return org.springframework.data.solr.repository.query.Criteria . in ( java.lang.Object[] ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ) ; case NOT_IN : return org.springframework.data.solr.repository.query.Criteria . in ( java.lang.Object[] ( java.lang.Object ( org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<> ) ) ) . not ( ) ; case NEAR : return org.springframework.data.solr.repository.query.Criteria ( java.util.Iterator<> , org.springframework.data.solr.repository.query.Criteria ) ; case WITHIN : return org.springframework.data.solr.repository.query.Criteria . within ( ( Point ) java.lang.Object ( ( BindableSolrParameter ) java.util.Iterator<> . next ( ) ) , ( Distance ) java.lang.Object ( ( BindableSolrParameter ) java.util.Iterator<> . next ( ) ) ) ; default: throw new InvalidDataAccessApiUsageException ( STRING + org.springframework.data.solr.repository.query.Type + STRING ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( Criteria org.springframework.data.solr.repository.query.Criteria , java.util.Iterator<?> < ? > java.util.Iterator<?> ) { java.lang.Object java.lang.Object = java.util.Iterator<> . next ( ) ; if ( java.lang.Object instanceof BindableSolrParameter ) { BindableSolrParameter org.springframework.data.solr.repository.query.BindableSolrParameter = ( BindableSolrParameter ) java.lang.Object ; org.springframework.data.solr.repository.query.Criteria ( org.springframework.data.solr.repository.query.Criteria , org.springframework.data.solr.repository.query.BindableSolrParameter ) ; return org.springframework.data.solr.repository.query.BindableSolrParameter . getValue ( ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.repository.query.Criteria org.springframework.data.solr.repository.query.Criteria ( Criteria org.springframework.data.solr.repository.query.Criteria , BindableSolrParameter org.springframework.data.solr.repository.query.BindableSolrParameter ) { if ( ! java.lang.Float . boolean ( org.springframework.data.solr.repository.query.BindableSolrParameter . getBoost ( ) ) ) { org.springframework.data.solr.repository.query.Criteria . boost ( org.springframework.data.solr.repository.query.BindableSolrParameter . getBoost ( ) ) ; } return org.springframework.data.solr.repository.query.Criteria ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( BindableSolrParameter org.springframework.data.solr.repository.query.BindableSolrParameter ) { if ( org.springframework.data.solr.repository.query.BindableSolrParameter == null ) { return null ; } return org.springframework.data.solr.repository.query.BindableSolrParameter . getValue ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.repository.query.Criteria org.springframework.data.solr.repository.query.Criteria ( java.util.Iterator<?> < ? > java.util.Iterator<?> , Criteria org.springframework.data.solr.repository.query.Criteria ) { java.lang.Object java.lang.Object = java.lang.Object ( ( BindableSolrParameter ) java.util.Iterator<> . next ( ) ) ; if ( java.lang.Object instanceof Box ) { return org.springframework.data.solr.repository.query.Criteria . near ( ( Box ) java.lang.Object ) ; } else { return org.springframework.data.solr.repository.query.Criteria . near ( ( Point ) java.lang.Object , ( Distance ) java.lang.Object ( ( BindableSolrParameter ) java.util.Iterator<> . next ( ) ) ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object [] java.lang.Object[] ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof java.util.Collection ) { return ( ( java.util.Collection<?> < ? > ) java.lang.Object ) . java.lang.Object[] ( ) ; } else if ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( ) ) { return ( java.lang.Object [] ) java.lang.Object ; } return new java.lang.Object [] { java.lang.Object } ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.lang.String [] java.lang.String[] ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof java.util.Collection ) { java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) java.lang.Object ; if ( java.util.Collection<> . boolean ( ) ) { return new java.lang.String [ NUMBER ] ; } else { if ( ! ( java.util.Collection<> . java.util.Iterator<> ( ) . next ( ) instanceof java.lang.String ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } return ( ( java.util.Collection<java.lang.String> < java.lang.String > ) java.lang.Object ) . java.lang.String[] ( new java.lang.String [ java.util.Collection<> . int ( ) ] ) ; } } else if ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( ) ) { if ( ! ( java.lang.Object instanceof java.lang.String [] ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } return ( java.lang.String [] ) java.lang.Object ; } return new java.lang.String [] { java.lang.Object . java.lang.String ( ) } ; }  <METHOD_END>
