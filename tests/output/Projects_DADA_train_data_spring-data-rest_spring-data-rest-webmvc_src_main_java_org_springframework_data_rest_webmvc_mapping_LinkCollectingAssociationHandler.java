<METHOD_START> public void ( PersistentEntities org.springframework.data.rest.webmvc.mapping.PersistentEntities , Path org.springframework.data.rest.webmvc.mapping.Path , Associations org.springframework.data.rest.webmvc.mapping.Associations ) { this( org.springframework.data.rest.webmvc.mapping.PersistentEntities , org.springframework.data.rest.webmvc.mapping.Path , org.springframework.data.rest.webmvc.mapping.Associations , false ); }  <METHOD_END>
<METHOD_START> private void ( PersistentEntities org.springframework.data.rest.webmvc.mapping.PersistentEntities , Path org.springframework.data.rest.webmvc.mapping.Path , Associations org.springframework.data.rest.webmvc.mapping.Associations , boolean boolean ) { Assert . notNull ( org.springframework.data.rest.webmvc.mapping.PersistentEntities , STRING ) ; Assert . notNull ( org.springframework.data.rest.webmvc.mapping.Path , STRING ) ; Assert . notNull ( org.springframework.data.rest.webmvc.mapping.Associations , STRING ) ; this . org.springframework.data.rest.webmvc.mapping.PersistentEntities = org.springframework.data.rest.webmvc.mapping.PersistentEntities ; this . org.springframework.data.rest.webmvc.mapping.Associations = org.springframework.data.rest.webmvc.mapping.Associations ; this . org.springframework.data.rest.webmvc.mapping.Path = org.springframework.data.rest.webmvc.mapping.Path ; this . java.util.List<org.springframework.data.rest.webmvc.mapping.Link> = new java.util.ArrayList<org.springframework.data.rest.webmvc.mapping.Link> < Link > ( ) ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.rest.webmvc.mapping.LinkCollectingAssociationHandler org.springframework.data.rest.webmvc.mapping.LinkCollectingAssociationHandler ( ) { return boolean ? this : new org.springframework.data.rest.webmvc.mapping.LinkCollectingAssociationHandler ( org.springframework.data.rest.webmvc.mapping.PersistentEntities , org.springframework.data.rest.webmvc.mapping.Path , org.springframework.data.rest.webmvc.mapping.Associations , true ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.data.rest.webmvc.mapping.Link> < Link > java.util.List<org.springframework.data.rest.webmvc.mapping.Link> ( ) { return java.util.List<org.springframework.data.rest.webmvc.mapping.Link> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( final Association < ? extends PersistentProperty < ? > > org.springframework.data.rest.webmvc.mapping.Association<? extends org.springframework.data.rest.webmvc.mapping.PersistentProperty<?>> ) { PersistentProperty < ? > org.springframework.data.rest.webmvc.mapping.PersistentProperty<?> = org.springframework.data.rest.webmvc.mapping.Association<> . getInverse ( ) ; if ( org.springframework.data.rest.webmvc.mapping.Associations . isLinkableAssociation ( org.springframework.data.rest.webmvc.mapping.PersistentProperty<> ) ) { Links org.springframework.data.rest.webmvc.mapping.Links = new Links ( java.util.List<org.springframework.data.rest.webmvc.mapping.Link> ) ; for ( Link org.springframework.data.rest.webmvc.mapping.Link : org.springframework.data.rest.webmvc.mapping.Associations . getLinksFor ( org.springframework.data.rest.webmvc.mapping.Association<> , org.springframework.data.rest.webmvc.mapping.Path ) ) { if ( org.springframework.data.rest.webmvc.mapping.Links . hasLink ( org.springframework.data.rest.webmvc.mapping.Link . getRel ( ) ) ) { throw new MappingException ( java.lang.String . java.lang.String ( java.lang.String , org.springframework.data.rest.webmvc.mapping.PersistentProperty<> . toString ( ) ) ) ; } else { java.util.List<org.springframework.data.rest.webmvc.mapping.Link> . add ( org.springframework.data.rest.webmvc.mapping.Link ) ; } } } }  <METHOD_END>
