<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.index.MongoPersistentProperty = org.springframework.data.mongodb.core.index.MongoPersistentProperty ( org.springframework.data.mongodb.core.index.MongoPersistentEntity<> , STRING ) ; assertThat ( new Path ( org.springframework.data.mongodb.core.index.MongoPersistentProperty , STRING ) . cycles ( org.springframework.data.mongodb.core.index.MongoPersistentProperty , STRING ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.index.MongoPersistentProperty = org.springframework.data.mongodb.core.index.MongoPersistentProperty ( org.springframework.data.mongodb.core.index.MongoPersistentEntity<> , STRING ) ; MongoPersistentEntity org.springframework.data.mongodb.core.index.MongoPersistentEntity = Mockito . mock ( MongoPersistentEntity .class ) ; MongoPersistentProperty org.springframework.data.mongodb.core.index.MongoPersistentProperty = org.springframework.data.mongodb.core.index.MongoPersistentProperty ( org.springframework.data.mongodb.core.index.MongoPersistentEntity , STRING ) ; assertThat ( new Path ( org.springframework.data.mongodb.core.index.MongoPersistentProperty , STRING ) . cycles ( org.springframework.data.mongodb.core.index.MongoPersistentProperty , STRING ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.index.MongoPersistentProperty = org.springframework.data.mongodb.core.index.MongoPersistentProperty ( org.springframework.data.mongodb.core.index.MongoPersistentEntity<> , STRING ) ; assertThat ( new Path ( org.springframework.data.mongodb.core.index.MongoPersistentProperty , STRING ) . cycles ( org.springframework.data.mongodb.core.index.MongoPersistentProperty , STRING ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) private org.springframework.data.mongodb.core.index.MongoPersistentProperty org.springframework.data.mongodb.core.index.MongoPersistentProperty ( MongoPersistentEntity org.springframework.data.mongodb.core.index.MongoPersistentEntity , java.lang.String java.lang.String ) { MongoPersistentProperty org.springframework.data.mongodb.core.index.MongoPersistentProperty = Mockito . mock ( MongoPersistentProperty .class ) ; when ( org.springframework.data.mongodb.core.index.MongoPersistentProperty . getOwner ( ) ) . thenReturn ( org.springframework.data.mongodb.core.index.MongoPersistentEntity ) ; return org.springframework.data.mongodb.core.index.MongoPersistentProperty ; }  <METHOD_END>