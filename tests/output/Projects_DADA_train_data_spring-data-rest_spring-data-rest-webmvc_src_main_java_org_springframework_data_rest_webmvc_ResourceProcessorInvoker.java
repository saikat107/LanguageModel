<METHOD_START> public void ( java.util.Collection<org.springframework.data.rest.webmvc.ResourceProcessor<?>> < ResourceProcessor < ? > > java.util.Collection<org.springframework.data.rest.webmvc.ResourceProcessor<?>> ) { Assert . notNull ( java.util.Collection<org.springframework.data.rest.webmvc.ResourceProcessor<?>> , STRING ) ; this . java.util.List<org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper> = new java.util.ArrayList<org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper> < org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper > ( ) ; for ( ResourceProcessor < ? > org.springframework.data.rest.webmvc.ResourceProcessor<?> : java.util.Collection<org.springframework.data.rest.webmvc.ResourceProcessor<?>> ) { ResolvableType org.springframework.data.rest.webmvc.ResolvableType = ResolvableType . forClass ( ResourceProcessor .class , org.springframework.data.rest.webmvc.ResourceProcessor<> . getClass ( ) ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.rest.webmvc.ResolvableType . getGeneric ( NUMBER ) . resolve ( ) ; if ( Resource .class . boolean ( java.lang.Class<> ) ) { this . java.util.List<org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper> . boolean ( new org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ResourceProcessorWrapper ( org.springframework.data.rest.webmvc.ResourceProcessor<> ) ) ; } else if ( Resources .class . boolean ( java.lang.Class<> ) ) { this . java.util.List<org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper> . boolean ( new org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ResourcesProcessorWrapper ( org.springframework.data.rest.webmvc.ResourceProcessor<> ) ) ; } else { this . java.util.List<org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper> . boolean ( new org.springframework.data.rest.webmvc.ResourceProcessorInvoker.DefaultProcessorWrapper ( org.springframework.data.rest.webmvc.ResourceProcessor<> ) ) ; } } java.util.Collections . void ( this . java.util.List<org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper> , AnnotationAwareOrderComparator . INSTANCE ) ; }  <METHOD_END>
<METHOD_START> public < T extends org.springframework.data.rest.webmvc.ResourceSupport > T T ( T T ) { Assert . notNull ( T , STRING ) ; return java.lang.Object ( T , ResolvableType . forClass ( T . java.lang.Class<? extends org.springframework.data.rest.webmvc.ResourceSupport> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T extends org.springframework.data.rest.webmvc.ResourceSupport > T T ( T T , ResolvableType org.springframework.data.rest.webmvc.ResolvableType ) { Assert . notNull ( T , STRING ) ; Assert . notNull ( org.springframework.data.rest.webmvc.ResolvableType , STRING ) ; if ( ResourceProcessorHandlerMethodReturnValueHandler . RESOURCES_TYPE . isAssignableFrom ( org.springframework.data.rest.webmvc.ResolvableType ) ) { Resources < ? > org.springframework.data.rest.webmvc.Resources<?> = ( Resources < ? > ) T ; ResolvableType org.springframework.data.rest.webmvc.ResolvableType = ResolvableType . forClass ( Resources .class , org.springframework.data.rest.webmvc.ResolvableType . getRawClass ( ) ) . getGeneric ( NUMBER ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( org.springframework.data.rest.webmvc.Resources<> . getContent ( ) . size ( ) ) ; for ( java.lang.Object java.lang.Object : org.springframework.data.rest.webmvc.Resources<> ) { ResolvableType org.springframework.data.rest.webmvc.ResolvableType = ResolvableType . forClass ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; if ( ! java.lang.Class<?> ( org.springframework.data.rest.webmvc.ResolvableType ) . equals ( org.springframework.data.rest.webmvc.ResolvableType . getRawClass ( ) ) ) { org.springframework.data.rest.webmvc.ResolvableType = org.springframework.data.rest.webmvc.ResolvableType ; } java.util.List<java.lang.Object> . boolean ( java.lang.Object ( java.lang.Object , org.springframework.data.rest.webmvc.ResolvableType ) ) ; } ReflectionUtils . setField ( ResourceProcessorHandlerMethodReturnValueHandler . CONTENT_FIELD , org.springframework.data.rest.webmvc.Resources<> , java.util.List<java.lang.Object> ) ; } return ( T ) java.lang.Object ( ( java.lang.Object ) T , org.springframework.data.rest.webmvc.ResolvableType ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , ResolvableType org.springframework.data.rest.webmvc.ResolvableType ) { java.lang.Object java.lang.Object = java.lang.Object ; for ( org.springframework.data.rest.webmvc.ResourceProcessorInvoker . org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper : this . java.util.List<org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper> ) { if ( org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper . boolean ( org.springframework.data.rest.webmvc.ResolvableType , java.lang.Object ) ) { java.lang.Object = org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ProcessorWrapper . java.lang.Object ( java.lang.Object ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( ResolvableType org.springframework.data.rest.webmvc.ResolvableType , java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<?> ( org.springframework.data.rest.webmvc.ResolvableType ) . isAssignableFrom ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Class<?> < ? > java.lang.Class<?> ( ResolvableType org.springframework.data.rest.webmvc.ResolvableType ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.rest.webmvc.ResolvableType . getRawClass ( ) ; return java.lang.Class<> == null ? java.lang.Object .class : java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> boolean boolean ( ResolvableType org.springframework.data.rest.webmvc.ResolvableType , java.lang.Object java.lang.Object );  <METHOD_END>
<METHOD_START> java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object );  <METHOD_END>
<METHOD_START> public void ( ResourceProcessor < ? > org.springframework.data.rest.webmvc.ResourceProcessor<?> ) { Assert . notNull ( org.springframework.data.rest.webmvc.ResourceProcessor<> , STRING ) ; this . org.springframework.data.rest.webmvc.ResourceProcessor<?> = org.springframework.data.rest.webmvc.ResourceProcessor<> ; this . org.springframework.data.rest.webmvc.ResolvableType = ResolvableType . forClass ( ResourceProcessor .class , org.springframework.data.rest.webmvc.ResourceProcessor<> . getClass ( ) ) . getGeneric ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.data.rest.webmvc.ResolvableType , java.lang.Object java.lang.Object ) { return boolean ( org.springframework.data.rest.webmvc.ResolvableType , java.lang.Class<?> ( org.springframework.data.rest.webmvc.ResolvableType ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return ( ( ResourceProcessor < ResourceSupport > ) org.springframework.data.rest.webmvc.ResourceProcessor<> ) . process ( ( ResourceSupport ) java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.rest.webmvc.ResourceProcessorInvoker.CustomOrderAwareComparator . org.springframework.data.rest.webmvc.ResourceProcessorInvoker.CustomOrderAwareComparator . int ( org.springframework.data.rest.webmvc.ResourceProcessor<> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.rest.webmvc.ResolvableType org.springframework.data.rest.webmvc.ResolvableType ( ) { return org.springframework.data.rest.webmvc.ResolvableType ; }  <METHOD_END>
<METHOD_START> public void ( ResourceProcessor < ? > org.springframework.data.rest.webmvc.ResourceProcessor<?> ) { super( org.springframework.data.rest.webmvc.ResourceProcessor<> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.data.rest.webmvc.ResolvableType , java.lang.Object java.lang.Object ) { if ( ! ResourceProcessorHandlerMethodReturnValueHandler . RESOURCE_TYPE . isAssignableFrom ( org.springframework.data.rest.webmvc.ResolvableType ) ) { return false ; } return super. boolean ( org.springframework.data.rest.webmvc.ResolvableType , java.lang.Object ) && boolean ( ( Resource < ? > ) java.lang.Object , org.springframework.data.rest.webmvc.ResolvableType ( ) ) ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( Resource < ? > org.springframework.data.rest.webmvc.Resource<?> , ResolvableType org.springframework.data.rest.webmvc.ResolvableType ) { if ( org.springframework.data.rest.webmvc.Resource<> == null || ! boolean ( org.springframework.data.rest.webmvc.ResolvableType , org.springframework.data.rest.webmvc.Resource<> . getClass ( ) ) ) { return false ; } java.lang.Object java.lang.Object = org.springframework.data.rest.webmvc.Resource<> . getContent ( ) ; if ( java.lang.Object == null ) { return false ; } ResolvableType org.springframework.data.rest.webmvc.ResolvableType = org.springframework.data.rest.webmvc.ResolvableType ( org.springframework.data.rest.webmvc.ResolvableType , Resource .class ) ; return org.springframework.data.rest.webmvc.ResolvableType != null && org.springframework.data.rest.webmvc.ResolvableType . getGeneric ( NUMBER ) . isAssignableFrom ( ResolvableType . forClass ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.rest.webmvc.ResolvableType org.springframework.data.rest.webmvc.ResolvableType ( ResolvableType org.springframework.data.rest.webmvc.ResolvableType , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( org.springframework.data.rest.webmvc.ResolvableType ) ; if ( java.lang.Object .class . boolean ( java.lang.Class<> ) ) { return null ; } if ( java.lang.Class<> . boolean ( java.lang.Class<> ) ) { return org.springframework.data.rest.webmvc.ResolvableType ; } return org.springframework.data.rest.webmvc.ResolvableType ( org.springframework.data.rest.webmvc.ResolvableType . getSuperType ( ) , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public void ( ResourceProcessor < ? > org.springframework.data.rest.webmvc.ResourceProcessor<?> ) { super( org.springframework.data.rest.webmvc.ResourceProcessor<> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.data.rest.webmvc.ResolvableType , java.lang.Object java.lang.Object ) { if ( ! ResourceProcessorHandlerMethodReturnValueHandler . RESOURCES_TYPE . isAssignableFrom ( org.springframework.data.rest.webmvc.ResolvableType ) ) { return false ; } return super. boolean ( org.springframework.data.rest.webmvc.ResolvableType , java.lang.Object ) && boolean ( ( Resources < ? > ) java.lang.Object , org.springframework.data.rest.webmvc.ResolvableType ( ) ) ; }  <METHOD_END>
<METHOD_START> static boolean boolean ( Resources < ? > org.springframework.data.rest.webmvc.Resources<?> , ResolvableType org.springframework.data.rest.webmvc.ResolvableType ) { if ( org.springframework.data.rest.webmvc.Resources<> == null ) { return false ; } java.util.Collection<?> < ? > java.util.Collection<?> = org.springframework.data.rest.webmvc.Resources<> . getContent ( ) ; if ( java.util.Collection<> . boolean ( ) ) { return false ; } ResolvableType org.springframework.data.rest.webmvc.ResolvableType = null ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.util.Arrays .< java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> ( org.springframework.data.rest.webmvc.Resources<> . getClass ( ) , Resources .class ) ) { org.springframework.data.rest.webmvc.ResolvableType = ResolvableType . forClass ( java.lang.Class<> , java.lang.Class<?> ( org.springframework.data.rest.webmvc.ResolvableType ) ) ; if ( org.springframework.data.rest.webmvc.ResolvableType != null ) { break; } } if ( org.springframework.data.rest.webmvc.ResolvableType == null ) { return false ; } java.lang.Object java.lang.Object = java.util.Collection<> . java.util.Iterator<> ( ) . next ( ) ; ResolvableType org.springframework.data.rest.webmvc.ResolvableType = org.springframework.data.rest.webmvc.ResolvableType . getGeneric ( NUMBER ) ; if ( java.lang.Object instanceof Resource ) { return org.springframework.data.rest.webmvc.ResourceProcessorInvoker.ResourceProcessorWrapper . boolean ( ( Resource < ? > ) java.lang.Object , org.springframework.data.rest.webmvc.ResolvableType ) ; } else if ( java.lang.Object instanceof EmbeddedWrapper ) { return boolean ( org.springframework.data.rest.webmvc.ResolvableType , ( ( EmbeddedWrapper ) java.lang.Object ) . getRelTargetType ( ) ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected int int ( java.lang.Object java.lang.Object ) { return super. getOrder ( java.lang.Object ) ; }  <METHOD_END>
