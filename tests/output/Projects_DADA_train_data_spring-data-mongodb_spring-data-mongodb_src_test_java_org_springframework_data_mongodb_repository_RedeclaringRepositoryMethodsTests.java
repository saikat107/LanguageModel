<METHOD_START> @ Test public void void ( ) { Page < Person > org.springframework.data.mongodb.repository.Page<org.springframework.data.mongodb.repository.Person> = org.springframework.data.mongodb.repository.RedeclaringRepositoryMethodsRepository . findAll ( new PageRequest ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.mongodb.repository.Page<org.springframework.data.mongodb.repository.Person> . getNumberOfElements ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.data.mongodb.repository.Page<org.springframework.data.mongodb.repository.Person> . getContent ( ) . get ( NUMBER ) . getFirstname ( ) , is ( oliver . getFirstname ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.mongodb.repository.Person> < Person > java.util.List<org.springframework.data.mongodb.repository.Person> = org.springframework.data.mongodb.repository.RedeclaringRepositoryMethodsRepository . findAll ( ) ; assertThat ( java.util.List<org.springframework.data.mongodb.repository.Person> . isEmpty ( ) , is ( true ) ) ; }  <METHOD_END>
