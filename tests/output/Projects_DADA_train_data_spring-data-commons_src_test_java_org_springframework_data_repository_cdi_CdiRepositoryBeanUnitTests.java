<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean <> ( null , org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class , org.springframework.data.repository.cdi.BeanManager ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean <> ( java.util.Set<java.lang.annotation.Annotation> , null , org.springframework.data.repository.cdi.BeanManager ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> <> ( java.util.Set<java.lang.annotation.Annotation> , org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> < org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository > org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> = new org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean <> ( java.util.Set<java.lang.annotation.Annotation> , org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class , org.springframework.data.repository.cdi.BeanManager ) ; assertThat ( org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> . getBeanClass ( ) ) . isEqualTo ( org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class ) ; assertThat ( org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> . getName ( ) ) . isEqualTo ( org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class . java.lang.String ( ) ) ; assertThat ( org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> . isNullable ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> < org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository > org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> = new org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean <> ( java.util.Set<java.lang.annotation.Annotation> , org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class , org.springframework.data.repository.cdi.BeanManager ) ; java.util.Set<java.lang.reflect.Type> < java.lang.reflect.Type > java.util.Set<java.lang.reflect.Type> = org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> . getTypes ( ) ; assertThat ( java.util.Set<java.lang.reflect.Type> ) . containsExactlyInAnyOrder ( org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class , Repository .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.StereotypedSampleRepository> < org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.StereotypedSampleRepository > org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.StereotypedSampleRepository> = new org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean <> ( java.util.Set<java.lang.annotation.Annotation> , org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.StereotypedSampleRepository .class , org.springframework.data.repository.cdi.BeanManager ) ; assertThat ( org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.StereotypedSampleRepository> . getStereotypes ( ) ) . containsExactly ( StereotypeAnnotation .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { Bean < org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository > org.springframework.data.repository.cdi.Bean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> = new org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean <> ( java.util.Set<java.lang.annotation.Annotation> , org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class , org.springframework.data.repository.cdi.BeanManager ) ; assertThat ( org.springframework.data.repository.cdi.Bean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> . getScope ( ) ) . isEqualTo ( ApplicationScoped .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CdiRepositoryBean < org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository > org.springframework.data.repository.cdi.CdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> = new org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.DummyCdiRepositoryBean <> ( java.util.Set<java.lang.annotation.Annotation> , org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository .class , org.springframework.data.repository.cdi.BeanManager ) ; assertThat ( org.springframework.data.repository.cdi.CdiRepositoryBean<org.springframework.data.repository.cdi.CdiRepositoryBeanUnitTests.SampleRepository> . getId ( ) ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Set<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> < T > java.lang.Class<T> , BeanManager org.springframework.data.repository.cdi.BeanManager ) { super( java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> , org.springframework.data.repository.cdi.BeanManager ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected T T ( CreationalContext < T > org.springframework.data.repository.cdi.CreationalContext<T> , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ) { return null ; }  <METHOD_END>