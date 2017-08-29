<METHOD_START> public void ( HttpServletRequest org.springframework.web.context.request.HttpServletRequest ) { Assert . notNull ( org.springframework.web.context.request.HttpServletRequest , STRING ) ; this . org.springframework.web.context.request.HttpServletRequest = org.springframework.web.context.request.HttpServletRequest ; }  <METHOD_END>
<METHOD_START> public void ( HttpServletRequest org.springframework.web.context.request.HttpServletRequest , HttpServletResponse org.springframework.web.context.request.HttpServletResponse ) { this( org.springframework.web.context.request.HttpServletRequest ); this . org.springframework.web.context.request.HttpServletResponse = org.springframework.web.context.request.HttpServletResponse ; }  <METHOD_END>
<METHOD_START> public final org.springframework.web.context.request.HttpServletRequest org.springframework.web.context.request.HttpServletRequest ( ) { return this . org.springframework.web.context.request.HttpServletRequest ; }  <METHOD_END>
<METHOD_START> public final org.springframework.web.context.request.HttpServletResponse org.springframework.web.context.request.HttpServletResponse ( ) { return this . org.springframework.web.context.request.HttpServletResponse ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.web.context.request.HttpSession org.springframework.web.context.request.HttpSession ( boolean boolean ) { if ( isRequestActive ( ) ) { HttpSession org.springframework.web.context.request.HttpSession = this . org.springframework.web.context.request.HttpServletRequest . getSession ( boolean ) ; this . org.springframework.web.context.request.HttpSession = org.springframework.web.context.request.HttpSession ; return org.springframework.web.context.request.HttpSession ; } else { HttpSession org.springframework.web.context.request.HttpSession = this . org.springframework.web.context.request.HttpSession ; if ( org.springframework.web.context.request.HttpSession == null ) { if ( boolean ) { throw new java.lang.IllegalStateException ( STRING ) ; } else { org.springframework.web.context.request.HttpSession = this . org.springframework.web.context.request.HttpServletRequest . getSession ( false ) ; this . org.springframework.web.context.request.HttpSession = org.springframework.web.context.request.HttpSession ; } } return org.springframework.web.context.request.HttpSession ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String , int int ) { if ( int == SCOPE_REQUEST ) { if ( ! isRequestActive ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } return this . org.springframework.web.context.request.HttpServletRequest . getAttribute ( java.lang.String ) ; } else { HttpSession org.springframework.web.context.request.HttpSession = org.springframework.web.context.request.HttpSession ( false ) ; if ( org.springframework.web.context.request.HttpSession != null ) { try { java.lang.Object java.lang.Object = org.springframework.web.context.request.HttpSession . getAttribute ( java.lang.String ) ; if ( java.lang.Object != null ) { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } return java.lang.Object ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } } return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , int int ) { if ( int == SCOPE_REQUEST ) { if ( ! isRequestActive ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } this . org.springframework.web.context.request.HttpServletRequest . setAttribute ( java.lang.String , java.lang.Object ) ; } else { HttpSession org.springframework.web.context.request.HttpSession = org.springframework.web.context.request.HttpSession ( true ) ; this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; org.springframework.web.context.request.HttpSession . setAttribute ( java.lang.String , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , int int ) { if ( int == SCOPE_REQUEST ) { if ( isRequestActive ( ) ) { this . org.springframework.web.context.request.HttpServletRequest . removeAttribute ( java.lang.String ) ; removeRequestDestructionCallback ( java.lang.String ) ; } } else { HttpSession org.springframework.web.context.request.HttpSession = org.springframework.web.context.request.HttpSession ( false ) ; if ( org.springframework.web.context.request.HttpSession != null ) { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; try { org.springframework.web.context.request.HttpSession . removeAttribute ( java.lang.String ) ; org.springframework.web.context.request.HttpSession . removeAttribute ( java.lang.String + java.lang.String ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( int int ) { if ( int == SCOPE_REQUEST ) { if ( ! isRequestActive ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } return StringUtils . toStringArray ( this . org.springframework.web.context.request.HttpServletRequest . getAttributeNames ( ) ) ; } else { HttpSession org.springframework.web.context.request.HttpSession = org.springframework.web.context.request.HttpSession ( false ) ; if ( org.springframework.web.context.request.HttpSession != null ) { try { return StringUtils . toStringArray ( org.springframework.web.context.request.HttpSession . getAttributeNames ( ) ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } } return new java.lang.String [ NUMBER ] ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.Runnable java.lang.Runnable , int int ) { if ( int == SCOPE_REQUEST ) { registerRequestDestructionCallback ( java.lang.String , java.lang.Runnable ) ; } else { void ( java.lang.String , java.lang.Runnable ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { if ( REFERENCE_REQUEST . equals ( java.lang.String ) ) { return this . org.springframework.web.context.request.HttpServletRequest ; } else if ( REFERENCE_SESSION . equals ( java.lang.String ) ) { return org.springframework.web.context.request.HttpSession ( true ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.web.context.request.HttpSession ( true ) . getId ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { return WebUtils . getSessionMutex ( org.springframework.web.context.request.HttpSession ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( ! this . java.util.Map<java.lang.String,java.lang.Object> . boolean ( ) ) { HttpSession org.springframework.web.context.request.HttpSession = org.springframework.web.context.request.HttpSession ( false ) ; if ( org.springframework.web.context.request.HttpSession != null ) { try { for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map.Entry<java.lang.String,java.lang.Object> : this . java.util.Map<java.lang.String,java.lang.Object> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Object>> ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) ; java.lang.Object java.lang.Object = java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) ; java.lang.Object java.lang.Object = org.springframework.web.context.request.HttpSession . getAttribute ( java.lang.String ) ; if ( java.lang.Object == java.lang.Object && ! boolean ( java.lang.String , java.lang.Object ) ) { org.springframework.web.context.request.HttpSession . setAttribute ( java.lang.String , java.lang.Object ) ; } } } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } } this . java.util.Map<java.lang.String,java.lang.Object> . void ( ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { return ( java.lang.Object == null || java.util.Set<java.lang.Class<?>> . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , java.lang.Runnable java.lang.Runnable ) { HttpSession org.springframework.web.context.request.HttpSession = org.springframework.web.context.request.HttpSession ( true ) ; org.springframework.web.context.request.HttpSession . setAttribute ( java.lang.String + java.lang.String , new DestructionCallbackBindingListener ( java.lang.Runnable ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.web.context.request.HttpServletRequest . toString ( ) ; }  <METHOD_END>
