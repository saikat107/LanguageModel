<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.json.SimpleJsonSerializerTests.Foo org.springframework.integration.json.SimpleJsonSerializerTests.Foo = new org.springframework.integration.json.SimpleJsonSerializerTests.Foo ( STRING ) ; java.lang.String java.lang.String = SimpleJsonSerializer . toJson ( org.springframework.integration.json.SimpleJsonSerializerTests.Foo , STRING ) ; org.springframework.integration.json.SimpleJsonSerializerTests.Foo org.springframework.integration.json.SimpleJsonSerializerTests.Foo = JsonObjectMapperProvider . newInstance ( ) . fromJson ( java.lang.String , org.springframework.integration.json.SimpleJsonSerializerTests.Foo .class ) ; assertThat ( org.springframework.integration.json.SimpleJsonSerializerTests.Foo . boolean , equalTo ( java.lang.Boolean . java.lang.Boolean ) ) ; assertThat ( org.springframework.integration.json.SimpleJsonSerializerTests.Foo . long , equalTo ( NUMBER ) ) ; assertThat ( org.springframework.integration.json.SimpleJsonSerializerTests.Foo . java.lang.String , equalTo ( STRING ) ) ; assertThat ( org.springframework.integration.json.SimpleJsonSerializerTests.Foo . double , equalTo ( NUMBER ) ) ; assertNull ( org.springframework.integration.json.SimpleJsonSerializerTests.Foo . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { super(); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = STRING ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public long long ( ) { return this . long ; }  <METHOD_END>
<METHOD_START> public double double ( ) { return this . double ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
