<METHOD_START> protected void ( ObjectMapper org.springframework.boot.test.json.ObjectMapper ) { Assert . notNull ( org.springframework.boot.test.json.ObjectMapper , STRING ) ; this . org.springframework.boot.test.json.ObjectMapper = org.springframework.boot.test.json.ObjectMapper ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> , ResolvableType org.springframework.boot.test.json.ResolvableType , ObjectMapper org.springframework.boot.test.json.ObjectMapper ) { super( java.lang.Class<> , org.springframework.boot.test.json.ResolvableType ); Assert . notNull ( org.springframework.boot.test.json.ObjectMapper , STRING ) ; this . org.springframework.boot.test.json.ObjectMapper = org.springframework.boot.test.json.ObjectMapper ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected T T ( java.io.InputStream java.io.InputStream , ResolvableType org.springframework.boot.test.json.ResolvableType )			throws java.io.IOException { return this . org.springframework.boot.test.json.ObjectMapper . readValue ( java.io.InputStream , org.springframework.boot.test.json.JavaType ( org.springframework.boot.test.json.ResolvableType ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected T T ( java.io.Reader java.io.Reader , ResolvableType org.springframework.boot.test.json.ResolvableType ) throws java.io.IOException { return this . org.springframework.boot.test.json.ObjectMapper . readerFor ( org.springframework.boot.test.json.JavaType ( org.springframework.boot.test.json.ResolvableType ) ) . readValue ( java.io.Reader ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( T T , ResolvableType org.springframework.boot.test.json.ResolvableType ) throws java.io.IOException { return this . org.springframework.boot.test.json.ObjectMapper . writerFor ( org.springframework.boot.test.json.JavaType ( org.springframework.boot.test.json.ResolvableType ) ) . writeValueAsString ( T ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.test.json.JavaType org.springframework.boot.test.json.JavaType ( ResolvableType org.springframework.boot.test.json.ResolvableType ) { return this . org.springframework.boot.test.json.ObjectMapper . constructType ( org.springframework.boot.test.json.ResolvableType . getType ( ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.Object java.lang.Object , ObjectMapper org.springframework.boot.test.json.ObjectMapper ) { new org.springframework.boot.test.json.JacksonTester.JacksonFieldInitializer ( ) . initFields ( java.lang.Object , org.springframework.boot.test.json.ObjectMapper ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.Object java.lang.Object , ObjectFactory < ObjectMapper > org.springframework.boot.test.json.ObjectFactory<org.springframework.boot.test.json.ObjectMapper> ) { new org.springframework.boot.test.json.JacksonTester.JacksonFieldInitializer ( ) . initFields ( java.lang.Object , org.springframework.boot.test.json.ObjectFactory<org.springframework.boot.test.json.ObjectMapper> ) ; }  <METHOD_END>
<METHOD_START> protected void ( ) { super( org.springframework.boot.test.json.JacksonTester .class ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> ( java.lang.Class<?> < ? > java.lang.Class<?> , ResolvableType org.springframework.boot.test.json.ResolvableType , ObjectMapper org.springframework.boot.test.json.ObjectMapper ) { return new org.springframework.boot.test.json.JacksonTester <> ( java.lang.Class<> , org.springframework.boot.test.json.ResolvableType , org.springframework.boot.test.json.ObjectMapper ) ; }  <METHOD_END>
