<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<T> < T > java.lang.Class<T> ) { void ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<T> < T > java.lang.Class<T> ) { this . java.lang.Class<?> = ClassUtils . resolvePrimitiveIfNecessary ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public T T ( java.sql.ResultSet java.sql.ResultSet , int int ) throws java.sql.SQLException { java.sql.ResultSetMetaData java.sql.ResultSetMetaData = java.sql.ResultSet . java.sql.ResultSetMetaData ( ) ; int int = java.sql.ResultSetMetaData . int ( ) ; if ( int != NUMBER ) { throw new IncorrectResultSetColumnCountException ( NUMBER , int ) ; } java.lang.Object java.lang.Object = java.lang.Object ( java.sql.ResultSet , NUMBER , this . java.lang.Class<> ) ; if ( java.lang.Object != null && this . java.lang.Class<> != null && ! this . java.lang.Class<> . boolean ( java.lang.Object ) ) { try { return ( T ) java.lang.Object ( java.lang.Object , this . java.lang.Class<> ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { throw new TypeMismatchDataAccessException ( STRING + int + STRING + java.sql.ResultSetMetaData . java.lang.String ( NUMBER ) + STRING + java.lang.IllegalArgumentException . java.lang.String ( ) ) ; } } return ( T ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.sql.ResultSet java.sql.ResultSet , int int , java.lang.Class<?> < ? > java.lang.Class<?> ) throws java.sql.SQLException { if ( java.lang.Class<> != null ) { return JdbcUtils . getResultSetValue ( java.sql.ResultSet , int , java.lang.Class<> ) ; } else { return java.lang.Object ( java.sql.ResultSet , int ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.sql.ResultSet java.sql.ResultSet , int int ) throws java.sql.SQLException { return JdbcUtils . getResultSetValue ( java.sql.ResultSet , int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.String .class == java.lang.Class<> ) { return java.lang.Object . java.lang.String ( ) ; } else if ( java.lang.Number .class . boolean ( java.lang.Class<> ) ) { if ( java.lang.Object instanceof java.lang.Number ) { return NumberUtils . convertNumberToTargetClass ( ( ( java.lang.Number ) java.lang.Object ) , ( java.lang.Class<java.lang.Number> < java.lang.Number > ) java.lang.Class<> ) ; } else { return NumberUtils . parseNumber ( java.lang.Object . java.lang.String ( ) , ( java.lang.Class<java.lang.Number> < java.lang.Number > ) java.lang.Class<> ) ; } } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING + java.lang.Class<> . java.lang.String ( ) + STRING ) ; } }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.jdbc.core.SingleColumnRowMapper<T> < T > org.springframework.jdbc.core.SingleColumnRowMapper<T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return new org.springframework.jdbc.core.SingleColumnRowMapper<T> <> ( java.lang.Class<T> ) ; }  <METHOD_END>
