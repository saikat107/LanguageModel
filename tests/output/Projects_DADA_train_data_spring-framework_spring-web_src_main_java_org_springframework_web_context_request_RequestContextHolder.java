<METHOD_START> public static void void ( ) { java.lang.ThreadLocal<org.springframework.web.context.request.RequestAttributes> . remove ( ) ; java.lang.ThreadLocal<org.springframework.web.context.request.RequestAttributes> . remove ( ) ; }  <METHOD_END>
<METHOD_START> public static void void ( RequestAttributes org.springframework.web.context.request.RequestAttributes ) { void ( org.springframework.web.context.request.RequestAttributes , false ) ; }  <METHOD_END>
<METHOD_START> public static void void ( RequestAttributes org.springframework.web.context.request.RequestAttributes , boolean boolean ) { if ( org.springframework.web.context.request.RequestAttributes == null ) { void ( ) ; } else { if ( boolean ) { java.lang.ThreadLocal<org.springframework.web.context.request.RequestAttributes> . set ( org.springframework.web.context.request.RequestAttributes ) ; java.lang.ThreadLocal<org.springframework.web.context.request.RequestAttributes> . remove ( ) ; } else { java.lang.ThreadLocal<org.springframework.web.context.request.RequestAttributes> . set ( org.springframework.web.context.request.RequestAttributes ) ; java.lang.ThreadLocal<org.springframework.web.context.request.RequestAttributes> . remove ( ) ; } } }  <METHOD_END>
<METHOD_START> public static org.springframework.web.context.request.RequestAttributes org.springframework.web.context.request.RequestAttributes ( ) { RequestAttributes org.springframework.web.context.request.RequestAttributes = java.lang.ThreadLocal<org.springframework.web.context.request.RequestAttributes> . get ( ) ; if ( org.springframework.web.context.request.RequestAttributes == null ) { org.springframework.web.context.request.RequestAttributes = java.lang.ThreadLocal<org.springframework.web.context.request.RequestAttributes> . get ( ) ; } return org.springframework.web.context.request.RequestAttributes ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.context.request.RequestAttributes org.springframework.web.context.request.RequestAttributes ( ) java.lang.IllegalStateException { RequestAttributes org.springframework.web.context.request.RequestAttributes = org.springframework.web.context.request.RequestAttributes ( ) ; if ( org.springframework.web.context.request.RequestAttributes == null ) { if ( boolean ) { org.springframework.web.context.request.RequestAttributes = org.springframework.web.context.request.RequestContextHolder.FacesRequestAttributesFactory . org.springframework.web.context.request.RequestAttributes ( ) ; } if ( org.springframework.web.context.request.RequestAttributes == null ) { throw new java.lang.IllegalStateException ( STRING + STRING + STRING + STRING + STRING + STRING ) ; } } return org.springframework.web.context.request.RequestAttributes ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.context.request.RequestAttributes org.springframework.web.context.request.RequestAttributes ( ) { FacesContext org.springframework.web.context.request.FacesContext = FacesContext . getCurrentInstance ( ) ; return ( org.springframework.web.context.request.FacesContext != null ? new FacesRequestAttributes ( org.springframework.web.context.request.FacesContext ) : null ) ; }  <METHOD_END>