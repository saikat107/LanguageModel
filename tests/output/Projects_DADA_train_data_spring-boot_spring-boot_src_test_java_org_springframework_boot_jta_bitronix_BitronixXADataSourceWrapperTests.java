<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.sql.XADataSource javax.sql.XADataSource = mock ( javax.sql.XADataSource .class ) ; BitronixXADataSourceWrapper org.springframework.boot.jta.bitronix.BitronixXADataSourceWrapper = new BitronixXADataSourceWrapper ( ) ; javax.sql.DataSource javax.sql.DataSource = org.springframework.boot.jta.bitronix.BitronixXADataSourceWrapper . wrapDataSource ( javax.sql.XADataSource ) ; assertThat ( javax.sql.DataSource ) . isInstanceOf ( PoolingDataSourceBean .class ) ; assertThat ( ( ( PoolingDataSourceBean ) javax.sql.DataSource ) . getDataSource ( ) ) . isSameAs ( javax.sql.XADataSource ) ; }  <METHOD_END>
