<METHOD_START> public void ( ) { this( new org.springframework.integration.scheduling.PollSkipAdvice.DefaultPollSkipStrategy ( ) ); }  <METHOD_END>
<METHOD_START> public void ( PollSkipStrategy org.springframework.integration.scheduling.PollSkipStrategy ) { this . org.springframework.integration.scheduling.PollSkipStrategy = org.springframework.integration.scheduling.PollSkipStrategy ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.integration.scheduling.MethodInvocation ) throws java.lang.Throwable { if ( STRING . boolean ( org.springframework.integration.scheduling.MethodInvocation . getMethod ( ) . getName ( ) ) && this . org.springframework.integration.scheduling.PollSkipStrategy . skipPoll ( ) ) { if ( org.springframework.integration.scheduling.Log . isDebugEnabled ( ) ) { org.springframework.integration.scheduling.Log . debug ( STRING + this . org.springframework.integration.scheduling.PollSkipStrategy . getClass ( ) . getName ( ) + STRING ) ; } return java.lang.Boolean . java.lang.Boolean ; } else { return org.springframework.integration.scheduling.MethodInvocation . proceed ( ) ; } }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
