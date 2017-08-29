<METHOD_START> @ Before public void void ( ) { DefaultListableBeanFactory org.springframework.http.converter.json.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; AutowiredAnnotationBeanPostProcessor org.springframework.http.converter.json.AutowiredAnnotationBeanPostProcessor = new AutowiredAnnotationBeanPostProcessor ( ) ; org.springframework.http.converter.json.AutowiredAnnotationBeanPostProcessor . setBeanFactory ( org.springframework.http.converter.json.DefaultListableBeanFactory ) ; org.springframework.http.converter.json.DefaultListableBeanFactory . addBeanPostProcessor ( org.springframework.http.converter.json.AutowiredAnnotationBeanPostProcessor ) ; org.springframework.http.converter.json.DefaultListableBeanFactory . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Capitalizer .class ) ) ; org.springframework.http.converter.json.SpringHandlerInstantiator = new SpringHandlerInstantiator ( org.springframework.http.converter.json.DefaultListableBeanFactory ) ; org.springframework.http.converter.json.ObjectMapper = Jackson2ObjectMapperBuilder . json ( ) . handlerInstantiator ( org.springframework.http.converter.json.SpringHandlerInstantiator ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.http.converter.json.JsonProcessingException { org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User = new org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User ( STRING ) ; java.lang.String java.lang.String = this . org.springframework.http.converter.json.ObjectMapper . writeValueAsString ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User = this . org.springframework.http.converter.json.ObjectMapper . readValue ( java.lang.String , org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User .class ) ; assertEquals ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User . java.lang.String ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; org.springframework.http.converter.json.SpringHandlerInstantiatorTests.SecurityRegistry org.springframework.http.converter.json.SpringHandlerInstantiatorTests.SecurityRegistry = this . org.springframework.http.converter.json.ObjectMapper . readValue ( java.lang.String , org.springframework.http.converter.json.SpringHandlerInstantiatorTests.SecurityRegistry .class ) ; assertTrue ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.SecurityRegistry . java.util.Map<java.lang.String,java.lang.String> ( ) . java.util.Set<java.lang.String> ( ) . boolean ( STRING ) ) ; assertFalse ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.SecurityRegistry . java.util.Map<java.lang.String,java.lang.String> ( ) . java.util.Set<java.lang.String> ( ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.http.converter.json.JsonProcessingException { this . org.springframework.http.converter.json.ObjectMapper . writeValueAsString ( new org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Group ( ) ) ; assertTrue ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.CustomTypeResolverBuilder . boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.http.converter.json.JsonProcessingException { this . org.springframework.http.converter.json.ObjectMapper . writeValueAsString ( new org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Group ( ) ) ; assertTrue ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.CustomTypeIdResolver . boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User ( JsonParser org.springframework.http.converter.json.JsonParser , DeserializationContext org.springframework.http.converter.json.DeserializationContext ) throws java.io.IOException { ObjectCodec org.springframework.http.converter.json.ObjectCodec = org.springframework.http.converter.json.JsonParser . getCodec ( ) ; JsonNode org.springframework.http.converter.json.JsonNode = org.springframework.http.converter.json.ObjectCodec . readTree ( org.springframework.http.converter.json.JsonParser ) ; return new org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User ( this . org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Capitalizer . java.lang.String ( org.springframework.http.converter.json.JsonNode . get ( STRING ) . asText ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User , JsonGenerator org.springframework.http.converter.json.JsonGenerator , SerializerProvider org.springframework.http.converter.json.SerializerProvider ) throws java.io.IOException { org.springframework.http.converter.json.JsonGenerator . writeStartObject ( ) ; org.springframework.http.converter.json.JsonGenerator . writeStringField ( STRING , this . org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Capitalizer . java.lang.String ( org.springframework.http.converter.json.SpringHandlerInstantiatorTests.User . java.lang.String ( ) ) ) ; org.springframework.http.converter.json.JsonGenerator . writeEndObject ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String , DeserializationContext org.springframework.http.converter.json.DeserializationContext ) throws java.io.IOException , org.springframework.http.converter.json.JsonProcessingException { return this . org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Capitalizer . java.lang.String ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.converter.json.TypeSerializer org.springframework.http.converter.json.TypeSerializer ( SerializationConfig org.springframework.http.converter.json.SerializationConfig , JavaType org.springframework.http.converter.json.JavaType , java.util.Collection<org.springframework.http.converter.json.NamedType> < NamedType > java.util.Collection<org.springframework.http.converter.json.NamedType> ) { boolean = ( this . org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Capitalizer != null ) ; return super. buildTypeSerializer ( org.springframework.http.converter.json.SerializationConfig , org.springframework.http.converter.json.JavaType , java.util.Collection<org.springframework.http.converter.json.NamedType> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.converter.json.TypeDeserializer org.springframework.http.converter.json.TypeDeserializer ( DeserializationConfig org.springframework.http.converter.json.DeserializationConfig , JavaType org.springframework.http.converter.json.JavaType , java.util.Collection<org.springframework.http.converter.json.NamedType> < NamedType > java.util.Collection<org.springframework.http.converter.json.NamedType> ) { return super. buildTypeDeserializer ( org.springframework.http.converter.json.DeserializationConfig , org.springframework.http.converter.json.JavaType , java.util.Collection<org.springframework.http.converter.json.NamedType> ) ; }  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.Object java.lang.Object , java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<> . java.lang.Class<? extends java.lang.Class> ( ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public JsonTypeInfo . JsonTypeInfo.Id JsonTypeInfo.Id ( ) { return JsonTypeInfo . Id . CUSTOM ; }  <METHOD_END>
<METHOD_START> public org.springframework.http.converter.json.JavaType org.springframework.http.converter.json.JavaType ( java.lang.String java.lang.String ) { return TypeFactory . defaultInstance ( ) . constructFromCanonical ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { boolean = ( this . org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Capitalizer != null ) ; return java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( JavaType org.springframework.http.converter.json.JavaType ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.converter.json.JavaType org.springframework.http.converter.json.JavaType ( DatabindContext org.springframework.http.converter.json.DatabindContext , java.lang.String java.lang.String ) { return null ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { return java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return org.springframework.http.converter.json.SpringHandlerInstantiatorTests.Group .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
