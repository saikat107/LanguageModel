<METHOD_START> @ Before public void void ( ) { JacksonTester . initFields ( this , new ObjectMapper ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; assertThat ( this . org.springframework.boot.test.json.JacksonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> . parse ( java.lang.String ) ) . asList ( ) . hasSize ( NUMBER ) ; assertThat ( this . org.springframework.boot.test.json.JacksonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> . parse ( java.lang.String ) . getObject ( ) . get ( NUMBER ) . getName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> = new java.util.LinkedHashMap<java.lang.String,java.lang.Integer> <> ( ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; assertThat ( this . org.springframework.boot.test.json.JacksonTester<java.util.Map<java.lang.String,java.lang.Integer>> . write ( java.util.Map<java.lang.String,java.lang.Integer> ) ) . extractingJsonPathNumberValue ( STRING ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
