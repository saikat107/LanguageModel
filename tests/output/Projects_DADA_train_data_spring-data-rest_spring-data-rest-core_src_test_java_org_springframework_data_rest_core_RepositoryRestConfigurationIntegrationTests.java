<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResourceMapping org.springframework.data.rest.core.ResourceMapping = org.springframework.data.rest.core.RepositoryRestConfiguration . getResourceMappingForRepository ( ConfiguredPersonRepository .class ) ; assertThat ( org.springframework.data.rest.core.ResourceMapping ) . isNotNull ( ) ; assertThat ( org.springframework.data.rest.core.ResourceMapping . getRel ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.rest.core.ResourceMapping . getPath ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.rest.core.ResourceMapping . isExported ( ) ) . isFalse ( ) ; }  <METHOD_END>