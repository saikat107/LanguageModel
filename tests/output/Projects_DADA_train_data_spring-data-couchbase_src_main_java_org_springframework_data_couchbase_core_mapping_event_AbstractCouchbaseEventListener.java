<METHOD_START> public void ( ) { java.lang.Class<?> < ? > java.lang.Class<?> = GenericTypeResolver . resolveTypeArgument ( java.lang.Class<? extends org.springframework.data.couchbase.core.mapping.event.AbstractCouchbaseEventListener> ( ) , org.springframework.data.couchbase.core.mapping.event.AbstractCouchbaseEventListener .class ) ; java.lang.Class<?> = java.lang.Class<> == null ? java.lang.Object .class : java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( CouchbaseMappingEvent < ? > org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<?> ) { E E = ( E ) org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> . getSource ( ) ; if ( E != null && ! java.lang.Class<> . boolean ( E . java.lang.Class<? extends java.lang.Object> ( ) ) ) { return; } if ( org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> instanceof BeforeDeleteEvent ) { void ( org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> . getSource ( ) , org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> . getDocument ( ) ) ; return; } else if ( org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> instanceof AfterDeleteEvent ) { void ( org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> . getSource ( ) , org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> . getDocument ( ) ) ; return; } if ( org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> instanceof BeforeConvertEvent ) { void ( E ) ; } else if ( org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> instanceof BeforeSaveEvent ) { void ( E , org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> . getDocument ( ) ) ; } else if ( org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> instanceof AfterSaveEvent ) { void ( E , org.springframework.data.couchbase.core.mapping.event.CouchbaseMappingEvent<> . getDocument ( ) ) ; } }  <METHOD_END>
<METHOD_START> public void void ( E E ) { if ( org.springframework.data.couchbase.core.mapping.event.Logger . isDebugEnabled ( ) ) { org.springframework.data.couchbase.core.mapping.event.Logger . debug ( STRING , E ) ; } }  <METHOD_END>
<METHOD_START> public void void ( E E , CouchbaseDocument org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) { if ( org.springframework.data.couchbase.core.mapping.event.Logger . isDebugEnabled ( ) ) { org.springframework.data.couchbase.core.mapping.event.Logger . debug ( STRING , E , org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) ; } }  <METHOD_END>
<METHOD_START> public void void ( E E , CouchbaseDocument org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) { if ( org.springframework.data.couchbase.core.mapping.event.Logger . isDebugEnabled ( ) ) { org.springframework.data.couchbase.core.mapping.event.Logger . debug ( STRING , E , org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) ; } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object , CouchbaseDocument org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) { if ( org.springframework.data.couchbase.core.mapping.event.Logger . isDebugEnabled ( ) ) { org.springframework.data.couchbase.core.mapping.event.Logger . debug ( STRING , org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) ; } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object , CouchbaseDocument org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) { if ( org.springframework.data.couchbase.core.mapping.event.Logger . isDebugEnabled ( ) ) { org.springframework.data.couchbase.core.mapping.event.Logger . debug ( STRING , org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) ; } }  <METHOD_END>
