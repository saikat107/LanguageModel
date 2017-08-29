<METHOD_START> public void ( RepositoryMetadata org.springframework.data.rest.core.mapping.RepositoryMetadata , RepositoryDetectionStrategy org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy ) { this( org.springframework.data.rest.core.mapping.RepositoryMetadata , new EvoInflectorRelProvider ( ) , org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy ); }  <METHOD_END>
<METHOD_START> void ( RepositoryMetadata org.springframework.data.rest.core.mapping.RepositoryMetadata , RelProvider org.springframework.data.rest.core.mapping.RelProvider , RepositoryDetectionStrategy org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy ) { Assert . notNull ( org.springframework.data.rest.core.mapping.RepositoryMetadata , STRING ) ; Assert . notNull ( org.springframework.data.rest.core.mapping.RelProvider , STRING ) ; Assert . notNull ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy , STRING ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.rest.core.mapping.RepositoryMetadata . getRepositoryInterface ( ) ; this . org.springframework.data.rest.core.mapping.RepositoryMetadata = org.springframework.data.rest.core.mapping.RepositoryMetadata ; this . org.springframework.data.rest.core.mapping.RestResource = AnnotationUtils . findAnnotation ( java.lang.Class<> , RestResource .class ) ; this . org.springframework.data.rest.core.mapping.RepositoryRestResource = AnnotationUtils . findAnnotation ( java.lang.Class<> , RepositoryRestResource .class ) ; this . boolean = org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy . isExported ( org.springframework.data.rest.core.mapping.RepositoryMetadata ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.rest.core.mapping.RepositoryMetadata . getDomainType ( ) ; this . org.springframework.data.rest.core.mapping.CollectionResourceMapping = boolean ? new EvoInflectorTypeBasedCollectionResourceMapping ( java.lang.Class<> , org.springframework.data.rest.core.mapping.RelProvider ) : new TypeBasedCollectionResourceMapping ( java.lang.Class<> , org.springframework.data.rest.core.mapping.RelProvider ) ; if ( org.springframework.data.rest.core.mapping.RestResource != null ) { org.springframework.data.rest.core.mapping.Logger . warn ( STRING , org.springframework.data.rest.core.mapping.RepositoryMetadata . getRepositoryInterface ( ) . getName ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.core.mapping.Path org.springframework.data.rest.core.mapping.Path ( ) { Path org.springframework.data.rest.core.mapping.Path = org.springframework.data.rest.core.mapping.CollectionResourceMapping . getPath ( ) ; if ( org.springframework.data.rest.core.mapping.RepositoryRestResource != null ) { java.lang.String java.lang.String = org.springframework.data.rest.core.mapping.RepositoryRestResource . path ( ) ; return StringUtils . hasText ( java.lang.String ) ? new Path ( java.lang.String ) : org.springframework.data.rest.core.mapping.Path ; } if ( org.springframework.data.rest.core.mapping.RestResource != null ) { java.lang.String java.lang.String = org.springframework.data.rest.core.mapping.RestResource . path ( ) ; return StringUtils . hasText ( java.lang.String ) ? new Path ( java.lang.String ) : org.springframework.data.rest.core.mapping.Path ; } return org.springframework.data.rest.core.mapping.Path ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = org.springframework.data.rest.core.mapping.CollectionResourceMapping . getRel ( ) ; if ( org.springframework.data.rest.core.mapping.RepositoryRestResource != null ) { java.lang.String java.lang.String = org.springframework.data.rest.core.mapping.RepositoryRestResource . collectionResourceRel ( ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : java.lang.String ; } if ( org.springframework.data.rest.core.mapping.RestResource != null ) { java.lang.String java.lang.String = org.springframework.data.rest.core.mapping.RestResource . rel ( ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : java.lang.String ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = org.springframework.data.rest.core.mapping.CollectionResourceMapping . getItemResourceRel ( ) ; if ( org.springframework.data.rest.core.mapping.RepositoryRestResource != null ) { java.lang.String java.lang.String = org.springframework.data.rest.core.mapping.RepositoryRestResource . itemResourceRel ( ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : java.lang.String ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.rest.core.mapping.RepositoryMetadata . isPagingRepository ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.core.mapping.ResourceDescription org.springframework.data.rest.core.mapping.ResourceDescription ( ) { ResourceDescription org.springframework.data.rest.core.mapping.ResourceDescription = SimpleResourceDescription . defaultFor ( java.lang.String ( ) ) ; if ( org.springframework.data.rest.core.mapping.RepositoryRestResource != null ) { return new AnnotationBasedResourceDescription ( org.springframework.data.rest.core.mapping.RepositoryRestResource . collectionResourceDescription ( ) , org.springframework.data.rest.core.mapping.ResourceDescription ) ; } return org.springframework.data.rest.core.mapping.ResourceDescription ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.core.mapping.ResourceDescription org.springframework.data.rest.core.mapping.ResourceDescription ( ) { ResourceDescription org.springframework.data.rest.core.mapping.ResourceDescription = SimpleResourceDescription . defaultFor ( java.lang.String ( ) ) ; if ( org.springframework.data.rest.core.mapping.RepositoryRestResource != null ) { return new AnnotationBasedResourceDescription ( org.springframework.data.rest.core.mapping.RepositoryRestResource . itemResourceDescription ( ) , org.springframework.data.rest.core.mapping.ResourceDescription ) ; } return org.springframework.data.rest.core.mapping.ResourceDescription ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { if ( org.springframework.data.rest.core.mapping.RepositoryRestResource == null ) { return null ; } java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.rest.core.mapping.RepositoryRestResource . excerptProjection ( ) ; return java.lang.Class<> . boolean ( RepositoryRestResource . RepositoryRestResource .class ) ? null : java.lang.Class<> ; }  <METHOD_END>
