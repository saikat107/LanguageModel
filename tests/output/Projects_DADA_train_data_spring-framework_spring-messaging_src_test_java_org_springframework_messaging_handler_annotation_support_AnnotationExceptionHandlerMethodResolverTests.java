<METHOD_START> @ Test public void void ( ) { AnnotationExceptionHandlerMethodResolver org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver = new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.ExceptionController .class ) ; java.io.IOException java.io.IOException = new java.io.IOException ( ) ; assertEquals ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( java.io.IOException ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationExceptionHandlerMethodResolver org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver = new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.ExceptionController .class ) ; java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( ) ; assertEquals ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( java.lang.IllegalArgumentException ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationExceptionHandlerMethodResolver org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver = new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.ExceptionController .class ) ; java.lang.AssertionError java.lang.AssertionError = new java.lang.AssertionError ( ) ; assertEquals ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( new java.lang.IllegalStateException ( java.lang.AssertionError ) ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationExceptionHandlerMethodResolver org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver = new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.ExceptionController .class ) ; java.io.IOException java.io.IOException = new java.io.FileNotFoundException ( ) ; assertEquals ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( java.io.IOException ) . getName ( ) ) ; java.net.SocketException java.net.SocketException = new java.net.BindException ( ) ; assertEquals ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( java.net.SocketException ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationExceptionHandlerMethodResolver org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver = new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.ExceptionController .class ) ; java.net.SocketException java.net.SocketException = new java.net.SocketException ( ) ; assertEquals ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( java.net.SocketException ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationExceptionHandlerMethodResolver org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver = new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.ExceptionController .class ) ; java.lang.Exception java.lang.Exception = new java.lang.Exception ( ) ; assertNull ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( java.lang.Exception ) ) ; assertNull ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( java.lang.Exception ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationExceptionHandlerMethodResolver org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver = new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.InheritedController .class ) ; java.io.IOException java.io.IOException = new java.io.IOException ( ) ; assertEquals ( STRING , org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolver . resolveMethod ( java.io.IOException ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.AmbiguousController .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new AnnotationExceptionHandlerMethodResolver ( org.springframework.messaging.handler.annotation.support.AnnotationExceptionHandlerMethodResolverTests.NoExceptionController .class ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) {}  <METHOD_END>
<METHOD_START> @ MessageExceptionHandler ( java.io.IOException .class ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ MessageExceptionHandler ( java.net.SocketException .class ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ MessageExceptionHandler public void void ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {		}  <METHOD_END>
<METHOD_START> @ MessageExceptionHandler public void void ( java.lang.AssertionError java.lang.AssertionError ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
<METHOD_START> public void void ( ) {}  <METHOD_END>
<METHOD_START> @ MessageExceptionHandler ( { java.net.BindException .class , java.lang.IllegalArgumentException .class } ) public java.lang.String java.lang.String ( java.lang.Exception java.lang.Exception ) throws java.io.IOException { return ClassUtils . getShortName ( java.lang.Exception . java.lang.Class<? extends java.lang.Exception> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ MessageExceptionHandler public java.lang.String java.lang.String ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { return ClassUtils . getShortName ( java.lang.IllegalArgumentException . java.lang.Class<? extends java.lang.IllegalArgumentException> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ MessageExceptionHandler public void void ( ) {		}  <METHOD_END>
