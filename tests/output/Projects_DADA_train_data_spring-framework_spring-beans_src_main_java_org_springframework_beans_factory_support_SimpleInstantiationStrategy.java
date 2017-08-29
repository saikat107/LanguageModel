<METHOD_START> public static java.lang.reflect.Method java.lang.reflect.Method ( ) { return java.lang.ThreadLocal<java.lang.reflect.Method> . java.lang.reflect.Method ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition , java.lang.String java.lang.String , BeanFactory org.springframework.beans.factory.support.BeanFactory ) { if ( org.springframework.beans.factory.support.RootBeanDefinition . getMethodOverrides ( ) . isEmpty ( ) ) { java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ; synchronized ( bd . constructorArgumentLock ) { java.lang.reflect.Constructor<?> = ( java.lang.reflect.Constructor<?> < ? > ) bd . resolvedConstructorOrFactoryMethod ; if ( java.lang.reflect.Constructor<> == null ) { final java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.beans.factory.support.RootBeanDefinition . getBeanClass ( ) ; if ( java.lang.Class<> . boolean ( ) ) { throw new BeanInstantiationException ( java.lang.Class<> , STRING ) ; } try { if ( java.lang.System . java.lang.SecurityManager ( ) != null ) { java.lang.reflect.Constructor<?> = java.security.AccessController . java.lang.reflect.Constructor<?> ( new java.security.PrivilegedExceptionAction<java.lang.reflect.Constructor<?>> < java.lang.reflect.Constructor<?> < ? > > ( ) { @ java.lang.Override public java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ( ) java.lang.Exception { return java.lang.Class<> . java.lang.reflect.Constructor<> ( ( java.lang.Class [] ) null ) ; } } ) ; } else { java.lang.reflect.Constructor<?> = java.lang.Class<> . java.lang.reflect.Constructor<> ( ( java.lang.Class [] ) null ) ; } bd . resolvedConstructorOrFactoryMethod = java.lang.reflect.Constructor<> ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new BeanInstantiationException ( java.lang.Class<> , STRING , java.lang.Throwable ) ; } } } return BeanUtils . instantiateClass ( java.lang.reflect.Constructor<> ) ; } else { return java.lang.Object ( org.springframework.beans.factory.support.RootBeanDefinition , java.lang.String , org.springframework.beans.factory.support.BeanFactory ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ( ) java.lang.Exception { return java.lang.Class<> . java.lang.reflect.Constructor<> ( ( java.lang.Class [] ) null ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition , java.lang.String java.lang.String , BeanFactory org.springframework.beans.factory.support.BeanFactory ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition , java.lang.String java.lang.String , BeanFactory org.springframework.beans.factory.support.BeanFactory , final java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> , java.lang.Object ... java.lang.Object[] ) { if ( org.springframework.beans.factory.support.RootBeanDefinition . getMethodOverrides ( ) . isEmpty ( ) ) { if ( java.lang.System . java.lang.SecurityManager ( ) != null ) { java.security.AccessController . java.lang.Object ( new java.security.PrivilegedAction<java.lang.Object> < java.lang.Object > ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( ) { ReflectionUtils . makeAccessible ( java.lang.reflect.Constructor<> ) ; return null ; } } ) ; } return BeanUtils . instantiateClass ( java.lang.reflect.Constructor<> , java.lang.Object[] ) ; } else { return java.lang.Object ( org.springframework.beans.factory.support.RootBeanDefinition , java.lang.String , org.springframework.beans.factory.support.BeanFactory , java.lang.reflect.Constructor<> , java.lang.Object[] ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { ReflectionUtils . makeAccessible ( java.lang.reflect.Constructor<> ) ; return null ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition , java.lang.String java.lang.String , BeanFactory org.springframework.beans.factory.support.BeanFactory , java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> , java.lang.Object ... java.lang.Object[] ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition , java.lang.String java.lang.String , BeanFactory org.springframework.beans.factory.support.BeanFactory , java.lang.Object java.lang.Object , final java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object ... java.lang.Object[] ) { try { if ( java.lang.System . java.lang.SecurityManager ( ) != null ) { java.security.AccessController . java.lang.Object ( new java.security.PrivilegedAction<java.lang.Object> < java.lang.Object > ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( ) { ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; return null ; } } ) ; } else { ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; } java.lang.reflect.Method java.lang.reflect.Method = java.lang.ThreadLocal<java.lang.reflect.Method> . java.lang.reflect.Method ( ) ; try { java.lang.ThreadLocal<java.lang.reflect.Method> . void ( java.lang.reflect.Method ) ; return java.lang.reflect.Method . java.lang.Object ( java.lang.Object , java.lang.Object[] ) ; } finally { if ( java.lang.reflect.Method != null ) { java.lang.ThreadLocal<java.lang.reflect.Method> . void ( java.lang.reflect.Method ) ; } else { java.lang.ThreadLocal<java.lang.reflect.Method> . void ( ) ; } } } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { throw new BeanInstantiationException ( java.lang.reflect.Method , STRING + java.lang.reflect.Method . java.lang.String ( ) + STRING + STRING + StringUtils . arrayToCommaDelimitedString ( java.lang.Object[] ) , java.lang.IllegalArgumentException ) ; } catch ( java.lang.IllegalAccessException java.lang.IllegalAccessException ) { throw new BeanInstantiationException ( java.lang.reflect.Method , STRING + java.lang.reflect.Method . java.lang.String ( ) + STRING , java.lang.IllegalAccessException ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { java.lang.String java.lang.String = STRING + java.lang.reflect.Method . java.lang.String ( ) + STRING ; if ( org.springframework.beans.factory.support.RootBeanDefinition . getFactoryBeanName ( ) != null && org.springframework.beans.factory.support.BeanFactory instanceof ConfigurableBeanFactory && ( ( ConfigurableBeanFactory ) org.springframework.beans.factory.support.BeanFactory ) . isCurrentlyInCreation ( org.springframework.beans.factory.support.RootBeanDefinition . getFactoryBeanName ( ) ) ) { java.lang.String = STRING + org.springframework.beans.factory.support.RootBeanDefinition . getFactoryBeanName ( ) + STRING + STRING + java.lang.String ; } throw new BeanInstantiationException ( java.lang.reflect.Method , java.lang.String , java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; return null ; }  <METHOD_END>