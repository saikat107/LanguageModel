<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvider org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvider ( ) { return new DataSourcePoolMetadataProvider ( ) { @ java.lang.Override public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata ( javax.sql.DataSource javax.sql.DataSource ) { if ( javax.sql.DataSource instanceof org . org.apache . org.apache . org.apache . org.apache . org.apache ) { return new TomcatDataSourcePoolMetadata ( ( org . org.apache . org.apache . org.apache . org.apache . org.apache ) javax.sql.DataSource ) ; } return null ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata ( javax.sql.DataSource javax.sql.DataSource ) { if ( javax.sql.DataSource instanceof org . org.apache . org.apache . org.apache . org.apache . org.apache ) { return new TomcatDataSourcePoolMetadata ( ( org . org.apache . org.apache . org.apache . org.apache . org.apache ) javax.sql.DataSource ) ; } return null ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvider org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvider ( ) { return new DataSourcePoolMetadataProvider ( ) { @ java.lang.Override public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata ( javax.sql.DataSource javax.sql.DataSource ) { if ( javax.sql.DataSource instanceof HikariDataSource ) { return new HikariDataSourcePoolMetadata ( ( HikariDataSource ) javax.sql.DataSource ) ; } return null ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata ( javax.sql.DataSource javax.sql.DataSource ) { if ( javax.sql.DataSource instanceof HikariDataSource ) { return new HikariDataSourcePoolMetadata ( ( HikariDataSource ) javax.sql.DataSource ) ; } return null ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvider org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvider ( ) { return new DataSourcePoolMetadataProvider ( ) { @ java.lang.Override public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata ( javax.sql.DataSource javax.sql.DataSource ) { if ( javax.sql.DataSource instanceof BasicDataSource ) { return new CommonsDbcp2DataSourcePoolMetadata ( ( BasicDataSource ) javax.sql.DataSource ) ; } return null ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadata ( javax.sql.DataSource javax.sql.DataSource ) { if ( javax.sql.DataSource instanceof BasicDataSource ) { return new CommonsDbcp2DataSourcePoolMetadata ( ( BasicDataSource ) javax.sql.DataSource ) ; } return null ; }  <METHOD_END>
