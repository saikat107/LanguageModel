<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( QualifierDefinition . forElement ( ( java.lang.reflect.Field ) null ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( QualifierDefinition . forElement ( java.lang.Class<? extends org.springframework.boot.test.mock.mockito.QualifierDefinitionTests> ( ) ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigA .class , STRING ) ) ; assertThat ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigA .class , STRING ) ) ; assertThat ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigA .class , STRING ) ; QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( java.lang.reflect.Field ) ; org.springframework.boot.test.mock.mockito.QualifierDefinition . matches ( this . org.springframework.boot.test.mock.mockito.ConfigurableListableBeanFactory , STRING ) ; verify ( this . org.springframework.boot.test.mock.mockito.ConfigurableListableBeanFactory ) . isAutowireCandidate ( eq ( STRING ) , this . org.springframework.boot.test.mock.mockito.ArgumentCaptor<org.springframework.boot.test.mock.mockito.DependencyDescriptor> . capture ( ) ) ; assertThat ( this . org.springframework.boot.test.mock.mockito.ArgumentCaptor<org.springframework.boot.test.mock.mockito.DependencyDescriptor> . getValue ( ) . getAnnotatedElement ( ) ) . isEqualTo ( java.lang.reflect.Field ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigA .class , STRING ) ; QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( java.lang.reflect.Field ) ; RootBeanDefinition org.springframework.boot.test.mock.mockito.RootBeanDefinition = new RootBeanDefinition ( ) ; org.springframework.boot.test.mock.mockito.QualifierDefinition . applyTo ( org.springframework.boot.test.mock.mockito.RootBeanDefinition ) ; assertThat ( org.springframework.boot.test.mock.mockito.RootBeanDefinition . getQualifiedElement ( ) ) . isEqualTo ( java.lang.reflect.Field ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigA .class , STRING ) ) ; QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigB .class , STRING ) ) ; QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigA .class , STRING ) ) ; QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigB .class , STRING ) ) ; QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigA .class , STRING ) ) ; QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition = QualifierDefinition . forElement ( ReflectionUtils . findField ( org.springframework.boot.test.mock.mockito.QualifierDefinitionTests.ConfigB .class , STRING ) ) ; assertThat ( org.springframework.boot.test.mock.mockito.QualifierDefinition . hashCode ( ) ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition . hashCode ( ) ) ; assertThat ( org.springframework.boot.test.mock.mockito.QualifierDefinition . hashCode ( ) ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition . hashCode ( ) ) ; assertThat ( org.springframework.boot.test.mock.mockito.QualifierDefinition . hashCode ( ) ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition . hashCode ( ) ) ; assertThat ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isNotEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) ; assertThat ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isNotEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) ; assertThat ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) . isNotEqualTo ( org.springframework.boot.test.mock.mockito.QualifierDefinition ) ; }  <METHOD_END>