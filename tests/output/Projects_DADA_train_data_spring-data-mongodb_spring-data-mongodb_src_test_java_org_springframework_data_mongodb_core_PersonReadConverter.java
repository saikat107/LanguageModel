<METHOD_START> public org.springframework.data.mongodb.core.Person org.springframework.data.mongodb.core.Person ( Document org.springframework.data.mongodb.core.Document ) { Person org.springframework.data.mongodb.core.Person = new Person ( ( ObjectId ) org.springframework.data.mongodb.core.Document . get ( STRING ) , ( java.lang.String ) org.springframework.data.mongodb.core.Document . get ( STRING ) ) ; org.springframework.data.mongodb.core.Person . setAge ( ( java.lang.Integer ) org.springframework.data.mongodb.core.Document . get ( STRING ) ) ; return org.springframework.data.mongodb.core.Person ; }  <METHOD_END>
