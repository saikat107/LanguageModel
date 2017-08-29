<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.mongodb.core.DefaultScriptOperations = new DefaultScriptOperations ( org.springframework.data.mongodb.core.MongoOperations ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . register ( ( ExecutableMongoScript ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . register ( ( NamedMongoScript ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . register ( new NamedMongoScript ( STRING , STRING ) ) ; verify ( org.springframework.data.mongodb.core.MongoOperations , times ( NUMBER ) ) . save ( any ( NamedMongoScript .class ) , eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . register ( new ExecutableMongoScript ( STRING ) ) ; ArgumentCaptor < NamedMongoScript > org.springframework.data.mongodb.core.ArgumentCaptor<org.springframework.data.mongodb.core.NamedMongoScript> = ArgumentCaptor . forClass ( NamedMongoScript .class ) ; verify ( org.springframework.data.mongodb.core.MongoOperations , times ( NUMBER ) ) . save ( org.springframework.data.mongodb.core.ArgumentCaptor<org.springframework.data.mongodb.core.NamedMongoScript> . capture ( ) , eq ( STRING ) ) ; Assert . assertThat ( org.springframework.data.mongodb.core.ArgumentCaptor<org.springframework.data.mongodb.core.NamedMongoScript> . getValue ( ) . getName ( ) , notNullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . execute ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . exists ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . exists ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . call ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mongodb.core.DefaultScriptOperations . call ( STRING ) ; }  <METHOD_END>
