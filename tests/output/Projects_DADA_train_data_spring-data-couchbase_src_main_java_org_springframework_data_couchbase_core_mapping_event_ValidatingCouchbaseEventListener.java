<METHOD_START> public void ( Validator org.springframework.data.couchbase.core.mapping.event.Validator ) { Assert . notNull ( org.springframework.data.couchbase.core.mapping.event.Validator , STRING ) ; this . org.springframework.data.couchbase.core.mapping.event.Validator = org.springframework.data.couchbase.core.mapping.event.Validator ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( java.lang.Object java.lang.Object , CouchbaseDocument org.springframework.data.couchbase.core.mapping.event.CouchbaseDocument ) { if ( org.springframework.data.couchbase.core.mapping.event.Logger . isDebugEnabled ( ) ) { org.springframework.data.couchbase.core.mapping.event.Logger . debug ( STRING , java.lang.Object ) ; } java.util.Set java.util.Set = org.springframework.data.couchbase.core.mapping.event.Validator . validate ( java.lang.Object ) ; if ( ! java.util.Set . boolean ( ) ) { org.springframework.data.couchbase.core.mapping.event.Logger . info ( STRING , java.lang.Object , java.util.Set ) ; throw new ConstraintViolationException ( java.util.Set ) ; } }  <METHOD_END>
