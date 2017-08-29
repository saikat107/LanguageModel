<METHOD_START> public static javax.management.MBeanServer javax.management.MBeanServer ( ) org.springframework.jmx.support.MBeanServerNotFoundException { return javax.management.MBeanServer ( null ) ; }  <METHOD_END>
<METHOD_START> public static javax.management.MBeanServer javax.management.MBeanServer ( java.lang.String java.lang.String ) throws org.springframework.jmx.support.MBeanServerNotFoundException { javax.management.MBeanServer javax.management.MBeanServer = null ; if ( ! STRING . boolean ( java.lang.String ) ) { java.util.List<javax.management.MBeanServer> < javax.management.MBeanServer > java.util.List<javax.management.MBeanServer> = javax.management.MBeanServerFactory . java.util.ArrayList<javax.management.MBeanServer> ( java.lang.String ) ; if ( java.util.List<javax.management.MBeanServer> != null && java.util.List<javax.management.MBeanServer> . int ( ) > NUMBER ) { if ( java.util.List<javax.management.MBeanServer> . int ( ) > NUMBER && org.springframework.jmx.support.Log . isWarnEnabled ( ) ) { org.springframework.jmx.support.Log . warn ( STRING + ( java.lang.String != null ? STRING + java.lang.String + STRING : STRING ) + STRING ) ; } javax.management.MBeanServer = java.util.List<javax.management.MBeanServer> . javax.management.MBeanServer ( NUMBER ) ; } } if ( javax.management.MBeanServer == null && ! StringUtils . hasLength ( java.lang.String ) ) { try { javax.management.MBeanServer = java.lang.management.ManagementFactory . javax.management.MBeanServer ( ) ; } catch ( java.lang.SecurityException java.lang.SecurityException ) { throw new MBeanServerNotFoundException ( STRING + STRING , java.lang.SecurityException ) ; } } if ( javax.management.MBeanServer == null ) { throw new MBeanServerNotFoundException ( STRING + ( java.lang.String != null ? STRING + java.lang.String + STRING : STRING ) ) ; } if ( org.springframework.jmx.support.Log . isDebugEnabled ( ) ) { org.springframework.jmx.support.Log . debug ( STRING + javax.management.MBeanServer ) ; } return javax.management.MBeanServer ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > [] java.lang.Class<?>[] ( javax.management.MBeanParameterInfo [] javax.management.MBeanParameterInfo[] ) throws java.lang.ClassNotFoundException { return java.lang.Class<?>[] ( javax.management.MBeanParameterInfo[] , ClassUtils . getDefaultClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > [] java.lang.Class<?>[] ( javax.management.MBeanParameterInfo [] javax.management.MBeanParameterInfo[] , java.lang.ClassLoader java.lang.ClassLoader )			throws java.lang.ClassNotFoundException { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = null ; if ( javax.management.MBeanParameterInfo[] != null && javax.management.MBeanParameterInfo[] . int > NUMBER ) { java.lang.Class<?>[] = new java.lang.Class<?> < ? > [ javax.management.MBeanParameterInfo[] . int ] ; for ( int int = NUMBER ; int < javax.management.MBeanParameterInfo[] . int ; int ++ ) { java.lang.Class<?>[] [ int ] = ClassUtils . forName ( javax.management.MBeanParameterInfo[] [ int ] . java.lang.String ( ) , java.lang.ClassLoader ) ; } } return java.lang.Class<?>[] ; }  <METHOD_END>
<METHOD_START> public static java.lang.String [] java.lang.String[] ( java.lang.reflect.Method java.lang.reflect.Method ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.reflect.Method . java.lang.Class<?>[] ( ) ; java.lang.String [] java.lang.String[] = new java.lang.String [ java.lang.Class<?>[] . int ] ; for ( int int = NUMBER ; int < java.lang.Class<?>[] . int ; int ++ ) { java.lang.String[] [ int ] = java.lang.Class<?>[] [ int ] . java.lang.String ( ) ; } return java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.beans.PropertyDescriptor java.beans.PropertyDescriptor , boolean boolean ) { if ( boolean ) { return StringUtils . capitalize ( java.beans.PropertyDescriptor . java.lang.String ( ) ) ; } else { return java.beans.PropertyDescriptor . java.lang.String ( ) ; } }  <METHOD_END>
<METHOD_START> public static javax.management.ObjectName javax.management.ObjectName ( javax.management.ObjectName javax.management.ObjectName , java.lang.Object java.lang.Object )			throws javax.management.MalformedObjectNameException { java.util.Hashtable<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Hashtable<java.lang.String,java.lang.String> = javax.management.ObjectName . java.util.Hashtable<java.lang.String,java.lang.String> ( ) ; java.util.Hashtable<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String , ObjectUtils . getIdentityHexString ( java.lang.Object ) ) ; return ObjectNameManager . getInstance ( javax.management.ObjectName . java.lang.String ( ) , java.util.Hashtable<java.lang.String,java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Object java.lang.Object ) { return ClassUtils . getUserClass ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ClassUtils . getUserClass ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ( java.lang.Class<> != null && ( javax.management.DynamicMBean .class . boolean ( java.lang.Class<> ) || ( java.lang.Class<?> ( java.lang.Class<> ) != null || java.lang.Class<?> ( java.lang.Class<> ) != null ) ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.Class<> == null || java.lang.Class<> . java.lang.Class<? super > ( ) == null ) { return null ; } java.lang.String java.lang.String = java.lang.Class<> . java.lang.String ( ) + java.lang.String ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.Class<> . java.lang.Class<?>[] ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { if ( java.lang.Class<> . java.lang.String ( ) . boolean ( java.lang.String ) ) { return java.lang.Class<> ; } } return java.lang.Class<?> ( java.lang.Class<> . java.lang.Class<? super > ( ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.Class<> == null || java.lang.Class<> . java.lang.Class<? super > ( ) == null ) { return null ; } java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.Class<> . java.lang.Class<?>[] ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { if ( javax.management.JMX . boolean ( java.lang.Class<> ) ) { return java.lang.Class<> ; } } return java.lang.Class<?> ( java.lang.Class<> . java.lang.Class<? super > ( ) ) ; }  <METHOD_END>
