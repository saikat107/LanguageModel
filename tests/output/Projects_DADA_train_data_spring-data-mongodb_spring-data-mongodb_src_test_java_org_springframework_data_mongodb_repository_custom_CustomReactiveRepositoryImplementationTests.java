<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; java.util.List<org.springframework.data.mongodb.repository.custom.User> < User > java.util.List<org.springframework.data.mongodb.repository.custom.User> = org.springframework.data.mongodb.repository.custom.CustomReactiveMongoRepository . findByUsernameCustom ( java.lang.String ) ; assertThat ( java.util.List<org.springframework.data.mongodb.repository.custom.User> . size ( ) , is ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.repository.custom.User> . get ( NUMBER ) , is ( notNullValue ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.repository.custom.User> . get ( NUMBER ) . getUsername ( ) , is ( java.lang.String ) ) ; }  <METHOD_END>
