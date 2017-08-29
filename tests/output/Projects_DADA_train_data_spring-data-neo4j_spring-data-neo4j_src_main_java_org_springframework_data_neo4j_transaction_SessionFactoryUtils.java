<METHOD_START> public static void void ( Session org.springframework.data.neo4j.transaction.Session ) {	}  <METHOD_END>
<METHOD_START> public static org.springframework.data.neo4j.transaction.Session org.springframework.data.neo4j.transaction.Session ( SessionFactory org.springframework.data.neo4j.transaction.SessionFactory ) throws java.lang.IllegalStateException { Assert . notNull ( org.springframework.data.neo4j.transaction.SessionFactory , STRING ) ; SessionHolder org.springframework.data.neo4j.transaction.SessionHolder = ( SessionHolder ) TransactionSynchronizationManager . getResource ( org.springframework.data.neo4j.transaction.SessionFactory ) ; if ( org.springframework.data.neo4j.transaction.SessionHolder != null ) { if ( ! org.springframework.data.neo4j.transaction.SessionHolder . isSynchronizedWithTransaction ( ) && TransactionSynchronizationManager . isSynchronizationActive ( ) ) { org.springframework.data.neo4j.transaction.SessionHolder . setSynchronizedWithTransaction ( true ) ; TransactionSynchronizationManager . registerSynchronization ( new org.springframework.data.neo4j.transaction.SessionFactoryUtils.SessionSynchronization ( org.springframework.data.neo4j.transaction.SessionHolder , org.springframework.data.neo4j.transaction.SessionFactory , false ) ) ; } return org.springframework.data.neo4j.transaction.SessionHolder . getSession ( ) ; } if ( ! TransactionSynchronizationManager . isSynchronizationActive ( ) ) { return null ; } Session org.springframework.data.neo4j.transaction.Session = org.springframework.data.neo4j.transaction.SessionFactory . openSession ( ) ; org.springframework.data.neo4j.transaction.Logger . debug ( STRING ) ; org.springframework.data.neo4j.transaction.SessionHolder = new SessionHolder ( org.springframework.data.neo4j.transaction.Session ) ; org.springframework.data.neo4j.transaction.SessionHolder . setSynchronizedWithTransaction ( true ) ; TransactionSynchronizationManager . registerSynchronization ( new org.springframework.data.neo4j.transaction.SessionFactoryUtils.SessionSynchronization ( org.springframework.data.neo4j.transaction.SessionHolder , org.springframework.data.neo4j.transaction.SessionFactory , true ) ) ; TransactionSynchronizationManager . bindResource ( org.springframework.data.neo4j.transaction.SessionFactory , org.springframework.data.neo4j.transaction.SessionHolder ) ; return org.springframework.data.neo4j.transaction.Session ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.neo4j.transaction.DataAccessException org.springframework.data.neo4j.transaction.DataAccessException ( java.lang.RuntimeException java.lang.RuntimeException ) { if ( java.lang.RuntimeException instanceof java.lang.IllegalStateException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof NotFoundException ) { return new DataRetrievalFailureException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof InvalidDepthException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof ResultProcessingException ) { return new DataRetrievalFailureException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof MappingException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof UnknownStatementTypeException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof ConnectionException ) { return new DataAccessResourceFailureException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof MissingOperatorException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof ResultErrorsException ) { return new DataRetrievalFailureException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof ServiceNotFoundException ) { return new DataAccessResourceFailureException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof TransactionException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof TransactionManagerException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof MissingIndexException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof Neo4jException ) { return new InvalidDataAccessApiUsageException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } if ( java.lang.RuntimeException instanceof CypherException ) { java.lang.String java.lang.String = ( ( CypherException ) java.lang.RuntimeException ) . getCode ( ) ; final java.lang.Class<? extends org.springframework.data.neo4j.transaction.DataAccessException> < ? extends DataAccessException > java.lang.Class<? extends org.springframework.data.neo4j.transaction.DataAccessException> = Neo4jErrorStatusCodes . translate ( java.lang.String ) ; if ( java.lang.Class<> != null ) { try { final java.lang.reflect.Constructor<? extends org.springframework.data.neo4j.transaction.DataAccessException> < ? extends DataAccessException > java.lang.reflect.Constructor<? extends org.springframework.data.neo4j.transaction.DataAccessException> = java.lang.Class<> . java.lang.reflect.Constructor<> ( java.lang.String .class , java.lang.Throwable .class ) ; return java.lang.reflect.Constructor<> . newInstance ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } catch ( java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException java.lang.ReflectiveOperationException ) { return null ; } } return new UncategorizedNeo4jException ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; } return null ; }  <METHOD_END>
<METHOD_START> void ( SessionHolder org.springframework.data.neo4j.transaction.SessionHolder , SessionFactory org.springframework.data.neo4j.transaction.SessionFactory , boolean boolean ) { super( org.springframework.data.neo4j.transaction.SessionHolder , org.springframework.data.neo4j.transaction.SessionFactory ); this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SessionHolder org.springframework.data.neo4j.transaction.SessionHolder ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( SessionHolder org.springframework.data.neo4j.transaction.SessionHolder ) { return false ; }  <METHOD_END>