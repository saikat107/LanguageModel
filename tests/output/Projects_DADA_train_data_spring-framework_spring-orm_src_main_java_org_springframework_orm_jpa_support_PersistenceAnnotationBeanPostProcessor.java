<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Properties java.util.Properties ) { this . java.lang.Object = java.util.Properties ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { this . java.util.Map<java.lang.String,java.lang.String> = java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { this . java.util.Map<java.lang.String,java.lang.String> = java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { this . java.util.Map<java.lang.String,java.lang.String> = java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = ( java.lang.String != null ? java.lang.String : STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.orm.jpa.support.BeanFactory ) { if ( org.springframework.orm.jpa.support.BeanFactory instanceof ListableBeanFactory ) { this . org.springframework.orm.jpa.support.ListableBeanFactory = ( ListableBeanFactory ) org.springframework.orm.jpa.support.BeanFactory ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( RootBeanDefinition org.springframework.orm.jpa.support.RootBeanDefinition , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { if ( java.lang.Class<> != null ) { InjectionMetadata org.springframework.orm.jpa.support.InjectionMetadata = org.springframework.orm.jpa.support.InjectionMetadata ( java.lang.String , java.lang.Class<> , null ) ; org.springframework.orm.jpa.support.InjectionMetadata . checkConfigMembers ( org.springframework.orm.jpa.support.RootBeanDefinition ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) throws org.springframework.orm.jpa.support.BeansException { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.orm.jpa.support.BeansException { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.orm.jpa.support.PropertyValues org.springframework.orm.jpa.support.PropertyValues ( PropertyValues org.springframework.orm.jpa.support.PropertyValues , java.beans.PropertyDescriptor [] java.beans.PropertyDescriptor[] , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.orm.jpa.support.BeansException { InjectionMetadata org.springframework.orm.jpa.support.InjectionMetadata = org.springframework.orm.jpa.support.InjectionMetadata ( java.lang.String , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , org.springframework.orm.jpa.support.PropertyValues ) ; try { org.springframework.orm.jpa.support.InjectionMetadata . inject ( java.lang.Object , java.lang.String , org.springframework.orm.jpa.support.PropertyValues ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new BeanCreationException ( java.lang.String , STRING , java.lang.Throwable ) ; } return org.springframework.orm.jpa.support.PropertyValues ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.orm.jpa.support.BeansException { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.orm.jpa.support.BeansException { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.orm.jpa.support.BeansException { EntityManager org.springframework.orm.jpa.support.EntityManager = this . java.util.Map<java.lang.Object,org.springframework.orm.jpa.support.EntityManager> . remove ( java.lang.Object ) ; EntityManagerFactoryUtils . closeEntityManager ( org.springframework.orm.jpa.support.EntityManager ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return this . java.util.Map<java.lang.Object,org.springframework.orm.jpa.support.EntityManager> . containsKey ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.orm.jpa.support.InjectionMetadata org.springframework.orm.jpa.support.InjectionMetadata ( java.lang.String java.lang.String , final java.lang.Class<?> < ? > java.lang.Class<?> , PropertyValues org.springframework.orm.jpa.support.PropertyValues ) { java.lang.String java.lang.String = ( StringUtils . hasLength ( java.lang.String ) ? java.lang.String : java.lang.Class<> . java.lang.String ( ) ) ; InjectionMetadata org.springframework.orm.jpa.support.InjectionMetadata = this . java.util.Map<java.lang.String,org.springframework.orm.jpa.support.InjectionMetadata> . get ( java.lang.String ) ; if ( InjectionMetadata . needsRefresh ( org.springframework.orm.jpa.support.InjectionMetadata , java.lang.Class<> ) ) { synchronized ( this . java.util.Map<java.lang.String,org.springframework.orm.jpa.support.InjectionMetadata> ) { org.springframework.orm.jpa.support.InjectionMetadata = this . java.util.Map<java.lang.String,org.springframework.orm.jpa.support.InjectionMetadata> . get ( java.lang.String ) ; if ( InjectionMetadata . needsRefresh ( org.springframework.orm.jpa.support.InjectionMetadata , java.lang.Class<> ) ) { if ( org.springframework.orm.jpa.support.InjectionMetadata != null ) { org.springframework.orm.jpa.support.InjectionMetadata . clear ( org.springframework.orm.jpa.support.PropertyValues ) ; } org.springframework.orm.jpa.support.InjectionMetadata = org.springframework.orm.jpa.support.InjectionMetadata ( java.lang.Class<> ) ; this . java.util.Map<java.lang.String,org.springframework.orm.jpa.support.InjectionMetadata> . put ( java.lang.String , org.springframework.orm.jpa.support.InjectionMetadata ) ; } } } return org.springframework.orm.jpa.support.InjectionMetadata ; }  <METHOD_END>
<METHOD_START> private org.springframework.orm.jpa.support.InjectionMetadata org.springframework.orm.jpa.support.InjectionMetadata ( final java.lang.Class<?> < ? > java.lang.Class<?> ) { java.util.LinkedList<InjectionMetadata.InjectedElement> < InjectionMetadata . InjectionMetadata > java.util.LinkedList<InjectionMetadata.InjectedElement> = new java.util.LinkedList<InjectionMetadata.InjectedElement> <> ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<> ; do { final java.util.LinkedList<InjectionMetadata.InjectedElement> < InjectionMetadata . InjectionMetadata > java.util.LinkedList<InjectionMetadata.InjectedElement> = new java.util.LinkedList<InjectionMetadata.InjectedElement> <> ( ) ; ReflectionUtils . doWithLocalFields ( java.lang.Class<> , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public void void ( java.lang.reflect.Field java.lang.reflect.Field ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { if ( java.lang.reflect.Field . boolean ( PersistenceContext .class ) || java.lang.reflect.Field . boolean ( PersistenceUnit .class ) ) { if ( java.lang.reflect.Modifier . boolean ( java.lang.reflect.Field . int ( ) ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.util.LinkedList<InjectionMetadata.InjectedElement> . add ( new org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor.PersistenceElement ( java.lang.reflect.Field , java.lang.reflect.Field , null ) ) ; } } } ) ; ReflectionUtils . doWithLocalMethods ( java.lang.Class<> , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { java.lang.reflect.Method java.lang.reflect.Method = BridgeMethodResolver . findBridgedMethod ( java.lang.reflect.Method ) ; if ( ! BridgeMethodResolver . isVisibilityBridgeMethodPair ( java.lang.reflect.Method , java.lang.reflect.Method ) ) { return; } if ( ( java.lang.reflect.Method . boolean ( PersistenceContext .class ) || java.lang.reflect.Method . boolean ( PersistenceUnit .class ) ) && java.lang.reflect.Method . boolean ( ClassUtils . getMostSpecificMethod ( java.lang.reflect.Method , java.lang.Class<> ) ) ) { if ( java.lang.reflect.Modifier . boolean ( java.lang.reflect.Method . int ( ) ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } if ( java.lang.reflect.Method . int ( ) != NUMBER ) { throw new java.lang.IllegalStateException ( STRING + java.lang.reflect.Method ) ; } java.beans.PropertyDescriptor java.beans.PropertyDescriptor = BeanUtils . findPropertyForMethod ( java.lang.reflect.Method , java.lang.Class<> ) ; java.util.LinkedList<InjectionMetadata.InjectedElement> . add ( new org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor.PersistenceElement ( java.lang.reflect.Method , java.lang.reflect.Method , java.beans.PropertyDescriptor ) ) ; } } } ) ; java.util.LinkedList<InjectionMetadata.InjectedElement> . addAll ( NUMBER , java.util.LinkedList<InjectionMetadata.InjectedElement> ) ; java.lang.Class<?> = java.lang.Class<> . java.lang.Class<? super > ( ) ; } while ( java.lang.Class<> != null && java.lang.Class<> != java.lang.Object .class ); return new InjectionMetadata ( java.lang.Class<> , java.util.LinkedList<InjectionMetadata.InjectedElement> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Field java.lang.reflect.Field ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { if ( java.lang.reflect.Field . boolean ( PersistenceContext .class ) || java.lang.reflect.Field . boolean ( PersistenceUnit .class ) ) { if ( java.lang.reflect.Modifier . boolean ( java.lang.reflect.Field . int ( ) ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.util.LinkedList<InjectionMetadata.InjectedElement> . add ( new org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor.PersistenceElement ( java.lang.reflect.Field , java.lang.reflect.Field , null ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { java.lang.reflect.Method java.lang.reflect.Method = BridgeMethodResolver . findBridgedMethod ( java.lang.reflect.Method ) ; if ( ! BridgeMethodResolver . isVisibilityBridgeMethodPair ( java.lang.reflect.Method , java.lang.reflect.Method ) ) { return; } if ( ( java.lang.reflect.Method . boolean ( PersistenceContext .class ) || java.lang.reflect.Method . boolean ( PersistenceUnit .class ) ) && java.lang.reflect.Method . boolean ( ClassUtils . getMostSpecificMethod ( java.lang.reflect.Method , java.lang.Class<> ) ) ) { if ( java.lang.reflect.Modifier . boolean ( java.lang.reflect.Method . int ( ) ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } if ( java.lang.reflect.Method . int ( ) != NUMBER ) { throw new java.lang.IllegalStateException ( STRING + java.lang.reflect.Method ) ; } java.beans.PropertyDescriptor java.beans.PropertyDescriptor = BeanUtils . findPropertyForMethod ( java.lang.reflect.Method , java.lang.Class<> ) ; java.util.LinkedList<InjectionMetadata.InjectedElement> . add ( new org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor.PersistenceElement ( java.lang.reflect.Method , java.lang.reflect.Method , java.beans.PropertyDescriptor ) ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.orm.jpa.support.EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String java.lang.String ) { if ( this . java.util.Map<java.lang.String,java.lang.String> != null ) { java.lang.String java.lang.String = ( java.lang.String != null ? java.lang.String : STRING ) ; if ( STRING . boolean ( java.lang.String ) ) { java.lang.String = this . java.lang.String ; } java.lang.String java.lang.String = this . java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String ) ; if ( java.lang.String == null && STRING . boolean ( java.lang.String ) && this . java.util.Map<java.lang.String,java.lang.String> . int ( ) == NUMBER ) { java.lang.String = this . java.util.Map<java.lang.String,java.lang.String> . java.util.Collection<java.lang.String> ( ) . java.util.Iterator<java.lang.String> ( ) . java.lang.String ( ) ; } if ( java.lang.String != null ) { try { return org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String , EntityManagerFactory .class ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING , java.lang.Exception ) ; } } } return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.orm.jpa.support.EntityManager org.springframework.orm.jpa.support.EntityManager ( java.lang.String java.lang.String , boolean boolean ) { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = ( boolean ? this . java.util.Map<java.lang.String,java.lang.String> : this . java.util.Map<java.lang.String,java.lang.String> ) ; if ( java.util.Map<java.lang.String,java.lang.String> != null ) { java.lang.String java.lang.String = ( java.lang.String != null ? java.lang.String : STRING ) ; if ( STRING . boolean ( java.lang.String ) ) { java.lang.String = this . java.lang.String ; } java.lang.String java.lang.String = java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String ) ; if ( java.lang.String == null && STRING . boolean ( java.lang.String ) && java.util.Map<java.lang.String,java.lang.String> . int ( ) == NUMBER ) { java.lang.String = java.util.Map<java.lang.String,java.lang.String> . java.util.Collection<java.lang.String> ( ) . java.util.Iterator<java.lang.String> ( ) . java.lang.String ( ) ; } if ( java.lang.String != null ) { try { return org.springframework.orm.jpa.support.EntityManager ( java.lang.String , EntityManager .class ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING , java.lang.Exception ) ; } } } return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.orm.jpa.support.EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String java.lang.String , java.lang.String java.lang.String )			throws org.springframework.orm.jpa.support.NoSuchBeanDefinitionException { if ( this . org.springframework.orm.jpa.support.ListableBeanFactory == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.lang.String java.lang.String = ( java.lang.String != null ? java.lang.String : STRING ) ; if ( STRING . boolean ( java.lang.String ) ) { java.lang.String = this . java.lang.String ; } if ( ! STRING . boolean ( java.lang.String ) ) { return org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String , java.lang.String ) ; } else { return org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.orm.jpa.support.EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String java.lang.String , java.lang.String java.lang.String )			throws org.springframework.orm.jpa.support.NoSuchBeanDefinitionException { EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory = EntityManagerFactoryUtils . findEntityManagerFactory ( this . org.springframework.orm.jpa.support.ListableBeanFactory , java.lang.String ) ; if ( this . org.springframework.orm.jpa.support.ListableBeanFactory instanceof ConfigurableBeanFactory ) { ( ( ConfigurableBeanFactory ) this . org.springframework.orm.jpa.support.ListableBeanFactory ) . registerDependentBean ( java.lang.String , java.lang.String ) ; } return org.springframework.orm.jpa.support.EntityManagerFactory ; }  <METHOD_END>
<METHOD_START> protected org.springframework.orm.jpa.support.EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String java.lang.String )			throws org.springframework.orm.jpa.support.NoSuchBeanDefinitionException { if ( this . org.springframework.orm.jpa.support.ListableBeanFactory instanceof ConfigurableListableBeanFactory ) { ConfigurableListableBeanFactory org.springframework.orm.jpa.support.ConfigurableListableBeanFactory = ( ConfigurableListableBeanFactory ) this . org.springframework.orm.jpa.support.ListableBeanFactory ; NamedBeanHolder < EntityManagerFactory > org.springframework.orm.jpa.support.NamedBeanHolder<org.springframework.orm.jpa.support.EntityManagerFactory> = org.springframework.orm.jpa.support.ConfigurableListableBeanFactory . resolveNamedBean ( EntityManagerFactory .class ) ; org.springframework.orm.jpa.support.ConfigurableListableBeanFactory . registerDependentBean ( org.springframework.orm.jpa.support.NamedBeanHolder<org.springframework.orm.jpa.support.EntityManagerFactory> . getBeanName ( ) , java.lang.String ) ; return org.springframework.orm.jpa.support.NamedBeanHolder<org.springframework.orm.jpa.support.EntityManagerFactory> . getBeanInstance ( ) ; } else { return this . org.springframework.orm.jpa.support.ListableBeanFactory . getBean ( EntityManagerFactory .class ) ; } }  <METHOD_END>
<METHOD_START> protected < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) throws java.lang.Exception { return new org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor.LocatorDelegate ( ) . T ( java.lang.String , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) throws java.lang.Exception { JndiLocatorDelegate org.springframework.orm.jpa.support.JndiLocatorDelegate = new JndiLocatorDelegate ( ) ; if ( java.lang.Object instanceof JndiTemplate ) { org.springframework.orm.jpa.support.JndiLocatorDelegate . setJndiTemplate ( ( JndiTemplate ) java.lang.Object ) ; } else if ( java.lang.Object instanceof java.util.Properties ) { org.springframework.orm.jpa.support.JndiLocatorDelegate . setJndiEnvironment ( ( java.util.Properties ) java.lang.Object ) ; } else if ( java.lang.Object != null ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } org.springframework.orm.jpa.support.JndiLocatorDelegate . setResourceRef ( boolean ) ; return org.springframework.orm.jpa.support.JndiLocatorDelegate . lookup ( java.lang.String , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.reflect.Member java.lang.reflect.Member , java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement , java.beans.PropertyDescriptor java.beans.PropertyDescriptor ) { super( java.lang.reflect.Member , java.beans.PropertyDescriptor ); PersistenceContext org.springframework.orm.jpa.support.PersistenceContext = java.lang.reflect.AnnotatedElement . T ( PersistenceContext .class ) ; PersistenceUnit org.springframework.orm.jpa.support.PersistenceUnit = java.lang.reflect.AnnotatedElement . T ( PersistenceUnit .class ) ; java.lang.Class<?> < ? > java.lang.Class<?> = EntityManager .class ; if ( org.springframework.orm.jpa.support.PersistenceContext != null ) { if ( org.springframework.orm.jpa.support.PersistenceUnit != null ) { throw new java.lang.IllegalStateException ( STRING + STRING + java.lang.reflect.Member ) ; } java.util.Properties java.util.Properties = null ; PersistenceProperty [] org.springframework.orm.jpa.support.PersistenceProperty[] = org.springframework.orm.jpa.support.PersistenceContext . properties ( ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.orm.jpa.support.PersistenceProperty[] ) ) { java.util.Properties = new java.util.Properties ( ) ; for ( PersistenceProperty org.springframework.orm.jpa.support.PersistenceProperty : org.springframework.orm.jpa.support.PersistenceProperty[] ) { java.util.Properties . java.lang.Object ( org.springframework.orm.jpa.support.PersistenceProperty . name ( ) , org.springframework.orm.jpa.support.PersistenceProperty . value ( ) ) ; } } this . java.lang.String = org.springframework.orm.jpa.support.PersistenceContext . unitName ( ) ; this . org.springframework.orm.jpa.support.PersistenceContextType = org.springframework.orm.jpa.support.PersistenceContext . type ( ) ; this . boolean = SynchronizationType . SYNCHRONIZED . equals ( org.springframework.orm.jpa.support.PersistenceContext . synchronization ( ) ) ; this . java.util.Properties = java.util.Properties ; } else { java.lang.Class<?> = EntityManagerFactory .class ; this . java.lang.String = org.springframework.orm.jpa.support.PersistenceUnit . unitName ( ) ; } checkResourceType ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { if ( this . org.springframework.orm.jpa.support.PersistenceContextType != null ) { return ( this . org.springframework.orm.jpa.support.PersistenceContextType == PersistenceContextType . EXTENDED ? org.springframework.orm.jpa.support.EntityManager ( java.lang.Object , java.lang.String ) : org.springframework.orm.jpa.support.EntityManager ( java.lang.String ) ) ; } else { return org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.orm.jpa.support.EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory ( java.lang.String java.lang.String ) { EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory = org.springframework.orm.jpa.support.EntityManagerFactory ( this . java.lang.String ) ; if ( org.springframework.orm.jpa.support.EntityManagerFactory == null ) { org.springframework.orm.jpa.support.EntityManagerFactory = org.springframework.orm.jpa.support.EntityManagerFactory ( this . java.lang.String , java.lang.String ) ; } return org.springframework.orm.jpa.support.EntityManagerFactory ; }  <METHOD_END>
<METHOD_START> private org.springframework.orm.jpa.support.EntityManager org.springframework.orm.jpa.support.EntityManager ( java.lang.String java.lang.String ) { EntityManager org.springframework.orm.jpa.support.EntityManager = org.springframework.orm.jpa.support.EntityManager ( this . java.lang.String , false ) ; if ( org.springframework.orm.jpa.support.EntityManager == null ) { EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory = org.springframework.orm.jpa.support.EntityManagerFactory ( this . java.lang.String ) ; if ( org.springframework.orm.jpa.support.EntityManagerFactory == null ) { org.springframework.orm.jpa.support.EntityManagerFactory = org.springframework.orm.jpa.support.EntityManagerFactory ( this . java.lang.String , java.lang.String ) ; } if ( org.springframework.orm.jpa.support.EntityManagerFactory instanceof EntityManagerFactoryInfo && ( ( EntityManagerFactoryInfo ) org.springframework.orm.jpa.support.EntityManagerFactory ) . getEntityManagerInterface ( ) != null ) { org.springframework.orm.jpa.support.EntityManager = SharedEntityManagerCreator . createSharedEntityManager ( org.springframework.orm.jpa.support.EntityManagerFactory , this . java.util.Properties , this . boolean ) ; } else { org.springframework.orm.jpa.support.EntityManager = SharedEntityManagerCreator . createSharedEntityManager ( org.springframework.orm.jpa.support.EntityManagerFactory , this . java.util.Properties , this . boolean , getResourceType ( ) ) ; } } return org.springframework.orm.jpa.support.EntityManager ; }  <METHOD_END>
<METHOD_START> private org.springframework.orm.jpa.support.EntityManager org.springframework.orm.jpa.support.EntityManager ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { EntityManager org.springframework.orm.jpa.support.EntityManager = org.springframework.orm.jpa.support.EntityManager ( this . java.lang.String , true ) ; if ( org.springframework.orm.jpa.support.EntityManager == null ) { EntityManagerFactory org.springframework.orm.jpa.support.EntityManagerFactory = org.springframework.orm.jpa.support.EntityManagerFactory ( this . java.lang.String ) ; if ( org.springframework.orm.jpa.support.EntityManagerFactory == null ) { org.springframework.orm.jpa.support.EntityManagerFactory = org.springframework.orm.jpa.support.EntityManagerFactory ( this . java.lang.String , java.lang.String ) ; } org.springframework.orm.jpa.support.EntityManager = ExtendedEntityManagerCreator . createContainerManagedEntityManager ( org.springframework.orm.jpa.support.EntityManagerFactory , this . java.util.Properties , this . boolean ) ; } if ( org.springframework.orm.jpa.support.EntityManager instanceof EntityManagerProxy && org.springframework.orm.jpa.support.ListableBeanFactory != null && org.springframework.orm.jpa.support.ListableBeanFactory . containsBean ( java.lang.String ) && ! org.springframework.orm.jpa.support.ListableBeanFactory . isPrototype ( java.lang.String ) ) { java.util.Map<java.lang.Object,org.springframework.orm.jpa.support.EntityManager> . put ( java.lang.Object , ( ( EntityManagerProxy ) org.springframework.orm.jpa.support.EntityManager ) . getTargetEntityManager ( ) ) ; } return org.springframework.orm.jpa.support.EntityManager ; }  <METHOD_END>