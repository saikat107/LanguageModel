<METHOD_START> private void ( DefaultListableBeanFactory org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory ) { this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory = org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory ; }  <METHOD_END>
<METHOD_START> static org.springframework.boot.autoconfigure.condition.BeanTypeRegistry org.springframework.boot.autoconfigure.condition.BeanTypeRegistry ( ListableBeanFactory org.springframework.boot.autoconfigure.condition.ListableBeanFactory ) { Assert . isInstanceOf ( DefaultListableBeanFactory .class , org.springframework.boot.autoconfigure.condition.ListableBeanFactory ) ; DefaultListableBeanFactory org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory = ( DefaultListableBeanFactory ) org.springframework.boot.autoconfigure.condition.ListableBeanFactory ; Assert . isTrue ( org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . isAllowEagerClassLoading ( ) , STRING ) ; if ( ! org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . containsLocalBean ( java.lang.String ) ) { BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition = new RootBeanDefinition ( org.springframework.boot.autoconfigure.condition.BeanTypeRegistry .class ) ; org.springframework.boot.autoconfigure.condition.BeanDefinition . getConstructorArgumentValues ( ) . addIndexedArgumentValue ( NUMBER , org.springframework.boot.autoconfigure.condition.ListableBeanFactory ) ; org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . registerBeanDefinition ( java.lang.String , org.springframework.boot.autoconfigure.condition.BeanDefinition ) ; } return org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . getBean ( java.lang.String , org.springframework.boot.autoconfigure.condition.BeanTypeRegistry .class ) ; }  <METHOD_END>
<METHOD_START> java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { void ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > java.util.Map.Entry<java.lang.String,java.lang.Class<?>> : this . java.util.Map<java.lang.String,java.lang.Class<?>> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Class<?>>> ( ) ) { if ( java.util.Map.Entry<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( ) != null && java.lang.Class<> . boolean ( java.util.Map.Entry<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( ) ) ) { java.util.Set<java.lang.String> . boolean ( java.util.Map.Entry<java.lang.String,java.lang.Class<?>> . java.lang.String ( ) ) ; } } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { void ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > java.util.Map.Entry<java.lang.String,java.lang.Class<?>> : this . java.util.Map<java.lang.String,java.lang.Class<?>> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Class<?>>> ( ) ) { if ( java.util.Map.Entry<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( ) != null && AnnotationUtils . findAnnotation ( java.util.Map.Entry<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( ) , java.lang.Class<> ) != null ) { java.util.Set<java.lang.String> . boolean ( java.util.Map.Entry<java.lang.String,java.lang.Class<?>> . java.lang.String ( ) ) ; } } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . java.util.Map<java.lang.String,java.lang.Class<?>> . void ( ) ; this . int = NUMBER ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { if ( this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . containsSingleton ( java.lang.String ) ) { this . java.util.Map<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( java.lang.String , this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . getType ( java.lang.String ) ) ; } else if ( ! this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . isAlias ( java.lang.String ) ) { void ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { try { java.lang.String java.lang.String = BeanFactory . FACTORY_BEAN_PREFIX + java.lang.String ; RootBeanDefinition org.springframework.boot.autoconfigure.condition.RootBeanDefinition = ( RootBeanDefinition ) this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . getMergedBeanDefinition ( java.lang.String ) ; if ( ! org.springframework.boot.autoconfigure.condition.RootBeanDefinition . isAbstract ( ) && ! boolean ( org.springframework.boot.autoconfigure.condition.RootBeanDefinition . getFactoryBeanName ( ) ) ) { if ( this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . isFactoryBean ( java.lang.String ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory , org.springframework.boot.autoconfigure.condition.RootBeanDefinition , java.lang.String ) ; this . java.util.Map<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( java.lang.String , java.lang.Class<> ) ; this . java.util.Map<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( java.lang.String , this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . getType ( java.lang.String ) ) ; } else { this . java.util.Map<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( java.lang.String , this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . getType ( java.lang.String ) ) ; } } } catch ( CannotLoadBeanClassException org.springframework.boot.autoconfigure.condition.CannotLoadBeanClassException ) { void ( STRING , java.lang.String , org.springframework.boot.autoconfigure.condition.CannotLoadBeanClassException ) ; } catch ( BeanDefinitionStoreException org.springframework.boot.autoconfigure.condition.BeanDefinitionStoreException ) { void ( STRING , java.lang.String , org.springframework.boot.autoconfigure.condition.BeanDefinitionStoreException ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.Exception java.lang.Exception ) { if ( org.springframework.boot.autoconfigure.condition.Log . isDebugEnabled ( ) ) { org.springframework.boot.autoconfigure.condition.Log . debug ( STRING + java.lang.String + STRING + java.lang.String + STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { return ( java.lang.String != null && this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . isFactoryBean ( java.lang.String ) && ! this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . containsSingleton ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( this . int != this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . getBeanDefinitionCount ( ) ) { java.util.Iterator<java.lang.String> < java.lang.String > java.util.Iterator<java.lang.String> = this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . getBeanNamesIterator ( ) ; while ( java.util.Iterator<java.lang.String> . boolean ( ) ) { java.lang.String java.lang.String = java.util.Iterator<java.lang.String> . java.lang.String ( ) ; if ( ! this . java.util.Map<java.lang.String,java.lang.Class<?>> . boolean ( java.lang.String ) ) { void ( java.lang.String ) ; } } this . int = this . org.springframework.boot.autoconfigure.condition.DefaultListableBeanFactory . getBeanDefinitionCount ( ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( ConfigurableListableBeanFactory org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.String java.lang.String ) { try { return java.lang.Class<?> ( org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.String ) ; } catch ( java.lang.Exception java.lang.Exception ) { return null ; } }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( ConfigurableListableBeanFactory org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.String java.lang.String )					throws java.lang.Exception , java.lang.ClassNotFoundException , java.lang.LinkageError { if ( StringUtils . hasLength ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getFactoryBeanName ( ) ) && StringUtils . hasLength ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getFactoryMethodName ( ) ) ) { return java.lang.Class<?> ( org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.String ) ; } if ( StringUtils . hasLength ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getBeanClassName ( ) ) ) { return java.lang.Class<?> ( org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.String ) ; } return null ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( ConfigurableListableBeanFactory org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = java.lang.reflect.Method ( org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , org.springframework.boot.autoconfigure.condition.BeanDefinition ) ; java.lang.Class<?> < ? > java.lang.Class<?> = ResolvableType . forMethodReturnType ( java.lang.reflect.Method ) . as ( FactoryBean .class ) . resolveGeneric ( ) ; if ( ( java.lang.Class<> == null || java.lang.Class<> . boolean ( java.lang.Object .class ) ) && org.springframework.boot.autoconfigure.condition.BeanDefinition . hasAttribute ( java.lang.String ) ) { java.lang.Class<?> = java.lang.Class<?> ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getAttribute ( java.lang.String ) ) ; } return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> private java.lang.reflect.Method java.lang.reflect.Method ( ConfigurableListableBeanFactory org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition ) throws java.lang.Exception { if ( org.springframework.boot.autoconfigure.condition.BeanDefinition instanceof AnnotatedBeanDefinition ) { MethodMetadata org.springframework.boot.autoconfigure.condition.MethodMetadata = ( ( AnnotatedBeanDefinition ) org.springframework.boot.autoconfigure.condition.BeanDefinition ) . getFactoryMethodMetadata ( ) ; if ( org.springframework.boot.autoconfigure.condition.MethodMetadata instanceof StandardMethodMetadata ) { return ( ( StandardMethodMetadata ) org.springframework.boot.autoconfigure.condition.MethodMetadata ) . getIntrospectedMethod ( ) ; } } BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition = org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory . getBeanDefinition ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getFactoryBeanName ( ) ) ; java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . forName ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getBeanClassName ( ) , org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory . getBeanClassLoader ( ) ) ; return java.lang.reflect.Method ( org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> private java.lang.reflect.Method java.lang.reflect.Method ( BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.reflect.Method java.lang.reflect.Method = null ; for ( java.lang.reflect.Method java.lang.reflect.Method : java.lang.reflect.Method[] ( org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.Class<> ) ) { if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getFactoryMethodName ( ) ) ) { if ( java.lang.reflect.Method == null ) { java.lang.reflect.Method = java.lang.reflect.Method ; } else if ( ! boolean ( java.lang.reflect.Method , java.lang.reflect.Method ) ) { return null ; } } } return java.lang.reflect.Method ; }  <METHOD_END>
<METHOD_START> private java.lang.reflect.Method [] java.lang.reflect.Method[] ( BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.Class<?> < ? > java.lang.Class<?> ) { return boolean ( org.springframework.boot.autoconfigure.condition.BeanDefinition ) ? ReflectionUtils . getAllDeclaredMethods ( java.lang.Class<> ) : java.lang.Class<> . java.lang.reflect.Method[] ( ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition ) { return ( org.springframework.boot.autoconfigure.condition.BeanDefinition instanceof AbstractBeanDefinition ) && ( ( AbstractBeanDefinition ) org.springframework.boot.autoconfigure.condition.BeanDefinition ) . isNonPublicAccessAllowed ( ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.reflect.Method java.lang.reflect.Method ) { return java.util.Arrays . boolean ( java.lang.reflect.Method . java.lang.Class<?>[] ( ) , java.lang.reflect.Method . java.lang.Class<?>[] ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( ConfigurableListableBeanFactory org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory , BeanDefinition org.springframework.boot.autoconfigure.condition.BeanDefinition , java.lang.String java.lang.String ) throws java.lang.ClassNotFoundException , java.lang.LinkageError { java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . forName ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getBeanClassName ( ) , org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory . getBeanClassLoader ( ) ) ; java.lang.Class<?> < ? > java.lang.Class<?> = ResolvableType . forClass ( java.lang.Class<> ) . as ( FactoryBean .class ) . resolveGeneric ( ) ; if ( ( java.lang.Class<> == null || java.lang.Class<> . boolean ( java.lang.Object .class ) ) && org.springframework.boot.autoconfigure.condition.BeanDefinition . hasAttribute ( java.lang.String ) ) { java.lang.Class<?> = java.lang.Class<?> ( org.springframework.boot.autoconfigure.condition.BeanDefinition . getAttribute ( java.lang.String ) ) ; } return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Object java.lang.Object )			throws java.lang.ClassNotFoundException , java.lang.LinkageError { if ( java.lang.Object instanceof java.lang.Class<?> < ? > ) { return ( java.lang.Class<?> < ? > ) java.lang.Object ; } if ( java.lang.Object instanceof java.lang.String ) { return ClassUtils . forName ( ( java.lang.String ) java.lang.Object , null ) ; } return null ; }  <METHOD_END>