<METHOD_START> @ java.lang.Override public void void ( FailureAnalysis org.springframework.boot.diagnostics.FailureAnalysis ) { if ( org.springframework.boot.diagnostics.Log . isDebugEnabled ( ) ) { org.springframework.boot.diagnostics.Log . debug ( STRING , org.springframework.boot.diagnostics.FailureAnalysis . getCause ( ) ) ; } if ( org.springframework.boot.diagnostics.Log . isErrorEnabled ( ) ) { org.springframework.boot.diagnostics.Log . error ( java.lang.String ( org.springframework.boot.diagnostics.FailureAnalysis ) ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( FailureAnalysis org.springframework.boot.diagnostics.FailureAnalysis ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , org.springframework.boot.diagnostics.FailureAnalysis . getDescription ( ) ) ) ; if ( StringUtils . hasText ( org.springframework.boot.diagnostics.FailureAnalysis . getAction ( ) ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , org.springframework.boot.diagnostics.FailureAnalysis . getAction ( ) ) ) ; } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
