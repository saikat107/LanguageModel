<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { new DefaultJpaEntityMetadata ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultJpaEntityMetadata < org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo > org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadata<org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo> = new DefaultJpaEntityMetadata < org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo > ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo .class ) ; assertThat ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadata<org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo> . getJavaType ( ) , is ( equalTo ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultJpaEntityMetadata < org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo > org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadata<org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo> = new DefaultJpaEntityMetadata < org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo > ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo .class ) ; assertThat ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadata<org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo> . getEntityName ( ) , is ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Foo .class . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultJpaEntityMetadata < org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Bar > org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadata<org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Bar> = new DefaultJpaEntityMetadata < org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Bar > ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Bar .class ) ; assertThat ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadata<org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.Bar> . getEntityName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultJpaEntityMetadata < org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.BarWithComposedAnnotation > org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadata<org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.BarWithComposedAnnotation> = new DefaultJpaEntityMetadata < org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.BarWithComposedAnnotation > ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.BarWithComposedAnnotation .class ) ; assertThat ( org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadata<org.springframework.data.jpa.repository.support.DefaultJpaEntityMetadataUnitTest.BarWithComposedAnnotation> . getEntityName ( ) , is ( STRING ) ) ; }  <METHOD_END>
