<METHOD_START> public void ( PartTree org.springframework.data.cassandra.repository.query.PartTree , CassandraParameterAccessor org.springframework.data.cassandra.repository.query.CassandraParameterAccessor , CassandraMappingContext org.springframework.data.cassandra.repository.query.CassandraMappingContext , CassandraEntityMetadata < ? > org.springframework.data.cassandra.repository.query.CassandraEntityMetadata<?> ) { super( org.springframework.data.cassandra.repository.query.PartTree , org.springframework.data.cassandra.repository.query.CassandraParameterAccessor ); Assert . notNull ( org.springframework.data.cassandra.repository.query.CassandraMappingContext , STRING ) ; Assert . notNull ( org.springframework.data.cassandra.repository.query.CassandraEntityMetadata<> , STRING ) ; this . org.springframework.data.cassandra.repository.query.CassandraMappingContext = org.springframework.data.cassandra.repository.query.CassandraMappingContext ; this . org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<?> = org.springframework.data.cassandra.repository.query.CassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.repository.query.CassandraEntityMetadata<> . getJavaType ( ) ) ; this . org.springframework.data.cassandra.repository.query.CqlIdentifier = org.springframework.data.cassandra.repository.query.CassandraEntityMetadata<> . getTableName ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.cassandra.repository.query.Clause org.springframework.data.cassandra.repository.query.Clause ( Part org.springframework.data.cassandra.repository.query.Part , java.util.Iterator<java.lang.Object> < java.lang.Object > java.util.Iterator<java.lang.Object> ) { PersistentPropertyPath < CassandraPersistentProperty > org.springframework.data.cassandra.repository.query.PersistentPropertyPath<org.springframework.data.cassandra.repository.query.CassandraPersistentProperty> = org.springframework.data.cassandra.repository.query.CassandraMappingContext . getPersistentPropertyPath ( org.springframework.data.cassandra.repository.query.Part . getProperty ( ) ) ; CassandraPersistentProperty org.springframework.data.cassandra.repository.query.CassandraPersistentProperty = org.springframework.data.cassandra.repository.query.PersistentPropertyPath<org.springframework.data.cassandra.repository.query.CassandraPersistentProperty> . getLeafProperty ( ) ; return org.springframework.data.cassandra.repository.query.Clause ( org.springframework.data.cassandra.repository.query.Part , org.springframework.data.cassandra.repository.query.CassandraPersistentProperty , ( PotentiallyConvertingIterator ) java.util.Iterator<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.cassandra.repository.query.Clause org.springframework.data.cassandra.repository.query.Clause ( Part org.springframework.data.cassandra.repository.query.Part , Clause org.springframework.data.cassandra.repository.query.Clause , java.util.Iterator<java.lang.Object> < java.lang.Object > java.util.Iterator<java.lang.Object> ) { if ( org.springframework.data.cassandra.repository.query.Clause == null ) { return org.springframework.data.cassandra.repository.query.CassandraQueryCreator.WhereBuilder . org.springframework.data.cassandra.repository.query.Clause ( org.springframework.data.cassandra.repository.query.Clause ( org.springframework.data.cassandra.repository.query.Part , java.util.Iterator<java.lang.Object> ) ) ; } org.springframework.data.cassandra.repository.query.CassandraQueryCreator.WhereBuilder . org.springframework.data.cassandra.repository.query.Clause ( org.springframework.data.cassandra.repository.query.Clause ) ; return org.springframework.data.cassandra.repository.query.Clause ( org.springframework.data.cassandra.repository.query.Part , java.util.Iterator<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.cassandra.repository.query.Clause org.springframework.data.cassandra.repository.query.Clause ( Clause org.springframework.data.cassandra.repository.query.Clause , Clause org.springframework.data.cassandra.repository.query.Clause ) { throw new InvalidDataAccessApiUsageException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.cassandra.repository.query.Select org.springframework.data.cassandra.repository.query.Select ( Clause org.springframework.data.cassandra.repository.query.Clause , Sort org.springframework.data.cassandra.repository.query.Sort ) { if ( org.springframework.data.cassandra.repository.query.Clause != null ) { org.springframework.data.cassandra.repository.query.CassandraQueryCreator.WhereBuilder . org.springframework.data.cassandra.repository.query.Clause ( org.springframework.data.cassandra.repository.query.Clause ) ; } Select org.springframework.data.cassandra.repository.query.Select = org.springframework.data.cassandra.repository.query.CassandraQueryCreator.StatementBuilder . org.springframework.data.cassandra.repository.query.Select ( org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<> , org.springframework.data.cassandra.repository.query.CqlIdentifier , org.springframework.data.cassandra.repository.query.CassandraQueryCreator.WhereBuilder , org.springframework.data.cassandra.repository.query.Sort ) ; if ( org.springframework.data.cassandra.repository.query.Logger . isDebugEnabled ( ) ) { org.springframework.data.cassandra.repository.query.Logger . debug ( STRING , org.springframework.data.cassandra.repository.query.Select ) ; } return org.springframework.data.cassandra.repository.query.Select ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.cassandra.repository.query.Clause org.springframework.data.cassandra.repository.query.Clause ( Part org.springframework.data.cassandra.repository.query.Part , CassandraPersistentProperty org.springframework.data.cassandra.repository.query.CassandraPersistentProperty , PotentiallyConvertingIterator org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator ) { Type org.springframework.data.cassandra.repository.query.Type = org.springframework.data.cassandra.repository.query.Part . getType ( ) ; switch ( org.springframework.data.cassandra.repository.query.Type ) { case AFTER : case GREATER_THAN : return QueryBuilder . gt ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator . nextConverted ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ; case GREATER_THAN_EQUAL : return QueryBuilder . gte ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator . nextConverted ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ; case BEFORE : case LESS_THAN : return QueryBuilder . lt ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator . nextConverted ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ; case LESS_THAN_EQUAL : return QueryBuilder . lte ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator . nextConverted ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ; case IN : return QueryBuilder . in ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , java.lang.Object[] ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty , org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator ) ) ; case LIKE : case STARTING_WITH : case ENDING_WITH : return QueryBuilder . like ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , java.lang.Object ( org.springframework.data.cassandra.repository.query.Type , org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator . nextConverted ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ) ; case CONTAINING : return org.springframework.data.cassandra.repository.query.Clause ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty , org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator . nextConverted ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ; case TRUE : return QueryBuilder . eq ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , true ) ; case FALSE : return QueryBuilder . eq ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , false ) ; case SIMPLE_PROPERTY : return QueryBuilder . eq ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator . nextConverted ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ; default: throw new InvalidDataAccessApiUsageException ( java.lang.String . java.lang.String ( STRING , org.springframework.data.cassandra.repository.query.Type , org.springframework.data.cassandra.repository.query.Part ) ) ; } }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( CassandraPersistentProperty org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) { return org.springframework.data.cassandra.repository.query.CassandraPersistentProperty . getColumnName ( ) . toCql ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.cassandra.repository.query.Clause org.springframework.data.cassandra.repository.query.Clause ( CassandraPersistentProperty org.springframework.data.cassandra.repository.query.CassandraPersistentProperty , java.lang.Object java.lang.Object ) { if ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty . isCollectionLike ( ) || org.springframework.data.cassandra.repository.query.CassandraPersistentProperty . isMapLike ( ) ) { return QueryBuilder . contains ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , java.lang.Object ) ; } return QueryBuilder . like ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) , java.lang.Object ( Type . CONTAINING , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( Type org.springframework.data.cassandra.repository.query.Type , java.lang.Object java.lang.Object ) { if ( java.lang.Object != null ) { switch ( org.springframework.data.cassandra.repository.query.Type ) { case LIKE : return java.lang.Object ; case CONTAINING : return STRING + java.lang.Object + STRING ; case STARTING_WITH : return java.lang.Object + STRING ; case ENDING_WITH : return STRING + java.lang.Object ; } throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , org.springframework.data.cassandra.repository.query.Type ) ) ; } return null ; }  <METHOD_END>
<METHOD_START> private java.lang.Object [] java.lang.Object[] ( CassandraPersistentProperty org.springframework.data.cassandra.repository.query.CassandraPersistentProperty , PotentiallyConvertingIterator org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator ) { java.lang.Object java.lang.Object = org.springframework.data.cassandra.repository.query.PotentiallyConvertingIterator . nextConverted ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ; if ( java.lang.Object instanceof java.util.Collection ) { return ( ( java.util.Collection<?> < ? > ) java.lang.Object ) . java.lang.Object[] ( ) ; } else if ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( ) ) { return ( java.lang.Object [] ) java.lang.Object ; } return new java.lang.Object [] { java.lang.Object } ; }  <METHOD_END>
<METHOD_START> org.springframework.data.cassandra.repository.query.Clause org.springframework.data.cassandra.repository.query.Clause ( Clause org.springframework.data.cassandra.repository.query.Clause ) { java.util.List<org.springframework.data.cassandra.repository.query.Clause> . add ( org.springframework.data.cassandra.repository.query.Clause ) ; return org.springframework.data.cassandra.repository.query.Clause ; }  <METHOD_END>
<METHOD_START> Select . Select.Where Select.Where ( Select . Select Select.Where ) { for ( Clause org.springframework.data.cassandra.repository.query.Clause : java.util.List<org.springframework.data.cassandra.repository.query.Clause> ) { Select.Where = Select.Where . and ( org.springframework.data.cassandra.repository.query.Clause ) ; } return Select.Where ; }  <METHOD_END>
<METHOD_START> static org.springframework.data.cassandra.repository.query.Select org.springframework.data.cassandra.repository.query.Select ( CassandraPersistentEntity < ? > org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<?> , CqlIdentifier org.springframework.data.cassandra.repository.query.CqlIdentifier , org.springframework.data.cassandra.repository.query.CassandraQueryCreator.WhereBuilder org.springframework.data.cassandra.repository.query.CassandraQueryCreator.WhereBuilder , Sort org.springframework.data.cassandra.repository.query.Sort ) { Select org.springframework.data.cassandra.repository.query.Select = QueryBuilder . select ( ) . from ( org.springframework.data.cassandra.repository.query.CqlIdentifier . toCql ( ) ) ; org.springframework.data.cassandra.repository.query.CassandraQueryCreator.WhereBuilder . Select.Where ( org.springframework.data.cassandra.repository.query.Select . where ( ) ) ; if ( org.springframework.data.cassandra.repository.query.Sort != null ) { for ( Order org.springframework.data.cassandra.repository.query.Order : org.springframework.data.cassandra.repository.query.Sort ) { java.lang.String java.lang.String = org.springframework.data.cassandra.repository.query.Order . getProperty ( ) ; CassandraPersistentProperty org.springframework.data.cassandra.repository.query.CassandraPersistentProperty = org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ( org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<> , java.lang.String ) ; if ( org.springframework.data.cassandra.repository.query.Order . isAscending ( ) ) { org.springframework.data.cassandra.repository.query.Select . orderBy ( QueryBuilder . asc ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ) ; } else { org.springframework.data.cassandra.repository.query.Select . orderBy ( QueryBuilder . desc ( java.lang.String ( org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ) ) ) ; } } } return org.springframework.data.cassandra.repository.query.Select ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private static org.springframework.data.cassandra.repository.query.CassandraPersistentProperty org.springframework.data.cassandra.repository.query.CassandraPersistentProperty ( CassandraPersistentEntity < ? > org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<?> , java.lang.String java.lang.String ) { java.lang.String [] java.lang.String[] = java.util.regex.Pattern . java.lang.String[] ( java.lang.String ) ; java.util.Optional<org.springframework.data.cassandra.repository.query.CassandraPersistentProperty> < CassandraPersistentProperty > java.util.Optional<org.springframework.data.cassandra.repository.query.CassandraPersistentProperty> = java.util.Optional . java.util.Optional<org.springframework.data.cassandra.repository.query.CassandraPersistentProperty> ( ) ; CassandraPersistentEntity < ? > org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<?> = org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<> ; for ( java.lang.String java.lang.String : java.lang.String[] ) { java.util.Optional<org.springframework.data.cassandra.repository.query.CassandraPersistentProperty> = org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<> . getPersistentProperty ( java.lang.String ) ; org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<?> = java.util.Optional<org.springframework.data.cassandra.repository.query.CassandraPersistentProperty> . filter ( CassandraPersistentProperty :: isCompositePrimaryKey ) . map ( CassandraPersistentProperty :: getCompositePrimaryKeyEntity ) . orElse ( ( CassandraPersistentEntity ) org.springframework.data.cassandra.repository.query.CassandraPersistentEntity<> ) ; } return java.util.Optional<org.springframework.data.cassandra.repository.query.CassandraPersistentProperty> . orElseThrow ( ( ) new IllegalArgumentException ( String . format ( STRING , dotPath , entity . getName ( ) ) ) ) ; }  <METHOD_END>
