<METHOD_START> public void ( Bean < CouchbaseOperations > org.springframework.data.couchbase.repository.cdi.Bean<org.springframework.data.couchbase.repository.cdi.CouchbaseOperations> , java.util.Set<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> < T > java.lang.Class<T> , BeanManager org.springframework.data.couchbase.repository.cdi.BeanManager , CustomRepositoryImplementationDetector org.springframework.data.couchbase.repository.cdi.CustomRepositoryImplementationDetector ) { super( java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> , org.springframework.data.couchbase.repository.cdi.BeanManager , java.util.Optional . java.util.Optional ( org.springframework.data.couchbase.repository.cdi.CustomRepositoryImplementationDetector ) ); Assert . notNull ( org.springframework.data.couchbase.repository.cdi.Bean<org.springframework.data.couchbase.repository.cdi.CouchbaseOperations> , STRING ) ; this . org.springframework.data.couchbase.repository.cdi.Bean<org.springframework.data.couchbase.repository.cdi.CouchbaseOperations> = org.springframework.data.couchbase.repository.cdi.Bean<org.springframework.data.couchbase.repository.cdi.CouchbaseOperations> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected T T ( CreationalContext < T > org.springframework.data.couchbase.repository.cdi.CreationalContext<T> , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ) { CouchbaseOperations org.springframework.data.couchbase.repository.cdi.CouchbaseOperations = getDependencyInstance ( org.springframework.data.couchbase.repository.cdi.Bean<org.springframework.data.couchbase.repository.cdi.CouchbaseOperations> , CouchbaseOperations .class ) ; RepositoryOperationsMapping org.springframework.data.couchbase.repository.cdi.RepositoryOperationsMapping = new RepositoryOperationsMapping ( org.springframework.data.couchbase.repository.cdi.CouchbaseOperations ) ; IndexManager org.springframework.data.couchbase.repository.cdi.IndexManager = new IndexManager ( ) ; CouchbaseRepositoryFactory org.springframework.data.couchbase.repository.cdi.CouchbaseRepositoryFactory = new CouchbaseRepositoryFactory ( org.springframework.data.couchbase.repository.cdi.RepositoryOperationsMapping , org.springframework.data.couchbase.repository.cdi.IndexManager ) ; return java.util.Optional<java.lang.Object> . java.util.Optional<java.lang.Object> ( java.lang.Object -> org.springframework.data.couchbase.repository.cdi.CouchbaseRepositoryFactory . getRepository ( java.lang.Class<T> , java.lang.Object ) ) . orElseGet ( ( ) factory . getRepository ( repositoryType ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ( ) { return org.springframework.data.couchbase.repository.cdi.Bean<org.springframework.data.couchbase.repository.cdi.CouchbaseOperations> . getScope ( ) ; }  <METHOD_END>
