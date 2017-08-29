<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.rest.core.RepositoryRestConfiguration = new RepositoryRestConfiguration ( new ProjectionDefinitionConfiguration ( ) , new MetadataConfiguration ( ) , mock ( EnumTranslationConfiguration .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( MediaType . APPLICATION_JSON_VALUE ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( MediaType . APPLICATION_JSON_VALUE ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( null ) ) . isFalse ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( null ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( STRING ) ) . isFalse ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.core.RepositoryRestConfiguration . setReturnBodyOnUpdate ( false ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( null ) ) . isFalse ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( STRING ) ) . isFalse ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( MediaType . APPLICATION_JSON_VALUE ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.core.RepositoryRestConfiguration . setReturnBodyOnCreate ( false ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( null ) ) . isFalse ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( STRING ) ) . isFalse ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( MediaType . APPLICATION_JSON_VALUE ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.core.RepositoryRestConfiguration . setReturnBodyOnUpdate ( true ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( null ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnUpdate ( MediaType . APPLICATION_JSON_VALUE ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.core.RepositoryRestConfiguration . setReturnBodyOnCreate ( true ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( null ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . returnBodyOnCreate ( MediaType . APPLICATION_JSON_VALUE ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.core.RepositoryRestConfiguration . withEntityLookup ( ) . forLookupRepository ( ProfileRepository .class ) ; assertThat ( org.springframework.data.rest.core.RepositoryRestConfiguration . isLookupType ( Profile .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RepositoryCorsRegistry org.springframework.data.rest.core.RepositoryCorsRegistry = org.springframework.data.rest.core.RepositoryRestConfiguration . getCorsRegistry ( ) ; org.springframework.data.rest.core.RepositoryCorsRegistry . addMapping ( STRING ) . maxAge ( NUMBER ) ; java.util.Map<java.lang.String,org.springframework.data.rest.core.CorsConfiguration> < java.lang.String , CorsConfiguration > java.util.Map<java.lang.String,org.springframework.data.rest.core.CorsConfiguration> = org.springframework.data.rest.core.RepositoryCorsRegistry . getCorsConfigurations ( ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.data.rest.core.CorsConfiguration> ) . containsKey ( STRING ) ; CorsConfiguration org.springframework.data.rest.core.CorsConfiguration = java.util.Map<java.lang.String,org.springframework.data.rest.core.CorsConfiguration> . get ( STRING ) ; assertThat ( org.springframework.data.rest.core.CorsConfiguration . getMaxAge ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
