<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void ( ) { this . java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> . boolean ( Autowired .class ) ; this . java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> . boolean ( Value .class ) ; try { this . java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> . boolean ( ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > ) ClassUtils . forName ( STRING , org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor .class . java.lang.ClassLoader ( ) ) ) ; org.springframework.beans.factory.annotation.Log . info ( STRING ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> . void ( ) ; this . java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> . boolean ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > > java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> ) { Assert . notEmpty ( java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> , STRING ) ; this . java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> . void ( ) ; this . java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> . boolean ( java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.beans.factory.annotation.BeanFactory ) { if ( ! ( org.springframework.beans.factory.annotation.BeanFactory instanceof ConfigurableListableBeanFactory ) ) { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.beans.factory.annotation.BeanFactory ) ; } this . org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory = ( ConfigurableListableBeanFactory ) org.springframework.beans.factory.annotation.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( RootBeanDefinition org.springframework.beans.factory.annotation.RootBeanDefinition , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { if ( java.lang.Class<> != null ) { InjectionMetadata org.springframework.beans.factory.annotation.InjectionMetadata = org.springframework.beans.factory.annotation.InjectionMetadata ( java.lang.String , java.lang.Class<> , null ) ; org.springframework.beans.factory.annotation.InjectionMetadata . checkConfigMembers ( org.springframework.beans.factory.annotation.RootBeanDefinition ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.reflect.Constructor<?> < ? > [] java.lang.reflect.Constructor<?>[] ( java.lang.Class<?> < ? > java.lang.Class<?> , final java.lang.String java.lang.String )			throws org.springframework.beans.factory.annotation.BeanCreationException { if ( ! this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ) { try { ReflectionUtils . doWithMethods ( java.lang.Class<> , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { Lookup org.springframework.beans.factory.annotation.Lookup = java.lang.reflect.Method . T ( Lookup .class ) ; if ( org.springframework.beans.factory.annotation.Lookup != null ) { LookupOverride org.springframework.beans.factory.annotation.LookupOverride = new LookupOverride ( java.lang.reflect.Method , org.springframework.beans.factory.annotation.Lookup . value ( ) ) ; try { RootBeanDefinition org.springframework.beans.factory.annotation.RootBeanDefinition = ( RootBeanDefinition ) org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . getMergedBeanDefinition ( java.lang.String ) ; org.springframework.beans.factory.annotation.RootBeanDefinition . getMethodOverrides ( ) . addOverride ( org.springframework.beans.factory.annotation.LookupOverride ) ; } catch ( NoSuchBeanDefinitionException org.springframework.beans.factory.annotation.NoSuchBeanDefinitionException ) { throw new BeanCreationException ( java.lang.String , STRING ) ; } } } } ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { throw new BeanCreationException ( java.lang.String , STRING , java.lang.IllegalStateException ) ; } this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } java.lang.reflect.Constructor<?> < ? > [] java.lang.reflect.Constructor<?>[] = this . java.util.Map<java.lang.Class<?>,java.lang.reflect.Constructor<?>[]> . java.lang.reflect.Constructor<?>[] ( java.lang.Class<> ) ; if ( java.lang.reflect.Constructor<?>[] == null ) { synchronized ( this . java.util.Map<java.lang.Class<?>,java.lang.reflect.Constructor<?>[]> ) { java.lang.reflect.Constructor<?>[] = this . java.util.Map<java.lang.Class<?>,java.lang.reflect.Constructor<?>[]> . java.lang.reflect.Constructor<?>[] ( java.lang.Class<> ) ; if ( java.lang.reflect.Constructor<?>[] == null ) { java.lang.reflect.Constructor<?> < ? > [] java.lang.reflect.Constructor<?>[] ; try { java.lang.reflect.Constructor<?>[] = java.lang.Class<> . java.lang.reflect.Constructor<?>[] ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new BeanCreationException ( java.lang.String , STRING + java.lang.Class<> . java.lang.String ( ) + STRING + java.lang.Class<> . java.lang.ClassLoader ( ) + STRING , java.lang.Throwable ) ; } java.util.List<java.lang.reflect.Constructor<?>> < java.lang.reflect.Constructor<?> < ? > > java.util.List<java.lang.reflect.Constructor<?>> = new java.util.ArrayList<java.lang.reflect.Constructor<?>> < java.lang.reflect.Constructor<?> < ? > > ( java.lang.reflect.Constructor<?>[] . int ) ; java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> = null ; java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> = null ; for ( java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> : java.lang.reflect.Constructor<?>[] ) { AnnotationAttributes org.springframework.beans.factory.annotation.AnnotationAttributes = org.springframework.beans.factory.annotation.AnnotationAttributes ( java.lang.reflect.Constructor<> ) ; if ( org.springframework.beans.factory.annotation.AnnotationAttributes == null ) { java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . getUserClass ( java.lang.Class<> ) ; if ( java.lang.Class<> != java.lang.Class<> ) { try { java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> = java.lang.Class<> . java.lang.reflect.Constructor<> ( java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) ) ; org.springframework.beans.factory.annotation.AnnotationAttributes = org.springframework.beans.factory.annotation.AnnotationAttributes ( java.lang.reflect.Constructor<> ) ; } catch ( java.lang.NoSuchMethodException java.lang.NoSuchMethodException ) { } } } if ( org.springframework.beans.factory.annotation.AnnotationAttributes != null ) { if ( java.lang.reflect.Constructor<> != null ) { throw new BeanCreationException ( java.lang.String , STRING + java.lang.reflect.Constructor<> + STRING + java.lang.reflect.Constructor<> ) ; } boolean boolean = boolean ( org.springframework.beans.factory.annotation.AnnotationAttributes ) ; if ( boolean ) { if ( ! java.util.List<java.lang.reflect.Constructor<?>> . boolean ( ) ) { throw new BeanCreationException ( java.lang.String , STRING + java.util.List<java.lang.reflect.Constructor<?>> + STRING + java.lang.reflect.Constructor<> ) ; } java.lang.reflect.Constructor<?> = java.lang.reflect.Constructor<> ; } java.util.List<java.lang.reflect.Constructor<?>> . boolean ( java.lang.reflect.Constructor<> ) ; } else if ( java.lang.reflect.Constructor<> . int ( ) == NUMBER ) { java.lang.reflect.Constructor<?> = java.lang.reflect.Constructor<> ; } } if ( ! java.util.List<java.lang.reflect.Constructor<?>> . boolean ( ) ) { if ( java.lang.reflect.Constructor<> == null ) { if ( java.lang.reflect.Constructor<> != null ) { java.util.List<java.lang.reflect.Constructor<?>> . boolean ( java.lang.reflect.Constructor<> ) ; } else if ( java.util.List<java.lang.reflect.Constructor<?>> . int ( ) == NUMBER && org.springframework.beans.factory.annotation.Log . isWarnEnabled ( ) ) { org.springframework.beans.factory.annotation.Log . warn ( STRING + java.lang.String + STRING + STRING + STRING + java.util.List<java.lang.reflect.Constructor<?>> . java.lang.reflect.Constructor<?> ( NUMBER ) ) ; } } java.lang.reflect.Constructor<?>[] = java.util.List<java.lang.reflect.Constructor<?>> . java.lang.reflect.Constructor<?>[] ( new java.lang.reflect.Constructor<?> < ? > [ java.util.List<java.lang.reflect.Constructor<?>> . int ( ) ] ) ; } else if ( java.lang.reflect.Constructor<?>[] . int == NUMBER && java.lang.reflect.Constructor<?>[] [ NUMBER ] . int ( ) > NUMBER ) { java.lang.reflect.Constructor<?>[] = new java.lang.reflect.Constructor<?> < ? > [] { java.lang.reflect.Constructor<?>[] [ NUMBER ] } ; } else { java.lang.reflect.Constructor<?>[] = new java.lang.reflect.Constructor<?> < ? > [ NUMBER ] ; } this . java.util.Map<java.lang.Class<?>,java.lang.reflect.Constructor<?>[]> . java.lang.reflect.Constructor<?>[] ( java.lang.Class<> , java.lang.reflect.Constructor<?>[] ) ; } } } return ( java.lang.reflect.Constructor<?>[] . int > NUMBER ? java.lang.reflect.Constructor<?>[] : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { Lookup org.springframework.beans.factory.annotation.Lookup = java.lang.reflect.Method . T ( Lookup .class ) ; if ( org.springframework.beans.factory.annotation.Lookup != null ) { LookupOverride org.springframework.beans.factory.annotation.LookupOverride = new LookupOverride ( java.lang.reflect.Method , org.springframework.beans.factory.annotation.Lookup . value ( ) ) ; try { RootBeanDefinition org.springframework.beans.factory.annotation.RootBeanDefinition = ( RootBeanDefinition ) org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . getMergedBeanDefinition ( java.lang.String ) ; org.springframework.beans.factory.annotation.RootBeanDefinition . getMethodOverrides ( ) . addOverride ( org.springframework.beans.factory.annotation.LookupOverride ) ; } catch ( NoSuchBeanDefinitionException org.springframework.beans.factory.annotation.NoSuchBeanDefinitionException ) { throw new BeanCreationException ( java.lang.String , STRING ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.beans.factory.annotation.PropertyValues org.springframework.beans.factory.annotation.PropertyValues ( PropertyValues org.springframework.beans.factory.annotation.PropertyValues , java.beans.PropertyDescriptor [] java.beans.PropertyDescriptor[] , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.beans.factory.annotation.BeanCreationException { InjectionMetadata org.springframework.beans.factory.annotation.InjectionMetadata = org.springframework.beans.factory.annotation.InjectionMetadata ( java.lang.String , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , org.springframework.beans.factory.annotation.PropertyValues ) ; try { org.springframework.beans.factory.annotation.InjectionMetadata . inject ( java.lang.Object , java.lang.String , org.springframework.beans.factory.annotation.PropertyValues ) ; } catch ( BeanCreationException org.springframework.beans.factory.annotation.BeanCreationException ) { throw org.springframework.beans.factory.annotation.BeanCreationException ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new BeanCreationException ( java.lang.String , STRING , java.lang.Throwable ) ; } return org.springframework.beans.factory.annotation.PropertyValues ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) throws org.springframework.beans.factory.annotation.BeanCreationException { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; InjectionMetadata org.springframework.beans.factory.annotation.InjectionMetadata = org.springframework.beans.factory.annotation.InjectionMetadata ( java.lang.Class<> . java.lang.String ( ) , java.lang.Class<> , null ) ; try { org.springframework.beans.factory.annotation.InjectionMetadata . inject ( java.lang.Object , null , null ) ; } catch ( BeanCreationException org.springframework.beans.factory.annotation.BeanCreationException ) { throw org.springframework.beans.factory.annotation.BeanCreationException ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new BeanCreationException ( STRING + java.lang.Class<> + STRING , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.beans.factory.annotation.InjectionMetadata org.springframework.beans.factory.annotation.InjectionMetadata ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> , PropertyValues org.springframework.beans.factory.annotation.PropertyValues ) { java.lang.String java.lang.String = ( StringUtils . hasLength ( java.lang.String ) ? java.lang.String : java.lang.Class<> . java.lang.String ( ) ) ; InjectionMetadata org.springframework.beans.factory.annotation.InjectionMetadata = this . java.util.Map<java.lang.String,org.springframework.beans.factory.annotation.InjectionMetadata> . get ( java.lang.String ) ; if ( InjectionMetadata . needsRefresh ( org.springframework.beans.factory.annotation.InjectionMetadata , java.lang.Class<> ) ) { synchronized ( this . java.util.Map<java.lang.String,org.springframework.beans.factory.annotation.InjectionMetadata> ) { org.springframework.beans.factory.annotation.InjectionMetadata = this . java.util.Map<java.lang.String,org.springframework.beans.factory.annotation.InjectionMetadata> . get ( java.lang.String ) ; if ( InjectionMetadata . needsRefresh ( org.springframework.beans.factory.annotation.InjectionMetadata , java.lang.Class<> ) ) { if ( org.springframework.beans.factory.annotation.InjectionMetadata != null ) { org.springframework.beans.factory.annotation.InjectionMetadata . clear ( org.springframework.beans.factory.annotation.PropertyValues ) ; } org.springframework.beans.factory.annotation.InjectionMetadata = org.springframework.beans.factory.annotation.InjectionMetadata ( java.lang.Class<> ) ; this . java.util.Map<java.lang.String,org.springframework.beans.factory.annotation.InjectionMetadata> . put ( java.lang.String , org.springframework.beans.factory.annotation.InjectionMetadata ) ; } } } return org.springframework.beans.factory.annotation.InjectionMetadata ; }  <METHOD_END>
<METHOD_START> private org.springframework.beans.factory.annotation.InjectionMetadata org.springframework.beans.factory.annotation.InjectionMetadata ( final java.lang.Class<?> < ? > java.lang.Class<?> ) { java.util.LinkedList<InjectionMetadata.InjectedElement> < InjectionMetadata . InjectionMetadata > java.util.LinkedList<InjectionMetadata.InjectedElement> = new java.util.LinkedList<InjectionMetadata.InjectedElement> <> ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<> ; do { final java.util.LinkedList<InjectionMetadata.InjectedElement> < InjectionMetadata . InjectionMetadata > java.util.LinkedList<InjectionMetadata.InjectedElement> = new java.util.LinkedList<InjectionMetadata.InjectedElement> <> ( ) ; ReflectionUtils . doWithLocalFields ( java.lang.Class<> , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public void void ( java.lang.reflect.Field java.lang.reflect.Field ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { AnnotationAttributes org.springframework.beans.factory.annotation.AnnotationAttributes = org.springframework.beans.factory.annotation.AnnotationAttributes ( java.lang.reflect.Field ) ; if ( org.springframework.beans.factory.annotation.AnnotationAttributes != null ) { if ( java.lang.reflect.Modifier . boolean ( java.lang.reflect.Field . int ( ) ) ) { if ( org.springframework.beans.factory.annotation.Log . isWarnEnabled ( ) ) { org.springframework.beans.factory.annotation.Log . warn ( STRING + java.lang.reflect.Field ) ; } return; } boolean boolean = boolean ( org.springframework.beans.factory.annotation.AnnotationAttributes ) ; java.util.LinkedList<InjectionMetadata.InjectedElement> . add ( new org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.AutowiredFieldElement ( java.lang.reflect.Field , boolean ) ) ; } } } ) ; ReflectionUtils . doWithLocalMethods ( java.lang.Class<> , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { java.lang.reflect.Method java.lang.reflect.Method = BridgeMethodResolver . findBridgedMethod ( java.lang.reflect.Method ) ; if ( ! BridgeMethodResolver . isVisibilityBridgeMethodPair ( java.lang.reflect.Method , java.lang.reflect.Method ) ) { return; } AnnotationAttributes org.springframework.beans.factory.annotation.AnnotationAttributes = org.springframework.beans.factory.annotation.AnnotationAttributes ( java.lang.reflect.Method ) ; if ( org.springframework.beans.factory.annotation.AnnotationAttributes != null && java.lang.reflect.Method . boolean ( ClassUtils . getMostSpecificMethod ( java.lang.reflect.Method , java.lang.Class<> ) ) ) { if ( java.lang.reflect.Modifier . boolean ( java.lang.reflect.Method . int ( ) ) ) { if ( org.springframework.beans.factory.annotation.Log . isWarnEnabled ( ) ) { org.springframework.beans.factory.annotation.Log . warn ( STRING + java.lang.reflect.Method ) ; } return; } if ( java.lang.reflect.Method . int ( ) == NUMBER ) { if ( org.springframework.beans.factory.annotation.Log . isWarnEnabled ( ) ) { org.springframework.beans.factory.annotation.Log . warn ( STRING + java.lang.reflect.Method ) ; } } boolean boolean = boolean ( org.springframework.beans.factory.annotation.AnnotationAttributes ) ; java.beans.PropertyDescriptor java.beans.PropertyDescriptor = BeanUtils . findPropertyForMethod ( java.lang.reflect.Method , java.lang.Class<> ) ; java.util.LinkedList<InjectionMetadata.InjectedElement> . add ( new org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.AutowiredMethodElement ( java.lang.reflect.Method , boolean , java.beans.PropertyDescriptor ) ) ; } } } ) ; java.util.LinkedList<InjectionMetadata.InjectedElement> . addAll ( NUMBER , java.util.LinkedList<InjectionMetadata.InjectedElement> ) ; java.lang.Class<?> = java.lang.Class<> . java.lang.Class<? super > ( ) ; } while ( java.lang.Class<> != null && java.lang.Class<> != java.lang.Object .class ); return new InjectionMetadata ( java.lang.Class<> , java.util.LinkedList<InjectionMetadata.InjectedElement> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Field java.lang.reflect.Field ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { AnnotationAttributes org.springframework.beans.factory.annotation.AnnotationAttributes = org.springframework.beans.factory.annotation.AnnotationAttributes ( java.lang.reflect.Field ) ; if ( org.springframework.beans.factory.annotation.AnnotationAttributes != null ) { if ( java.lang.reflect.Modifier . boolean ( java.lang.reflect.Field . int ( ) ) ) { if ( org.springframework.beans.factory.annotation.Log . isWarnEnabled ( ) ) { org.springframework.beans.factory.annotation.Log . warn ( STRING + java.lang.reflect.Field ) ; } return; } boolean boolean = boolean ( org.springframework.beans.factory.annotation.AnnotationAttributes ) ; java.util.LinkedList<InjectionMetadata.InjectedElement> . add ( new org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.AutowiredFieldElement ( java.lang.reflect.Field , boolean ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { java.lang.reflect.Method java.lang.reflect.Method = BridgeMethodResolver . findBridgedMethod ( java.lang.reflect.Method ) ; if ( ! BridgeMethodResolver . isVisibilityBridgeMethodPair ( java.lang.reflect.Method , java.lang.reflect.Method ) ) { return; } AnnotationAttributes org.springframework.beans.factory.annotation.AnnotationAttributes = org.springframework.beans.factory.annotation.AnnotationAttributes ( java.lang.reflect.Method ) ; if ( org.springframework.beans.factory.annotation.AnnotationAttributes != null && java.lang.reflect.Method . boolean ( ClassUtils . getMostSpecificMethod ( java.lang.reflect.Method , java.lang.Class<> ) ) ) { if ( java.lang.reflect.Modifier . boolean ( java.lang.reflect.Method . int ( ) ) ) { if ( org.springframework.beans.factory.annotation.Log . isWarnEnabled ( ) ) { org.springframework.beans.factory.annotation.Log . warn ( STRING + java.lang.reflect.Method ) ; } return; } if ( java.lang.reflect.Method . int ( ) == NUMBER ) { if ( org.springframework.beans.factory.annotation.Log . isWarnEnabled ( ) ) { org.springframework.beans.factory.annotation.Log . warn ( STRING + java.lang.reflect.Method ) ; } } boolean boolean = boolean ( org.springframework.beans.factory.annotation.AnnotationAttributes ) ; java.beans.PropertyDescriptor java.beans.PropertyDescriptor = BeanUtils . findPropertyForMethod ( java.lang.reflect.Method , java.lang.Class<> ) ; java.util.LinkedList<InjectionMetadata.InjectedElement> . add ( new org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.AutowiredMethodElement ( java.lang.reflect.Method , boolean , java.beans.PropertyDescriptor ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.beans.factory.annotation.AnnotationAttributes org.springframework.beans.factory.annotation.AnnotationAttributes ( java.lang.reflect.AccessibleObject java.lang.reflect.AccessibleObject ) { if ( java.lang.reflect.AccessibleObject . java.lang.annotation.Annotation[] ( ) . int > NUMBER ) { for ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> : this . java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> ) { AnnotationAttributes org.springframework.beans.factory.annotation.AnnotationAttributes = AnnotatedElementUtils . getMergedAnnotationAttributes ( java.lang.reflect.AccessibleObject , java.lang.Class<> ) ; if ( org.springframework.beans.factory.annotation.AnnotationAttributes != null ) { return org.springframework.beans.factory.annotation.AnnotationAttributes ; } } } return null ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( AnnotationAttributes org.springframework.beans.factory.annotation.AnnotationAttributes ) { return ( ! org.springframework.beans.factory.annotation.AnnotationAttributes . containsKey ( this . java.lang.String ) || this . boolean == org.springframework.beans.factory.annotation.AnnotationAttributes . getBoolean ( this . java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> protected < T > java.util.Map<java.lang.String,T> < java.lang.String , T > java.util.Map<java.lang.String,T> ( java.lang.Class<T> < T > java.lang.Class<T> ) throws org.springframework.beans.factory.annotation.BeansException { if ( this . org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory == null ) { throw new java.lang.IllegalStateException ( STRING + STRING ) ; } return BeanFactoryUtils . beansOfTypeIncludingAncestors ( this . org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ) { if ( java.lang.String != null ) { for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { if ( this . org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . containsBean ( java.lang.String ) ) { this . org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . registerDependentBean ( java.lang.String , java.lang.String ) ; } if ( org.springframework.beans.factory.annotation.Log . isDebugEnabled ( ) ) { org.springframework.beans.factory.annotation.Log . debug ( STRING + java.lang.String + STRING + java.lang.String + STRING ) ; } } } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof DependencyDescriptor ) { DependencyDescriptor org.springframework.beans.factory.annotation.DependencyDescriptor = ( DependencyDescriptor ) java.lang.Object ; return this . org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . resolveDependency ( org.springframework.beans.factory.annotation.DependencyDescriptor , java.lang.String , null , null ) ; } else { return java.lang.Object ; } }  <METHOD_END>
<METHOD_START> public void ( java.lang.reflect.Field java.lang.reflect.Field , boolean boolean ) { super( java.lang.reflect.Field , null ); this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , PropertyValues org.springframework.beans.factory.annotation.PropertyValues ) throws java.lang.Throwable { java.lang.reflect.Field java.lang.reflect.Field = ( java.lang.reflect.Field ) this . member ; java.lang.Object java.lang.Object ; if ( this . boolean ) { java.lang.Object = java.lang.Object ( java.lang.String , this . java.lang.Object ) ; } else { DependencyDescriptor org.springframework.beans.factory.annotation.DependencyDescriptor = new DependencyDescriptor ( java.lang.reflect.Field , this . boolean ) ; org.springframework.beans.factory.annotation.DependencyDescriptor . setContainingClass ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( NUMBER ) ; TypeConverter org.springframework.beans.factory.annotation.TypeConverter = org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . getTypeConverter ( ) ; try { java.lang.Object = org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . resolveDependency ( org.springframework.beans.factory.annotation.DependencyDescriptor , java.lang.String , java.util.Set<java.lang.String> , org.springframework.beans.factory.annotation.TypeConverter ) ; } catch ( BeansException org.springframework.beans.factory.annotation.BeansException ) { throw new UnsatisfiedDependencyException ( null , java.lang.String , new InjectionPoint ( java.lang.reflect.Field ) , org.springframework.beans.factory.annotation.BeansException ) ; } synchronized ( this ) { if ( ! this . boolean ) { if ( java.lang.Object != null || this . boolean ) { this . java.lang.Object = org.springframework.beans.factory.annotation.DependencyDescriptor ; void ( java.lang.String , java.util.Set<java.lang.String> ) ; if ( java.util.Set<java.lang.String> . int ( ) == NUMBER ) { java.lang.String java.lang.String = java.util.Set<java.lang.String> . java.util.Iterator<java.lang.String> ( ) . java.lang.String ( ) ; if ( org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . containsBean ( java.lang.String ) ) { if ( org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . isTypeMatch ( java.lang.String , java.lang.reflect.Field . java.lang.Class<?> ( ) ) ) { this . java.lang.Object = new org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.ShortcutDependencyDescriptor ( org.springframework.beans.factory.annotation.DependencyDescriptor , java.lang.String , java.lang.reflect.Field . java.lang.Class<?> ( ) ) ; } } } } else { this . java.lang.Object = null ; } this . boolean = true ; } } } if ( java.lang.Object != null ) { ReflectionUtils . makeAccessible ( java.lang.reflect.Field ) ; java.lang.reflect.Field . void ( java.lang.Object , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , boolean boolean , java.beans.PropertyDescriptor java.beans.PropertyDescriptor ) { super( java.lang.reflect.Method , java.beans.PropertyDescriptor ); this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , PropertyValues org.springframework.beans.factory.annotation.PropertyValues ) throws java.lang.Throwable { if ( checkPropertySkipping ( org.springframework.beans.factory.annotation.PropertyValues ) ) { return; } java.lang.reflect.Method java.lang.reflect.Method = ( java.lang.reflect.Method ) this . member ; java.lang.Object [] java.lang.Object[] ; if ( this . boolean ) { java.lang.Object[] = java.lang.Object[] ( java.lang.String ) ; } else { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.reflect.Method . java.lang.Class<?>[] ( ) ; java.lang.Object[] = new java.lang.Object [ java.lang.Class<?>[] . int ] ; DependencyDescriptor [] org.springframework.beans.factory.annotation.DependencyDescriptor[] = new DependencyDescriptor [ java.lang.Class<?>[] . int ] ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( java.lang.Class<?>[] . int ) ; TypeConverter org.springframework.beans.factory.annotation.TypeConverter = org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . getTypeConverter ( ) ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { MethodParameter org.springframework.beans.factory.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , int ) ; DependencyDescriptor org.springframework.beans.factory.annotation.DependencyDescriptor = new DependencyDescriptor ( org.springframework.beans.factory.annotation.MethodParameter , this . boolean ) ; org.springframework.beans.factory.annotation.DependencyDescriptor . setContainingClass ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; org.springframework.beans.factory.annotation.DependencyDescriptor[] [ int ] = org.springframework.beans.factory.annotation.DependencyDescriptor ; try { java.lang.Object java.lang.Object = org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . resolveDependency ( org.springframework.beans.factory.annotation.DependencyDescriptor , java.lang.String , java.util.Set<java.lang.String> , org.springframework.beans.factory.annotation.TypeConverter ) ; if ( java.lang.Object == null && ! this . boolean ) { java.lang.Object[] = null ; break; } java.lang.Object[] [ int ] = java.lang.Object ; } catch ( BeansException org.springframework.beans.factory.annotation.BeansException ) { throw new UnsatisfiedDependencyException ( null , java.lang.String , new InjectionPoint ( org.springframework.beans.factory.annotation.MethodParameter ) , org.springframework.beans.factory.annotation.BeansException ) ; } } synchronized ( this ) { if ( ! this . boolean ) { if ( java.lang.Object[] != null ) { this . java.lang.Object[] = new java.lang.Object [ java.lang.Class<?>[] . int ] ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { this . java.lang.Object[] [ int ] = org.springframework.beans.factory.annotation.DependencyDescriptor[] [ int ] ; } void ( java.lang.String , java.util.Set<java.lang.String> ) ; if ( java.util.Set<java.lang.String> . int ( ) == java.lang.Class<?>[] . int ) { java.util.Iterator<java.lang.String> < java.lang.String > java.util.Iterator<java.lang.String> = java.util.Set<java.lang.String> . java.util.Iterator<java.lang.String> ( ) ; for ( int int = NUMBER ; int < java.lang.Class<?>[] . int ; int ++ ) { java.lang.String java.lang.String = java.util.Iterator<java.lang.String> . java.lang.String ( ) ; if ( org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . containsBean ( java.lang.String ) ) { if ( org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory . isTypeMatch ( java.lang.String , java.lang.Class<?>[] [ int ] ) ) { this . java.lang.Object[] [ int ] = new org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.ShortcutDependencyDescriptor ( org.springframework.beans.factory.annotation.DependencyDescriptor[] [ int ] , java.lang.String , java.lang.Class<?>[] [ int ] ) ; } } } } } else { this . java.lang.Object[] = null ; } this . boolean = true ; } } } if ( java.lang.Object[] != null ) { try { ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; java.lang.reflect.Method . java.lang.Object ( java.lang.Object , java.lang.Object[] ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { throw java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ; } } }  <METHOD_END>
<METHOD_START> private java.lang.Object [] java.lang.Object[] ( java.lang.String java.lang.String ) { if ( this . java.lang.Object[] == null ) { return null ; } java.lang.Object [] java.lang.Object[] = new java.lang.Object [ this . java.lang.Object[] . int ] ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { java.lang.Object[] [ int ] = java.lang.Object ( java.lang.String , this . java.lang.Object[] [ int ] ) ; } return java.lang.Object[] ; }  <METHOD_END>
<METHOD_START> public void ( DependencyDescriptor org.springframework.beans.factory.annotation.DependencyDescriptor , java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { super( org.springframework.beans.factory.annotation.DependencyDescriptor ); this . java.lang.String = java.lang.String ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( BeanFactory org.springframework.beans.factory.annotation.BeanFactory ) { return resolveCandidate ( this . java.lang.String , this . java.lang.Class<> , org.springframework.beans.factory.annotation.BeanFactory ) ; }  <METHOD_END>
