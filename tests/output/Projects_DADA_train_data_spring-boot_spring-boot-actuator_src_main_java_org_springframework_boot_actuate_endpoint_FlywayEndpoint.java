<METHOD_START> public void ( Flyway org.springframework.boot.actuate.endpoint.Flyway ) { this( java.util.Collections . java.util.Map ( STRING , org.springframework.boot.actuate.endpoint.Flyway ) ); }  <METHOD_END>
<METHOD_START> public void ( java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> < java.lang.String , Flyway > java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> ) { super( STRING ); Assert . notEmpty ( java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> , STRING ) ; this . java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> = java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport> < org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport > java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport> ( ) { java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport> < org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport > java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport> = new java.util.ArrayList<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport> <> ( ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> < java.lang.String , Flyway > java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> : this . java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> . entrySet ( ) ) { java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> < org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration > java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> = new java.util.ArrayList<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> <> ( ) ; for ( MigrationInfo org.springframework.boot.actuate.endpoint.MigrationInfo : java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> . getValue ( ) . info ( ) . all ( ) ) { java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> . boolean ( new org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration ( org.springframework.boot.actuate.endpoint.MigrationInfo ) ) ; } java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport> . boolean ( new org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport ( java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.Flyway> . getKey ( ) , java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> ) ) ; } return java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayReport> ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> < org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration > java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> ) { this . java.lang.String = java.lang.String ; this . java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> = java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> < org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration > java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> ( ) { return this . java.util.List<org.springframework.boot.actuate.endpoint.FlywayEndpoint.FlywayMigration> ; }  <METHOD_END>
<METHOD_START> public void ( MigrationInfo org.springframework.boot.actuate.endpoint.MigrationInfo ) { this . org.springframework.boot.actuate.endpoint.MigrationType = org.springframework.boot.actuate.endpoint.MigrationInfo . getType ( ) ; this . java.lang.Integer = org.springframework.boot.actuate.endpoint.MigrationInfo . getChecksum ( ) ; this . java.lang.String = java.lang.String ( org.springframework.boot.actuate.endpoint.MigrationInfo . getVersion ( ) ) ; this . java.lang.String = org.springframework.boot.actuate.endpoint.MigrationInfo . getDescription ( ) ; this . java.lang.String = org.springframework.boot.actuate.endpoint.MigrationInfo . getScript ( ) ; this . org.springframework.boot.actuate.endpoint.MigrationState = org.springframework.boot.actuate.endpoint.MigrationInfo . getState ( ) ; this . java.util.Date = org.springframework.boot.actuate.endpoint.MigrationInfo . getInstalledOn ( ) ; this . java.lang.Integer = org.springframework.boot.actuate.endpoint.MigrationInfo . getExecutionTime ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { return ( java.lang.Object == null ? null : java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.actuate.endpoint.MigrationType org.springframework.boot.actuate.endpoint.MigrationType ( ) { return this . org.springframework.boot.actuate.endpoint.MigrationType ; }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) { return this . java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.actuate.endpoint.MigrationState org.springframework.boot.actuate.endpoint.MigrationState ( ) { return this . org.springframework.boot.actuate.endpoint.MigrationState ; }  <METHOD_END>
<METHOD_START> public java.util.Date java.util.Date ( ) { return this . java.util.Date ; }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) { return this . java.lang.Integer ; }  <METHOD_END>
