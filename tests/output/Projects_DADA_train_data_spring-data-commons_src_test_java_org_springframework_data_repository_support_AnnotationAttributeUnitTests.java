<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new AnnotationAttribute ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new AnnotationAttribute ( null , java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationAttribute org.springframework.data.repository.support.AnnotationAttribute = new AnnotationAttribute ( Component .class ) ; assertThat ( org.springframework.data.repository.support.AnnotationAttribute . getValueFrom ( org.springframework.data.repository.support.AnnotationAttributeUnitTests.Sample .class ) ) . hasValue ( STRING ) ; }  <METHOD_END>
