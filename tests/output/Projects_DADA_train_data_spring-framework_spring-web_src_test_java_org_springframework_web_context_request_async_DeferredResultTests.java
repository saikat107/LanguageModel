<METHOD_START> @ Test public void void ( ) { DeferredResultHandler org.springframework.web.context.request.async.DeferredResultHandler = mock ( DeferredResultHandler .class ) ; DeferredResult < java.lang.String > org.springframework.web.context.request.async.DeferredResult<java.lang.String> = new DeferredResult <> ( ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResultHandler ( org.springframework.web.context.request.async.DeferredResultHandler ) ; assertTrue ( org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResult ( STRING ) ) ; verify ( org.springframework.web.context.request.async.DeferredResultHandler ) . handleResult ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DeferredResultHandler org.springframework.web.context.request.async.DeferredResultHandler = mock ( DeferredResultHandler .class ) ; DeferredResult < java.lang.String > org.springframework.web.context.request.async.DeferredResult<java.lang.String> = new DeferredResult <> ( ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResultHandler ( org.springframework.web.context.request.async.DeferredResultHandler ) ; assertTrue ( org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResult ( STRING ) ) ; assertFalse ( org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResult ( STRING ) ) ; verify ( org.springframework.web.context.request.async.DeferredResultHandler ) . handleResult ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DeferredResultHandler org.springframework.web.context.request.async.DeferredResultHandler = mock ( DeferredResultHandler .class ) ; DeferredResult < java.lang.String > org.springframework.web.context.request.async.DeferredResult<java.lang.String> = new DeferredResult <> ( ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResultHandler ( org.springframework.web.context.request.async.DeferredResultHandler ) ; assertFalse ( org.springframework.web.context.request.async.DeferredResult<java.lang.String> . isSetOrExpired ( ) ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResult ( STRING ) ; assertTrue ( org.springframework.web.context.request.async.DeferredResult<java.lang.String> . isSetOrExpired ( ) ) ; verify ( org.springframework.web.context.request.async.DeferredResultHandler ) . handleResult ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DeferredResultHandler org.springframework.web.context.request.async.DeferredResultHandler = mock ( DeferredResultHandler .class ) ; DeferredResult < java.lang.String > org.springframework.web.context.request.async.DeferredResult<java.lang.String> = new DeferredResult <> ( ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResultHandler ( org.springframework.web.context.request.async.DeferredResultHandler ) ; assertFalse ( org.springframework.web.context.request.async.DeferredResult<java.lang.String> . hasResult ( ) ) ; assertNull ( org.springframework.web.context.request.async.DeferredResult<java.lang.String> . getResult ( ) ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResult ( STRING ) ; assertEquals ( STRING , org.springframework.web.context.request.async.DeferredResult<java.lang.String> . getResult ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; DeferredResult < java.lang.String > org.springframework.web.context.request.async.DeferredResult<java.lang.String> = new DeferredResult <> ( ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . onCompletion ( new java.lang.Runnable ( ) { @ java.lang.Override public void void ( ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } } ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . getInterceptor ( ) . afterCompletion ( null , null ) ; assertTrue ( org.springframework.web.context.request.async.DeferredResult<java.lang.String> . isSetOrExpired ( ) ) ; assertEquals ( STRING , java.lang.StringBuilder . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; DeferredResultHandler org.springframework.web.context.request.async.DeferredResultHandler = mock ( DeferredResultHandler .class ) ; DeferredResult < java.lang.String > org.springframework.web.context.request.async.DeferredResult<java.lang.String> = new DeferredResult <> ( null , STRING ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResultHandler ( org.springframework.web.context.request.async.DeferredResultHandler ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . onTimeout ( new java.lang.Runnable ( ) { @ java.lang.Override public void void ( ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } } ) ; org.springframework.web.context.request.async.DeferredResult<java.lang.String> . getInterceptor ( ) . handleTimeout ( null , null ) ; assertEquals ( STRING , java.lang.StringBuilder . java.lang.String ( ) ) ; assertFalse ( STRING , org.springframework.web.context.request.async.DeferredResult<java.lang.String> . setResult ( STRING ) ) ; verify ( org.springframework.web.context.request.async.DeferredResultHandler ) . handleResult ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; }  <METHOD_END>
