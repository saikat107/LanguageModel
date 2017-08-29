<METHOD_START> public void ( final TypeInformation < T > org.springframework.data.couchbase.core.mapping.TypeInformation<T> ) { super( org.springframework.data.couchbase.core.mapping.TypeInformation<T> ); void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { Document org.springframework.data.couchbase.core.mapping.Document = getType ( ) . getAnnotation ( Document .class ) ; if ( org.springframework.data.couchbase.core.mapping.Document != null && org.springframework.data.couchbase.core.mapping.Document . expiry ( ) > NUMBER && StringUtils . hasLength ( org.springframework.data.couchbase.core.mapping.Document . expiryExpression ( ) ) ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( STRING + STRING , getType ( ) . getName ( ) , org.springframework.data.couchbase.core.mapping.Document ) ; throw new java.lang.IllegalArgumentException ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.data.couchbase.core.mapping.Environment ) { this . org.springframework.data.couchbase.core.mapping.Environment = org.springframework.data.couchbase.core.mapping.Environment ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty ( CouchbasePersistentProperty org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty ) { if ( ! org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty . isIdProperty ( ) ) { return null ; } if ( ! this . hasIdProperty ( ) ) { return org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty ; } boolean boolean = this . getIdProperty ( ) . map ( couchbasePersistentProperty -> couchbasePersistentProperty . isAnnotationPresent ( Id .class ) ) . orElse ( false ) ; boolean boolean = this . getIdProperty ( ) . map ( couchbasePersistentProperty -> couchbasePersistentProperty . isAnnotationPresent ( org . springframework . data . annotation . Id .class ) ) . orElse ( false ) ; boolean boolean = org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty . isAnnotationPresent ( Id .class ) ; boolean boolean = org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty . isAnnotationPresent ( org . springframework . data . org.springframework.data.annotation . org.springframework.data.annotation .class ) ; if ( boolean && boolean ) { return org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty ; } else if ( boolean && boolean ) { return null ; } return super. returnPropertyIfBetterIdPropertyCandidateOrNull ( org.springframework.data.couchbase.core.mapping.CouchbasePersistentProperty ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { Document org.springframework.data.couchbase.core.mapping.Document = getType ( ) . getAnnotation ( Document .class ) ; if ( org.springframework.data.couchbase.core.mapping.Document == null ) return NUMBER ; int int = int ( org.springframework.data.couchbase.core.mapping.Document ) ; long long = org.springframework.data.couchbase.core.mapping.Document . expiryUnit ( ) . toSeconds ( int ) ; if ( long > TTL_IN_SECONDS_INCLUSIVE_END ) { java.util.Calendar java.util.Calendar = java.util.Calendar . java.util.Calendar ( java.util.TimeZone . java.util.TimeZone ( STRING ) ) ; if ( org.springframework.data.couchbase.core.mapping.Document . expiryUnit ( ) == java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) { java.util.Calendar . void ( java.util.Calendar . int , org.springframework.data.couchbase.core.mapping.Document . expiry ( ) ) ; } else { java.util.Calendar . void ( java.util.Calendar . int , ( int ) long ) ; } return ( int ) ( java.util.Calendar . long ( ) / NUMBER ) ; } else { return ( int ) long ; } }  <METHOD_END>
<METHOD_START> private int int ( Document org.springframework.data.couchbase.core.mapping.Document ) { int int = org.springframework.data.couchbase.core.mapping.Document . expiry ( ) ; java.lang.String java.lang.String = org.springframework.data.couchbase.core.mapping.Document . expiryExpression ( ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { Assert . notNull ( org.springframework.data.couchbase.core.mapping.Environment , STRING ) ; java.lang.String java.lang.String = org.springframework.data.couchbase.core.mapping.Environment . resolveRequiredPlaceholders ( java.lang.String ) ; try { int = java.lang.Integer . int ( java.lang.String ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String ) ; } } return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { org . springframework . data . couchbase . core . mapping . org.springframework.data.couchbase.core.mapping.Document org.springframework.data.couchbase.core.mapping.Document = getType ( ) . getAnnotation ( org . springframework . data . couchbase . core . mapping . org.springframework.data.couchbase.core.mapping.Document .class ) ; return org.springframework.data.couchbase.core.mapping.Document == null ? false : org.springframework.data.couchbase.core.mapping.Document . touchOnRead ( ) && int ( ) > NUMBER ; }  <METHOD_END>
