<METHOD_START> @ java.lang.Override public org.springframework.boot.test.context.ContextCustomizer org.springframework.boot.test.context.ContextCustomizer ( java.lang.Class<?> < ? > java.lang.Class<?> , java.util.List<org.springframework.boot.test.context.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.boot.test.context.ContextConfigurationAttributes> ) { if ( AnnotatedElementUtils . findMergedAnnotation ( java.lang.Class<> , SpringBootTest .class ) != null ) { return new SpringBootTestContextCustomizer ( ) ; } return null ; }  <METHOD_END>
