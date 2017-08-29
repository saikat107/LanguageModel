<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.repository.support.RepositoryInvokerFactory = new DefaultRepositoryInvokerFactory ( org.springframework.data.repository.support.Repositories ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Product org.springframework.data.repository.support.Product = new Product ( ) ; when ( org.springframework.data.repository.support.ProductRepository . findOne ( NUMBER ) ) . thenReturn ( org.springframework.data.repository.support.Product ) ; java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> = org.springframework.data.repository.support.RepositoryInvokerFactory . getInvokerFor ( Product .class ) . invokeFindOne ( NUMBER ) ; assertThat ( java.util.Optional<java.lang.Object> ) . isEqualTo ( java.util.Optional . java.util.Optional ( org.springframework.data.repository.support.Product ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.repository.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.repository.support.ExpectedException . expectMessage ( java.lang.Object .class . java.lang.String ( ) ) ; org.springframework.data.repository.support.RepositoryInvokerFactory . getInvokerFor ( java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RepositoryInvoker org.springframework.data.repository.support.RepositoryInvoker = org.springframework.data.repository.support.RepositoryInvokerFactory . getInvokerFor ( Product .class ) ; assertThat ( org.springframework.data.repository.support.RepositoryInvokerFactory . getInvokerFor ( Product .class ) ) . isEqualTo ( org.springframework.data.repository.support.RepositoryInvoker ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RepositoryInvoker org.springframework.data.repository.support.RepositoryInvoker = org.springframework.data.repository.support.RepositoryInvokerFactory . getInvokerFor ( Product .class ) ; assertThat ( org.springframework.data.repository.support.RepositoryInvoker ) . isInstanceOf ( ReflectionRepositoryInvoker .class ) . isNotInstanceOf ( CrudRepositoryInvoker .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RepositoryInvoker org.springframework.data.repository.support.RepositoryInvoker = org.springframework.data.repository.support.RepositoryInvokerFactory . getInvokerFor ( User .class ) ; assertThat ( org.springframework.data.repository.support.RepositoryInvoker ) . isInstanceOf ( CrudRepositoryInvoker .class ) . isNotInstanceOf ( PagingAndSortingRepositoryInvoker .class ) ; }  <METHOD_END>