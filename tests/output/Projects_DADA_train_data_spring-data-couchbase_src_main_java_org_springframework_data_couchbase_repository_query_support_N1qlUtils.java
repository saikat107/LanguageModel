<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( CouchbasePersistentProperty org.springframework.data.couchbase.repository.query.support.CouchbasePersistentProperty ) { return STRING + org.springframework.data.couchbase.repository.query.support.CouchbasePersistentProperty . getFieldName ( ) + STRING ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.couchbase.repository.query.support.Expression org.springframework.data.couchbase.repository.query.support.Expression ( java.lang.String java.lang.String ) { return i ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.couchbase.repository.query.support.FromPath org.springframework.data.couchbase.repository.query.support.FromPath ( java.lang.String java.lang.String , ReturnedType org.springframework.data.couchbase.repository.query.support.ReturnedType , CouchbaseConverter org.springframework.data.couchbase.repository.query.support.CouchbaseConverter ) { Expression org.springframework.data.couchbase.repository.query.support.Expression = org.springframework.data.couchbase.repository.query.support.Expression ( java.lang.String ) ; Expression org.springframework.data.couchbase.repository.query.support.Expression = path ( meta ( org.springframework.data.couchbase.repository.query.support.Expression ) , STRING ) . as ( SELECT_ID ) ; Expression org.springframework.data.couchbase.repository.query.support.Expression = path ( meta ( org.springframework.data.couchbase.repository.query.support.Expression ) , STRING ) . as ( SELECT_CAS ) ; java.util.List<org.springframework.data.couchbase.repository.query.support.Expression> < Expression > java.util.List<org.springframework.data.couchbase.repository.query.support.Expression> = new java.util.ArrayList<org.springframework.data.couchbase.repository.query.support.Expression> < Expression > ( ) ; java.util.List<org.springframework.data.couchbase.repository.query.support.Expression> . add ( org.springframework.data.couchbase.repository.query.support.Expression ) ; java.util.List<org.springframework.data.couchbase.repository.query.support.Expression> . add ( org.springframework.data.couchbase.repository.query.support.Expression ) ; if ( org.springframework.data.couchbase.repository.query.support.ReturnedType != null && org.springframework.data.couchbase.repository.query.support.ReturnedType . needsCustomConstruction ( ) ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.data.couchbase.repository.query.support.ReturnedType . getInputProperties ( ) ; CouchbasePersistentEntity < ? > org.springframework.data.couchbase.repository.query.support.CouchbasePersistentEntity<?> = org.springframework.data.couchbase.repository.query.support.CouchbaseConverter . getMappingContext ( ) . getRequiredPersistentEntity ( org.springframework.data.couchbase.repository.query.support.ReturnedType . getDomainType ( ) ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.util.List<org.springframework.data.couchbase.repository.query.support.Expression> . add ( path ( org.springframework.data.couchbase.repository.query.support.Expression , i ( org.springframework.data.couchbase.repository.query.support.CouchbasePersistentEntity<> . getRequiredPersistentProperty ( java.lang.String ) . getFieldName ( ) ) ) ) ; } } else { java.util.List<org.springframework.data.couchbase.repository.query.support.Expression> . add ( path ( org.springframework.data.couchbase.repository.query.support.Expression , STRING ) ) ; } Expression [] org.springframework.data.couchbase.repository.query.support.Expression[] = new Expression [ java.util.List<org.springframework.data.couchbase.repository.query.support.Expression> . size ( ) ] ; org.springframework.data.couchbase.repository.query.support.Expression[] = java.util.List<org.springframework.data.couchbase.repository.query.support.Expression> . toArray ( org.springframework.data.couchbase.repository.query.support.Expression[] ) ; return select ( org.springframework.data.couchbase.repository.query.support.Expression[] ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.couchbase.repository.query.support.FromPath org.springframework.data.couchbase.repository.query.support.FromPath ( java.lang.String java.lang.String ) { return org.springframework.data.couchbase.repository.query.support.FromPath ( java.lang.String , null , null ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.couchbase.repository.query.support.WherePath org.springframework.data.couchbase.repository.query.support.WherePath ( java.lang.String java.lang.String ) { return org.springframework.data.couchbase.repository.query.support.FromPath ( java.lang.String ) . from ( org.springframework.data.couchbase.repository.query.support.Expression ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.couchbase.repository.query.support.Expression org.springframework.data.couchbase.repository.query.support.Expression ( Expression org.springframework.data.couchbase.repository.query.support.Expression , CouchbaseConverter org.springframework.data.couchbase.repository.query.support.CouchbaseConverter , EntityMetadata < ? > org.springframework.data.couchbase.repository.query.support.EntityMetadata<?> ) { java.lang.String java.lang.String = org.springframework.data.couchbase.repository.query.support.CouchbaseConverter . getTypeKey ( ) ; java.lang.String java.lang.String = org.springframework.data.couchbase.repository.query.support.EntityMetadata<> . getJavaType ( ) . getName ( ) ; Expression org.springframework.data.couchbase.repository.query.support.Expression = i ( java.lang.String ) . eq ( s ( java.lang.String ) ) ; if ( org.springframework.data.couchbase.repository.query.support.Expression == null ) { org.springframework.data.couchbase.repository.query.support.Expression = org.springframework.data.couchbase.repository.query.support.Expression ; } else { org.springframework.data.couchbase.repository.query.support.Expression = x ( STRING + org.springframework.data.couchbase.repository.query.support.Expression . toString ( ) + STRING ) . and ( org.springframework.data.couchbase.repository.query.support.Expression ) ; } return org.springframework.data.couchbase.repository.query.support.Expression ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.couchbase.repository.query.support.PersistentPropertyPath<org.springframework.data.couchbase.repository.query.support.CouchbasePersistentProperty> < CouchbasePersistentProperty > org.springframework.data.couchbase.repository.query.support.PersistentPropertyPath<org.springframework.data.couchbase.repository.query.support.CouchbasePersistentProperty> ( CouchbaseConverter org.springframework.data.couchbase.repository.query.support.CouchbaseConverter , PropertyPath org.springframework.data.couchbase.repository.query.support.PropertyPath ) { PersistentPropertyPath < CouchbasePersistentProperty > org.springframework.data.couchbase.repository.query.support.PersistentPropertyPath<org.springframework.data.couchbase.repository.query.support.CouchbasePersistentProperty> = org.springframework.data.couchbase.repository.query.support.CouchbaseConverter . getMappingContext ( ) . getPersistentPropertyPath ( org.springframework.data.couchbase.repository.query.support.PropertyPath ) ; return org.springframework.data.couchbase.repository.query.support.PersistentPropertyPath<org.springframework.data.couchbase.repository.query.support.CouchbasePersistentProperty> ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( PersistentPropertyPath < CouchbasePersistentProperty > org.springframework.data.couchbase.repository.query.support.PersistentPropertyPath<org.springframework.data.couchbase.repository.query.support.CouchbasePersistentProperty> ) { return org.springframework.data.couchbase.repository.query.support.PersistentPropertyPath<org.springframework.data.couchbase.repository.query.support.CouchbasePersistentProperty> . toDotPath ( org.springframework.data.couchbase.repository.query.support.Converter<,java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> public static com . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase.client.java.query.dsl.Sort [] com.couchbase.client.java.query.dsl.Sort[] ( Sort org.springframework.data.couchbase.repository.query.support.Sort , CouchbaseConverter org.springframework.data.couchbase.repository.query.support.CouchbaseConverter ) { java.util.List<com.couchbase.client.java.query.dsl.Sort> < com . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase > java.util.List<com.couchbase.client.java.query.dsl.Sort> = new java.util.ArrayList<com.couchbase.client.java.query.dsl.Sort> < com . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase > ( ) ; for ( Sort . Sort Sort.Order : org.springframework.data.couchbase.repository.query.support.Sort ) { java.lang.String java.lang.String = Sort.Order . getProperty ( ) ; Expression org.springframework.data.couchbase.repository.query.support.Expression = i ( java.lang.String ) ; if ( Sort.Order . isIgnoreCase ( ) ) { org.springframework.data.couchbase.repository.query.support.Expression = lower ( TypeFunctions . toString ( org.springframework.data.couchbase.repository.query.support.Expression ) ) ; } if ( Sort.Order . isAscending ( ) ) { java.util.List<com.couchbase.client.java.query.dsl.Sort> . add ( com . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase . Sort . asc ( org.springframework.data.couchbase.repository.query.support.Expression ) ) ; } else { java.util.List<com.couchbase.client.java.query.dsl.Sort> . add ( com . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase . Sort . desc ( org.springframework.data.couchbase.repository.query.support.Expression ) ) ; } } return java.util.List<com.couchbase.client.java.query.dsl.Sort> . toArray ( new com . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase . com.couchbase [ java.util.List<com.couchbase.client.java.query.dsl.Sort> . size ( ) ] ) ; }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.data.couchbase.repository.query.support.Statement org.springframework.data.couchbase.repository.query.support.Statement ( java.lang.String java.lang.String , CouchbaseConverter org.springframework.data.couchbase.repository.query.support.CouchbaseConverter , CouchbaseEntityInformation < T , java.lang.String > org.springframework.data.couchbase.repository.query.support.CouchbaseEntityInformation<T,java.lang.String> ) { return select ( count ( STRING ) . as ( CountFragment . COUNT_ALIAS ) ) . from ( org.springframework.data.couchbase.repository.query.support.Expression ( java.lang.String ) ) . where ( org.springframework.data.couchbase.repository.query.support.Expression ( null , org.springframework.data.couchbase.repository.query.support.CouchbaseConverter , org.springframework.data.couchbase.repository.query.support.CouchbaseEntityInformation<T,java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.couchbase.repository.query.support.N1qlQuery org.springframework.data.couchbase.repository.query.support.N1qlQuery ( Statement org.springframework.data.couchbase.repository.query.support.Statement , JsonValue org.springframework.data.couchbase.repository.query.support.JsonValue , ScanConsistency org.springframework.data.couchbase.repository.query.support.ScanConsistency ) { N1qlParams org.springframework.data.couchbase.repository.query.support.N1qlParams = N1qlParams . build ( ) . consistency ( org.springframework.data.couchbase.repository.query.support.ScanConsistency ) ; N1qlQuery org.springframework.data.couchbase.repository.query.support.N1qlQuery ; if ( org.springframework.data.couchbase.repository.query.support.JsonValue instanceof JsonObject && ! ( ( JsonObject ) org.springframework.data.couchbase.repository.query.support.JsonValue ) . isEmpty ( ) ) { org.springframework.data.couchbase.repository.query.support.N1qlQuery = N1qlQuery . parameterized ( org.springframework.data.couchbase.repository.query.support.Statement , ( JsonObject ) org.springframework.data.couchbase.repository.query.support.JsonValue , org.springframework.data.couchbase.repository.query.support.N1qlParams ) ; } else if ( org.springframework.data.couchbase.repository.query.support.JsonValue instanceof JsonArray && ! ( ( JsonArray ) org.springframework.data.couchbase.repository.query.support.JsonValue ) . isEmpty ( ) ) { org.springframework.data.couchbase.repository.query.support.N1qlQuery = N1qlQuery . parameterized ( org.springframework.data.couchbase.repository.query.support.Statement , ( JsonArray ) org.springframework.data.couchbase.repository.query.support.JsonValue , org.springframework.data.couchbase.repository.query.support.N1qlParams ) ; } else { org.springframework.data.couchbase.repository.query.support.N1qlQuery = N1qlQuery . simple ( org.springframework.data.couchbase.repository.query.support.Statement , org.springframework.data.couchbase.repository.query.support.N1qlParams ) ; } return org.springframework.data.couchbase.repository.query.support.N1qlQuery ; }  <METHOD_END>
