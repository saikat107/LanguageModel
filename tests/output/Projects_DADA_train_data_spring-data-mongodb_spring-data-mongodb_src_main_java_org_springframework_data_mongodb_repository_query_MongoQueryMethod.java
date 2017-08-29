<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , RepositoryMetadata org.springframework.data.mongodb.repository.query.RepositoryMetadata , ProjectionFactory org.springframework.data.mongodb.repository.query.ProjectionFactory , MappingContext < ? extends MongoPersistentEntity < ? > , MongoPersistentProperty > org.springframework.data.mongodb.repository.query.MappingContext<? extends org.springframework.data.mongodb.repository.query.MongoPersistentEntity<?>,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> ) { super( java.lang.reflect.Method , org.springframework.data.mongodb.repository.query.RepositoryMetadata , org.springframework.data.mongodb.repository.query.ProjectionFactory ); Assert . notNull ( org.springframework.data.mongodb.repository.query.MappingContext<,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> , STRING ) ; this . java.lang.reflect.Method = java.lang.reflect.Method ; this . org.springframework.data.mongodb.repository.query.MappingContext<? extends org.springframework.data.mongodb.repository.query.MongoPersistentEntity<?>,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> = org.springframework.data.mongodb.repository.query.MappingContext<,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.mongodb.repository.query.MongoParameters org.springframework.data.mongodb.repository.query.MongoParameters ( java.lang.reflect.Method java.lang.reflect.Method ) { return new MongoParameters ( java.lang.reflect.Method , boolean ( java.lang.reflect.Method ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return java.lang.String ( ) != null ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = ( java.lang.String ) AnnotationUtils . getValue ( org.springframework.data.mongodb.repository.query.Query ( ) ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : null ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = ( java.lang.String ) AnnotationUtils . getValue ( org.springframework.data.mongodb.repository.query.Query ( ) , STRING ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.data.mongodb.repository.query.MongoEntityMetadata<?> < ? > org.springframework.data.mongodb.repository.query.MongoEntityMetadata<?> ( ) { if ( org.springframework.data.mongodb.repository.query.MongoEntityMetadata<> == null ) { java.lang.Class<?> < ? > java.lang.Class<?> = getReturnedObjectType ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = getDomainClass ( ) ; if ( ClassUtils . isPrimitiveOrWrapper ( java.lang.Class<> ) ) { this . org.springframework.data.mongodb.repository.query.MongoEntityMetadata<?> = new SimpleMongoEntityMetadata < java.lang.Object > ( ( java.lang.Class<java.lang.Object> < java.lang.Object > ) java.lang.Class<> , org.springframework.data.mongodb.repository.query.MappingContext<,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> . getRequiredPersistentEntity ( java.lang.Class<> ) ) ; } else { java.util.Optional<? extends org.springframework.data.mongodb.repository.query.MongoPersistentEntity<?>> < ? extends MongoPersistentEntity < ? > > java.util.Optional<? extends org.springframework.data.mongodb.repository.query.MongoPersistentEntity<?>> = org.springframework.data.mongodb.repository.query.MappingContext<,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> . getPersistentEntity ( java.lang.Class<> ) ; MongoPersistentEntity < ? > org.springframework.data.mongodb.repository.query.MongoPersistentEntity<?> = org.springframework.data.mongodb.repository.query.MappingContext<,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> . getRequiredPersistentEntity ( java.lang.Class<> ) ; java.util.Optional<? extends org.springframework.data.mongodb.repository.query.MongoPersistentEntity<?>> = ! java.util.Optional<> . boolean ( ) || java.util.Optional<> . get ( ) . getType ( ) . isInterface ( ) ? java.util.Optional . java.util.Optional ( org.springframework.data.mongodb.repository.query.MongoPersistentEntity<> ) : java.util.Optional<> ; MongoPersistentEntity < ? > org.springframework.data.mongodb.repository.query.MongoPersistentEntity<?> = java.lang.Class<> . boolean ( java.lang.Class<> ) ? java.util.Optional<> . get ( ) : org.springframework.data.mongodb.repository.query.MongoPersistentEntity<> ; this . org.springframework.data.mongodb.repository.query.MongoEntityMetadata<?> = new SimpleMongoEntityMetadata < java.lang.Object > ( ( java.lang.Class<java.lang.Object> < java.lang.Object > ) java.util.Optional<> . get ( ) . getType ( ) , org.springframework.data.mongodb.repository.query.MongoPersistentEntity<> ) ; } } return this . org.springframework.data.mongodb.repository.query.MongoEntityMetadata<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.repository.query.MongoParameters org.springframework.data.mongodb.repository.query.MongoParameters ( ) { return ( MongoParameters ) super. getParameters ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ( this . java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.reflect.Method . java.lang.Class<?> ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.util.List<java.lang.Class<? extends java.io.Serializable>> ) { if ( java.lang.Class<> . boolean ( java.lang.Class<> ) ) { return true ; } } if ( java.lang.Iterable .class . boolean ( java.lang.Class<> ) ) { TypeInformation < ? > org.springframework.data.mongodb.repository.query.TypeInformation<?> = ClassTypeInformation . fromReturnTypeOf ( java.lang.reflect.Method ) ; return GeoResult .class . boolean ( org.springframework.data.mongodb.repository.query.TypeInformation<> . getComponentType ( ) . get ( ) . getType ( ) ) ; } return false ; }  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.query.Query org.springframework.data.mongodb.repository.query.Query ( ) { return AnnotatedElementUtils . findMergedAnnotation ( java.lang.reflect.Method , Query .class ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.query.TypeInformation<?> < ? > org.springframework.data.mongodb.repository.query.TypeInformation<?> ( ) { return ClassTypeInformation . fromReturnTypeOf ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return org.springframework.data.mongodb.repository.query.Meta ( ) != null ; }  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.query.Meta org.springframework.data.mongodb.repository.query.Meta ( ) { return AnnotatedElementUtils . findMergedAnnotation ( java.lang.reflect.Method , Meta .class ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.query.InfiniteStream org.springframework.data.mongodb.repository.query.InfiniteStream ( ) { return AnnotatedElementUtils . findMergedAnnotation ( java.lang.reflect.Method , InfiniteStream .class ) ; }  <METHOD_END>
<METHOD_START> public org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core.query.Meta org.springframework.data.mongodb.core.query.Meta ( ) { Meta org.springframework.data.mongodb.repository.query.Meta = org.springframework.data.mongodb.repository.query.Meta ( ) ; if ( org.springframework.data.mongodb.repository.query.Meta == null ) { return new org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core ( ) ; } org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Meta = new org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core ( ) ; if ( org.springframework.data.mongodb.repository.query.Meta . maxExecutionTimeMs ( ) > NUMBER ) { org.springframework.data.mongodb.core.query.Meta . setMaxTimeMsec ( org.springframework.data.mongodb.repository.query.Meta . maxExecutionTimeMs ( ) ) ; } if ( org.springframework.data.mongodb.repository.query.Meta . maxScanDocuments ( ) > NUMBER ) { org.springframework.data.mongodb.core.query.Meta . setMaxScan ( org.springframework.data.mongodb.repository.query.Meta . maxScanDocuments ( ) ) ; } if ( StringUtils . hasText ( org.springframework.data.mongodb.repository.query.Meta . comment ( ) ) ) { org.springframework.data.mongodb.core.query.Meta . setComment ( org.springframework.data.mongodb.repository.query.Meta . comment ( ) ) ; } if ( org.springframework.data.mongodb.repository.query.Meta . snapshot ( ) ) { org.springframework.data.mongodb.core.query.Meta . setSnapshot ( org.springframework.data.mongodb.repository.query.Meta . snapshot ( ) ) ; } if ( ! ObjectUtils . isEmpty ( org.springframework.data.mongodb.repository.query.Meta . flags ( ) ) ) { for ( org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Meta.CursorOption : org.springframework.data.mongodb.repository.query.Meta . flags ( ) ) { org.springframework.data.mongodb.core.query.Meta . addFlag ( org.springframework.data.mongodb.core.query.Meta.CursorOption ) ; } } return org.springframework.data.mongodb.core.query.Meta ; }  <METHOD_END>
