<METHOD_START> @ Test public void void ( ) { ConverterRegistration org.springframework.data.cassandra.convert.ConverterRegistration = new ConverterRegistration ( Person .class , java.lang.String .class , false , false ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isWriting ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isReading ( ) ) . isFalse ( ) ; org.springframework.data.cassandra.convert.ConverterRegistration = new ConverterRegistration ( java.lang.String .class , Person .class , false , false ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isWriting ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isReading ( ) ) . isTrue ( ) ; org.springframework.data.cassandra.convert.ConverterRegistration = new ConverterRegistration ( java.lang.String .class , java.lang.Class .class , false , false ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isWriting ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isReading ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConverterRegistration org.springframework.data.cassandra.convert.ConverterRegistration = new ConverterRegistration ( java.lang.String .class , java.lang.Class .class , false , true ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isWriting ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isReading ( ) ) . isFalse ( ) ; org.springframework.data.cassandra.convert.ConverterRegistration = new ConverterRegistration ( java.lang.String .class , java.lang.Class .class , true , false ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isWriting ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isReading ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConverterRegistration org.springframework.data.cassandra.convert.ConverterRegistration = new ConverterRegistration ( java.lang.String .class , java.lang.Class .class , true , true ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isWriting ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.cassandra.convert.ConverterRegistration . isReading ( ) ) . isTrue ( ) ; }  <METHOD_END>