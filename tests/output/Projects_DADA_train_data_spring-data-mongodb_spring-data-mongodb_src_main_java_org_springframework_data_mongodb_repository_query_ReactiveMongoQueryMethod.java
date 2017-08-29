<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , RepositoryMetadata org.springframework.data.mongodb.repository.query.RepositoryMetadata , ProjectionFactory org.springframework.data.mongodb.repository.query.ProjectionFactory , MappingContext < ? extends MongoPersistentEntity < ? > , MongoPersistentProperty > org.springframework.data.mongodb.repository.query.MappingContext<? extends org.springframework.data.mongodb.repository.query.MongoPersistentEntity<?>,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> ) { super( java.lang.reflect.Method , org.springframework.data.mongodb.repository.query.RepositoryMetadata , org.springframework.data.mongodb.repository.query.ProjectionFactory , org.springframework.data.mongodb.repository.query.MappingContext<,org.springframework.data.mongodb.repository.query.MongoPersistentProperty> ); if ( hasParameterOfType ( java.lang.reflect.Method , Pageable .class ) ) { TypeInformation < ? > org.springframework.data.mongodb.repository.query.TypeInformation<?> = ClassTypeInformation . fromReturnTypeOf ( java.lang.reflect.Method ) ; boolean boolean = ReactiveWrappers . isMultiValueType ( org.springframework.data.mongodb.repository.query.TypeInformation<> . getType ( ) ) ; boolean boolean = ReactiveWrappers . isSingleValueType ( org.springframework.data.mongodb.repository.query.TypeInformation<> . getType ( ) ) && ( org.springframework.data.mongodb.repository.query.ClassTypeInformation<org.springframework.data.mongodb.repository.query.Page> . isAssignableFrom ( org.springframework.data.mongodb.repository.query.TypeInformation<> . getComponentType ( ) . get ( ) ) || org.springframework.data.mongodb.repository.query.ClassTypeInformation<org.springframework.data.mongodb.repository.query.Slice> . isAssignableFrom ( org.springframework.data.mongodb.repository.query.TypeInformation<> . getComponentType ( ) . get ( ) ) ) ; if ( boolean ) { throw new InvalidDataAccessApiUsageException ( java.lang.String . java.lang.String ( STRING , ClassUtils . getShortName ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) , java.lang.reflect.Method . java.lang.String ( ) ) ) ; } if ( ! boolean && ! boolean ) { throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING , java.lang.reflect.Method . java.lang.String ( ) ) ) ; } if ( hasParameterOfType ( java.lang.reflect.Method , Sort .class ) ) { throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING + STRING , java.lang.reflect.Method . java.lang.String ( ) ) ) ; } } this . java.lang.reflect.Method = java.lang.reflect.Method ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.mongodb.repository.query.MongoParameters org.springframework.data.mongodb.repository.query.MongoParameters ( java.lang.reflect.Method java.lang.reflect.Method ) { return new MongoParameters ( java.lang.reflect.Method , boolean ( java.lang.reflect.Method ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ! ( isPageQuery ( ) || isSliceQuery ( ) ) && ReactiveWrappers . isMultiValueType ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return boolean ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { if ( ReactiveWrappers . supports ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) ) { TypeInformation < ? > org.springframework.data.mongodb.repository.query.TypeInformation<?> = ClassTypeInformation . fromReturnTypeOf ( java.lang.reflect.Method ) ; return GeoResult .class . boolean ( org.springframework.data.mongodb.repository.query.TypeInformation<> . getComponentType ( ) . get ( ) . getType ( ) ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return super. isModifyingQuery ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return super. isQueryForEntity ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { for ( MongoParameter org.springframework.data.mongodb.repository.query.MongoParameter : getParameters ( ) ) { if ( ReactiveWrapperConverters . supports ( org.springframework.data.mongodb.repository.query.MongoParameter . getType ( ) ) ) { return true ; } } return false ; }  <METHOD_END>
