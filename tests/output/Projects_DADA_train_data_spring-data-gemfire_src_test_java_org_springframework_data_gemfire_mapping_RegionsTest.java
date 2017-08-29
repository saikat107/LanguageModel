<METHOD_START> protected org.springframework.data.gemfire.mapping.Region org.springframework.data.gemfire.mapping.Region ( java.lang.String java.lang.String ) { return org.springframework.data.gemfire.mapping.Region ( java.lang.String . java.lang.String ( java.lang.String . int ( Region . SEPARATOR ) + NUMBER ) , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.mapping.Region org.springframework.data.gemfire.mapping.Region ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { Region org.springframework.data.gemfire.mapping.Region = mock ( Region .class , java.lang.String ) ; when ( org.springframework.data.gemfire.mapping.Region . getName ( ) ) . thenReturn ( java.lang.String ) ; when ( org.springframework.data.gemfire.mapping.Region . getFullPath ( ) ) . thenReturn ( java.lang.String ) ; return org.springframework.data.gemfire.mapping.Region ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { org.springframework.data.gemfire.mapping.Region = org.springframework.data.gemfire.mapping.Region ( STRING ) ; org.springframework.data.gemfire.mapping.Region = org.springframework.data.gemfire.mapping.Region ( STRING ) ; org.springframework.data.gemfire.mapping.Region = org.springframework.data.gemfire.mapping.Region ( STRING ) ; org.springframework.data.gemfire.mapping.Regions = new Regions ( java.util.Arrays . java.util.List ( org.springframework.data.gemfire.mapping.Region , org.springframework.data.gemfire.mapping.Region , org.springframework.data.gemfire.mapping.Region ) , org.springframework.data.gemfire.mapping.MappingContext ) ; assertThat ( org.springframework.data.gemfire.mapping.Regions ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { org.springframework.data.gemfire.mapping.Region = org.springframework.data.gemfire.mapping.Region = org.springframework.data.gemfire.mapping.Region = null ; org.springframework.data.gemfire.mapping.Regions = null ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfirePersistentEntity < User > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.User> = mock ( GemfirePersistentEntity .class ) ; when ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.User> . getRegionName ( ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.mapping.MappingContext . getPersistentEntity ( eq ( User .class ) ) ) . thenReturn ( java.util.Optional . java.util.Optional ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.User> ) ) ; assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( User .class ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.Region ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.gemfire.mapping.MappingContext . getPersistentEntity ( any ( java.lang.Class .class ) ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) ; assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( org.springframework.data.gemfire.mapping.RegionsTest.Users .class ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.Region ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.gemfire.mapping.MappingContext . getPersistentEntity ( any ( java.lang.Class .class ) ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) ; assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( java.lang.Object .class ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.mapping.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.gemfire.mapping.Regions . getRegion ( ( java.lang.Class ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.mapping.Region ) ; assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.mapping.Region ) ; assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.mapping.Region ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.mapping.Region ) ; assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.mapping.Region ) ; assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.mapping.Region ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.mapping.Regions . getRegion ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.mapping.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.gemfire.mapping.Regions . getRegion ( ( java.lang.String ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.gemfire.mapping.Region> < Region > java.util.List<org.springframework.data.gemfire.mapping.Region> = new java.util.ArrayList<org.springframework.data.gemfire.mapping.Region> <> ( NUMBER ) ; for ( Region org.springframework.data.gemfire.mapping.Region : org.springframework.data.gemfire.mapping.Regions ) { java.util.List<org.springframework.data.gemfire.mapping.Region> . add ( org.springframework.data.gemfire.mapping.Region ) ; } java.util.List<org.springframework.data.gemfire.mapping.Region> < Region > java.util.List<org.springframework.data.gemfire.mapping.Region> = java.util.Arrays . java.util.List ( org.springframework.data.gemfire.mapping.Region , org.springframework.data.gemfire.mapping.Region , org.springframework.data.gemfire.mapping.Region ) ; assertThat ( java.util.List<org.springframework.data.gemfire.mapping.Region> ) . hasSize ( java.util.List<org.springframework.data.gemfire.mapping.Region> . size ( ) * NUMBER ) ; assertThat ( java.util.List<org.springframework.data.gemfire.mapping.Region> ) . containsAll ( java.util.List<org.springframework.data.gemfire.mapping.Region> ) ; }  <METHOD_END>
