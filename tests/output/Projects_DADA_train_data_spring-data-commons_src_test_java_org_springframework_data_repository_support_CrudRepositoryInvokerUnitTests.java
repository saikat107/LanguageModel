<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.OrderRepository , expectInvocationOnType ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.OrderRepository .class ) ) . invokeSave ( new org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.OrderRepository , expectInvocationOnType ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.OrderRepository .class ) ) . invokeFindOne ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.OrderRepository , expectInvocationOnType ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.OrderRepository .class ) ) . invokeDelete ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = CrudRepository .class . java.lang.reflect.Method ( STRING , java.lang.Object .class ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.PersonRepository , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeSave ( new org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = CrudRepository .class . java.lang.reflect.Method ( STRING , java.io.Serializable .class ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.PersonRepository , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeFindOne ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = CrudRepository .class . java.lang.reflect.Method ( STRING , java.io.Serializable .class ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.PersonRepository , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeDelete ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = CrudRepository .class . java.lang.reflect.Method ( STRING ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.OrderRepository , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeFindAll ( Pageable . unpaged ( ) ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.OrderRepository , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeFindAll ( Sort . unsorted ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithSort org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithSort = mock ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithSort .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithSort .class . java.lang.reflect.Method ( STRING , Sort .class ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithSort , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeFindAll ( Sort . unsorted ( ) ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithSort , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeFindAll ( PageRequest . of ( NUMBER , NUMBER ) ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithSort , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeFindAll ( Pageable . unpaged ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithPageable org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithPageable = mock ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithPageable .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithPageable .class . java.lang.reflect.Method ( STRING , Pageable .class ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithPageable , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeFindAll ( Pageable . unpaged ( ) ) ; org.springframework.data.repository.support.RepositoryInvoker ( org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.CrudWithFindAllWithPageable , expectInvocationOf ( java.lang.reflect.Method ) ) . invokeFindAll ( PageRequest . of ( NUMBER , NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) private static org.springframework.data.repository.support.RepositoryInvoker org.springframework.data.repository.support.RepositoryInvoker ( java.lang.Object java.lang.Object , VerifyingMethodInterceptor org.springframework.data.repository.support.VerifyingMethodInterceptor ) { java.lang.Object java.lang.Object = getVerifyingRepositoryProxy ( java.lang.Object , org.springframework.data.repository.support.VerifyingMethodInterceptor ) ; RepositoryMetadata org.springframework.data.repository.support.RepositoryMetadata = new DefaultRepositoryMetadata ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.Class<?>[] ( ) [ NUMBER ] ) ; GenericConversionService org.springframework.data.repository.support.GenericConversionService = new DefaultFormattingConversionService ( ) ; return new CrudRepositoryInvoker ( ( CrudRepository ) java.lang.Object , org.springframework.data.repository.support.RepositoryMetadata , org.springframework.data.repository.support.GenericConversionService ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override < S extends org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order > S S ( S S );  <METHOD_END>
<METHOD_START> @ java.lang.Override java.util.Optional<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order> < org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order > java.util.Optional<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order> ( java.lang.Long java.lang.Long );  <METHOD_END>
<METHOD_START> @ java.lang.Override void void ( java.lang.Long java.lang.Long );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.support.Page<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person> < org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person > org.springframework.data.repository.support.Page<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person> ( @ Param ( STRING ) java.lang.String java.lang.String , Pageable org.springframework.data.repository.support.Pageable );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.support.Page<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person> < org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person > org.springframework.data.repository.support.Page<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person> ( @ Param ( STRING ) @ DateTimeFormat ( iso = ISO . DATE_TIME ) java.util.Date java.util.Date , Pageable org.springframework.data.repository.support.Pageable );  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person> < org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person > java.util.List<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Person> ( @ Param ( STRING ) java.util.Collection<java.lang.Long> < java.lang.Long > java.util.Collection<java.lang.Long> );  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order> < org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order > java.util.List<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order> ( Sort org.springframework.data.repository.support.Sort );  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order> < org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order > java.util.List<org.springframework.data.repository.support.CrudRepositoryInvokerUnitTests.Order> ( Pageable org.springframework.data.repository.support.Pageable );  <METHOD_END>
<METHOD_START> void void ( java.lang.Long java.lang.Long );  <METHOD_END>
