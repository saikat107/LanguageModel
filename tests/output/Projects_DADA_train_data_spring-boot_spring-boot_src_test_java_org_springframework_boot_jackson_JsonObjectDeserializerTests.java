<METHOD_START> @ Test public void void ( ) java.lang.Exception { Deserializer org.springframework.boot.jackson.Deserializer = new NameAndAgeJsonComponent . NameAndAgeJsonComponent ( ) ; SimpleModule org.springframework.boot.jackson.SimpleModule = new SimpleModule ( ) ; org.springframework.boot.jackson.SimpleModule . addDeserializer ( NameAndAge .class , org.springframework.boot.jackson.Deserializer ) ; ObjectMapper org.springframework.boot.jackson.ObjectMapper = new ObjectMapper ( ) ; org.springframework.boot.jackson.ObjectMapper . registerModule ( org.springframework.boot.jackson.SimpleModule ) ; NameAndAge org.springframework.boot.jackson.NameAndAge = org.springframework.boot.jackson.ObjectMapper . readValue ( STRING , NameAndAge .class ) ; assertThat ( org.springframework.boot.jackson.NameAndAge . getName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.jackson.NameAndAge . getAge ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.String ( null , java.lang.String .class ) ; assertThat ( java.lang.String ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.jackson.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.jackson.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( mock ( JsonNode .class ) , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . textValue ( ) ) . willReturn ( STRING ) ; java.lang.String java.lang.String = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.lang.String .class ) ; assertThat ( java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . booleanValue ( ) ) . willReturn ( true ) ; java.lang.Boolean java.lang.Boolean = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.lang.Boolean .class ) ; assertThat ( java.lang.Boolean ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . longValue ( ) ) . willReturn ( NUMBER ) ; java.lang.Long java.lang.Long = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.lang.Long .class ) ; assertThat ( java.lang.Long ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . intValue ( ) ) . willReturn ( NUMBER ) ; java.lang.Integer java.lang.Integer = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.lang.Integer .class ) ; assertThat ( java.lang.Integer ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . shortValue ( ) ) . willReturn ( ( short ) NUMBER ) ; java.lang.Short java.lang.Short = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.lang.Short .class ) ; assertThat ( java.lang.Short ) . isEqualTo ( ( short ) NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . doubleValue ( ) ) . willReturn ( NUMBER ) ; java.lang.Double java.lang.Double = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.lang.Double .class ) ; assertThat ( java.lang.Double ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . floatValue ( ) ) . willReturn ( NUMBER ) ; java.lang.Float java.lang.Float = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.lang.Float .class ) ; assertThat ( java.lang.Float ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . decimalValue ( ) ) . willReturn ( java.math.BigDecimal . java.math.BigDecimal ) ; java.math.BigDecimal java.math.BigDecimal = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.math.BigDecimal .class ) ; assertThat ( java.math.BigDecimal ) . isEqualTo ( java.math.BigDecimal . java.math.BigDecimal ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . bigIntegerValue ( ) ) . willReturn ( java.math.BigInteger . java.math.BigInteger ) ; java.math.BigInteger java.math.BigInteger = this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( org.springframework.boot.jackson.JsonNode , java.math.BigInteger .class ) ; assertThat ( java.math.BigInteger ) . isEqualTo ( java.math.BigInteger . java.math.BigInteger ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.jackson.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.jackson.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . java.lang.Object ( mock ( JsonNode .class ) , java.io.InputStream .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.jackson.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.jackson.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . org.springframework.boot.jackson.JsonNode ( null , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . get ( STRING ) ) . willReturn ( null ) ; this . org.springframework.boot.jackson.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.boot.jackson.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . org.springframework.boot.jackson.JsonNode ( org.springframework.boot.jackson.JsonNode , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; given ( org.springframework.boot.jackson.JsonNode . get ( STRING ) ) . willReturn ( NullNode . instance ) ; this . org.springframework.boot.jackson.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.boot.jackson.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . org.springframework.boot.jackson.JsonNode ( org.springframework.boot.jackson.JsonNode , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.boot.jackson.JsonNode = mock ( JsonNode .class ) ; JsonNode org.springframework.boot.jackson.JsonNode = org.springframework.boot.jackson.JsonNode ; given ( org.springframework.boot.jackson.JsonNode . get ( STRING ) ) . willReturn ( org.springframework.boot.jackson.JsonNode ) ; assertThat ( this . org.springframework.boot.jackson.JsonObjectDeserializerTests.TestJsonObjectDeserializer<java.lang.Object> . org.springframework.boot.jackson.JsonNode ( org.springframework.boot.jackson.JsonNode , STRING ) ) . isEqualTo ( org.springframework.boot.jackson.JsonNode ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected T T ( JsonParser org.springframework.boot.jackson.JsonParser , DeserializationContext org.springframework.boot.jackson.DeserializationContext , ObjectCodec org.springframework.boot.jackson.ObjectCodec , JsonNode org.springframework.boot.jackson.JsonNode )						throws java.io.IOException { return null ; }  <METHOD_END>
<METHOD_START> public < D > D D ( JsonNode org.springframework.boot.jackson.JsonNode , java.lang.Class<D> < D > java.lang.Class<D> ) { return nullSafeValue ( org.springframework.boot.jackson.JsonNode , java.lang.Class<D> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.jackson.JsonNode org.springframework.boot.jackson.JsonNode ( JsonNode org.springframework.boot.jackson.JsonNode , java.lang.String java.lang.String ) { return getRequiredNode ( org.springframework.boot.jackson.JsonNode , java.lang.String ) ; }  <METHOD_END>
