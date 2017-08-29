<METHOD_START> @ Before public void void ( ) { org.springframework.data.gemfire.mapping.GemfireMappingContext = new GemfireMappingContext ( ) ; org.springframework.data.gemfire.mapping.ConversionService = new GenericConversionService ( ) ; org.springframework.data.gemfire.mapping.MappingPdxSerializer = new MappingPdxSerializer ( org.springframework.data.gemfire.mapping.GemfireMappingContext , org.springframework.data.gemfire.mapping.ConversionService ) ; org.springframework.data.gemfire.mapping.MappingPdxSerializer . setCustomSerializers ( java.util.Collections . java.util.Map ( Address .class , org.springframework.data.gemfire.mapping.PdxSerializer ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConversionService org.springframework.data.gemfire.mapping.ConversionService = mock ( ConversionService .class ) ; GemfireMappingContext org.springframework.data.gemfire.mapping.GemfireMappingContext = mock ( GemfireMappingContext .class ) ; MappingPdxSerializer org.springframework.data.gemfire.mapping.MappingPdxSerializer = MappingPdxSerializer . create ( org.springframework.data.gemfire.mapping.GemfireMappingContext , org.springframework.data.gemfire.mapping.ConversionService ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . getConversionService ( ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.ConversionService ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . getMappingContext ( ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.GemfireMappingContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireMappingContext org.springframework.data.gemfire.mapping.GemfireMappingContext = mock ( GemfireMappingContext .class ) ; MappingPdxSerializer org.springframework.data.gemfire.mapping.MappingPdxSerializer = MappingPdxSerializer . create ( org.springframework.data.gemfire.mapping.GemfireMappingContext , null ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . getConversionService ( ) ) . isInstanceOf ( ConversionService .class ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . getMappingContext ( ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.GemfireMappingContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConversionService org.springframework.data.gemfire.mapping.ConversionService = mock ( ConversionService .class ) ; MappingPdxSerializer org.springframework.data.gemfire.mapping.MappingPdxSerializer = MappingPdxSerializer . create ( null , org.springframework.data.gemfire.mapping.ConversionService ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . getConversionService ( ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.ConversionService ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . getMappingContext ( ) ) . isInstanceOf ( GemfireMappingContext .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MappingPdxSerializer org.springframework.data.gemfire.mapping.MappingPdxSerializer = MappingPdxSerializer . create ( null , null ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . getConversionService ( ) ) . isInstanceOf ( ConversionService .class ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . getMappingContext ( ) ) . isInstanceOf ( GemfireMappingContext .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { Address org.springframework.data.gemfire.mapping.Address = new Address ( ) ; address . city = STRING ; address . zipCode = STRING ; Person org.springframework.data.gemfire.mapping.Person = new Person ( NUMBER , STRING , STRING ) ; person . address = org.springframework.data.gemfire.mapping.Address ; when ( org.springframework.data.gemfire.mapping.EntityInstantiator . createInstance ( any ( GemfirePersistentEntity .class ) , any ( ParameterValueProvider .class ) ) ) . thenReturn ( org.springframework.data.gemfire.mapping.Person ) ; org.springframework.data.gemfire.mapping.MappingPdxSerializer . setGemfireInstantiators ( java.util.Collections . java.util.Map ( Person .class , org.springframework.data.gemfire.mapping.EntityInstantiator ) ) ; org.springframework.data.gemfire.mapping.MappingPdxSerializer . fromData ( Person .class , org.springframework.data.gemfire.mapping.PdxReader ) ; GemfirePersistentEntity < ? > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<?> = org.springframework.data.gemfire.mapping.GemfireMappingContext . getPersistentEntity ( Person .class ) . orElseThrow ( ( ) newIllegalStateException ( STRING , Person .class . getName ( ) ) ) ; verify ( org.springframework.data.gemfire.mapping.EntityInstantiator , times ( NUMBER ) ) . createInstance ( eq ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<> ) , any ( ParameterValueProvider .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxSerializer , times ( NUMBER ) ) . fromData ( eq ( Address .class ) , any ( PdxReader .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { Address org.springframework.data.gemfire.mapping.Address = new Address ( ) ; expectedAddress . city = STRING ; expectedAddress . zipCode = STRING ; when ( org.springframework.data.gemfire.mapping.EntityInstantiator . createInstance ( any ( GemfirePersistentEntity .class ) , any ( ParameterValueProvider .class ) ) ) . thenReturn ( new Person ( null , null , null ) ) ; when ( org.springframework.data.gemfire.mapping.PdxReader . readField ( eq ( STRING ) ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.mapping.PdxReader . readField ( eq ( STRING ) ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.mapping.PdxReader . readField ( eq ( STRING ) ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.mapping.PdxSerializer . fromData ( eq ( Address .class ) , eq ( org.springframework.data.gemfire.mapping.PdxReader ) ) ) . thenReturn ( org.springframework.data.gemfire.mapping.Address ) ; org.springframework.data.gemfire.mapping.MappingPdxSerializer . setGemfireInstantiators ( java.util.Collections . java.util.Map ( Person .class , org.springframework.data.gemfire.mapping.EntityInstantiator ) ) ; java.lang.Object java.lang.Object = org.springframework.data.gemfire.mapping.MappingPdxSerializer . fromData ( Person .class , org.springframework.data.gemfire.mapping.PdxReader ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Person .class ) ; Person org.springframework.data.gemfire.mapping.Person = ( Person ) java.lang.Object ; assertThat ( org.springframework.data.gemfire.mapping.Person . getAddress ( ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.Address ) ; assertThat ( org.springframework.data.gemfire.mapping.Person . getId ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.mapping.Person . getFirstname ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.mapping.Person . getLastname ( ) ) . isEqualTo ( STRING ) ; verify ( org.springframework.data.gemfire.mapping.EntityInstantiator , times ( NUMBER ) ) . createInstance ( any ( GemfirePersistentEntity .class ) , any ( ParameterValueProvider .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxReader , times ( NUMBER ) ) . readField ( eq ( STRING ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxReader , times ( NUMBER ) ) . readField ( eq ( STRING ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxReader , times ( NUMBER ) ) . readField ( eq ( STRING ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxSerializer , times ( NUMBER ) ) . fromData ( eq ( Address .class ) , eq ( org.springframework.data.gemfire.mapping.PdxReader ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { when ( org.springframework.data.gemfire.mapping.EntityInstantiator . createInstance ( any ( GemfirePersistentEntity .class ) , any ( ParameterValueProvider .class ) ) ) . thenReturn ( new Person ( null , null , null ) ) ; when ( org.springframework.data.gemfire.mapping.PdxReader . readField ( eq ( STRING ) ) ) . thenThrow ( newIllegalArgumentException ( STRING ) ) ; org.springframework.data.gemfire.mapping.MappingPdxSerializer . setGemfireInstantiators ( java.util.Collections . java.util.Map ( Person .class , org.springframework.data.gemfire.mapping.EntityInstantiator ) ) ; try { org.springframework.data.gemfire.mapping.ExpectedException . expect ( MappingException .class ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectCause ( isA ( java.lang.IllegalArgumentException .class ) ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectMessage ( java.lang.String . java.lang.String ( STRING , Person .class ) ) ; org.springframework.data.gemfire.mapping.MappingPdxSerializer . fromData ( Person .class , org.springframework.data.gemfire.mapping.PdxReader ) ; } finally { verify ( org.springframework.data.gemfire.mapping.EntityInstantiator , times ( NUMBER ) ) . createInstance ( any ( GemfirePersistentEntity .class ) , any ( ParameterValueProvider .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxReader , times ( NUMBER ) ) . readField ( eq ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Address org.springframework.data.gemfire.mapping.Address = new Address ( ) ; address . city = STRING ; address . zipCode = STRING ; Person org.springframework.data.gemfire.mapping.Person = new Person ( NUMBER , STRING , STRING ) ; jonDoe . address = org.springframework.data.gemfire.mapping.Address ; org.springframework.data.gemfire.mapping.MappingPdxSerializer . setCustomSerializers ( java.util.Collections . java.util.Map ( Address .class , org.springframework.data.gemfire.mapping.PdxSerializer ) ) ; assertThat ( org.springframework.data.gemfire.mapping.MappingPdxSerializer . toData ( org.springframework.data.gemfire.mapping.Person , org.springframework.data.gemfire.mapping.PdxWriter ) ) . isTrue ( ) ; verify ( org.springframework.data.gemfire.mapping.PdxSerializer , times ( NUMBER ) ) . toData ( eq ( org.springframework.data.gemfire.mapping.Address ) , eq ( org.springframework.data.gemfire.mapping.PdxWriter ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxWriter , times ( NUMBER ) ) . writeField ( eq ( STRING ) , eq ( NUMBER ) , eq ( java.lang.Long .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxWriter , times ( NUMBER ) ) . writeField ( eq ( STRING ) , eq ( STRING ) , eq ( java.lang.String .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxWriter , times ( NUMBER ) ) . writeField ( eq ( STRING ) , eq ( STRING ) , eq ( java.lang.String .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxWriter , times ( NUMBER ) ) . markIdentityField ( eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Address org.springframework.data.gemfire.mapping.Address = new Address ( ) ; address . city = STRING ; address . zipCode = STRING ; Person org.springframework.data.gemfire.mapping.Person = new Person ( NUMBER , STRING , STRING ) ; jonDoe . address = org.springframework.data.gemfire.mapping.Address ; when ( org.springframework.data.gemfire.mapping.PdxWriter . writeField ( eq ( STRING ) , eq ( org.springframework.data.gemfire.mapping.Address ) , eq ( Address .class ) ) ) . thenThrow ( newIllegalArgumentException ( STRING ) ) ; try { org.springframework.data.gemfire.mapping.ExpectedException . expect ( MappingException .class ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectCause ( isA ( java.lang.IllegalArgumentException .class ) ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectMessage ( java.lang.String . java.lang.String ( STRING , Person .class ) ) ; new MappingPdxSerializer ( org.springframework.data.gemfire.mapping.GemfireMappingContext , org.springframework.data.gemfire.mapping.ConversionService ) . toData ( org.springframework.data.gemfire.mapping.Person , org.springframework.data.gemfire.mapping.PdxWriter ) ; } finally { verify ( org.springframework.data.gemfire.mapping.PdxWriter , atMost ( NUMBER ) ) . writeField ( eq ( STRING ) , eq ( NUMBER ) , eq ( java.lang.Long .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxWriter , atMost ( NUMBER ) ) . writeField ( eq ( STRING ) , eq ( STRING ) , eq ( java.lang.String .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxWriter , atMost ( NUMBER ) ) . writeField ( eq ( STRING ) , eq ( STRING ) , eq ( java.lang.String .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxWriter , times ( NUMBER ) ) . writeField ( eq ( STRING ) , eq ( org.springframework.data.gemfire.mapping.Address ) , eq ( Address .class ) ) ; verify ( org.springframework.data.gemfire.mapping.PdxWriter , never ( ) ) . markIdentityField ( anyString ( ) ) ; } }  <METHOD_END>