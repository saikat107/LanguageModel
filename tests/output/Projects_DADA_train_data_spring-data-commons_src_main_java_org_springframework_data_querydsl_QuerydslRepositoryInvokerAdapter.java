<METHOD_START> public void ( RepositoryInvoker org.springframework.data.querydsl.RepositoryInvoker , QuerydslPredicateExecutor < java.lang.Object > org.springframework.data.querydsl.QuerydslPredicateExecutor<java.lang.Object> , Predicate org.springframework.data.querydsl.Predicate ) { Assert . notNull ( org.springframework.data.querydsl.RepositoryInvoker , STRING ) ; Assert . notNull ( org.springframework.data.querydsl.QuerydslPredicateExecutor<java.lang.Object> , STRING ) ; this . org.springframework.data.querydsl.RepositoryInvoker = org.springframework.data.querydsl.RepositoryInvoker ; this . org.springframework.data.querydsl.QuerydslPredicateExecutor<java.lang.Object> = org.springframework.data.querydsl.QuerydslPredicateExecutor<java.lang.Object> ; this . org.springframework.data.querydsl.Predicate = org.springframework.data.querydsl.Predicate ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<java.lang.Object> < java.lang.Object > java.lang.Iterable<java.lang.Object> ( Pageable org.springframework.data.querydsl.Pageable ) { return org.springframework.data.querydsl.QuerydslPredicateExecutor<java.lang.Object> . findAll ( org.springframework.data.querydsl.Predicate , org.springframework.data.querydsl.Pageable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<java.lang.Object> < java.lang.Object > java.lang.Iterable<java.lang.Object> ( Sort org.springframework.data.querydsl.Sort ) { return org.springframework.data.querydsl.QuerydslPredicateExecutor<java.lang.Object> . findAll ( org.springframework.data.querydsl.Predicate , org.springframework.data.querydsl.Sort ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.querydsl.RepositoryInvoker . hasDeleteMethod ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.querydsl.RepositoryInvoker . hasFindAllMethod ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.querydsl.RepositoryInvoker . hasFindOneMethod ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.querydsl.RepositoryInvoker . hasSaveMethod ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.Serializable java.io.Serializable ) { org.springframework.data.querydsl.RepositoryInvoker . invokeDelete ( java.io.Serializable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.Optional<T> < T > java.util.Optional<T> ( java.io.Serializable java.io.Serializable ) { return org.springframework.data.querydsl.RepositoryInvoker . invokeFindOne ( java.io.Serializable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( java.lang.reflect.Method java.lang.reflect.Method , MultiValueMap < java.lang.String , ? extends java.lang.Object > org.springframework.data.querydsl.MultiValueMap<java.lang.String,? extends java.lang.Object> , Pageable org.springframework.data.querydsl.Pageable , Sort org.springframework.data.querydsl.Sort ) { return org.springframework.data.querydsl.RepositoryInvoker . invokeQueryMethod ( java.lang.reflect.Method , org.springframework.data.querydsl.MultiValueMap<java.lang.String,> , org.springframework.data.querydsl.Pageable , org.springframework.data.querydsl.Sort ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( T T ) { return org.springframework.data.querydsl.RepositoryInvoker . invokeSave ( T ) ; }  <METHOD_END>
