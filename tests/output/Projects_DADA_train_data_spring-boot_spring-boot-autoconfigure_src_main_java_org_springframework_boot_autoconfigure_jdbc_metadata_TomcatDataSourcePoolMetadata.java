<METHOD_START> public void ( DataSource org.springframework.boot.autoconfigure.jdbc.metadata.DataSource ) { super( org.springframework.boot.autoconfigure.jdbc.metadata.DataSource ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Integer java.lang.Integer ( ) { ConnectionPool org.springframework.boot.autoconfigure.jdbc.metadata.ConnectionPool = getDataSource ( ) . getPool ( ) ; return ( org.springframework.boot.autoconfigure.jdbc.metadata.ConnectionPool == null ? NUMBER : org.springframework.boot.autoconfigure.jdbc.metadata.ConnectionPool . getActive ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Integer java.lang.Integer ( ) { return getDataSource ( ) . getMaxActive ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Integer java.lang.Integer ( ) { return getDataSource ( ) . getMinIdle ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return getDataSource ( ) . getValidationQuery ( ) ; }  <METHOD_END>