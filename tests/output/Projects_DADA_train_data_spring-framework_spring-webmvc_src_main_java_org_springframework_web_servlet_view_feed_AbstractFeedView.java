<METHOD_START> @ java.lang.Override protected final void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , HttpServletRequest org.springframework.web.servlet.view.feed.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.view.feed.HttpServletResponse )			throws java.lang.Exception { T T = T ( ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , T , org.springframework.web.servlet.view.feed.HttpServletRequest ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , T , org.springframework.web.servlet.view.feed.HttpServletRequest , org.springframework.web.servlet.view.feed.HttpServletResponse ) ; setResponseContentType ( org.springframework.web.servlet.view.feed.HttpServletRequest , org.springframework.web.servlet.view.feed.HttpServletResponse ) ; if ( ! StringUtils . hasText ( T . getEncoding ( ) ) ) { T . setEncoding ( STRING ) ; } WireFeedOutput org.springframework.web.servlet.view.feed.WireFeedOutput = new WireFeedOutput ( ) ; ServletOutputStream org.springframework.web.servlet.view.feed.ServletOutputStream = org.springframework.web.servlet.view.feed.HttpServletResponse . getOutputStream ( ) ; org.springframework.web.servlet.view.feed.WireFeedOutput . output ( T , new java.io.OutputStreamWriter ( org.springframework.web.servlet.view.feed.ServletOutputStream , T . getEncoding ( ) ) ) ; org.springframework.web.servlet.view.feed.ServletOutputStream . flush ( ) ; }  <METHOD_END>
<METHOD_START> protected abstract T T ( )  <METHOD_END>
<METHOD_START> protected void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , T T , HttpServletRequest org.springframework.web.servlet.view.feed.HttpServletRequest ) {	}  <METHOD_END>
<METHOD_START> protected abstract void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , T T , HttpServletRequest org.springframework.web.servlet.view.feed.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.view.feed.HttpServletResponse ) throws java.lang.Exception ;  <METHOD_END>
