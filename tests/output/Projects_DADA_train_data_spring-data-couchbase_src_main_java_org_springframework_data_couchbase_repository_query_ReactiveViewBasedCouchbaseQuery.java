<METHOD_START> public void ( CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , RxJavaCouchbaseOperations org.springframework.data.couchbase.repository.query.RxJavaCouchbaseOperations ) { this . org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod ; this . org.springframework.data.couchbase.repository.query.RxJavaCouchbaseOperations = org.springframework.data.couchbase.repository.query.RxJavaCouchbaseOperations ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] ) { if ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . hasViewName ( ) ) { return java.lang.Object ( java.lang.Object[] ) ; } else { return java.lang.Object ( ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod ) ; java.lang.String java.lang.String = org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getName ( ) ; boolean boolean = org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . hasViewAnnotation ( ) && org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getViewAnnotation ( ) . reduce ( ) ; boolean boolean = java.lang.String . boolean ( STRING ) || boolean ; java.lang.String java.lang.String = StringUtils . uncapitalize ( java.lang.String . java.lang.String ( STRING , STRING ) ) ; ViewQuery org.springframework.data.couchbase.repository.query.ViewQuery = ViewQuery . from ( java.lang.String , java.lang.String ) . stale ( org.springframework.data.couchbase.repository.query.RxJavaCouchbaseOperations . getDefaultConsistency ( ) . viewConsistency ( ) ) ; if ( boolean ) { org.springframework.data.couchbase.repository.query.ViewQuery . reduce ( ) ; return java.lang.Object ( org.springframework.data.couchbase.repository.query.ViewQuery , java.lang.String , java.lang.String ) ; } else { return java.lang.Object ( org.springframework.data.couchbase.repository.query.ViewQuery ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod ) ; java.lang.String java.lang.String = org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getViewAnnotation ( ) . viewName ( ) ; ViewQuery org.springframework.data.couchbase.repository.query.ViewQuery = ViewQuery . from ( java.lang.String , java.lang.String ) . stale ( org.springframework.data.couchbase.repository.query.RxJavaCouchbaseOperations . getDefaultConsistency ( ) . viewConsistency ( ) ) ; try { PartTree org.springframework.data.couchbase.repository.query.PartTree = new PartTree ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getName ( ) , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getEntityInformation ( ) . getJavaType ( ) ) ; ViewQueryCreator org.springframework.data.couchbase.repository.query.ViewQueryCreator = new ViewQueryCreator ( org.springframework.data.couchbase.repository.query.PartTree , new ReactiveCouchbaseParameterAccessor ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , java.lang.Object[] ) , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getViewAnnotation ( ) , org.springframework.data.couchbase.repository.query.ViewQuery , org.springframework.data.couchbase.repository.query.RxJavaCouchbaseOperations . getConverter ( ) ) ; ViewQueryCreator . ViewQueryCreator ViewQueryCreator.DerivedViewQuery = org.springframework.data.couchbase.repository.query.ViewQueryCreator . createQuery ( ) ; if ( result . isReduce ) { return java.lang.Object ( result . builtQuery , java.lang.String , java.lang.String ) ; } else { return java.lang.Object ( result . builtQuery ) ; } } catch ( PropertyReferenceException org.springframework.data.couchbase.repository.query.PropertyReferenceException ) { if ( org.springframework.data.couchbase.repository.query.PropertyReferenceException . getPropertyName ( ) . equals ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getName ( ) ) ) { return java.lang.Object ( org.springframework.data.couchbase.repository.query.ViewQuery ) ; } throw org.springframework.data.couchbase.repository.query.PropertyReferenceException ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( ViewQuery org.springframework.data.couchbase.repository.query.ViewQuery ) { if ( org.springframework.data.couchbase.repository.query.Logger . isDebugEnabled ( ) ) { org.springframework.data.couchbase.repository.query.Logger . debug ( STRING + org.springframework.data.couchbase.repository.query.ViewQuery . toString ( ) ) ; } return ReactiveWrapperConverters . toWrapper ( org.springframework.data.couchbase.repository.query.RxJavaCouchbaseOperations . findByView ( org.springframework.data.couchbase.repository.query.ViewQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getEntityInformation ( ) . getJavaType ( ) ) , Flux .class ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( ViewQuery org.springframework.data.couchbase.repository.query.ViewQuery , java.lang.String java.lang.String , java.lang.String java.lang.String ) { if ( org.springframework.data.couchbase.repository.query.Logger . isDebugEnabled ( ) ) { org.springframework.data.couchbase.repository.query.Logger . debug ( STRING + org.springframework.data.couchbase.repository.query.ViewQuery . toString ( ) ) ; } return ReactiveWrapperConverters . toWrapper ( org.springframework.data.couchbase.repository.query.RxJavaCouchbaseOperations . queryView ( org.springframework.data.couchbase.repository.query.ViewQuery ) . flatMap ( asyncViewResult -> asyncViewResult . error ( ) . flatMap ( error -> Observable . error ( new CouchbaseQueryExecutionException ( STRING + viewName + STRING + designDoc + STRING + error . toString ( ) ) ) ) . switchIfEmpty ( asyncViewResult . rows ( ) ) ) . map ( row -> { AsyncViewRow asyncViewRow = ( AsyncViewRow ) row ; return asyncViewRow . value ( ) ; } ) . take ( NUMBER ) , Flux .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.repository.query.QueryMethod org.springframework.data.couchbase.repository.query.QueryMethod ( ) { return org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod ) { if ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . hasViewSpecification ( ) ) { return org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getViewAnnotation ( ) . designDocument ( ) ; } else if ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . hasViewAnnotation ( ) ) { return StringUtils . uncapitalize ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . getEntityInformation ( ) . getJavaType ( ) . getSimpleName ( ) ) ; } else { throw new java.lang.IllegalStateException ( STRING ) ; } }  <METHOD_END>
