<METHOD_START> @ java.lang.Override public void void ( HttpServletRequest org.springframework.remoting.httpinvoker.HttpServletRequest , HttpServletResponse org.springframework.remoting.httpinvoker.HttpServletResponse )			throws org.springframework.remoting.httpinvoker.ServletException , java.io.IOException { try { RemoteInvocation org.springframework.remoting.httpinvoker.RemoteInvocation = org.springframework.remoting.httpinvoker.RemoteInvocation ( org.springframework.remoting.httpinvoker.HttpServletRequest ) ; RemoteInvocationResult org.springframework.remoting.httpinvoker.RemoteInvocationResult = invokeAndCreateResult ( org.springframework.remoting.httpinvoker.RemoteInvocation , getProxy ( ) ) ; void ( org.springframework.remoting.httpinvoker.HttpServletRequest , org.springframework.remoting.httpinvoker.HttpServletResponse , org.springframework.remoting.httpinvoker.RemoteInvocationResult ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { throw new NestedServletException ( STRING , java.lang.ClassNotFoundException ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.remoting.httpinvoker.RemoteInvocation org.springframework.remoting.httpinvoker.RemoteInvocation ( HttpServletRequest org.springframework.remoting.httpinvoker.HttpServletRequest )			throws java.io.IOException , java.lang.ClassNotFoundException { return org.springframework.remoting.httpinvoker.RemoteInvocation ( org.springframework.remoting.httpinvoker.HttpServletRequest , org.springframework.remoting.httpinvoker.HttpServletRequest . getInputStream ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.remoting.httpinvoker.RemoteInvocation org.springframework.remoting.httpinvoker.RemoteInvocation ( HttpServletRequest org.springframework.remoting.httpinvoker.HttpServletRequest , java.io.InputStream java.io.InputStream )			throws java.io.IOException , java.lang.ClassNotFoundException { java.io.ObjectInputStream java.io.ObjectInputStream = createObjectInputStream ( java.io.InputStream ( org.springframework.remoting.httpinvoker.HttpServletRequest , java.io.InputStream ) ) ; try { return doReadRemoteInvocation ( java.io.ObjectInputStream ) ; } finally { java.io.ObjectInputStream . void ( ) ; } }  <METHOD_END>
<METHOD_START> protected java.io.InputStream java.io.InputStream ( HttpServletRequest org.springframework.remoting.httpinvoker.HttpServletRequest , java.io.InputStream java.io.InputStream ) throws java.io.IOException { return java.io.InputStream ; }  <METHOD_END>
<METHOD_START> protected void void ( HttpServletRequest org.springframework.remoting.httpinvoker.HttpServletRequest , HttpServletResponse org.springframework.remoting.httpinvoker.HttpServletResponse , RemoteInvocationResult org.springframework.remoting.httpinvoker.RemoteInvocationResult )			throws java.io.IOException { org.springframework.remoting.httpinvoker.HttpServletResponse . setContentType ( getContentType ( ) ) ; void ( org.springframework.remoting.httpinvoker.HttpServletRequest , org.springframework.remoting.httpinvoker.HttpServletResponse , org.springframework.remoting.httpinvoker.RemoteInvocationResult , org.springframework.remoting.httpinvoker.HttpServletResponse . getOutputStream ( ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( HttpServletRequest org.springframework.remoting.httpinvoker.HttpServletRequest , HttpServletResponse org.springframework.remoting.httpinvoker.HttpServletResponse , RemoteInvocationResult org.springframework.remoting.httpinvoker.RemoteInvocationResult , java.io.OutputStream java.io.OutputStream )			throws java.io.IOException { java.io.ObjectOutputStream java.io.ObjectOutputStream = createObjectOutputStream ( new org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter.FlushGuardedOutputStream ( java.io.OutputStream ( org.springframework.remoting.httpinvoker.HttpServletRequest , org.springframework.remoting.httpinvoker.HttpServletResponse , java.io.OutputStream ) ) ) ; try { doWriteRemoteInvocationResult ( org.springframework.remoting.httpinvoker.RemoteInvocationResult , java.io.ObjectOutputStream ) ; } finally { java.io.ObjectOutputStream . void ( ) ; } }  <METHOD_END>
<METHOD_START> protected java.io.OutputStream java.io.OutputStream ( HttpServletRequest org.springframework.remoting.httpinvoker.HttpServletRequest , HttpServletResponse org.springframework.remoting.httpinvoker.HttpServletResponse , java.io.OutputStream java.io.OutputStream ) throws java.io.IOException { return java.io.OutputStream ; }  <METHOD_END>
<METHOD_START> public void ( java.io.OutputStream java.io.OutputStream ) { super( java.io.OutputStream ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { }  <METHOD_END>