<METHOD_START> @ java.lang.Override public int int ( CassandraPersistentProperty org.springframework.data.cassandra.mapping.CassandraPersistentProperty , CassandraPersistentProperty org.springframework.data.cassandra.mapping.CassandraPersistentProperty ) { if ( org.springframework.data.cassandra.mapping.CassandraPersistentProperty == null && org.springframework.data.cassandra.mapping.CassandraPersistentProperty == null ) { return NUMBER ; } else if ( org.springframework.data.cassandra.mapping.CassandraPersistentProperty != null && org.springframework.data.cassandra.mapping.CassandraPersistentProperty == null ) { return NUMBER ; } else if ( org.springframework.data.cassandra.mapping.CassandraPersistentProperty == null ) { return - NUMBER ; } else if ( org.springframework.data.cassandra.mapping.CassandraPersistentProperty . equals ( org.springframework.data.cassandra.mapping.CassandraPersistentProperty ) ) { return NUMBER ; } boolean boolean = org.springframework.data.cassandra.mapping.CassandraPersistentProperty . isCompositePrimaryKey ( ) ; boolean boolean = org.springframework.data.cassandra.mapping.CassandraPersistentProperty . isCompositePrimaryKey ( ) ; if ( boolean && boolean ) { return NUMBER ; } boolean boolean = org.springframework.data.cassandra.mapping.CassandraPersistentProperty . isPrimaryKeyColumn ( ) ; boolean boolean = org.springframework.data.cassandra.mapping.CassandraPersistentProperty . isPrimaryKeyColumn ( ) ; if ( boolean && boolean ) { java.util.Optional<org.springframework.data.cassandra.mapping.PrimaryKeyColumn> < PrimaryKeyColumn > java.util.Optional<org.springframework.data.cassandra.mapping.PrimaryKeyColumn> = org.springframework.data.cassandra.mapping.CassandraPersistentProperty . findAnnotation ( PrimaryKeyColumn .class ) ; java.util.Optional<org.springframework.data.cassandra.mapping.PrimaryKeyColumn> < PrimaryKeyColumn > java.util.Optional<org.springframework.data.cassandra.mapping.PrimaryKeyColumn> = org.springframework.data.cassandra.mapping.CassandraPersistentProperty . findAnnotation ( PrimaryKeyColumn .class ) ; return java.util.Optional<org.springframework.data.cassandra.mapping.PrimaryKeyColumn> . map ( leftAnnotation -> { return optionaRightAnnotation . map ( rightAnnotation -> CassandraPrimaryKeyColumnAnnotationComparator . INSTANCE . compare ( leftAnnotation , rightAnnotation ) ) . orElse ( NUMBER ) ; } ) . orElse ( NUMBER ) ; } boolean boolean = boolean || boolean ; boolean boolean = boolean || boolean ; if ( boolean && ! boolean ) { return - NUMBER ; } else if ( ! boolean && boolean ) { return NUMBER ; } return org.springframework.data.cassandra.mapping.CassandraPersistentProperty . getColumnName ( ) . compareTo ( org.springframework.data.cassandra.mapping.CassandraPersistentProperty . getColumnName ( ) ) ; }  <METHOD_END>
