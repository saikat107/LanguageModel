<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.UserRepository . findOne ( NUMBER ) ; assertThat ( org.springframework.data.jpa.repository.support.DelegatingTransactionManager . getDefinition ( ) . isReadOnly ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.UserRepository . findAll ( PageRequest . of ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.DelegatingTransactionManager . getDefinition ( ) , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.ExpectedException . expect ( InvalidDataAccessApiUsageException .class ) ; org.springframework.data.jpa.repository.support.ExpectedException . expectCause ( is ( Matchers .< java.lang.Throwable > instanceOf ( TransactionRequiredException .class ) ) ) ; org.springframework.data.jpa.repository.support.UserRepository . saveAndFlush ( new User ( ) ) ; }  <METHOD_END>
