<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; Assert . isTrue ( java.lang.Class<> . boolean ( ) , STRING ) ; this . java.lang.Class<?> = java.lang.Class<> ; this . org.springframework.data.repository.core.support.TypeInformation<?> = ClassTypeInformation . from ( java.lang.Class<> ) ; this . org.springframework.data.repository.core.support.Lazy<org.springframework.data.repository.core.support.CrudMethods> = Lazy . of ( ( ) new DefaultCrudMethods ( this ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.repository.core.support.RepositoryMetadata org.springframework.data.repository.core.support.RepositoryMetadata ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; return Repository .class . boolean ( java.lang.Class<> ) ? new DefaultRepositoryMetadata ( java.lang.Class<> ) : new AnnotationRepositoryMetadata ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.reflect.Method java.lang.reflect.Method ) { return java.lang.Class<?> ( org.springframework.data.repository.core.support.TypeInformation<> . getReturnType ( java.lang.reflect.Method ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return this . java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.repository.core.support.CrudMethods org.springframework.data.repository.core.support.CrudMethods ( ) { return this . org.springframework.data.repository.core.support.Lazy<org.springframework.data.repository.core.support.CrudMethods> . get ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.repository.core.support.CrudMethods ( ) . getFindAllMethod ( ) . map ( it -> Arrays . asList ( it . getParameterTypes ( ) ) . contains ( Pageable .class ) ) . orElse ( false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> ( ) { return java.util.Collections . java.util.Set<java.lang.Class<?>> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ReactiveWrappers . usesReactiveType ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Class<?> < ? > java.lang.Class<?> ( TypeInformation < ? > org.springframework.data.repository.core.support.TypeInformation<?> ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.repository.core.support.TypeInformation<> . getType ( ) ; boolean boolean = java.lang.Iterable .class . boolean ( java.lang.Class<> ) || java.lang.Class<> . boolean ( ) || QueryExecutionConverters . supports ( java.lang.Class<> ) || java.util.stream.Stream .class . boolean ( java.lang.Class<> ) ; return boolean ? java.lang.Class<?> ( org.springframework.data.repository.core.support.TypeInformation<> . getRequiredComponentType ( ) ) : java.lang.Class<> ; }  <METHOD_END>