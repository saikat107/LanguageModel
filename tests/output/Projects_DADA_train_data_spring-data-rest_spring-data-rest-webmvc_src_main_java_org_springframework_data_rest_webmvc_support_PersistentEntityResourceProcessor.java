<METHOD_START> @ Autowired public void ( Repositories org.springframework.data.rest.webmvc.support.Repositories , java.util.List<org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>>> < ResourceProcessor < Resource < ? > > > java.util.List<org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>>> ) { if ( null != java.util.List<org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>>> ) { for ( ResourceProcessor < Resource < ? > > org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>> : java.util.List<org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>>> ) { TypeInformation < ? > org.springframework.data.rest.webmvc.support.TypeInformation<?> = ClassTypeInformation . from ( org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>> . getClass ( ) ) ; TypeInformation < ? > org.springframework.data.rest.webmvc.support.TypeInformation<?> = org.springframework.data.rest.webmvc.support.TypeInformation<> . getTypeArguments ( ) . get ( NUMBER ) ; if ( null != org.springframework.data.rest.webmvc.support.Repositories . getPersistentEntity ( org.springframework.data.rest.webmvc.support.TypeInformation<> . getType ( ) ) ) { this . java.util.List<org.springframework.data.rest.webmvc.support.PersistentEntityResourceProcessor.DomainTypeResourceProcessor> . boolean ( new org.springframework.data.rest.webmvc.support.PersistentEntityResourceProcessor.DomainTypeResourceProcessor ( org.springframework.data.rest.webmvc.support.TypeInformation<> . getType ( ) , org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>> ) ) ; } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.support.PersistentEntityResource org.springframework.data.rest.webmvc.support.PersistentEntityResource ( PersistentEntityResource org.springframework.data.rest.webmvc.support.PersistentEntityResource ) { java.lang.Object java.lang.Object = org.springframework.data.rest.webmvc.support.PersistentEntityResource . getContent ( ) ; if ( null == java.lang.Object ) { return org.springframework.data.rest.webmvc.support.PersistentEntityResource ; } java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; for ( org.springframework.data.rest.webmvc.support.PersistentEntityResourceProcessor.DomainTypeResourceProcessor org.springframework.data.rest.webmvc.support.PersistentEntityResourceProcessor.DomainTypeResourceProcessor : java.util.List<org.springframework.data.rest.webmvc.support.PersistentEntityResourceProcessor.DomainTypeResourceProcessor> ) { if ( isAssignable ( java.lang.Class<> , org.springframework.data.rest.webmvc.support.PersistentEntityResourceProcessor.DomainTypeResourceProcessor . java.lang.Class<> ) ) { org.springframework.data.rest.webmvc.support.PersistentEntityResourceProcessor.DomainTypeResourceProcessor . org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>> . process ( org.springframework.data.rest.webmvc.support.PersistentEntityResource ) ; } } return org.springframework.data.rest.webmvc.support.PersistentEntityResource ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.Class<?> < ? > java.lang.Class<?> , ResourceProcessor < Resource < ? > > org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>> ) { this . java.lang.Class<?> = java.lang.Class<> ; this . org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>> = org.springframework.data.rest.webmvc.support.ResourceProcessor<org.springframework.data.rest.webmvc.support.Resource<?>> ; }  <METHOD_END>
