<METHOD_START> public void void ( javax.management.MBeanServerConnection javax.management.MBeanServerConnection ) { this . javax.management.MBeanServerConnection = javax.management.MBeanServerConnection ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) throws java.net.MalformedURLException { this . javax.management.remote.JMXServiceURL = new javax.management.remote.JMXServiceURL ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { this . java.util.Map<java.lang.String,?> = java.util.Map<java.lang.String,> ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ( ) { return this . java.util.Map<java.lang.String,> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) throws javax.management.MalformedObjectNameException { this . javax.management.ObjectName = ObjectNameManager . getInstance ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> protected final java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return this . java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . javax.management.MBeanServerConnection != null && this . boolean ) { throw new java.lang.IllegalArgumentException ( STRING + STRING ) ; } if ( this . boolean ) { void ( ) ; } }  <METHOD_END>
<METHOD_START> public void void ( ) { synchronized ( this . java.lang.Object ) { if ( this . javax.management.MBeanServerConnection != null ) { this . javax.management.MBeanServerConnection = this . javax.management.MBeanServerConnection ; } else { this . javax.management.MBeanServerConnection = null ; this . javax.management.MBeanServerConnection = this . org.springframework.jmx.access.ConnectorDelegate . connect ( this . javax.management.remote.JMXServiceURL , this . java.util.Map<java.lang.String,> , this . java.lang.String ) ; } this . javax.management.MBeanServerInvocationHandler = null ; if ( this . boolean ) { this . javax.management.MBeanServerInvocationHandler = new javax.management.MBeanServerInvocationHandler ( this . javax.management.MBeanServerConnection , this . javax.management.ObjectName , ( this . java.lang.Class<> != null && javax.management.JMX . boolean ( this . java.lang.Class<> ) ) ) ; } else { void ( ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( ) org.springframework.jmx.access.MBeanInfoRetrievalException { try { javax.management.MBeanInfo javax.management.MBeanInfo = this . javax.management.MBeanServerConnection . javax.management.MBeanInfo ( this . javax.management.ObjectName ) ; javax.management.MBeanAttributeInfo [] javax.management.MBeanAttributeInfo[] = javax.management.MBeanInfo . javax.management.MBeanAttributeInfo[] ( ) ; this . java.util.Map<java.lang.String,javax.management.MBeanAttributeInfo> = new java.util.HashMap<java.lang.String,javax.management.MBeanAttributeInfo> <> ( javax.management.MBeanAttributeInfo[] . int ) ; for ( javax.management.MBeanAttributeInfo javax.management.MBeanAttributeInfo : javax.management.MBeanAttributeInfo[] ) { this . java.util.Map<java.lang.String,javax.management.MBeanAttributeInfo> . javax.management.MBeanAttributeInfo ( javax.management.MBeanAttributeInfo . java.lang.String ( ) , javax.management.MBeanAttributeInfo ) ; } javax.management.MBeanOperationInfo [] javax.management.MBeanOperationInfo[] = javax.management.MBeanInfo . javax.management.MBeanOperationInfo[] ( ) ; this . java.util.Map<org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey,javax.management.MBeanOperationInfo> = new java.util.HashMap<org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey,javax.management.MBeanOperationInfo> <> ( javax.management.MBeanOperationInfo[] . int ) ; for ( javax.management.MBeanOperationInfo javax.management.MBeanOperationInfo : javax.management.MBeanOperationInfo[] ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = JmxUtils . parameterInfoToTypes ( javax.management.MBeanOperationInfo . javax.management.MBeanParameterInfo[] ( ) , this . java.lang.ClassLoader ) ; this . java.util.Map<org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey,javax.management.MBeanOperationInfo> . javax.management.MBeanOperationInfo ( new org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey ( javax.management.MBeanOperationInfo . java.lang.String ( ) , java.lang.Class<?>[] ) , javax.management.MBeanOperationInfo ) ; } } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { throw new MBeanInfoRetrievalException ( STRING , java.lang.ClassNotFoundException ) ; } catch ( javax.management.IntrospectionException javax.management.IntrospectionException ) { throw new MBeanInfoRetrievalException ( STRING + this . javax.management.ObjectName + STRING , javax.management.IntrospectionException ) ; } catch ( javax.management.InstanceNotFoundException javax.management.InstanceNotFoundException ) { throw new MBeanInfoRetrievalException ( STRING + this . javax.management.ObjectName + STRING , javax.management.InstanceNotFoundException ) ; } catch ( javax.management.ReflectionException javax.management.ReflectionException ) { throw new MBeanInfoRetrievalException ( STRING + this . javax.management.ObjectName + STRING , javax.management.ReflectionException ) ; } catch ( java.io.IOException java.io.IOException ) { throw new MBeanInfoRetrievalException ( STRING + STRING + STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { synchronized ( this . java.lang.Object ) { return ( this . javax.management.MBeanServerConnection != null ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.jmx.access.MethodInvocation ) throws java.lang.Throwable { synchronized ( this . java.lang.Object ) { if ( ! boolean ( ) ) { void ( ) ; } } try { return java.lang.Object ( org.springframework.jmx.access.MethodInvocation ) ; } catch ( MBeanConnectFailureException org.springframework.jmx.access.MBeanConnectFailureException ) { return java.lang.Object ( org.springframework.jmx.access.MethodInvocation , org.springframework.jmx.access.MBeanConnectFailureException ) ; } catch ( java.io.IOException java.io.IOException ) { return java.lang.Object ( org.springframework.jmx.access.MethodInvocation , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( MethodInvocation org.springframework.jmx.access.MethodInvocation , java.lang.Exception java.lang.Exception ) throws java.lang.Throwable { if ( this . boolean ) { java.lang.String java.lang.String = STRING ; if ( org.springframework.jmx.access.Log . isDebugEnabled ( ) ) { org.springframework.jmx.access.Log . warn ( java.lang.String , java.lang.Exception ) ; } else if ( org.springframework.jmx.access.Log . isWarnEnabled ( ) ) { org.springframework.jmx.access.Log . warn ( java.lang.String ) ; } void ( ) ; return java.lang.Object ( org.springframework.jmx.access.MethodInvocation ) ; } else { throw java.lang.Exception ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( MethodInvocation org.springframework.jmx.access.MethodInvocation ) throws java.lang.Throwable { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.jmx.access.MethodInvocation . getMethod ( ) ; try { java.lang.Object java.lang.Object = null ; if ( this . javax.management.MBeanServerInvocationHandler != null ) { java.lang.Object = this . javax.management.MBeanServerInvocationHandler . java.lang.Object ( org.springframework.jmx.access.MethodInvocation . getThis ( ) , java.lang.reflect.Method , org.springframework.jmx.access.MethodInvocation . getArguments ( ) ) ; } else { java.beans.PropertyDescriptor java.beans.PropertyDescriptor = BeanUtils . findPropertyForMethod ( java.lang.reflect.Method ) ; if ( java.beans.PropertyDescriptor != null ) { java.lang.Object = java.lang.Object ( java.beans.PropertyDescriptor , org.springframework.jmx.access.MethodInvocation ) ; } else { java.lang.Object = java.lang.Object ( java.lang.reflect.Method , org.springframework.jmx.access.MethodInvocation . getArguments ( ) ) ; } } return java.lang.Object ( java.lang.Object , new MethodParameter ( java.lang.reflect.Method , - NUMBER ) ) ; } catch ( javax.management.MBeanException javax.management.MBeanException ) { throw javax.management.MBeanException . java.lang.Exception ( ) ; } catch ( javax.management.RuntimeMBeanException javax.management.RuntimeMBeanException ) { throw javax.management.RuntimeMBeanException . java.lang.RuntimeException ( ) ; } catch ( javax.management.RuntimeErrorException javax.management.RuntimeErrorException ) { throw javax.management.RuntimeErrorException . java.lang.Error ( ) ; } catch ( javax.management.RuntimeOperationsException javax.management.RuntimeOperationsException ) { java.lang.RuntimeException java.lang.RuntimeException = javax.management.RuntimeOperationsException . java.lang.RuntimeException ( ) ; if ( java.lang.RuntimeException instanceof javax.management.RuntimeMBeanException ) { throw ( ( javax.management.RuntimeMBeanException ) java.lang.RuntimeException ) . java.lang.RuntimeException ( ) ; } else if ( java.lang.RuntimeException instanceof javax.management.RuntimeErrorException ) { throw ( ( javax.management.RuntimeErrorException ) java.lang.RuntimeException ) . java.lang.Error ( ) ; } else { throw java.lang.RuntimeException ; } } catch ( javax.management.OperationsException javax.management.OperationsException ) { if ( ReflectionUtils . declaresException ( java.lang.reflect.Method , javax.management.OperationsException . java.lang.Class<? extends javax.management.OperationsException> ( ) ) ) { throw javax.management.OperationsException ; } else { throw new InvalidInvocationException ( javax.management.OperationsException . java.lang.String ( ) ) ; } } catch ( javax.management.JMException javax.management.JMException ) { if ( ReflectionUtils . declaresException ( java.lang.reflect.Method , javax.management.JMException . java.lang.Class<? extends javax.management.JMException> ( ) ) ) { throw javax.management.JMException ; } else { throw new InvocationFailureException ( STRING , javax.management.JMException ) ; } } catch ( java.io.IOException java.io.IOException ) { if ( ReflectionUtils . declaresException ( java.lang.reflect.Method , java.io.IOException . java.lang.Class<? extends java.io.IOException> ( ) ) ) { throw java.io.IOException ; } else { throw new MBeanConnectFailureException ( STRING , java.io.IOException ) ; } } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.beans.PropertyDescriptor java.beans.PropertyDescriptor , MethodInvocation org.springframework.jmx.access.MethodInvocation )			throws javax.management.JMException , java.io.IOException { java.lang.String java.lang.String = JmxUtils . getAttributeName ( java.beans.PropertyDescriptor , this . boolean ) ; javax.management.MBeanAttributeInfo javax.management.MBeanAttributeInfo = this . java.util.Map<java.lang.String,javax.management.MBeanAttributeInfo> . javax.management.MBeanAttributeInfo ( java.lang.String ) ; if ( javax.management.MBeanAttributeInfo == null ) { throw new InvalidInvocationException ( STRING + java.beans.PropertyDescriptor . java.lang.String ( ) + STRING ) ; } if ( org.springframework.jmx.access.MethodInvocation . getMethod ( ) . equals ( java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) ) ) { if ( javax.management.MBeanAttributeInfo . boolean ( ) ) { return this . javax.management.MBeanServerConnection . java.lang.Object ( this . javax.management.ObjectName , java.lang.String ) ; } else { throw new InvalidInvocationException ( STRING + java.lang.String + STRING ) ; } } else if ( org.springframework.jmx.access.MethodInvocation . getMethod ( ) . equals ( java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) ) ) { if ( javax.management.MBeanAttributeInfo . boolean ( ) ) { this . javax.management.MBeanServerConnection . void ( this . javax.management.ObjectName , new javax.management.Attribute ( java.lang.String , org.springframework.jmx.access.MethodInvocation . getArguments ( ) [ NUMBER ] ) ) ; return null ; } else { throw new InvalidInvocationException ( STRING + java.lang.String + STRING ) ; } } else { throw new java.lang.IllegalStateException ( STRING + org.springframework.jmx.access.MethodInvocation . getMethod ( ) + STRING ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] ) throws javax.management.JMException , java.io.IOException { org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey = new org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey ( java.lang.reflect.Method . java.lang.String ( ) , java.lang.reflect.Method . java.lang.Class<?>[] ( ) ) ; javax.management.MBeanOperationInfo javax.management.MBeanOperationInfo = this . java.util.Map<org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey,javax.management.MBeanOperationInfo> . javax.management.MBeanOperationInfo ( org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey ) ; if ( javax.management.MBeanOperationInfo == null ) { throw new InvalidInvocationException ( STRING + java.lang.reflect.Method . java.lang.String ( ) + STRING ) ; } java.lang.String [] java.lang.String[] = null ; synchronized ( this . java.util.Map<java.lang.reflect.Method,java.lang.String[]> ) { java.lang.String[] = this . java.util.Map<java.lang.reflect.Method,java.lang.String[]> . java.lang.String[] ( java.lang.reflect.Method ) ; if ( java.lang.String[] == null ) { java.lang.String[] = JmxUtils . getMethodSignature ( java.lang.reflect.Method ) ; this . java.util.Map<java.lang.reflect.Method,java.lang.String[]> . java.lang.String[] ( java.lang.reflect.Method , java.lang.String[] ) ; } } return this . javax.management.MBeanServerConnection . java.lang.Object ( this . javax.management.ObjectName , java.lang.reflect.Method . java.lang.String ( ) , java.lang.Object[] , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , MethodParameter org.springframework.jmx.access.MethodParameter ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.jmx.access.MethodParameter . getParameterType ( ) ; try { if ( java.lang.Object == null ) { return null ; } if ( ClassUtils . isAssignableValue ( java.lang.Class<> , java.lang.Object ) ) { return java.lang.Object ; } if ( java.lang.Object instanceof javax.management.openmbean.CompositeData ) { java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( STRING , javax.management.openmbean.CompositeData .class ) ; return ReflectionUtils . invokeMethod ( java.lang.reflect.Method , null , java.lang.Object ) ; } else if ( java.lang.Object instanceof javax.management.openmbean.CompositeData [] ) { javax.management.openmbean.CompositeData [] javax.management.openmbean.CompositeData[] = ( javax.management.openmbean.CompositeData [] ) java.lang.Object ; if ( java.lang.Class<> . boolean ( ) ) { return java.lang.Object ( javax.management.openmbean.CompositeData[] , java.lang.Class<> ) ; } else if ( java.util.Collection .class . boolean ( java.lang.Class<> ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = ResolvableType . forMethodParameter ( org.springframework.jmx.access.MethodParameter ) . asCollection ( ) . resolveGeneric ( ) ; if ( java.lang.Class<> != null ) { return java.util.Collection<?> ( javax.management.openmbean.CompositeData[] , java.lang.Class<> , java.lang.Class<> ) ; } } } else if ( java.lang.Object instanceof javax.management.openmbean.TabularData ) { java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( STRING , javax.management.openmbean.TabularData .class ) ; return ReflectionUtils . invokeMethod ( java.lang.reflect.Method , null , java.lang.Object ) ; } else if ( java.lang.Object instanceof javax.management.openmbean.TabularData [] ) { javax.management.openmbean.TabularData [] javax.management.openmbean.TabularData[] = ( javax.management.openmbean.TabularData [] ) java.lang.Object ; if ( java.lang.Class<> . boolean ( ) ) { return java.lang.Object ( javax.management.openmbean.TabularData[] , java.lang.Class<> ) ; } else if ( java.util.Collection .class . boolean ( java.lang.Class<> ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = ResolvableType . forMethodParameter ( org.springframework.jmx.access.MethodParameter ) . asCollection ( ) . resolveGeneric ( ) ; if ( java.lang.Class<> != null ) { return java.util.Collection<?> ( javax.management.openmbean.TabularData[] , java.lang.Class<> , java.lang.Class<> ) ; } } } throw new InvocationFailureException ( STRING + java.lang.Object + STRING + java.lang.Class<> . java.lang.String ( ) + STRING ) ; } catch ( java.lang.NoSuchMethodException java.lang.NoSuchMethodException ) { throw new InvocationFailureException ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING + java.lang.Object + STRING ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] , java.lang.Class<?> < ? > java.lang.Class<?> ) throws java.lang.NoSuchMethodException { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<> . java.lang.Class<?> ( ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( STRING , java.lang.Object[] . java.lang.Class<? extends java.lang.Object[]> ( ) . java.lang.Class<?> ( ) ) ; java.lang.Object java.lang.Object = java.lang.reflect.Array . java.lang.Object ( java.lang.Class<> , java.lang.Object[] . int ) ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { java.lang.reflect.Array . void ( java.lang.Object , int , ReflectionUtils . invokeMethod ( java.lang.reflect.Method , null , java.lang.Object[] [ int ] ) ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private java.util.Collection<?> < ? > java.util.Collection<?> ( java.lang.Object [] java.lang.Object[] , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> )			throws java.lang.NoSuchMethodException { java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( STRING , java.lang.Object[] . java.lang.Class<? extends java.lang.Object[]> ( ) . java.lang.Class<?> ( ) ) ; java.util.Collection<java.lang.Object> < java.lang.Object > java.util.Collection<java.lang.Object> = CollectionFactory . createCollection ( java.lang.Class<> , java.lang.reflect.Array . int ( java.lang.Object[] ) ) ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { java.util.Collection<java.lang.Object> . boolean ( ReflectionUtils . invokeMethod ( java.lang.reflect.Method , null , java.lang.Object[] [ int ] ) ) ; } return java.util.Collection<java.lang.Object> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.jmx.access.ConnectorDelegate . close ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Class<?> < ? > [] java.lang.Class<?>[] ) { this . java.lang.String = java.lang.String ; this . java.lang.Class<?>[] = ( java.lang.Class<?>[] != null ? java.lang.Class<?>[] : new java.lang.Class<?> < ? > [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey = ( org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey ) java.lang.Object ; return ( this . java.lang.String . boolean ( org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey . java.lang.String ) && java.util.Arrays . boolean ( this . java.lang.Class<?>[] , org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey . java.lang.Class<?>[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.lang.String . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String + STRING + StringUtils . arrayToCommaDelimitedString ( this . java.lang.Class<?>[] ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey ) { int int = this . java.lang.String . int ( org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey . java.lang.String ) ; if ( int != NUMBER ) { return int ; } if ( this . java.lang.Class<?>[] . int < org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey . java.lang.Class<?>[] . int ) { return - NUMBER ; } if ( this . java.lang.Class<?>[] . int > org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey . java.lang.Class<?>[] . int ) { return NUMBER ; } for ( int int = NUMBER ; int < this . java.lang.Class<?>[] . int ; int ++ ) { int = this . java.lang.Class<?>[] [ int ] . java.lang.String ( ) . int ( org.springframework.jmx.access.MBeanClientInterceptor.MethodCacheKey . java.lang.Class<?>[] [ int ] . java.lang.String ( ) ) ; if ( int != NUMBER ) { return int ; } } return NUMBER ; }  <METHOD_END>
